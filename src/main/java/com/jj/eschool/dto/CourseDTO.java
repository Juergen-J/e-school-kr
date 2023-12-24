package com.jj.eschool.dto;

public record CourseDTO(
        Long courseId,
        String name,
        String description,
        String teacherName
) {}
