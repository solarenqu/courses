package com.kebodev.web;


import com.kebodev.dto.CourseDto;
import com.kebodev.entity.CourseEntity;
import com.kebodev.mapper.CourseMapper;
import com.kebodev.repository.CourseRepository;
import com.kebodev.service.CourseService;
import com.querydsl.core.types.Predicate;
import lombok.RequiredArgsConstructor;
import org.springframework.data.querydsl.binding.QuerydslPredicate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/courses")
public class CourseController {


    private final CourseRepository courseRepository;
    private final CourseMapper courseMapper;
    private final CourseService courseService;

    @GetMapping("/search")
    public List<CourseDto> searchCourses(@QuerydslPredicate(root = CourseEntity.class) Predicate predicate){
        return courseMapper.coursesToDtos(courseService.findAllWithRealtions());
    }


}
