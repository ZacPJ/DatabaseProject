package com.sparta.Converters;

import com.sparta.Scanner.ConverterChoice;

public class Conversion {
    public void convertObject(Object employees, String converterChoice, String fileName) {
        //Runs all the  converter factory stuff
        ConverterFactory converterFactory = new ConverterFactory();
        Converter converter = converterFactory.getConverter(converterChoice);
        converter.convert(employees,fileName);
        }
    }

