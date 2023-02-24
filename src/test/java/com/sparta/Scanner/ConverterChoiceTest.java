package com.sparta.Scanner;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class ConverterChoiceTest {
    @Test
    @DisplayName("Given an Input of XML, returns XML")
    public void givenAnInputOfXML_ReturnsXML(){
        String expectedResult = "XML";
        String input = "XML";

        assertEquals(expectedResult, ConverterChoice.chooseConverter(new Scanner(input)));
    }
    @Test
    @DisplayName("Given an input of JSON, returns JSON")
    public void givenAnInputOfJSON_ReturnsJSON(){
        String expectedResult = "JSON";
        String input = "JSON";

        assertEquals(expectedResult, ConverterChoice.chooseConverter(new Scanner(input)));
    }
    @Test
    @DisplayName("If Input is not XML or JSON, returns null")
    public void ifInputIsNotXMLOrJSON_ReturnsNull(){
        String input = "Not XML or JSON";

        assertNull(ConverterChoice.chooseConverter(new Scanner(input)));
    }
}