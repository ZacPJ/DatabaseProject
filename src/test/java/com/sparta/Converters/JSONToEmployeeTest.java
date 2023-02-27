package com.sparta.Converters;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.sparta.fileReader.Employee;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JSONToEmployeeTest {
    @Test
    @DisplayName("JSONToEmployee")
    void JSONFileToEmployeeObject(){
        try {

            Employee test = JSONToEmployee.jsonToObject(
                    "{\n" +
                            "    \"emp_no\": 14397,\n" +
                            "    \"birth_date\": \"1957-09-15\",\n" +
                            "    \"first_name\": \"Feixiong\",\n" +
                            "    \"last_name\": \"Hardjono\",\n" +
                            "    \"gender\": \"F\",\n" +
                            "    \"hire_date\": \"1993-08-05\"\n" +
                            "  }");
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