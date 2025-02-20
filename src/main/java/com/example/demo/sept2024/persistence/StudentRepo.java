package com.example.demo.sept2024.persistence;

import com.example.demo.sept2024.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student, String> {
}
