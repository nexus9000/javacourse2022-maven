package com.ibm.javacourse2022.run.calculator;





import com.sun.net.httpserver.Filter;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import org.apache.log4j.Logger;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorTools {
    CalculatorImpl calculator;
    final static Logger logger = Logger.getLogger(CalculatorTools.class);
    //constructor DI
    public CalculatorTools(CalculatorImpl calculator){
        this.calculator = calculator;
    }

    @Override
    public int hashCode() {
        return 0x32;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public CalculatorTools(){

    }
    public void runCalculator(){

        doLogic(calculator);
    }

    @SuppressFBWarnings("DM_DEFAULT_ENCODING")
    private void doLogic(CalculatorImpl calculator){
        Number operand1, operand2;
        Scanner sc = new Scanner(System.in, StandardCharsets.UTF_8);

        while(true) {
            logger.info("Choose math operation[type 1 or 2,...] or type [9 for exit]");
            logger.info("1.Multiply" +"\n" +"2.Divide" +
                    "\n"+"3.Sum"+"\n"+ "4.Minus");
            try {
                int choice = sc.nextInt();//choice entered by user
                if (choice == 9) {
                    logger.info("Program was finished!");
                    return;
                }
                logger.info("Enter a first operand!");
                 operand1 = readInput(sc);
                logger.info("Enter a second operand!");
                operand2 = readInput(sc);

            Number result  = 0L;
            switch (choice) {
                case 1: {
                    result = calculator.doMultiply(operand1, operand2);
                    break;
                }
                case 2: {
                    result = calculator.doDivide(operand1, operand2);
                    break;
                }
                case 3: {
                    result = calculator.doSum(operand1, operand2);
                    break;
                }
                case 4:
                    break;

                default: {
                    logger.info("Undefined operation");
                }
            }//end switch

             logger.info("result of operation is: "+result);
            }catch(InputMismatchException ime){
                logger.error("You didn't enter a number");
                sc = new Scanner(System.in);
                System.exit(0x57);

            }
        }//end while
    }

    public Number readInput( Scanner sc){
        try {
            long result = sc.nextLong();
            return result;
        }catch (InputMismatchException ime){
            double result = sc.nextDouble();
            return result;
        }
    }


}
