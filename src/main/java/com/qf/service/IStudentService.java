package com.qf.service;

import com.qf.model.Student;

import java.util.List;

public interface IStudentService {
    List<Student> queryStudent();

    void addStudent(Student student);

    Student getStudentById(int id);

    void updateStudent(Student student);

    void deleteStudent(int id);
}
