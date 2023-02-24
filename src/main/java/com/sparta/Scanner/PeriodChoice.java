package com.sparta.Scanner;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Scanner;

public class PeriodChoice {
    public static Date[] choosePeriod(){
        Scanner s = new Scanner(System.in);
        //get start date
        System.out.println("enter the start date (YYYY-mm-dd) including the dashes");
        Date startDate = Date.valueOf(s.next());
        //get end date
        System.out.println("enter the end date (YYYY-mm-dd) including the dashes");
        Date endDate = Date.valueOf(s.next());
        //return the two dates as an array of dates, index 0 is min date, index 1 is max date
        return new Date[]{startDate,endDate};
    }

}
