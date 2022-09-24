package com.ibm.javacourse2022.run.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
 CalculatorImpl calculator;
    @BeforeEach
    void setUp() {
        calculator = new CalculatorImpl();
    }
    @DisplayName("Test sum method")
    @Test
    void doSum() {
        assertEquals(4.0,calculator.doSum(2,2.0));
        assertEquals(4.0, calculator.doSum(2.0, 2.0));
        assertEquals(4L, calculator.doSum(2L,2L));

    }

    @Test
    @DisplayName("test ternary operator")
    void doTernary(){
        int operand1 = 10;
        int operand2 = 12;
        //? ternary operator
        int max = (operand1 > operand2) ? operand1 : operand2;
        System.out.println(max);
        int max1 = 0;
        if(operand1 > operand2){
            max1 = operand1;
        }else {
            max1 = operand2;
        }
    }
    void doMinus() {
        assertEquals(0.0, calculator.doMinus(4.0, 4.0));
        assertEquals(0L, calculator.doMinus(4L,4L));
        //assertEquals(0L, calculator.doMinus(4.0, 4L));
    }

    @Test
    @Disabled("not implement")
    void doDivide() {
    }

    @Test
    @Disabled("not implemented")
    void doMultiply() {
    }
}