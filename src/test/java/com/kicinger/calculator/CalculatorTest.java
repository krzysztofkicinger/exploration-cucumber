package com.kicinger.calculator;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by krzysztofk on 2017-07-26.
 */
public class CalculatorTest {

    private static Calculator calculator;

    @BeforeClass
    public static void setUp() throws Exception {
        calculator = new Calculator();
    }

    @Test
    public void shouldReturn30_when10And20AreAdded() throws Exception {
        final int expectedResult = 30;
        final int actualResult = calculator.add(10, 20);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void shouldReturnMinus30_whenMinus10AndMinus20AreAdded() throws Exception {
        final int expectedResult = -30;
        final int actualResult = calculator.add(-10, -20);
        assertEquals(expectedResult, actualResult);
    }

}