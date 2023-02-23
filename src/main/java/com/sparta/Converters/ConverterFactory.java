package com.sparta.Converters;

public class ConverterFactory {
        public Converter getConverter(String choice){
            if(choice.equals("XML")){
                return new ConvertToXML();
            }
            if(choice.equals("JSON")){
                return new ConvertToJSON();
            }
            return null;
        };

    }


