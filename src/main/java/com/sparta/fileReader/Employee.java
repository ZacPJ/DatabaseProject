package com.sparta.fileReader;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.deser.std.DateDeserializers;
import com.fasterxml.jackson.databind.ser.std.DateSerializer;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Arrays;


//Turns the list into a list of employees object type
public class Employee {
    private int emp_no;
    @JsonFormat(pattern = "yyyy/MM/dd")
    private String birth_date;
    private String first_name;
    private String last_name;
    private String gender;
    @JsonFormat(pattern = "yyyy/MM/dd")
    private  String hire_date;

    public Employee(int emp_no, String birth_date, String first_name, String last_name, String gender, String hire_date) {
        this.emp_no = emp_no;
        this.birth_date = birth_date;
        this.first_name = first_name;
        this.last_name = last_name;
        this.gender = gender;
        this.hire_date = hire_date;
    }
    public Employee(){

    }


    public int getemp_no() {
        return emp_no;
    }


    public String getbirth_date() {
        return birth_date;
    }


    public String getfirst_name() {
        return first_name;
    }


    public String getlast_name() {
        return last_name;
    }


    public String getgender() {
        return gender;
    }


    public String gethire_date() {
        return hire_date;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "emp_no=" + emp_no +
                ", birth_date='" + birth_date + '\'' +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", gender=" + gender +
                ", hire_date='" + hire_date + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj!=null){
            if (obj.toString().equals(this.toString())) {
                return true;
            }
        }
        return false;
    }
}
