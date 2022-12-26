package com.flknlabs.calculator.usecase;

import com.flknlabs.calculator.R;
import com.flknlabs.calculator.ui.CalculatorActivity;
import com.flknlabs.core.resource.StringsProvider;

public class SumUseCase {

    private final StringsProvider stringsProvider;

    public SumUseCase(StringsProvider stringsProvider) {
        this.stringsProvider = stringsProvider;
    }

    public Result execute(Integer firstNumber, Integer secondNumber) {
        if (firstNumber > 0 && secondNumber > 0) {
            return new Result.Success(firstNumber + secondNumber);
        } else {
            return new  Result.Failure(stringsProvider.getCustomString(R.string.both_numbers_must_be_positive));
        }
    }
}

