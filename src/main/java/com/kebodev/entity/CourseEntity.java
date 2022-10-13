package com.kebodev.entity;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class CourseEntity {

    @Id
    @GeneratedValue
    @EqualsAndHashCode.Include()
    private BigDecimal id;

    private String name;

    @ManyToMany
    private Set<StudentEntity> students;

    @ManyToMany
    private Set<TeacherEntity> teachers;




}
