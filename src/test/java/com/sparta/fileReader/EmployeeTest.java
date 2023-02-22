package com.sparta.fileReader;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
    @ParameterizedTest
    @ValueSource(ints = {1,2,3,4,5,6,7,8,9,0,10,123,-213})
    @DisplayName("Get ID")

    void getIdOfEmployee(int input){
        Employee expected = new Employee(input,"1998/02/11","Zac","Perkins-Jones",'M',"2022/30/01");
        assertEquals(expected.getId(),input);
    }
    @ParameterizedTest
    @ValueSource(strings = {"1998/02/11/","2012/10/01"})
    @DisplayName("Get DOB")
    void getDOB(String input){
        Employee expected = new Employee(1,input,"Zac","Perkins-Jones",'M',"2022/30/01");
        assertEquals(expected.getDOB(),input);
    }
    @ParameterizedTest
    @ValueSource(strings = {"Zac","Martin"})
    @DisplayName("Get First Name given input")
    void getFirstName(String input){
        Employee expected = new Employee(1,"1998/12/12",input,"Perkins-Jones",'M',"2022/30/01");
        assertEquals(expected.getFirstName(),input);
    }
    @ParameterizedTest
    @ValueSource(strings = {"Perkins","Jones","Rudd"})
    @DisplayName("Get Last Name Given Input")
    void getLastName(String input){
        Employee expected = new Employee(1,"1998/12/12","Zac",input,'M',"2022/30/01");
        assertEquals(expected.getLastName(),input);
    }
    @ParameterizedTest
    @ValueSource(chars = {'F','M'})
    @DisplayName("Get Gender Given Input")
    void getGender(char input){
            Employee expected = new Employee(1,"1998/12/12","Zac","Perkins-Jones",input,"2022/30/01");
        assertEquals(expected.getGender(),input);
    }
    @ParameterizedTest
    @ValueSource(strings = {"1998/02/11/","2012/10/01"})
    @DisplayName("Get Start Date")
    void getStartDate(String input){
        Employee expected = new Employee(1,"1998/12/12","Zac","Perkins-Jones",'M',input);
        assertEquals(expected.getStartingDate(),input);
    }

    @Test
    @DisplayName("Test 2 Employees Equality")
    void twoEqualEmployeesTest(){
        Employee first = new Employee(1,"1998/12/12","Zac","Perkins-Jones",'M',"2012/12/12");
        Employee second = new Employee(1,"1998/12/12","Zac","Perkins-Jones",'M',"2012/12/12");
        assertEquals(first,second);
    }
    @Test
    @DisplayName("Test 2 Employees not equal given different name")
    void twoNonEqualEmployeesTest(){
        Employee first = new Employee(1,"1998/12/12","James","Perkins-Jones",'M',"2012/12/12");
        Employee second = new Employee(1,"1998/12/12","Zac","Perkins-Jones",'M',"2012/12/12");
        assertNotEquals(first,second);
    }

}