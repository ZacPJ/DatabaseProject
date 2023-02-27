package com.sparta.fileReader;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JSONReaderTest {

    @Test
    void readFromJson() {
        String[] test = JSONReader.readFromJson();
        System.out.println(test[0]);
    }
}