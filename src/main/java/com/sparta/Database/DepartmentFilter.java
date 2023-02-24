package com.sparta.Database;

import com.sparta.Scanner.PeriodChoice;

import java.sql.*;
import java.util.ArrayList;

public class DepartmentFilter {


    public static ArrayList<Integer> filterDepartment(String userDepartmentInput, Date minDate, Date maxDate){


        ArrayList<Integer> employeeIdArrayList = new ArrayList<>();
        PreparedStatement preparedStatement = null;
        ResultSet rs = null;

        String query = "SELECT dept_emp.dept_no, employees.emp_no" +
                "FROM dept_emp" +
                "INNER JOIN employees" +
                "ON dept_emp.emp_no = employees.emp_no" +
                "WHERE dept_no = ?" +
                "WHERE dept_emp.from_date >= ?" +
                "AND dept_emp.to_date <= ?";

        try {
            Connection connection = DatabaseConnector.getConnection();
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, userDepartmentInput);
            preparedStatement.setDate(2, minDate);
            preparedStatement.setDate(3, maxDate);
//            preparedStatement.setString(1, "d005");  // userDepartmentInput
//            preparedStatement.setString(2, "1995-05-05"); // minDate
//            preparedStatement.setString(3, "1998-05-05"); // maxDate
            rs = preparedStatement.executeQuery();
            while (rs.next()) {
                System.out.println(
                                // SQL columns indexed from 1
                        employeeIdArrayList.add(rs.getInt("employees.emp_no"))

                );
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    return employeeIdArrayList;
    }
}
