package com.example.android_unittest_calculator;

public class Calculator {

    private String displayString;

    public Calculator(String displayString) {
        this.displayString = displayString;
    }

    String addSymbol(String input) {
        displayString += input;
        return displayString;
    }

    String addDecimal() {
        if (!displayString.contains(".")) {
            displayString += ".";
        }
        return displayString;
    }

    String removeLast() {
        displayString = displayString.substring(0, displayString.length() - 1);
        return displayString;
    }


}
