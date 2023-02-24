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
    private int id;
    @JsonSerialize(using = DateSerializer.class)
    @JsonDeserialize(using = DateDeserializers.DateDeserializer.class)
    @JsonFormat(pattern = "yyyy/MM/dd")
    private String DOB;
    private String firstName;
    private String lastName;
    private String Gender;
    @JsonSerialize(using = DateSerializer.class)
    @JsonDeserialize(using = DateDeserializers.DateDeserializer.class)
    @JsonFormat(pattern = "yyyy/MM/dd")
    private  String startingDate;

    public Employee(int id, String DOB, String firstName, String lastName, String gender, String startingDate) {
        this.id = id;

        this.DOB = DOB;
        this.firstName = firstName;
        this.lastName = lastName;
        this.Gender = gender;
        this.startingDate = startingDate;
    }

    public int getId() {
        return id;
    }


    public String getDOB() {
        return DOB;
    }


    public String getFirstName() {
        return firstName;
    }


    public String getLastName() {
        return lastName;
    }


    public String getGender() {
        return Gender;
    }


    public String getStartingDate() {
        return startingDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", DOB='" + DOB + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", Gender=" + Gender +
                ", startingDate='" + startingDate + '\'' +
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
