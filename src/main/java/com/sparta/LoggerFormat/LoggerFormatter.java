package com.sparta.LoggerFormat;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Formatter;
import java.util.logging.Level;
import java.util.logging.LogRecord;

public class LoggerFormatter extends Formatter {

    @Override
    public String format(LogRecord record) {
        StringBuilder builder = new StringBuilder();

        builder.append(LocalDateTime.now().format(DateTimeFormatter.BASIC_ISO_DATE))
                .append(": ")
                .append(record.getSourceClassName())
                .append(": ")
                .append(record.getLevel())
                .append(": ")
                .append(record.getMessage());

        if (record.getLevel() == Level.WARNING) {
            builder.append(": WARNING!");
        }

        builder.append("\n");

        return builder.toString();
    }
    }


