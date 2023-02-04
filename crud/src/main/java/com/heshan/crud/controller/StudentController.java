package com.heshan.crud.controller;

import com.heshan.crud.model.Student;
import com.heshan.crud.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class StudentController {
    @Autowired
    StudentService studentService;
    //create
    @PostMapping(path = "/addStudents")
    public Student createStudents(@RequestBody Student student){
        return studentService.createStudent(student);
    }
    @GetMapping(path = "getStudents")
    public List<Student> getStudents(){
        return studentService.getStudents();
    }

    @GetMapping(path = "/getStudents/{id}")
    public Student getStudentsById(@PathVariable Long id){
        return studentService.getStudentsById(id);
    }


   



}
