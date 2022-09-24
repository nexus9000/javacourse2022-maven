package com.ibm.javacourse2022.run.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorScientificImplTest {
    CalculatorScientificImpl scientific;

    @BeforeEach
    void setUp() {
        scientific = new CalculatorScientificImpl();
    }

    @Test
    void piTest() {
        //assertEquals(expected, actual)
        assertEquals(Math.PI, (CalculatorScientific.getConstantPi()));

        System.out.println(22.0 / 7.0);//double
        System.out.println(CalculatorScientific.Pi);//usage BigDecimal
        String result = String.format("%.7f", CalculatorScientific.getConstantPi());
        System.out.println(result);
    }

    @Test
    void modulDivideTest() {
        assertEquals(0.0, scientific.modulDivide(4.0, 2.0));
        assertEquals(1.0, scientific.modulDivide(9.0, 2.0));
    }

    @Test
    void factorielTest() {
        assertEquals(6L, scientific.factoriel(3L));
        assertEquals(120L, scientific.factoriel(5L));
        assertEquals(720L, scientific.factoriel(6L));
    }

    @Test
    void sinMathTest() {
        assertEquals(1, Math.round(Math.sin(Math.toRadians(90))));
        assertEquals(0, Math.round(Math.sin(Math.toRadians(0))));
        assertEquals(0, Math.round(Math.sin(Math.toRadians(180))));
        assertEquals(0, Math.round(Math.sin(Math.toRadians(360))));
        assertEquals(1, Math.round(Math.sin(Math.toRadians(45))));
    }
}