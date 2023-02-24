package com.sparta.Scanner;

import java.util.Scanner;

public class ConverterChoice {

    public static String chooseConverter(Scanner scanner){
        //Ask for XML OR JSON, calls correct converter
        System.out.println("Would you like an XMl or a JSON file?");
        String input = scanner.nextLine();
             if(input.equals("XML") || input.equals("JSON")) {
                 return input;
             }else {
             System.out.println("Please input either XML or JSON");
             chooseConverter(new Scanner(System.in));
             return null;
             }
    }
}