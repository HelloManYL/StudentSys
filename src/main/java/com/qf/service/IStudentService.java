package com.qf.service;

import com.qf.model.Student;

import java.util.List;

public interface IStudentService {
    List<Student> queryStudent();

    void addStudent(Student student);
}
