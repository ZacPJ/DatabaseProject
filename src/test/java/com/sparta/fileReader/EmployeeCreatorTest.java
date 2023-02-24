package com.sparta.fileReader;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.nio.file.LinkPermission;
import java.sql.Date;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeCreatorTest {
    @Test
    @DisplayName("Returns Employee type given array of strings")
    void returnEmployeeGivenArrayOfStrings(){
        Object[] input = {1,"2012/02/01","Zac","Perkins-Jones","M","2012/02/01"};
        Employee employee = EmployeeCreator.createEmployee(input);
        Employee expected = new Employee(1,"2012/02/01","Zac","Perkins-Jones","M","2012/02/01");
        assertEquals(employee,expected);
    }


}