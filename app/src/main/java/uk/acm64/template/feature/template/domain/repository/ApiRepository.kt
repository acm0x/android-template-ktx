package uk.acm64.template.feature.template.domain.repository

import uk.acm64.template.feature.template.domain.model.Data

interface ApiRepository {
    suspend fun getData(): List<Data>
}