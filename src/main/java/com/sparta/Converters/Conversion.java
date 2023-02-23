package com.sparta.Converters;

import com.sparta.Scanner.ConverterChoice;

public class Conversion {
    public void convertObject() {
        //Runs all the  converter factory stuff
        ConverterFactory converterFactory = new ConverterFactory();
        Converter converter = converterFactory.getConverter(ConverterChoice.chooseConverter());
        converter.convert();
        }
    }

