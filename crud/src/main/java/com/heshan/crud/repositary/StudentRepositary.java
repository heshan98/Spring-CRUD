package com.heshan.crud.repositary;

import com.heshan.crud.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepositary extends JpaRepository<Student,Long> {
}
