package com.example.android_unittest_calculator;

public class Calculator {

    private String displayString;

    public Calculator(String displayString) {
        this.displayString = displayString;
    }

    String addSymbol(String input) {
        if (input.equals(".")) {
            if (!displayString.contains(".")) {
                displayString += input;
            }
        } else {
            displayString += input;
        }
        return displayString;
    }

}
