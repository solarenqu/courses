package com.kebodev.repository;

import com.kebodev.entity.CourseEntity;
import com.kebodev.entity.QCourseEntity;
import com.kebodev.entity.QStudentEntity;
import com.kebodev.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.querydsl.binding.QuerydslBinderCustomizer;
import org.springframework.data.querydsl.binding.QuerydslBindings;

import java.math.BigDecimal;

public interface StudentRepository extends JpaRepository<StudentEntity, BigDecimal>,
        JpaSpecificationExecutor<StudentEntity>,
        QuerydslPredicateExecutor<StudentEntity>,
        QuerydslBinderCustomizer<QStudentEntity> {

    @Override
    default void customize(QuerydslBindings bindings, QStudentEntity student) {

    }
}
