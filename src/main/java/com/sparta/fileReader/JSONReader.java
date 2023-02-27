package com.sparta.fileReader;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class JSONReader {
    public static String[] readFromJson(){
        String result = "";
            List<String> resultSplit = new ArrayList<>();
            String line;
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader("src/main/resources/employees02.json"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
                while((line = bufferedReader.readLine()) != null){
                    if(line.length()>=2) {
                        if (line.charAt(line.length() - 2) == '}') {
                            result += "}, ";
                            resultSplit.add(result);
                            result = "";
                        } else {
                            result += line;
                        }
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return resultSplit.toArray(new String[resultSplit.size()]);
        }
    }

