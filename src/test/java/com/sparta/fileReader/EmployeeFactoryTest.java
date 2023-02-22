package com.sparta.fileReader;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.Reader;
import java.io.StringReader;
import java.util.Arrays;


import static org.junit.jupiter.api.Assertions.*;

class EmployeeFactoryTest {

    @Test
    @DisplayName("Given a reader, return an array of Strings")
    public void givenAReader_ReturnArrayOfStrings(){
        Reader reader = new StringReader("An\nArray\nOf\nStrings");
        String[] expectedResult = {"An", "Array", "Of", "Strings"};
        String[] result = EmployeeFactory.getEmployees(reader);

        for(int i = 0; i < expectedResult.length; i++){
            assertEquals(expectedResult[i], result[i]);
        }
    }

}