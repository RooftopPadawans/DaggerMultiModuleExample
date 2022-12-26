package com.flknlabs.core.modes

import com.flknlabs.core.R
import com.flknlabs.core.resource.StringsProvider

class AppSubscription(
    val stringsProvider: StringsProvider
) {

    fun getUserSubscription(): String {
        return stringsProvider.getCustomString(R.string.subscription_free_title)
    }
}

