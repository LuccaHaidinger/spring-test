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
@Table(name = "teacher")
public class Teacher{

    @Column(nullable = false, unique = true) @Id
    private String teacherIdentifier;

    @Column
    private String firstName;

    @Column(nullable = false)
    private String lastName;
}
