package com.sparta.Converters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ConverterFactoryTest {
    @ParameterizedTest
    @ValueSource(strings = {"hello","K","and"})
    @DisplayName("Given the choices that are not XML or JSON, return null ")
    public void givenChoiceThatIsNot_XMLorJSON_returnNull(String input){
        Assertions.assertNull(new ConverterFactory().getConverter (input));
    }

    @Test
    @DisplayName("Given XML return xmlConverter class")
    public void givenXmlChoice_returnXMLConverter(){
        Converter converterComputed=new ConverterFactory().getConverter("XML");
        Assertions.assertEquals(ConvertToXML.class,converterComputed.getClass());
    }
    @Test
    @DisplayName("Given JSON return jsonConverter class")
    public void givenJsonChoice_returnJSONConverter(){
        Converter converterComputed=new ConverterFactory().getConverter("JSON");
        Assertions.assertEquals(ConvertToJSON.class,converterComputed.getClass());
    }
}
