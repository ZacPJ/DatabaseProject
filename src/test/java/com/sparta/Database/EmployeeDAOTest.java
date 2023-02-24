package com.sparta.Database;

import com.sparta.fileReader.EmployeeCreator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import java.sql.Connection;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeDAOTest {
    @Test
    @DisplayName("Display Employees")
    void displayEmployeeRowOne(){
        EmployeeDAO employeeDAO = new EmployeeDAO();
        Object output = employeeDAO.readAll();
        assertTrue(output!=null);
}
    @Test
    @DisplayName("Test Filters")
    void testFilter(){
        EmployeeDAO employeeDAO = new EmployeeDAO();
        Object output = employeeDAO.readByFilter();
        System.out.println(output);
    }
}