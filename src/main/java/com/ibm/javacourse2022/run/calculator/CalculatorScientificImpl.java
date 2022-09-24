package com.ibm.javacourse2022.run.calculator;

public class CalculatorScientificImpl implements CalculatorScientific{
    @Override
    public Number modulDivide(Number operand1, Number operand2) {
        if(operand1 instanceof Double){
            return operand1.doubleValue() % operand2.doubleValue();
        }
        else if(operand2 instanceof Double){
            return operand1.doubleValue() % operand2.doubleValue();
        }
        else if (operand1 instanceof Long && operand2 instanceof Long) {
            return operand1.longValue() % operand2.longValue();
        } else if (operand1 instanceof Double && operand2 instanceof Double) {
            return operand1.doubleValue() % operand2.doubleValue();
        }
        throw new RuntimeException("NaN");
    }

      @Override
   public Long factoriel(Long arg) {
        Long result = 1L;
      if (arg != 1) {//recursion
            result = arg * factoriel(arg - 1);
        }
       return result;
    }

    @Override
    public double sinMath(double value) {
        return Math.round(Math.sin(Math.toRadians(value)));
    }



}
