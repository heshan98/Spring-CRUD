package com.heshan.crud.controller;

import com.heshan.crud.model.Student;
import com.heshan.crud.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
public class StudentController {
    @Autowired
    StudentService studentService;

    //create
    @PostMapping(path = "/addStudents")
    public Student createStudents(@RequestBody Student student) {

        return studentService.createStudent(student);
    }
//getallStudents
    @GetMapping(path = "getStudents")
    public List<Student> getStudents() {
        return studentService.getStudents();
    }
//getStudentsById
    @GetMapping(path = "/getStudents/{id}")
    public Student getStudentsById(@PathVariable Long id) {
        return studentService.getStudentsById(id);
    }
    //updateById

    @PutMapping(path = "/updateStudents/{id}")
    public ResponseEntity<?> updateStudents(@RequestBody Student student, @PathVariable Long id) {
        Optional<Student> findStudents = Optional.ofNullable(studentService.getStudentsById(id));
        if (findStudents.isPresent()) {
            Student updateStudents = findStudents.get();
            updateStudents.setStudentName(student.getStudentName());
            updateStudents.setAge(student.getAge());
            updateStudents.setHomeTown(student.getHomeTown());
            return new ResponseEntity<>(studentService.updateStuents(updateStudents), HttpStatus.OK);


        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping(path="deleteStudents/{id}")
    public void deleteStudents(@PathVariable Long id){
        studentService.deleteStudents(id);
    }

}








