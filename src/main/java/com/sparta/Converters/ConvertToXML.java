package com.sparta.Converters;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import java.io.File;
import java.io.IOException;

public class ConvertToXML implements Converter {

    @Override
    public void convert(Object employees, String fileName) {
        String pathName="src/main/resources/"+fileName+".xml";
        XmlMapper mapper=new XmlMapper();
        try {
            mapper.writeValue(new File(pathName), employees);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
