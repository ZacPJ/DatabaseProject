package com.sparta.Database;

import com.sparta.fileReader.Employee;

import java.util.List;

public interface DAO {
    void create();


    List<Employee> readAll();



}
