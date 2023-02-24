package com.sparta.Database;

import com.sparta.Scanner.DepartmentChoice;
import com.sparta.Scanner.PeriodChoice;
import com.sparta.fileReader.Employee;
import com.sparta.fileReader.EmployeeCreator;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO implements DAO {
    @Override
    public void create() {

    }

    @Override
    public List<Object> readAll() {
        Statement statement = null;
        ResultSet rs = null;
        List<Object> allEmployees = new ArrayList<Object>();
        Object[] employeeList = new Object[6];

        try{
            Connection connection = DatabaseConnector.getConnection();
            statement = connection.createStatement();
            rs = statement.executeQuery("SELECT * FROM employees.employees");

            while(rs.next()){
                employeeList[0]=(rs.getInt(1));
                employeeList[1]=(rs.getDate(2));
                employeeList[2]=(rs.getString(3));
                employeeList[3]=(rs.getString(4));
                employeeList[4]=(rs.getString(5));
                employeeList[5]=(rs.getDate(6));
                allEmployees.add(EmployeeCreator.createEmployee(employeeList));
            }

        return allEmployees;

        } catch (SQLException e){
            throw new RuntimeException(e);
        } finally{
                DatabaseConnector.closeConnection();
        }
    }

    @Override
    public List<Object> readByFilter() {

        int[] employeeIds = DepartmentFilter.filterDepartment(DepartmentChoice.chooseDepartment(), PeriodChoice.choosePeriod()[0], PeriodChoice.choosePeriod()[1]);


        return null;
    }
}
