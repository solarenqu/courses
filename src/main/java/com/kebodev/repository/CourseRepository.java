package com.kebodev.repository;

import com.kebodev.entity.CourseEntity;
import com.kebodev.entity.QCourseEntity;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.querydsl.binding.QuerydslBinderCustomizer;
import org.springframework.data.querydsl.binding.QuerydslBindings;
import java.math.BigDecimal;
import java.util.List;


public interface CourseRepository extends JpaRepository<CourseEntity, BigDecimal>,
        JpaSpecificationExecutor<CourseEntity>,
        QuerydslPredicateExecutor<CourseEntity>,
        QuerydslBinderCustomizer<QCourseEntity> {


    @EntityGraph(attributePaths = {"students"})
    @Query("SELECT a FROM CourseEntity a")
    List<CourseEntity> findAllWithStudents();

    @EntityGraph(attributePaths = {"teachers"})
    @Query("SELECT a FROM CourseEntity a")
    List<CourseEntity> findAllWithTeachers();

    @Override
    default void customize(QuerydslBindings bindings, QCourseEntity course) {

        bindings.bind(course.name).first((path, value) -> path.startsWith(value));
        bindings.bind(course.teachers.any().name).first((path, value) -> path.startsWith(value));

    }

}
