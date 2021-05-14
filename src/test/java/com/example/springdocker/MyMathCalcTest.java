package com.example.springdocker;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Max Erling
 * Date: 2021-05-14
 * Copyright: MIT
 * Class: Java20B
 */
class MyMathCalcTest {
    private MyMathCalc mc;

    @BeforeEach
    public void setup() {
        mc = new MyMathCalc();
    }


    @Test
    @DisplayName("Testing add method")
    void add() {
        int a = 2;
        int b = 2;
        int result = mc.add(a,b);
        int expected = 4;

        assertEquals(expected,result, a + " + " + b + ", expected to be  " + expected);
    }

    @Test
    @DisplayName("Testing multiply method")
    void multiply() {
        int a = 3;
        int b = 3;
        int result = mc.multiply(a,b);
        int expected = 9;

        assertEquals(expected,result, a + " * " + b + ", expected to be  " + expected);

    }

    @Test
    @DisplayName("Testing divide method")
    void divide() {
        int a = 3;
        int b = 3;
        int result = mc.divide(1,2);
        int expected = 0;
        assertEquals(expected,result, a + "/" + b + ", expected to be " + expected);
        assertThrows(ArithmeticException.class,() -> mc.divide(1,0), "Should return " + ArithmeticException.class.getName());
    }
}