package com.sparta.Database;

import com.sparta.fileReader.EmployeeCreator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import java.sql.Connection;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeDAOTest {
    @Test
    @DisplayName("Display Employee Row 1")
    void displayEmployeeRowOne(){
        EmployeeDAO employeeDAO = new EmployeeDAO();
        employeeDAO.readAll();
}
}