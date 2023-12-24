package com.jj.eschool.dto;

public record ScheduleDTO(

        CourseDTO course,

        String classRoom,

        String time
) {
}
