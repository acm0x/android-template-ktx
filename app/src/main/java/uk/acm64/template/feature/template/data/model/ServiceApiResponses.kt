package uk.acm64.template.feature.template.data.model

import uk.acm64.template.feature.template.domain.model.Data

/** put here all the feature API data classes */

data class TemplateResponse(val name: String) {
    fun toData(): List<Data> = listOf()
}

