package com.ibm.javacourse2022.sql;

import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestDB {
    @Test
    void connnetinDBTest()throws Exception{

        String url = "jdbc:sqlite:test.db";
        // create a connection to the database
       Connection conn = DriverManager.getConnection(url);
        System.out.println(TestDB.class.getClass().getResource("/test.db"));
        System.out.println("Connection to SQLite has been established.");
    }
}
