package edu.itstep.sql;

import org.apache.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.*;

public class TestMySql {
    //test purposes only
    private final static Logger log = Logger.getLogger(TestMySql.class.getName());
    private Connection conn;//connection to database
    @BeforeEach
    public void setUp() {
        try {
            String url = "jdbc:mysql://127.0.0.1:3306/albums";
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
       String sql = "select user_name from albums.users where user_name='user1'";
        PreparedStatement ps = conn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        Assertions.assertTrue(rs.next());
        ps.close();
        rs.close();
    }
    @Test
    void testAlbumName()throws SQLException{
        String sql = "";
    }
}
