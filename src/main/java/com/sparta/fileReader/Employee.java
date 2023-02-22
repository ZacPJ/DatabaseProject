package com.sparta.fileReader;


import java.sql.Date;
import java.time.LocalDate;
import java.util.Arrays;


//Turns the list into a list of employees object type
public class Employee {
    private int id;
    private Date DOB;
    private String firstName;
    private String lastName;
    private String Gender;
    private  Date startingDate;

    public Employee(int id, Date DOB, String firstName, String lastName, String gender, Date startingDate) {
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


    public Date getDOB() {
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


    public Date getStartingDate() {
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
