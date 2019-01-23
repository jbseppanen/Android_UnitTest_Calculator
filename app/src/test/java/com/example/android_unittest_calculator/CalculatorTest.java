package com.example.android_unittest_calculator;

import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void setUp() throws Exception {
        calculator = new Calculator("");
    }

    @Test
    public void shouldReturnSingleCharacterWhenSingleCharacterAdded() {
        //Setup
        String singleChar = "1";
        //Execution
        String checkString = calculator.addSymbol(singleChar);
        //Check
        assertEquals(singleChar, checkString);
    }

    @Test
    public void shouldReturnConcatenatedStringWhenMulitpleStringsAdded() {
        //Setup
        String string0 = "0";
        String string1 = ".";
        String string2 = "7";
        String string3 = "1";
        String string4 = "46";
        String concatenatedString = string0 + string1 + string2 + string3 + string4;

        //Execution
        calculator.addSymbol(string0);
        calculator.addSymbol(string1);
        calculator.addSymbol(string2);
        calculator.addSymbol(string3);
        String checkString = calculator.addSymbol(string4);

        //Check
        assertEquals(concatenatedString, checkString);
    }

    @Test
    public void shouldReturnSingleDecimalIfMultipleAdded() {
        //Setup
        String intialString = "12345.";
        //Execution
        calculator.addSymbol(intialString);
        String checkString = calculator.addDecimal();
        //Check
        assertEquals(intialString,checkString);
    }

    @Test
    public void shouldReturnLastItemRemoved() {
        //Setup
        String intialString = "12345.";
        String backspacedString = "12345";
        //Execution
        calculator.addSymbol(intialString);
        String checkString = calculator.removeLast();
        //Check
        assertEquals(backspacedString,checkString);
    }

}