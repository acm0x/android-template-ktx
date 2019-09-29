package uk.acm64.template.feature.template.data.repository

import io.mockk.MockKAnnotations
import io.mockk.coEvery
import io.mockk.coVerify
import io.mockk.impl.annotations.MockK
import kotlinx.coroutines.test.runBlockingTest
import org.amshove.kluent.`should be equal to`
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.junit.MockitoJUnitRunner
import uk.acm64.template.feature.template.data.ApiRetrofitService
import uk.acm64.template.feature.template.data.model.TemplateResponse

@RunWith(MockitoJUnitRunner::class)
class ApiRepositoryImplTest {

    @MockK
    lateinit var apiRetrofitService: ApiRetrofitService

    @MockK
    lateinit var templateResponse: TemplateResponse

    lateinit var apiRepositoryImpl: ApiRepositoryImpl

    @Before
    fun setUp() {
        MockKAnnotations.init(this)
        apiRepositoryImpl = ApiRepositoryImpl(apiRetrofitService)
    }

    @Test
    fun `get data`() = runBlockingTest {
        coEvery { apiRetrofitService.getData() } returns templateResponse

        val data = apiRepositoryImpl.getData()

        coVerify {apiRetrofitService.getData()}
        data.size `should be equal to` 0
    }

}