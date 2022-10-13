package com.kebodev.entity;

import java.math.BigDecimal;
import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(TeacherEntity.class)
public abstract class TeacherEntity_ {

	public static volatile SetAttribute<TeacherEntity, CourseEntity> courses;
	public static volatile SingularAttribute<TeacherEntity, String> name;
	public static volatile SingularAttribute<TeacherEntity, BigDecimal> id;
	public static volatile SingularAttribute<TeacherEntity, LocalDate> birthDate;

	public static final String COURSES = "courses";
	public static final String NAME = "name";
	public static final String ID = "id";
	public static final String BIRTH_DATE = "birthDate";

}

