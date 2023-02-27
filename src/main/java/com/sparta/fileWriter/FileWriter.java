package com.sparta.fileWriter;


//writes read employees to an output file

import java.util.Scanner;

public class FileWriter {

    public static String getFileName(){
        System.out.println("Please enter file name");
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.next();

        return "src/main/resources/" + fileName;
    }
}
