package com.kebodev.mapper;

import com.kebodev.dto.CourseDto;
import com.kebodev.entity.CourseEntity;
import com.kebodev.entity.CourseEntity.CourseEntityBuilder;
import com.kebodev.entity.StudentEntity;
import com.kebodev.entity.TeacherEntity;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-10-13T13:07:30+0200",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.12 (Oracle Corporation)"
)
@Component
public class CourseMapperImpl implements CourseMapper {

    @Override
    public CourseEntity dtoToCourse(CourseDto courseDto) {
        if ( courseDto == null ) {
            return null;
        }

        CourseEntityBuilder courseEntity = CourseEntity.builder();

        courseEntity.id( courseDto.getId() );
        courseEntity.name( courseDto.getName() );
        Set<StudentEntity> set = courseDto.getStudents();
        if ( set != null ) {
            courseEntity.students( new HashSet<StudentEntity>( set ) );
        }
        Set<TeacherEntity> set1 = courseDto.getTeachers();
        if ( set1 != null ) {
            courseEntity.teachers( new HashSet<TeacherEntity>( set1 ) );
        }

        return courseEntity.build();
    }

    @Override
    public CourseDto courseToDto(CourseEntity courseEntity) {
        if ( courseEntity == null ) {
            return null;
        }

        CourseDto courseDto = new CourseDto();

        courseDto.setId( courseEntity.getId() );
        courseDto.setName( courseEntity.getName() );

        return courseDto;
    }

    @Override
    public List<CourseDto> coursesToDtos(List<CourseEntity> courseEntities) {
        if ( courseEntities == null ) {
            return null;
        }

        List<CourseDto> list = new ArrayList<CourseDto>( courseEntities.size() );
        for ( CourseEntity courseEntity : courseEntities ) {
            list.add( courseEntityToCourseDto( courseEntity ) );
        }

        return list;
    }

    @Override
    public List<CourseDto> coursesToDtos(Iterable<CourseEntity> findAll) {
        if ( findAll == null ) {
            return null;
        }

        List<CourseDto> list = new ArrayList<CourseDto>();
        for ( CourseEntity courseEntity : findAll ) {
            list.add( courseToDto( courseEntity ) );
        }

        return list;
    }

    protected CourseDto courseEntityToCourseDto(CourseEntity courseEntity) {
        if ( courseEntity == null ) {
            return null;
        }

        CourseDto courseDto = new CourseDto();

        courseDto.setId( courseEntity.getId() );
        courseDto.setName( courseEntity.getName() );
        Set<StudentEntity> set = courseEntity.getStudents();
        if ( set != null ) {
            courseDto.setStudents( new HashSet<StudentEntity>( set ) );
        }
        Set<TeacherEntity> set1 = courseEntity.getTeachers();
        if ( set1 != null ) {
            courseDto.setTeachers( new HashSet<TeacherEntity>( set1 ) );
        }

        return courseDto;
    }
}
