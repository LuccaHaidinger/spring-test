package com.example.demo.model;

import com.example.demo.sept2024.model.Subject;
import com.example.demo.sept2024.persistence.SubjectRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@DataJpaTest
public class SubjectTest {

    @Autowired
    private SubjectRepo repo;

    @Test
    public void saveSubject(){
        Subject subject = Subject.builder()
                .code_subject("AM")
                .name("Angewandte Mathematik")
                .description("Saug deine Lebensenergie aus")
                .build();
        repo.save(subject);

        Subject savedSubject = repo.save(subject);

        assertThat(savedSubject).isNotNull();
        assertThat(savedSubject.getCode_subject()).isEqualTo("AM");
    }
}
