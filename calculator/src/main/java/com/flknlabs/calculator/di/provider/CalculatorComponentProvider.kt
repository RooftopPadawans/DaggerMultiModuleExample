package com.flknlabs.calculator.di.provider

import com.flknlabs.calculator.di.CalculatorComponent

interface CalculatorComponentProvider {

    fun getCalculatorComponent(): CalculatorComponent

}