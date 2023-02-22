package com.sparta.fileReader;
//Takes list from StringSplitter and creates employees from it
public class EmployeeCreator {
    public static Employee createEmployee(String[] employeeData) {
        if (employeeData!=null) {
            Employee employee = new Employee(
                    Integer.parseInt(employeeData[0]),
                    employeeData[1],
                    employeeData[2],
                    employeeData[3],
                    employeeData[4].toCharArray()[0],
                    employeeData[5]
            );
            return employee;
        }else {
            throw new IllegalArgumentException("Illegal Parameter -- Null");
        }
    }


}