package com.sparta.Converters;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sparta.fileReader.Employee;

public class JSONToEmployee {
    public static Employee jsonToObject(String s) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(s, Employee.class);
    }
}
