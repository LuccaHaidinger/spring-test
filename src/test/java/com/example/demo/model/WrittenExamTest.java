package com.example.demo.model;

import com.example.demo.sept2024.model.*;
import com.example.demo.sept2024.persistence.WrittenExamRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
public class WrittenExamTest {

    @Autowired private WrittenExamRepo repo;

    @Test
    public void saveWrittenExam() {

        Subject subject = Subject.builder().code_subject("AM").name("Angewandte Mathematik").description("Sucking your blood.").build();
        Student student = Student.builder().studentIdentifier("HAI22505").firstName("Lucca").lastName("Haidinger").birthDate("2005-10-21").build();
        FinalExamination finalExamination = FinalExamination.builder().code("POSPLUE").department("HIF").from(LocalDate.of(2024,2,20)).to(LocalDate.of(2024,2,22)).build();
        Teacher teacher = Teacher.builder().teacherIdentifier("PLK").firstName("Susanne").lastName("Pollack").build();

        WrittenExam exam = WrittenExam.builder()
                .id(1L)
                .examStart(LocalDateTime.of(2024, Month.FEBRUARY, 2, 12, 0))
                .examEnd(LocalDateTime.of(2024, Month.FEBRUARY, 2, 14,0))
                .subject(subject)
                .student(student)
                .finalExamination(finalExamination)
                .teacher(teacher)
                .build();


        WrittenExam savedExam = repo.save(exam);













        assertThat(savedExam).isNotNull();
        assertThat(savedExam.getId()).isEqualTo(1L);
        assertThat(savedExam.getExamStart()).isEqualTo(LocalDateTime.of(2024, Month.FEBRUARY, 2, 12, 0));
        assertThat(savedExam.getExamEnd()).isEqualTo(LocalDateTime.of(2024, Month.FEBRUARY, 2, 14, 0));
        assertThat(savedExam.getSubject()).isEqualTo(Subject.builder().code_subject("AM").name("Angewandte Mathematik").description("Sucking your blood.").build());
        assertThat(savedExam.getStudent()).isEqualTo(Student.builder().studentIdentifier("HAI22505").firstName("Lucca").lastName("Haidinger").birthDate("2005-10-21").build());
        assertThat(savedExam.getFinalExamination()).isEqualTo(FinalExamination.builder().code("POSPLUE").department("HIF").from(LocalDate.of(2024,2,20)).to(LocalDate.of(2024,2,22)).build());
        assertThat(savedExam.getTeacher()).isEqualTo(Teacher.builder().teacherIdentifier("PLK").firstName("Susanne").lastName("Pollack").build());
    }
}
