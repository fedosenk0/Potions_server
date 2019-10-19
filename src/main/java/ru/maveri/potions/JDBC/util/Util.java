package ru.maveri.potions.JDBC.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static final String JDBC_username = "potion_user";
    private static final String JDBC_password = "2F$[NQ,ZJFpY8Pavl8pFEEL2SaYYFLK";
    private static final String JDBC_URL = "jdbc:postgresql://localhost:5432/potion_db";
    private static final String JDBC_driver = "org.postgresql.Driver";
    private static  Connection connection ;

    public static Connection getConnection() {
        //if(connection == null) {
            try {
                connection = DriverManager.getConnection(JDBC_URL, JDBC_username, JDBC_password);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        //}


        return connection;
    }
}
