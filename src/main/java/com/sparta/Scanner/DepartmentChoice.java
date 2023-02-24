package com.sparta.Scanner;

import java.util.Scanner;

public class DepartmentChoice {
    public static String chooseDepartment() {
        //returns the users choice of department for use in the filter
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the department name for which you want to search for a list of employees: ");
        String userInput = scanner.nextLine();
        String deptName = userInput.toLowerCase();
        
        if (deptName.equals("customer service") || deptName.equals("development") || deptName.equals("finance") ||
                deptName.equals("human resources") || deptName.equals("marketing") || deptName.equals("production") ||
                deptName.equals("quality management") || deptName.equals("research") || deptName.equals("sales")) {
            return deptName;
        } else {
            throw new RuntimeException("Invalid selection, please choose a valid department name.");
        }
    }
}
