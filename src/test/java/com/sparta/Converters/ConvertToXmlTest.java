package com.sparta.Converters;

import com.sparta.fileReader.Employee;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.FileReader;

public class ConvertToXmlTest {
    @Test
    @DisplayName("Given no employees and the file named 'testXml' then the file is created ")
    public void  givenNoEmployees_Create_XmlfileCalled_testXml(){
        String fileName="testXml";
        Employee[] employees={};
        ConvertToXML converter=new ConvertToXML();
        converter.convert(employees,fileName);
        Assertions.assertDoesNotThrow(()->new FileReader("src/main/resources/testXml.xml"));
    }
}
