package com.kebodev.dto;

import com.kebodev.entity.CourseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.ManyToOne;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Set;

@Getter
@Setter
public class TeacherDto {

    private BigDecimal id;
    private String name;
    private LocalDate birthDate;
    //private Set<CourseDto> courses;
}
