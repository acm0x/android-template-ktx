package uk.acm64.template.feature.template.data

import retrofit2.http.GET
import uk.acm64.template.feature.template.data.model.TemplateResponse

interface ApiRetrofitService {
    @GET("/")
    suspend fun getData(): TemplateResponse

}
