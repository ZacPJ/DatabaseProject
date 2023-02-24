package com.sparta.Scanner;

import org.junit.jupiter.api.Test;

import java.sql.Date;
import java.time.LocalDate;
import java.sql.Date;

import static org.junit.jupiter.api.Assertions.*;

class PeriodChoiceTest {

    @Test
    void choosePeriod() {
        String[] expected = {"1987-03-22", "1999-11-2"};
        assertArrayEquals(expected, PeriodChoice.choosePeriod());
    }
}