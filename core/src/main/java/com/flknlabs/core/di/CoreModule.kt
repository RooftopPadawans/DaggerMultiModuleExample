package com.flknlabs.core.di

import android.app.Application
import com.flknlabs.core.resource.StringsProvider
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class CoreModule(
    private val application: Application
) {

    @Provides
    @Singleton
    fun stringsProvider() = StringsProvider(application)
}