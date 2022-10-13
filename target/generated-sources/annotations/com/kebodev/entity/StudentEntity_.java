package com.kebodev.entity;

import java.math.BigDecimal;
import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(StudentEntity.class)
public abstract class StudentEntity_ {

	public static volatile SetAttribute<StudentEntity, CourseEntity> courses;
	public static volatile SingularAttribute<StudentEntity, String> name;
	public static volatile SingularAttribute<StudentEntity, Integer> semester;
	public static volatile SingularAttribute<StudentEntity, BigDecimal> id;
	public static volatile SingularAttribute<StudentEntity, LocalDate> birthDate;

	public static final String COURSES = "courses";
	public static final String NAME = "name";
	public static final String SEMESTER = "semester";
	public static final String ID = "id";
	public static final String BIRTH_DATE = "birthDate";

}

