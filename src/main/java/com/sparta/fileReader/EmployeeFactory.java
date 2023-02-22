package com.sparta.fileReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmployeeFactory {

    public static String[] getEmployees(Reader reader){
        List<String> result = new ArrayList<>();
        String line;
        BufferedReader bufferedReader = new BufferedReader(reader);
        try {
            while((line = bufferedReader.readLine()) != null){
                result.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result.toArray(new String[0]);
    }
}