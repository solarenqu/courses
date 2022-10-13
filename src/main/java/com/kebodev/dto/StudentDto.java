package com.kebodev.dto;

import lombok.Getter;
import lombok.Setter;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Set;

@Getter
@Setter
public class StudentDto {

    private BigDecimal id;
    private String name;
    private LocalDate birthDate;
    private int semester;
    //private Set<CourseDto> courses;

}
