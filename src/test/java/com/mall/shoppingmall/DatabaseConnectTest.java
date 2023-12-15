package com.mall.shoppingmall;

import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;


//마리아DB connetion test
public class DatabaseConnectTest {
    static {
        try {
            Class.forName("org.mariadb.jdbc.Driver");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void testConnection() {
        try (Connection con =
                     DriverManager.getConnection(
                             "jdbc:mariadb://localhost:3306/board",
                             "root",
                             "1234")) {
            System.out.println("DB Connection => " + con);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
