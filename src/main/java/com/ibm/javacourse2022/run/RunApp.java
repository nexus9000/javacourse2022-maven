package com.ibm.javacourse2022.run;

import com.ibm.javacourse2022.run.calculator.CalculatorTools;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.DriverManager;

public class RunApp {
    static final Logger logger = Logger.getLogger(RunApp.class);
    public static void main(String...arg)throws Exception{
//         CalculatorTools ct = new CalculatorTools();
//         logger.info("Calculator was started");
//         ct.runCalculator();
//         logger.info("Application was stopped!");
        System.out.println(RunApp.class.getClass().getResource("/test.db"));
        String url = "jdbc:sqlite:"+RunApp.class.getClass().getResource("/test.db");
        // create a connection to the database
        Connection conn = DriverManager.getConnection(url);

        System.out.println("Connection to SQLite has been established.");
    }
}
