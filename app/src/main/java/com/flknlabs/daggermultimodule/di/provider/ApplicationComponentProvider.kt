package com.flknlabs.daggermultimodule.di.provider

import com.flknlabs.daggermultimodule.di.ApplicationComponent

interface ApplicationComponentProvider {

    fun getApplicationComponent(): ApplicationComponent

}