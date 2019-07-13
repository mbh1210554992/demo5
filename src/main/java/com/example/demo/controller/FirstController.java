package com.example.demo.controller;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class FirstController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/hello")
    @ResponseBody
    public List<Student> hello(){
        List<Student> list=studentService.getStudent();
        for(Student student:list){
            System.out.println(student);
        }
        return list;
    }


}
