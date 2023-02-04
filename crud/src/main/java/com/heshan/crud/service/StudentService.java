package com.heshan.crud.service;

import com.heshan.crud.model.Student;
import com.heshan.crud.repositary.StudentRepositary;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class StudentService {
    @Autowired
    StudentRepositary studentRepositary;

    //create
    public Student createStudent(Student student) {
        return studentRepositary.save(student);
    }

    //findallStudents
    public List<Student> getStudents() {
        return studentRepositary.findAll();
    }
    //getById
    public Student getStudentsById(Long id){
        return studentRepositary.findById(id).get();
    }
    //update
    public Student updateStuents(Student student){
        return studentRepositary.save(student);
    }
    public void deleteStudents(Long id){
        studentRepositary.deleteById(id);
    }


}
