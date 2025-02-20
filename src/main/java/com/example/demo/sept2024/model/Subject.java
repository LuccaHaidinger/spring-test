package com.example.demo.sept2024.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name="subject")
public class Subject{

    @Column(nullable = false, unique = true) @Id
    private String code_subject;

    @Column(nullable = false)
    private String name;

    @Column
    private String description;
}
