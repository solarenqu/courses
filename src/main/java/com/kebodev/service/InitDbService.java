package com.kebodev.service;

import com.kebodev.entity.CourseEntity;
import com.kebodev.entity.StudentEntity;
import com.kebodev.entity.TeacherEntity;
import com.kebodev.repository.CourseRepository;
import com.kebodev.repository.StudentRepository;
import com.kebodev.repository.TeacherRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

@RequiredArgsConstructor
@Service
public class InitDbService {


    private final CourseRepository courseRepository;
    private final TeacherRepository teacherRepository;
    private final StudentRepository studentRepository;


    @Transactional
    public void deleteDb() {
        courseRepository.deleteAll();
        teacherRepository.deleteAll();
        studentRepository.deleteAll();
    }

    @Transactional
    public void addInitData() {

        StudentEntity student1 = saveNewStudent("student1", LocalDate.of(2000, 10, 10), 1);
        StudentEntity student2 = saveNewStudent("student2", LocalDate.of(2000, 10, 10), 2);
        StudentEntity student3 = saveNewStudent("student3", LocalDate.of(2000, 10, 10), 3);

        TeacherEntity teacher1 = saveNewTeacher("teacher1", LocalDate.of(2000, 10, 10));
        TeacherEntity teacher2 = saveNewTeacher("teacher2", LocalDate.of(2000, 10, 10));
        TeacherEntity teacher3 = saveNewTeacher("teacher3", LocalDate.of(2000, 10, 10));

        createCourse("course1", Arrays.asList(teacher1, teacher2), Arrays.asList(student1, student2, student3));
        createCourse("course2", Arrays.asList(teacher2), Arrays.asList(student1, student3));
        createCourse("course3", Arrays.asList(teacher1, teacher3), Arrays.asList(student2, student3));
    }

    private CourseEntity createCourse(String name, List<TeacherEntity> teachers, List<StudentEntity> students) {
        return courseRepository.save(
                CourseEntity.builder()
                        .name(name)
                        .teachers(new HashSet<>(teachers))
                        .students(new HashSet<>(students))
                        .build());
    }

    private StudentEntity saveNewStudent(String name, LocalDate birthdate, int semester) {
        return studentRepository.save(
                StudentEntity.builder()
                        .name(name)
                        .birthDate(birthdate)
                        .semester(semester)
                        .build());
    }

    private TeacherEntity saveNewTeacher(String name, LocalDate birthdate) {
        return teacherRepository.save(
                TeacherEntity.builder()
                        .name(name)
                        .birthDate(birthdate)
                        .build());
    }

}
