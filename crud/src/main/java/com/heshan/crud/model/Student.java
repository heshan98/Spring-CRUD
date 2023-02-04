package com.heshan.crud.model;

import jakarta.persistence.*;

@Entity
@Table
        (name="STUDENT")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long id;
    @Column(name="studentName")
    public String studentName;

    @Column (name="age")
    public Integer age;
    @Column(name="homeTown")
    public String homeTown;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getHomeTown() {
        return homeTown;
    }

    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", studentName='" + studentName + '\'' +
                ", age=" + age +
                ", homeTown='" + homeTown + '\'' +
                '}';
    }
}
