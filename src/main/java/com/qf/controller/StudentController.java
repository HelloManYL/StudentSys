package com.qf.controller;

import com.qf.model.Student;
import com.qf.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @Author Administrator
 * @Date 2019/1/9 0009
 * @Version 1.0
 */
@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private IStudentService studentService;

    @RequestMapping("/queryStudent")
    public ModelAndView queryStu(){
        List<Student> studentList = studentService.queryStudent();
        ModelAndView modelAndView = new ModelAndView("showStudent");
        modelAndView.addObject("studentList",studentList);
        return  modelAndView;
    }

    @RequestMapping("/addStudent")
    public String addStudent(Student student){
        studentService.addStudent(student);
        return "redirect:/student/queryStudent";
    }


}
