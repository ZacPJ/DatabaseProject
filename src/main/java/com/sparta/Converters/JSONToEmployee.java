package com.sparta.Converters;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sparta.fileReader.Employee;

import java.util.ArrayList;
import java.util.List;

public class JSONToEmployee {
    public static List<Employee> jsonToObject(String[] s) throws JsonProcessingException {
        List<Employee> employeesList = new ArrayList<Employee>();
        for(String t: s) {
            Employee employee = new Employee();
            ObjectMapper mapper = new ObjectMapper();
            employee = mapper.readValue(t, Employee.class);
            employeesList.add(employee);
        }
        return employeesList;
    }
}
