package com.hello;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void additionTest() {

        Assertions.assertEquals(10, calculator.addition(9, 1));
    }

    @Test
    void subractionTest() {

        Assertions.assertEquals(8, calculator.subtraction(9, 1));
    }

    @Test
    void divisionTest() {

        Assertions.assertEquals(3, calculator.division(6, 2));
    }

    @Test
    void multiplicationTest() {

        Assertions.assertEquals(9, calculator.multiplication(9, 1));
    }


}
