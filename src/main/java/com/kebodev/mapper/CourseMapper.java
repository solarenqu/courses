package com.kebodev.mapper;

import com.kebodev.dto.CourseDto;
import com.kebodev.entity.CourseEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CourseMapper {

    CourseEntity dtoToCourse(CourseDto courseDto);

    CourseDto courseToDto(CourseEntity courseEntity);

    List<CourseDto> coursesToDtos(List<CourseEntity> courseEntities);

    List<CourseDto> coursesToDtos(Iterable<CourseEntity> findAll);

}
