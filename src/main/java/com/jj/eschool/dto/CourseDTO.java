package com.jj.eschool.dto;

public record CourseDTO(
        Long courseId,
        String name,
        String description,
        UserDTO teacher,

        Long teacherId
) {}
