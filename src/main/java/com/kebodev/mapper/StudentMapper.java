package com.kebodev.mapper;

import com.kebodev.dto.CourseDto;
import com.kebodev.dto.StudentDto;
import com.kebodev.entity.CourseEntity;
import com.kebodev.entity.StudentEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface StudentMapper {

    StudentEntity dtoToStudent(StudentDto studentDtoDto);

    //@Mapping(ignore = true, target = "courses")
    StudentDto studentToDto(StudentEntity studentEntity);

    List<StudentDto> studentsToDtos(List<StudentEntity> studentEntities);

    List<StudentDto> studentsToDtos(Iterable<StudentEntity> findAll);

}
