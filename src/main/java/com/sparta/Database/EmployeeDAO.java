package com.sparta.Database;

import com.sparta.fileReader.EmployeeCreator;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EmployeeDAO implements DAO {
    @Override
    public void create() {

    }

    @Override
    public void readAll() {
        Statement statement = null;
        ResultSet rs = null;

        List<Object> employeeList = new ArrayList<>();

        try{
            Connection connection = DatabaseConnector.getConnection();
            statement = connection.createStatement();
            rs = statement.executeQuery("SELECT * FROM employees.employees");

            while(rs.next()){
                employeeList.add(rs.getInt(1));
                employeeList.add(rs.getDate(2));
                employeeList.add(rs.getString(3));
                employeeList.add(rs.getString(4));
                employeeList.add(rs.getString(5));
                employeeList.add(rs.getDate(6));
            }

            Object[] employeesObjects = employeeList.toArray();
            EmployeeCreator.createEmployee(employeesObjects);
        } catch (SQLException e){
            throw new RuntimeException(e);
        } finally{
                DatabaseConnector.closeConnection();
        }
    }
}