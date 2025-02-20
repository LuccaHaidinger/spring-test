package com.example.demo.sept2024.persistence;

import com.example.demo.sept2024.model.WrittenExam;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WrittenExamRepo extends JpaRepository<WrittenExam, Long> {
}
