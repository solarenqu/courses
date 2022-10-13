package com.kebodev.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCourseEntity is a Querydsl query type for CourseEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCourseEntity extends EntityPathBase<CourseEntity> {

    private static final long serialVersionUID = -1926556964L;

    public static final QCourseEntity courseEntity = new QCourseEntity("courseEntity");

    public final NumberPath<java.math.BigDecimal> id = createNumber("id", java.math.BigDecimal.class);

    public final StringPath name = createString("name");

    public final SetPath<StudentEntity, QStudentEntity> students = this.<StudentEntity, QStudentEntity>createSet("students", StudentEntity.class, QStudentEntity.class, PathInits.DIRECT2);

    public final SetPath<TeacherEntity, QTeacherEntity> teachers = this.<TeacherEntity, QTeacherEntity>createSet("teachers", TeacherEntity.class, QTeacherEntity.class, PathInits.DIRECT2);

    public QCourseEntity(String variable) {
        super(CourseEntity.class, forVariable(variable));
    }

    public QCourseEntity(Path<? extends CourseEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCourseEntity(PathMetadata metadata) {
        super(CourseEntity.class, metadata);
    }

}

