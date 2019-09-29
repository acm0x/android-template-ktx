package uk.acm64.template.feature.template.presentation.template

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import io.mockk.*
import io.mockk.impl.annotations.MockK
import kotlinx.coroutines.ExperimentalCoroutinesApi
import org.amshove.kluent.`should be`
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import uk.acm64.template.feature.template.CoroutinesTestRule
import uk.acm64.template.feature.template.domain.usecase.GetDataUseCase

internal class TemplateViewModelTest {

    @ExperimentalCoroutinesApi
    @get:Rule
    var coroutinesTestRule = CoroutinesTestRule()

    @get:Rule
    var rule = InstantTaskExecutorRule()

    @MockK
    lateinit var getDataUseCase: GetDataUseCase


    lateinit var cut: TemplateViewModel

    @Before
    fun setUp() {
        MockKAnnotations.init(this)
        cut = TemplateViewModel(getDataUseCase)
    }

    @Test
    fun `perform catalog fetch`() {
        every {getDataUseCase.invoke(any(), any(), any())} just Runs
        cut.loadData()

        cut.state.value `should be` TemplateViewState.Loading
        verify { getDataUseCase.invoke(any(), any(), any())}
    }

}