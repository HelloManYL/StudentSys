package com.qf.service.impl;

import com.qf.dao.StudentMapper;
import com.qf.model.Student;
import com.qf.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author Administrator
 * @Date 2019/1/9 0009
 * @Version 1.0
 */
@Service
public class StudentServiceImpl implements IStudentService{

    @Autowired
    private StudentMapper studentMapper;


    @Override
    public List<Student> queryStudent() {
        return studentMapper.queryStudent();
    }

    @Override
    public void addStudent(Student student) {
        studentMapper.insert(student);
    }

    @Override
    public Student getStudentById(int id) {
        return studentMapper.selectByPrimaryKey(id);
    }

    @Override
    public void updateStudent(Student student) {
        studentMapper.updateByPrimaryKey(student);
    }

    @Override
    public void deleteStudent(int id) {
        studentMapper.deleteByPrimaryKey(id);
    }
}
