package com.sparta.fileReader;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

//Takes list from StringSplitter and creates employees from it
public class EmployeeCreator {
    public static Employee createEmployee(Object[] employeeData) {
        if (employeeData!=null) {
            Employee employee = new Employee(
                    (Integer) employeeData[0],
                    (String) employeeData[1],
                    (String) employeeData[2],
                    (String) employeeData[3],
                    (String) employeeData[4],
                    (String) employeeData[5]
            );
            return employee;
        }else {
            throw new IllegalArgumentException("Illegal Parameter -- Null");
        }
    }


}