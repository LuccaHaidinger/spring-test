package com.example.demo.model;

import com.example.demo.sept2024.model.Teacher;
import com.example.demo.sept2024.persistence.TeacherRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
public class TeacherTest {

    @Autowired private TeacherRepo repo;

    @Test
    public void saveTeacher() {
        Teacher teacher = Teacher.builder()
                .teacherIdentifier("PLK")
                .firstName("Susanne")
                .lastName("Pollack").build();
        Teacher savedTeacher = repo.save(teacher);

        assertThat(savedTeacher.getTeacherIdentifier()).isEqualTo("PLK");
        assertThat(savedTeacher.getFirstName()).isEqualTo("Susanne");
        assertThat(savedTeacher.getLastName()).isEqualTo("Pollack");
        assertThat(savedTeacher).isNotNull();
    }
}
