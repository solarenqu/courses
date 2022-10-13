package com.kebodev.mapper;

import com.kebodev.dto.CourseDto;
import com.kebodev.dto.StudentDto;
import com.kebodev.entity.CourseEntity;
import com.kebodev.entity.CourseEntity.CourseEntityBuilder;
import com.kebodev.entity.StudentEntity;
import com.kebodev.entity.StudentEntity.StudentEntityBuilder;
import com.kebodev.entity.TeacherEntity;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-10-13T12:55:35+0200",
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
        studentEntity.courses( courseDtoSetToCourseEntitySet( studentDtoDto.getCourses() ) );

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
        studentDto.setCourses( courseEntitySetToCourseDtoSet( studentEntity.getCourses() ) );

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

    protected CourseEntity courseDtoToCourseEntity(CourseDto courseDto) {
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

    protected Set<CourseEntity> courseDtoSetToCourseEntitySet(Set<CourseDto> set) {
        if ( set == null ) {
            return null;
        }

        Set<CourseEntity> set1 = new HashSet<CourseEntity>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( CourseDto courseDto : set ) {
            set1.add( courseDtoToCourseEntity( courseDto ) );
        }

        return set1;
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

    protected Set<CourseDto> courseEntitySetToCourseDtoSet(Set<CourseEntity> set) {
        if ( set == null ) {
            return null;
        }

        Set<CourseDto> set1 = new HashSet<CourseDto>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( CourseEntity courseEntity : set ) {
            set1.add( courseEntityToCourseDto( courseEntity ) );
        }

        return set1;
    }
}
