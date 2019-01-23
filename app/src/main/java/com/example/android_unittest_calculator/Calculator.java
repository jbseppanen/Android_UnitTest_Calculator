package com.example.android_unittest_calculator;

import java.util.Arrays;

public class Calculator {

    private String displayString;

    public Calculator(String displayString) {
        this.displayString = displayString;
    }

    String addSymbol(String input) {
        String[] allowedSymbols = {"+", "-", "*", "/"};
        if (Arrays.asList(allowedSymbols).contains(input)) {
            if (displayString.length() == 0) {
                displayString += "0";
            }
            String lastChar = displayString.substring(displayString.length()-1);
            if (Arrays.asList(allowedSymbols).contains(lastChar)) {
                removeLast();
            }
            displayString += input;
        }
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
        if (displayString.length() > 0) {
            displayString = displayString.substring(0, displayString.length() - 1);
        }
        return displayString;
    }


    //Copied from TextUtils.isDigitsOnly to make it work with tests.
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
