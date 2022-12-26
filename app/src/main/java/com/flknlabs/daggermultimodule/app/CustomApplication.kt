package com.flknlabs.daggermultimodule.app

import android.app.Application
import com.flknlabs.calculator.di.CalculatorComponent
import com.flknlabs.calculator.di.provider.CalculatorComponentProvider
import com.flknlabs.calculator.di.DaggerCalculatorComponent
import com.flknlabs.core.di.CoreModule
import com.flknlabs.daggermultimodule.di.ApplicationComponent
import com.flknlabs.daggermultimodule.di.DaggerApplicationComponent
import com.flknlabs.daggermultimodule.di.provider.ApplicationComponentProvider

class CustomApplication : Application(),
    CalculatorComponentProvider,
    ApplicationComponentProvider {

    private val coreModule: CoreModule by lazy {
        CoreModule(this)
    }

    override fun getCalculatorComponent(): CalculatorComponent {
        return DaggerCalculatorComponent.builder()
            .coreModule(coreModule)
            .build()
    }

    override fun getApplicationComponent(): ApplicationComponent {
        return DaggerApplicationComponent.builder()
            .coreModule(coreModule)
            .build()
    }

}