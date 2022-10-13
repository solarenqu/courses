package com.kebodev.mapper;

import com.kebodev.dto.StudentDto;
import com.kebodev.entity.StudentEntity;
import com.kebodev.entity.StudentEntity.StudentEntityBuilder;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-10-13T13:40:37+0200",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.12 (Oracle Corporation)"
)
@Component
public class StudentMapperImpl implements StudentMapper {

    @Override
    public StudentEntity dtoToStudent(StudentDto studentDtoDto) {
        if ( studentDtoDto == null ) {
            return null;
        }

        StudentEntityBuilder studentEntity = StudentEntity.builder();

        studentEntity.id( studentDtoDto.getId() );
        studentEntity.name( studentDtoDto.getName() );
        studentEntity.birthDate( studentDtoDto.getBirthDate() );
        studentEntity.semester( studentDtoDto.getSemester() );

        return studentEntity.build();
    }

    @Override
    public StudentDto studentToDto(StudentEntity studentEntity) {
        if ( studentEntity == null ) {
            return null;
        }

        StudentDto studentDto = new StudentDto();

        studentDto.setId( studentEntity.getId() );
        studentDto.setName( studentEntity.getName() );
        studentDto.setBirthDate( studentEntity.getBirthDate() );
        studentDto.setSemester( studentEntity.getSemester() );

        return studentDto;
    }

    @Override
    public List<StudentDto> studentsToDtos(List<StudentEntity> studentEntities) {
        if ( studentEntities == null ) {
            return null;
        }

        List<StudentDto> list = new ArrayList<StudentDto>( studentEntities.size() );
        for ( StudentEntity studentEntity : studentEntities ) {
            list.add( studentToDto( studentEntity ) );
        }

        return list;
    }

    @Override
    public List<StudentDto> studentsToDtos(Iterable<StudentEntity> findAll) {
        if ( findAll == null ) {
            return null;
        }

        List<StudentDto> list = new ArrayList<StudentDto>();
        for ( StudentEntity studentEntity : findAll ) {
            list.add( studentToDto( studentEntity ) );
        }

        return list;
    }
}
