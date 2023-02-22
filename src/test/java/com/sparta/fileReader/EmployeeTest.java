package com.sparta.fileReader;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.sql.Date;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
    @ParameterizedTest
    @ValueSource(ints = {1,2,3,4,5,6,7,8,9,0,10,123,-213})
    @DisplayName("Get ID")

    void getIdOfEmployee(int input){
        Employee expected = new Employee(input,new Date(2012/02/11),"Zac","Perkins-Jones",'M',new Date(2012/02/11));
        assertEquals(expected.getId(),input);
    }
    @Test
    @DisplayName("Get DOB")
    void getDOB(){
        Date input = new Date(2012/02/11);
        Employee expected = new Employee(1,new Date(2012/02/11),"Zac","Perkins-Jones",'M',new Date(2012/02/11));
        assertEquals(expected.getDOB(),input);
    }
    @ParameterizedTest
    @ValueSource(strings = {"Zac","Martin"})
    @DisplayName("Get First Name given input")
    void getFirstName(String input){
        Employee expected = new Employee(1,new Date(2012/02/11),input,"Perkins-Jones",'M',new Date(2012/02/11));
        assertEquals(expected.getFirstName(),input);
    }
    @ParameterizedTest
    @ValueSource(strings = {"Perkins","Jones","Rudd"})
    @DisplayName("Get Last Name Given Input")
    void getLastName(String input){
        Employee expected = new Employee(1,new Date(2012/02/11),"Zac",input,'M',new Date(2012/02/11));
        assertEquals(expected.getLastName(),input);
    }
    @ParameterizedTest
    @ValueSource(chars = {'F','M'})
    @DisplayName("Get Gender Given Input")
    void getGender(char input){
        Employee expected = new Employee(1,new Date(2012/02/11),"Zac","Perkins-Jones",input,new Date(2012/02/11));
        assertEquals(expected.getGender(),input);
    }
    @Test
    @DisplayName("Get Start Date")
    void getStartDate(){
        Date input = new Date(2012/02/11);
        Employee expected = new Employee(1,new Date(2012/02/11),"Zac","Perkins-Jones",'M',input);
        assertEquals(expected.getStartingDate(),input);
    }

    @Test
    @DisplayName("Test 2 Employees Equality")
    void twoEqualEmployeesTest(){
        Employee first = new Employee(1,new Date(2012/02/11),"Zac","Perkins-Jones",'M',new Date(2012/02/11));
        Employee second = new Employee(1,new Date(2012/02/11),"Zac","Perkins-Jones",'M',new Date(2012/02/11));
        assertEquals(first,second);
    }
    @Test
    @DisplayName("Test 2 Employees not equal given different name")
    void twoNonEqualEmployeesTest(){
        Employee first = new Employee(1,new Date(2012/02/11),"James","Perkins-Jones",'M',new Date(2012/02/11));
        Employee second = new Employee(1,new Date(2012/02/11),"Zac","Perkins-Jones",'M',new Date(2012/02/11));
        assertNotEquals(first,second);
    }

}