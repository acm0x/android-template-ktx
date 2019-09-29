package uk.acm64.template.feature.template.domain.usecase

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import io.mockk.MockKAnnotations
import io.mockk.coEvery
import io.mockk.coVerify
import io.mockk.impl.annotations.MockK
import kotlinx.coroutines.test.runBlockingTest
import org.amshove.kluent.`should be equal to`
import org.amshove.kluent.`should be`
import org.junit.Assert
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.jupiter.api.fail
import org.junit.runner.RunWith
import org.mockito.junit.MockitoJUnitRunner
import uk.acm64.template.feature.template.CoroutinesTestRule
import uk.acm64.template.feature.template.domain.model.Data
import uk.acm64.template.feature.template.domain.repository.ApiRepository


@RunWith(MockitoJUnitRunner::class)
internal class GetDataUseCaseTest {

    @get:Rule
    var coroutinesTestRule = CoroutinesTestRule()

    @get:Rule
    var rule = InstantTaskExecutorRule()

    @MockK
    lateinit var apiRepository: ApiRepository

    @MockK
    lateinit var data: Data

    lateinit var cut: GetDataUseCase

    @Before
    fun setUp() {
        MockKAnnotations.init(this)
        cut = GetDataUseCase(apiRepository)
    }

    @Test
    fun `run Use Case`() = runBlockingTest {

        coEvery { apiRepository.getData() } returns listOf(data)

        val result = cut.run(GetDataUseCase.Params)

        Assert.assertTrue(result.isRight)
        result.either({ fail("Should be right") },
            {
                it.size `should be equal to` 1
                it[0] `should be` data

            })
        coVerify { apiRepository.getData() }
    }
}
