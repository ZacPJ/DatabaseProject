package com.sparta.fileWriter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FileWriterTest {

    @Test
    void getFileName() {
        String expected = "src/main/resources/something";
        assertEquals(expected, FileWriter.getFileName());
    }
}