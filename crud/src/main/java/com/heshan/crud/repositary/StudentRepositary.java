package com.heshan.crud.repositary;

import com.heshan.crud.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface StudentRepositary extends JpaRepository<Student,Long> {
}
