package com.example.demo.sept2024.persistence;

import com.example.demo.sept2024.model.FinalExamination;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FinalExaminationRepo extends JpaRepository<FinalExamination, String> {
}
