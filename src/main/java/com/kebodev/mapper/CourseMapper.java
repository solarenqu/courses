package com.kebodev.mapper;

import com.kebodev.dto.CourseDto;
import com.kebodev.entity.CourseEntity;
import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CourseMapper {

    CourseEntity dtoToCourse(CourseDto courseDto);

    @Named("summary")
    @Mapping(ignore = true, target = "teachers")
    @Mapping(ignore = true, target = "students")
    CourseDto courseToDto(CourseEntity courseEntity);

    List<CourseDto> coursesToDtos(List<CourseEntity> courseEntities);

    @IterableMapping(qualifiedByName = "summary")
    List<CourseDto> coursesToDtos(Iterable<CourseEntity> findAll);

}
