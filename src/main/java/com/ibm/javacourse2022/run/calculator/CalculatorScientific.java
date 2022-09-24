package com.ibm.javacourse2022.run.calculator;

import java.math.BigDecimal;

public interface CalculatorScientific {
    public static final double E = 2.718281828459045;//constant
    public static final BigDecimal Pi = BigDecimal.valueOf(3.142857142857143);
    public Number modulDivide(Number operand1, Number operand2);
    public Number factoriel(Long arg);
    public double sinMath(double value);
    //>= Java 1.8
    default void printResult(Number result){
        System.out.println(result);
    }
  public static double getConstantE(){
        return E;
    }
   public static BigDecimal getConstantPi(){
        return BigDecimal.valueOf(22.0/7.0);
    }
}
