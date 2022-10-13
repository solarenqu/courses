package com.kebodev.entity;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class StudentEntity {

    @Id
    @GeneratedValue
    @EqualsAndHashCode.Include()
    private BigDecimal id;

    private String name;
    private LocalDate birthDate;
    private int semester;

    @ManyToMany(mappedBy = "students")
    private Set<CourseEntity> courses;


}
