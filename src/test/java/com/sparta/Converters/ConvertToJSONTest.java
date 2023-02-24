package com.sparta.Converters;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sparta.fileReader.Employee;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.Date;
import java.time.LocalDate;
import java.util.Arrays;

public class ConvertToJSONTest {
    @Test
    @DisplayName("Given no employees and the file named 'testJson' then the file is created ")
    public void  givenNoEmployees_Create_JsonfileCalled_testJson(){
        String fileName="testJson";
        Employee[] employees={};
        ConvertToJSON converter=new ConvertToJSON();
        converter.convert(employees,fileName);
        Assertions.assertDoesNotThrow(()->new FileReader("src/main/resources/testJson.json"));
    }

//    @Test
//    @DisplayName("Given two employees and the json file containing two employees is created")
//    public void  givenEmployees_CreatingFilesContainingTem(){
//        Employee employee1=new Employee(1, "2015-03-05","Honghao","Zheng","Male","2016-03-06");
//        Employee employee2=new Employee(2, "1401-05-06","Honghao2","Zheng2","Male","1401-05-06");
//        Object[] employees={employee1, employee2};
//        ConvertToJSON converter=new ConvertToJSON();
//        converter.convert(employees,"testJson");
//        String expectedResult= Arrays.toString(employees);
//        ObjectMapper mapper=new ObjectMapper();
//        Employee[] contentFromFile;
//        try {
//            contentFromFile = mapper.readValue(
//                    new File("src/main/resources/testJson.json"),
//                    Object.class);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        String actualResult= Arrays.toString(contentFromFile);
//        Assertions.assertEquals(expectedResult,actualResult);
//    }

}
