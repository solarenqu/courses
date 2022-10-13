package com.kebodev.repository;

import com.kebodev.entity.QStudentEntity;
import com.kebodev.entity.QTeacherEntity;
import com.kebodev.entity.StudentEntity;
import com.kebodev.entity.TeacherEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.querydsl.binding.QuerydslBinderCustomizer;
import org.springframework.data.querydsl.binding.QuerydslBindings;

import java.math.BigDecimal;

public interface TeacherRepository extends JpaRepository<TeacherEntity, BigDecimal>,
        JpaSpecificationExecutor<TeacherEntity>,
        QuerydslPredicateExecutor<TeacherEntity>,
        QuerydslBinderCustomizer<QTeacherEntity> {

    @Override
    default void customize(QuerydslBindings bindings, QTeacherEntity student) {

    }
}
