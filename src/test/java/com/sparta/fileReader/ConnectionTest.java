package com.sparta.fileReader;

import static org.junit.jupiter.api.Assertions.*;

import com.sparta.Database.DatabaseConnector;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.sql.Connection;

public class ConnectionTest {
    @Test
    @DisplayName("Given a null connection existed and create new connection return a not null connection")
    public void givenNullConnectionAndNewConnection_NullBecome_NewConnection(){
        Connection oldConnection=null;
        Connection newConnection= DatabaseConnector.getConnection();
        assertNotNull(newConnection);
    }
    @Test
    @DisplayName("Given a not null connection existed create connection return the same connection")
    public void givenNotNullConnection_Return_Connection(){
        Connection expectedConnection=DatabaseConnector.getConnection();
        assertTrue(expectedConnection==DatabaseConnector.getConnection());//it only asserts the values equal but not the entire object
    }

//    @Test
//    @DisplayName("create a connection and it does not throw exception")
//    public void givenNotNullConnection_Return_Connection(){
//        Connection expectedConnection=DatabaseConnector.getConnection();
//        assertDoesNotThrow(expectedConnection, DatabaseConnector.getConnection());//it only asserts the values equal but not the entire object
//    }
}
