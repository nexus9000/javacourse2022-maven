package edu.itstep.sql;

import org.apache.log4j.Logger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestMySql {
    //test purposes only
    private final static Logger log = Logger.getLogger(TestMySql.class.getName());
    private Connection conn;//connection to database
    @BeforeEach
    public void setUp() {
        try {
            String url = "jdbc:mysql://127.0.0.1:3306/test";
            String user = "root";
            String password = "cisco";
            conn = DriverManager.getConnection(url, user, password);
            log.info("Connection to database is OK!");
            System.out.println("conn is ok");
        } catch (SQLException sql) {
            log.error("problem with driver. Not found!");
            sql.printStackTrace();
        }
    }
    @Test
    void testUserName()throws SQLException{

    }
}
