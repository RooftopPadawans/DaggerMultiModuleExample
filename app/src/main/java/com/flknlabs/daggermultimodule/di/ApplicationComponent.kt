package com.flknlabs.daggermultimodule.di

import com.flknlabs.core.di.SubscriptionModule
import com.flknlabs.daggermultimodule.MainActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        SubscriptionModule::class
    ]
)
interface ApplicationComponent {

    fun inject(activity: MainActivity)

}