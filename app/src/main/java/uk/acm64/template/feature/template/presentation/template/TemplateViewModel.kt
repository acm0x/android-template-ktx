package uk.acm64.template.feature.template.presentation.template

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import uk.acm64.core.BaseViewModel
import uk.acm64.template.feature.template.domain.model.Data
import uk.acm64.template.feature.template.domain.usecase.GetDataUseCase
import javax.inject.Inject

class TemplateViewModel @Inject constructor(val getDataUseCase: GetDataUseCase) :
    BaseViewModel() {

    var state: MutableLiveData<TemplateViewState> = MutableLiveData()

    fun loadData() {
        state.value = TemplateViewState.Loading
        getDataUseCase(viewModelScope, GetDataUseCase.Params) {
            it.either(::handleFailure, ::handleSuccess)
        }
    }

    private fun handleSuccess(list: List<Data>) {
        when {
            list.isEmpty() -> state.value = TemplateViewState.Empty
            else -> state.value = TemplateViewState.Available(mapToPresentation(list))
        }
    }

    private fun mapToPresentation(list: List<Data>): List<DataUi> = list.map {
        DataUi(it.name)
    }
}

sealed class TemplateViewState() {
    object Loading : TemplateViewState()
    object Empty : TemplateViewState()
    data class Available(val data: List<DataUi>) : TemplateViewState()
}
