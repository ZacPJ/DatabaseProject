package com.sparta.Database;

import com.sparta.fileReader.Employee;

import java.sql.Date;
import java.util.List;

public interface DAO {
    void create();


    List<Object> readAll();

    List<Object> readByFilter();

}
