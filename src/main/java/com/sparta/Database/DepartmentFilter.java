package com.sparta.Database;

import com.sparta.Scanner.PeriodChoice;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class DepartmentFilter {


    public static ArrayList<Integer> filterDepartment(String userDepartmentInput, String minDate, String maxDate){


        ArrayList<Integer> employeeIdArrayList = new ArrayList<>();
        PreparedStatement preparedStatement = null;
        ResultSet rs = null;

        String query = "SELECT employees.emp_no "+
       "FROM employees.dept_emp " +
        "INNER JOIN departments " +
        "ON departments.dept_no = dept_emp.dept_no " +
        "INNER JOIN employees " +
        "ON dept_emp.emp_no = employees.emp_no " +
        "WHERE dept_name = ? "+
        "AND from_date > ? " +
        "AND to_date < ?";


        try {
            Connection connection = DatabaseConnector.getConnection();
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, userDepartmentInput);
            preparedStatement.setString(2, minDate);
            preparedStatement.setString(3, maxDate);
//            preparedStatement.setString(1, "d005");  // userDepartmentInput
//            preparedStatement.setString(2, "1995-05-05"); // minDate
//            preparedStatement.setString(3, "1998-05-05"); // maxDate
            rs = preparedStatement.executeQuery();
            while (rs.next()) {
                                // SQL columns indexed from 1
                        employeeIdArrayList.add(rs.getInt(1));
            }
            return employeeIdArrayList;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }



    }
}
