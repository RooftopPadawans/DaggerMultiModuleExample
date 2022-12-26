package com.flknlabs.calculator.di

import com.flknlabs.calculator.ui.CalculatorActivity
import com.flknlabs.core.di.CoreModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        CalculatorModule::class,
        CoreModule::class
    ]
)
interface CalculatorComponent {

    fun inject(calculatorActivity: CalculatorActivity)
}