package com.kebodev.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QStudentEntity is a Querydsl query type for StudentEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QStudentEntity extends EntityPathBase<StudentEntity> {

    private static final long serialVersionUID = -972638528L;

    public static final QStudentEntity studentEntity = new QStudentEntity("studentEntity");

    public final DatePath<java.time.LocalDate> birthDate = createDate("birthDate", java.time.LocalDate.class);

    public final SetPath<CourseEntity, QCourseEntity> courses = this.<CourseEntity, QCourseEntity>createSet("courses", CourseEntity.class, QCourseEntity.class, PathInits.DIRECT2);

    public final NumberPath<java.math.BigDecimal> id = createNumber("id", java.math.BigDecimal.class);

    public final StringPath name = createString("name");

    public final NumberPath<Integer> semester = createNumber("semester", Integer.class);

    public QStudentEntity(String variable) {
        super(StudentEntity.class, forVariable(variable));
    }

    public QStudentEntity(Path<? extends StudentEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QStudentEntity(PathMetadata metadata) {
        super(StudentEntity.class, metadata);
    }

}

