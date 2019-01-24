package com.example.android_unittest_calculator;

import java.util.ArrayList;
import java.util.Arrays;

public class Calculator {

    public static final String[] ALLOWED_SYMBOLS = {"+", "-", "*", "/"};

    private String displayString;
    private ArrayList<String> operators = new ArrayList<>();
    private ArrayList<Double> numbers = new ArrayList<>();
    private StringBuilder numberBuilder = new StringBuilder();

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
            operators.add(input);
            numbers.add(Double.valueOf(String.valueOf(numberBuilder)));
            displayString += input;
        }
        return displayString;
    }

    String addDigit(String input) {
        String addedString = "";
        if (input.substring(0, 1).equals("-") && input.length() == 1) {
            addedString = "-";
            input = input.substring(1);
        }
        if (isDigitsOnly(input)) {
            addedString += input;
        }
        numberBuilder.append(addedString);
        displayString += addedString;
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
            //TODO figure out what to do if backpsace past an operator into a number.
            String lastChar = displayString.substring(displayString.length() - 1);
            if (Arrays.asList(ALLOWED_SYMBOLS).contains(lastChar)) {
                operators.remove(operators.size() - 1);
            }
            displayString = displayString.substring(0, displayString.length() - 1);
        }
        return displayString;
    }

    String calculate() {

        double total = numbers.get(0);

        for (int i = 0; i <operators.size(); ++i) {
//            String operator = strings.get(i);
            String operator = operators.get(i);
            double number = numbers.get(i + 1);
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
