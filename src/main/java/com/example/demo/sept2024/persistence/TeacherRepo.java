package com.example.demo.sept2024.persistence;

import com.example.demo.sept2024.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepo extends JpaRepository<Teacher, String> {
}
