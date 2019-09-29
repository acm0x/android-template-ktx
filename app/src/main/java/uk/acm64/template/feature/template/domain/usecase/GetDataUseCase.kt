package uk.acm64.template.feature.template.domain.usecase

import uk.acm64.core.Either
import uk.acm64.core.Failure
import uk.acm64.core.UseCase
import uk.acm64.template.feature.template.domain.model.Data
import uk.acm64.template.feature.template.domain.repository.ApiRepository
import javax.inject.Inject

class GetDataUseCase @Inject constructor(private val apiRepository: ApiRepository) :
    UseCase<List<Data>, GetDataUseCase.Params>() {
    override suspend fun run(params: GetDataUseCase.Params): Either<Failure, List<Data>> {
        return try {
            apiRepository.getData().let {
                Either.Right(it)
            }
        } catch (exp: Exception) {
            exp.printStackTrace()
            Either.Left(GetDataFailure)
        }
    }

    object Params
    object GetDataFailure : Failure.FeatureFailure()
}