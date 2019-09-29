package uk.acm64.template.feature.template.data.model

import org.amshove.kluent.`should be equal to`
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class ServiceApiResponsesTest {

    @Test
    fun toData() {
        val templateData = TemplateResponse("name")

        val data = templateData.toData()

        data.size `should be equal to`  0
    }

}