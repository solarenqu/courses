package com.kebodev.entity;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(CourseEntity.class)
public abstract class CourseEntity_ {

	public static volatile SetAttribute<CourseEntity, TeacherEntity> teachers;
	public static volatile SingularAttribute<CourseEntity, String> name;
	public static volatile SetAttribute<CourseEntity, StudentEntity> students;
	public static volatile SingularAttribute<CourseEntity, BigDecimal> id;

	public static final String TEACHERS = "teachers";
	public static final String NAME = "name";
	public static final String STUDENTS = "students";
	public static final String ID = "id";

}

