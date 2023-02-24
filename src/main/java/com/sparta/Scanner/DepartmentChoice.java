package com.sparta.Scanner;

import java.sql.SQLOutput;
import java.util.Scanner;

public class DepartmentChoice {
    public static String chooseDepartment() {
        //returns the users choice of department for use in the filter
        Scanner scanner = new Scanner(System.in);
        System.out.println("This program will run until you enter the exit command 'exit");
        boolean isRunning = true;

        while(isRunning) {
            System.out.println("Please enter the department name for which you want to search for a list of employees: ");
            String userInput = scanner.nextLine();
            String deptName = userInput.toLowerCase();
            if (deptName.equals("customer service") || deptName.equals("development") || deptName.equals("finance") ||
                    deptName.equals("human resources") || deptName.equals("marketing") || deptName.equals("production") ||
                    deptName.equals("quality management") || deptName.equals("research") || deptName.equals("sales")) {
                return deptName;
            } else if(deptName.equals("exit")) {
                System.out.println("Thank you for using our program. Goodbye.");
                isRunning = false;
            } else {
                System.out.println("Invalid selection. Please choose a valid department name: ");
            }

        }
        return null;
    }
}
