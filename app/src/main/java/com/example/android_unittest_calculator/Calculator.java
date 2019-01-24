package com.example.android_unittest_calculator;

import java.util.ArrayList;
import java.util.Arrays;

public class Calculator {

    public static final String[] ALLOWED_SYMBOLS = {"+", "-", "*", "/"};

    private String displayString;

    public Calculator(String displayString) {
        this.displayString = displayString;
    }

    String addSymbol(String input) {
        if (Arrays.asList(ALLOWED_SYMBOLS).contains(input)) {
            if (displayString.length() == 0) {
                displayString += "0";
            }
            String lastChar = displayString.substring(displayString.length() - 1);
            if (Arrays.asList(ALLOWED_SYMBOLS).contains(lastChar)) {
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
        //TODO add a 0 if not numeric before it.
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

    String calculate() {
        ArrayList<String> strings = new ArrayList<>();
        String[] stringCharacterArray = displayString.split("");
        StringBuilder builder = new StringBuilder();
        for (String item : stringCharacterArray) {
            if (isDigitsOnly(String.valueOf(item))) {
                builder.append(item);
            } else if (item.equals(".")) {
                builder.append(item);
            } else if (Arrays.asList(ALLOWED_SYMBOLS).contains(item)) {
                strings.add(builder.toString());
                builder.setLength(0);
                strings.add(item);
            }
        }
        if (builder.length() == 0) {
            strings.add(strings.get(strings.size()-2));
        } else {
            strings.add(builder.toString());
        }


        double total = Double.parseDouble(strings.get(0));

        for (int i = 1; i < strings.size(); i += 2) {
            String operator = strings.get(i);
            double number = Double.parseDouble(strings.get(i + 1));
            switch (operator) {
                case "+":
                    total = total + number;
                    break;
                case "-":
                    total = total - number;
                    break;
                case "*":
                    total = total * number;
                    break;
                case "/":
                    total = total / number;
            }
        }
        String returnValue;
        if (total == (int) total) {
            returnValue = String.valueOf((int) total);
        } else {
            returnValue = String.valueOf(total);
        }
        return returnValue;
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
