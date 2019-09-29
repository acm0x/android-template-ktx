package uk.acm64.template.contract.di

import dagger.Module
import dagger.Provides
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import uk.acm64.BuildConfig
import uk.acm64.template.feature.template.data.ApiRetrofitService
import uk.acm64.template.feature.template.data.repository.ApiRepositoryImpl
import uk.acm64.template.feature.template.domain.repository.ApiRepository
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

@Module
class ApplicationModule() {

    @Provides
    @Singleton
    fun provideRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(BuildConfig.API_BASE_URL)
            .client(createClient())
            .addConverterFactory(MoshiConverterFactory.create())
            .build()
    }

    @Provides
    @Singleton
    fun providesLastFmRetrofitService(retrofit: Retrofit): ApiRetrofitService =
        retrofit.create(ApiRetrofitService::class.java)

    @Provides
    @Singleton
    fun providesApiRepository(apiRetrofitService: ApiRetrofitService): ApiRepository {
        return ApiRepositoryImpl(
            apiRetrofitService
        )
    }

    private val authInterceptor = Interceptor { chain ->
        val newUrlBuilder = chain.request().url()
            .newBuilder()
            .addEncodedQueryParameter("format", "json")

        if (BuildConfig.API_KEY.isNotEmpty()) {
            newUrlBuilder.addEncodedQueryParameter("api_key", BuildConfig.API_KEY)
        }

        val newRequest = chain.request()
            .newBuilder()
            .url(newUrlBuilder.build())
            .build()
        chain.proceed(newRequest)
    }

    private val loggingInterceptor = HttpLoggingInterceptor().apply {
        level = HttpLoggingInterceptor.Level.BODY
    }

    private fun createClient(): OkHttpClient = OkHttpClient.Builder().apply {
        addInterceptor(authInterceptor)
        retryOnConnectionFailure(true)
        connectTimeout(15, TimeUnit.SECONDS)
        readTimeout(15, TimeUnit.SECONDS)
        writeTimeout(15, TimeUnit.SECONDS)
        if (BuildConfig.DEBUG) {
            addInterceptor(loggingInterceptor)
        }
    }.build()


}
