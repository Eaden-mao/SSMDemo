package com.mao.controller;

import com.mao.entity.Student;
import com.mao.service.api.StudentServices;
import com.mao.service.impl.StudentServicesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentServicesImpl studentServicesimpl;


    /*
    查询全部学生
     */
    @RequestMapping("/allStudent")
    public String listAllStudnet(Model model) {
        List<Student> list = studentServicesimpl.queryAllStudent();
        model.addAttribute("list", list);
        return "student";
    }
    @RequestMapping("/addStudent")
    public String addStudent(Student student) {

        return "student";
    }

    @RequestMapping("/queryStudentById")
    public String queryStudentById(Model model,@RequestParam("sid") Integer id) {
        Student student=studentServicesimpl.queryStudentById(id);
        model.addAttribute("student",student);
        return "Test";
    }
}
