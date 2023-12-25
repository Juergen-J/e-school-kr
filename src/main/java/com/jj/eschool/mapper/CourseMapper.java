package com.jj.eschool.mapper;

import com.jj.eschool.dto.CourseDTO;
import com.jj.eschool.entity.Course;
import org.mapstruct.Mapper;

import java.util.Optional;

@Mapper
public interface CourseMapper {
    CourseDTO mapCourse(Course course);
}
