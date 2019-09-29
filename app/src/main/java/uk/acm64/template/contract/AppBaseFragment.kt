package uk.acm64.template.contract

import androidx.core.content.ContextCompat
import uk.acm64.core.BaseFragment
import uk.acm64.core.extension.appContext
import uk.acm64.template.AndroidApplication
import uk.acm64.R
import uk.acm64.template.contract.di.ApplicationComponent

abstract class AppBaseFragment : BaseFragment() {

    val appComponent: ApplicationComponent by lazy(mode = LazyThreadSafetyMode.NONE) {
        (activity?.application as AndroidApplication).appComponent
    }

    override fun snackbarTextColor() = ContextCompat.getColor(appContext, R.color.secondaryTextColor)

    override fun snackbarBackgroudColor() = ContextCompat.getColor(appContext, R.color.secondaryLightColor)

}