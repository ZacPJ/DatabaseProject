package com.sparta.Converters;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class ConvertToJSON implements Converter{
    @Override
    public void convert(Object employees, String fileName) {
        String pathName="src/main/resources/"+fileName+".json";
        ObjectMapper mapper=new ObjectMapper();
        try {
            mapper.writeValue(new File(pathName), employees);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
