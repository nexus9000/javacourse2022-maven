package com.ibm.javacourse2022.run.calculator;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import java.util.Scanner;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorToolsTest {
Scanner sc;
CalculatorTools ct;
CalculatorImpl calculator;
    @BeforeEach
    void setUp() {
        sc = new Scanner(System.in);
        ct = new CalculatorTools(calculator);
    }

    @Test
    @Disabled
    void runCalculator(){
    }
    @Test
    @Disabled
    void readInput()throws Exception{

       assertEquals(4L, ct.readInput(sc) );
    }
    @AfterAll
    void tearDown() throws Exception{
        sc.close();
        sc = null;
        ct = null;
    }
}