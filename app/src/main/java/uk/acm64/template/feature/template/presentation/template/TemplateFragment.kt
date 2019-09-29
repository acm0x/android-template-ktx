package uk.acm64.template.feature.template.presentation.template

import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.fragment_template.*
import uk.acm64.core.extension.*
import uk.acm64.R
import uk.acm64.template.contract.AppBaseFragment

class TemplateFragment : AppBaseFragment() {
    override fun layoutId() = R.layout.fragment_template

    private lateinit var templateViewModel: TemplateViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        retainInstance = true
        appComponent.inject(this)
        templateViewModel = viewModel(viewModelFactory) {
            observe(state, ::renderSearchResults)
            failure(failure, ::handleFailure)
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        templateViewModel.loadData()
    }



    private fun renderSearchResults(templateViewState: TemplateViewState?) {
        when (templateViewState) {
            is TemplateViewState.Empty -> showEmpty()
            is TemplateViewState.Loading -> showLoading()
            is TemplateViewState.Available -> show(templateViewState.data)
        }
    }

    private fun showLoading() {
        template_progress.visible()
        template_empty.invisible()
        data_view.invisible()

    }

    private fun show(data: List<DataUi>) {
        template_progress.invisible()
        template_empty.invisible()
        data_view.visible()
    }

    private fun showEmpty() {
        template_progress.invisible()
        template_empty.visible()
        data_view.invisible()
    }

}