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

    String addDigit(String input) {
        if (isDigitsOnly(input)) {
            displayString += input;
        }
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


    private static boolean isDigitsOnly(CharSequence str) {
        final int len = str.length();
        for (int cp, i = 0; i < len; i += Character.charCount(cp)) {
            cp = Character.codePointAt(str, i);
            if (!Character.isDigit(cp)) {
                return false;
            }
        }
        return true;
    }


}
