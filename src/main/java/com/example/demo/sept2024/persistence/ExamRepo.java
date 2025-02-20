package com.example.demo.sept2024.persistence;

import com.example.demo.sept2024.model.Exam;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExamRepo extends JpaRepository<Exam, Long> {
}
