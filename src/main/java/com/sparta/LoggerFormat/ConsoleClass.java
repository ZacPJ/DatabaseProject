package com.sparta.LoggerFormat;

import java.util.logging.Logger;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;

public class ConsoleClass {

    public static void runConsole(){
        ConsoleHandler consoleHandler = new ConsoleHandler();
        LoggerClass.logger.addHandler(consoleHandler);

        if(consoleHandler.getLevel() == null){
            consoleHandler.setLevel(Level.ALL);
        }

        if(consoleHandler.getFormatter() == null){
            consoleHandler.setFormatter(new LoggerFormatter());
        }
    }

}
