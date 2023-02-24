package com.sparta;

import com.sparta.Database.EmployeeDAO;
import com.sparta.Scanner.DepartmentChoice;
import com.sparta.fileReader.Employee;

import java.util.List;

public class Main {
    public static void main(String[] args) {
//        EmployeeDAO employeeDAO = new EmployeeDAO();
//        List o = employeeDAO.readAll();
//
//        System.out.println(o);
        DepartmentChoice.chooseDepartment();
    }
}