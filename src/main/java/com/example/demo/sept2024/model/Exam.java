package com.example.demo.sept2024.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Entity
@Table(name = "exam")
public class Exam {

    @Column @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private LocalDateTime examStart;

    @Column(nullable = false)
    private LocalDateTime examEnd;

    @ManyToOne
    @JoinColumn(name = "code_subject")
    private Subject subject;

    @ManyToOne
    @JoinColumn(name = "studentIdentifier")
    private Student student;

    @ManyToOne
    @JoinColumn(name = "code")
    private FinalExamination finalExamination;

    @ManyToOne
    @JoinColumn(name = "teacherIdentifier")
    private Teacher teacher;
}
