package com.example.demo.sept2024.persistence;

import com.example.demo.sept2024.model.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepo extends JpaRepository<Subject, String> {
}
