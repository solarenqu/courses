package com.kebodev.dto;

import com.kebodev.entity.StudentEntity;
import com.kebodev.entity.TeacherEntity;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.math.BigDecimal;
import java.util.Set;

@Getter
@Setter
public class CourseDto {


    private BigDecimal id;
    private String name;
    private Set<StudentEntity> students;
    private Set<TeacherEntity> teachers;
}
