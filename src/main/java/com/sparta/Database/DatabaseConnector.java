package com.sparta.Database;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DatabaseConnector {
    private static Connection connection = null;
    public static Connection getConnection() {
        if(connection == null){
            Properties props = new Properties();
            try {
                props.load(new FileReader("src/main/resources/dbconnect.properties"));
                connection = DriverManager.getConnection(
                        props.getProperty("dburl"),
                        props.getProperty("dbuser"),
                        props.getProperty("dbpassword")
                );

            } catch (IOException | SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return connection;
    }

    public static void closeConnection() throws SQLException{
        if (connection != null){
            connection.close();
        }
    }
    private DatabaseConnector(){}
}
