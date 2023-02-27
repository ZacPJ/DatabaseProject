package com.sparta.Converters;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.sparta.fileReader.Employee;
import com.sparta.fileReader.JSONReader;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.Convert;

import static org.junit.jupiter.api.Assertions.*;

class JSONToEmployeeTest {
    @Test
    @DisplayName("JSONToEmployee")
    void JSONFileToEmployeeObject(){
        try {
            Employee test = JSONToEmployee.jsonToObject(JSONReader.readFromJson()).get(0);
            Employee expected = new Employee(
                    14397,
                    "1957-09-15",
                    "Feixiong",
                    "Hardjono",
                    "F",
                    "1993-08-05"
  );
            assertTrue(test.equals(expected));
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }


}