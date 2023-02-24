package com.sparta.LoggerFormat;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Logger {
    public final static Logger logger = Logger.getLogger(Logger.class.getName());

    public static void createLog(String lvl, String msg){
        logger.setUseParentHandlers(false);
        logger.setLevel(Level.ALL);

        if ("ALL".equals(lvl)) {
            logger.log(Level.ALL, msg);
        } else if ("INFO".equals(lvl)) {
            logger.log(Level.INFO, msg);
        } else if ("CONFIG".equals(lvl)) {
            logger.log(Level.CONFIG, msg);
        } else if ("FINE".equals(lvl)) {
            logger.log(Level.FINE, msg);
        } else if ("FINER".equals(lvl)) {
            logger.log(Level.FINER, msg);
        } else if ("FINEST".equals(lvl)) {
            logger.log(Level.FINEST, msg);
        } else if ("WARNING".equals(lvl)) {
            logger.log(Level.WARNING, msg);
        } else if ("SEVERE".equals(lvl)) {
            logger.log(Level.SEVERE, msg);
        }
    }
}
    Note that in this version, we're using equals method to compare strings instead of the switch statement. Also, we're using else if instead of -> to check multiple conditions.





        }
