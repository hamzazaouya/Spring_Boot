package com.zaouya.cruddemo.dao;

import com.zaouya.cruddemo.entity.Student;
import java.rmi.StubNotFoundException;

public interface StudentDAO {
    void save(Student theStudent);
}
