package com.flknlabs.calculator.di

import com.flknlabs.calculator.usecase.SumUseCase
import com.flknlabs.core.resource.StringsProvider
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class CalculatorModule {

    @Provides
    @Singleton
    fun sumUseCase(
        stringsProvider: StringsProvider
    ): SumUseCase = SumUseCase(stringsProvider)

}
