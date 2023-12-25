package com.jj.eschool.dto;

public record AttendanceCourseDTO(
        Long courseId,
        String name,
        String description,
        String teacherName
) {}
