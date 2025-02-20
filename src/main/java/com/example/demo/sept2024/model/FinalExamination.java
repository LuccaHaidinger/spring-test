package com.example.demo.sept2024.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "finalExamination")
public class FinalExamination{

    @Column @Id
    private String code;

    @Column(nullable = false)
    private String department;

    @Column(name = "start_date",nullable = false)
    private LocalDate from;

    @Column(name = "end_date", nullable = false)
    private LocalDate to;
}
