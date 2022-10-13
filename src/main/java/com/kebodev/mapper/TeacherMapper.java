package com.kebodev.mapper;

import com.kebodev.dto.StudentDto;
import com.kebodev.dto.TeacherDto;
import com.kebodev.entity.StudentEntity;
import com.kebodev.entity.TeacherEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TeacherMapper {

    TeacherEntity dtoToTeacher(TeacherDto teacherDto);

    //@Mapping(ignore = true, target = "courses")
    TeacherDto teacherToDto(TeacherEntity teacherEntity);

    List<TeacherDto> teacherToDtos(List<TeacherEntity> teacherEntities);

    List<TeacherDto> teacherToDtos(Iterable<TeacherEntity> findAll);
}
