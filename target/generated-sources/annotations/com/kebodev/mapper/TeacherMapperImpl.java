package com.kebodev.mapper;

import com.kebodev.dto.TeacherDto;
import com.kebodev.entity.TeacherEntity;
import com.kebodev.entity.TeacherEntity.TeacherEntityBuilder;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-10-13T14:13:20+0200",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.12 (Oracle Corporation)"
)
@Component
public class TeacherMapperImpl implements TeacherMapper {

    @Override
    public TeacherEntity dtoToTeacher(TeacherDto teacherDto) {
        if ( teacherDto == null ) {
            return null;
        }

        TeacherEntityBuilder teacherEntity = TeacherEntity.builder();

        teacherEntity.id( teacherDto.getId() );
        teacherEntity.name( teacherDto.getName() );
        teacherEntity.birthDate( teacherDto.getBirthDate() );

        return teacherEntity.build();
    }

    @Override
    public TeacherDto teacherToDto(TeacherEntity teacherEntity) {
        if ( teacherEntity == null ) {
            return null;
        }

        TeacherDto teacherDto = new TeacherDto();

        teacherDto.setId( teacherEntity.getId() );
        teacherDto.setName( teacherEntity.getName() );
        teacherDto.setBirthDate( teacherEntity.getBirthDate() );

        return teacherDto;
    }

    @Override
    public List<TeacherDto> teacherToDtos(List<TeacherEntity> teacherEntities) {
        if ( teacherEntities == null ) {
            return null;
        }

        List<TeacherDto> list = new ArrayList<TeacherDto>( teacherEntities.size() );
        for ( TeacherEntity teacherEntity : teacherEntities ) {
            list.add( teacherToDto( teacherEntity ) );
        }

        return list;
    }

    @Override
    public List<TeacherDto> teacherToDtos(Iterable<TeacherEntity> findAll) {
        if ( findAll == null ) {
            return null;
        }

        List<TeacherDto> list = new ArrayList<TeacherDto>();
        for ( TeacherEntity teacherEntity : findAll ) {
            list.add( teacherToDto( teacherEntity ) );
        }

        return list;
    }
}
