package com.flknlabs.core.di

import com.flknlabs.core.modes.AppSubscription
import com.flknlabs.core.resource.StringsProvider
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module(includes = [CoreModule::class])
class SubscriptionModule {

    @Provides
    @Singleton
    fun appSubscription(
        stringsProvider: StringsProvider
    ): AppSubscription = AppSubscription(stringsProvider)

}