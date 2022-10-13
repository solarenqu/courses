package com.kebodev.mapper;

import com.kebodev.dto.StudentDto;
import com.kebodev.dto.TeacherDto;
import com.kebodev.entity.StudentEntity;
import com.kebodev.entity.TeacherEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TeacherMapper {

    TeacherEntity dtoToTeacher(TeacherDto teacherDto);

    StudentDto teacherToDto(TeacherEntity teacherEntity);

    List<StudentDto> teacherToDtos(List<TeacherEntity> teacherEntities);

    List<StudentDto> teacherToDtos(Iterable<TeacherEntity> findAll);
}
