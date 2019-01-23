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

/*
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
*/

    @Test
    public void shouldReturnSingleDecimalIfMultipleAdded() {
        //Setup
        String intialString = "12345";
        String expectedString = "12345.";
        //Execution
        calculator.addDigit(intialString);
        String checkString = calculator.addDecimal();
        checkString = calculator.addDecimal();
        //Check
        assertEquals(expectedString, checkString);
    }

    @Test
    public void shouldReturnWithLastItemRemoved() {
        //Setup
        String intialString = "12345";
        String backspacedString = "1234";
        //Execution
        calculator.addDigit(intialString);
        String checkString = calculator.removeLast();
        //Check
        assertEquals(backspacedString, checkString);
    }

    @Test
    public void shouldReturnStringWithAddedDigits() {
        //Setup
        String digitsToAdd = "12345";
        //Execution
        String checkString = calculator.addDigit(digitsToAdd);
        //Check
        assertEquals(digitsToAdd, checkString);
    }

    @Test
    public void shouldNotReturnStringWithAddedLetters() {
        //Setup
        String digitsToAdd = "abcde";
        //Execution
        String checkString = calculator.addDigit(digitsToAdd);
        //Check
        assertNotEquals(digitsToAdd, checkString);
    }

    @Test
    public void shouldReturnStringWithAddedSymbol() {
        //Setup
        String intialString = "12345";
        String expectedString = "12345+";
        //Execution
        calculator.addDigit(intialString);
        String checkString = calculator.addSymbol("+");
        //Check
        assertEquals(expectedString, checkString);
    }

    @Test
    public void shouldReturnStringWithLeading0IfSymbolFirst() {
        //Setup
        String expectedString = "0+";
        //Execution
        String checkString = calculator.addSymbol("+");
        //Check
        assertEquals(expectedString, checkString);
    }

    @Test
    public void shouldReturnWithLastSymbolChangedRatherThanAddedIfLastCharacterIsAlreadyASymbol() {
        //Setup
        String intialString = "12345";
        String expectedString = "12345-";
        //Execution
        calculator.addDigit(intialString);
        calculator.addSymbol("+");
        String checkString = calculator.addSymbol("-");
        //Check
        assertEquals(expectedString, checkString);
    }

}