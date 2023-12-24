package com.jj.eschool.dto;

import com.jj.eschool.entity.enums.Grade;

import java.time.LocalDate;

public record GradesDTO(
        StudentDTO student,

        CourseDTO course,

        int grade,

        LocalDate date


) {
}
