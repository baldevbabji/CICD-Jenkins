package com.sonata.springcicd.calculatortest;

import com.sonata.springcicd.calculator.CalculatorService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;



@SpringBootTest
public class CalculatorServiceTest {

    @Autowired
    private CalculatorService calculatorService;

    @Test
    public void testAddition() {
        assertEquals(5, calculatorService.add(2, 3));
    }

    @Test
    public void testSubtraction() {
        assertEquals(2, calculatorService.subtract(5, 3));
    }

    @Test
    public void testMultiplication() {
        assertEquals(15, calculatorService.multiply(3, 5));
    }

    @Test
    public void testDivision() {
        assertEquals(2, calculatorService.divide(10, 5));
    }

    @Test
    public void testDivisionByZero() {
        assertThrows(ArithmeticException.class, () -> calculatorService.divide(10, 0));
    }
}
