package uk.acm64.template.feature.template.data.repository

import uk.acm64.template.feature.template.data.ApiRetrofitService
import uk.acm64.template.feature.template.domain.model.Data
import uk.acm64.template.feature.template.domain.repository.ApiRepository
import javax.inject.Inject

class ApiRepositoryImpl @Inject constructor(private val apiRetrofitService: ApiRetrofitService) :
    ApiRepository {
    override suspend fun getData(): List<Data> =
        apiRetrofitService.getData()
            .toData()
}