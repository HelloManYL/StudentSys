package com.qf.controller;

import com.qf.model.Student;
import com.qf.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.jws.soap.SOAPBinding;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    @RequestMapping("/getStudentById/{id}")
    public String getStudentById(@PathVariable int id, HttpServletRequest request){
        Student student = studentService.getStudentById(id);
        request.setAttribute("student",student);
        return "update";

    }

    @RequestMapping("/updateStudent")
    public String updateStudent(Student student){
        studentService.updateStudent(student);
        return "redirect:/student/queryStudent";
    }

    @RequestMapping("/deleteStudent/{id}")
    public String deleteStudent(@PathVariable int id){
        studentService.deleteStudent(id);
        return "redirect:/student/queryStudent";
    }



}
