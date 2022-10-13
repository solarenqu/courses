package com.kebodev.service;

import com.kebodev.entity.CourseEntity;
import com.kebodev.repository.CourseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CourseService {


    private final CourseRepository courseRepository;


    @Transactional
    public List<CourseEntity> findAllWithRealtions() {

        List<CourseEntity> courseList;
        courseList = courseRepository.findAllWithStudents();
        courseList = courseRepository.findAllWithTeachers();

        return courseList;

    }

}
