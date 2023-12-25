package com.jj.eschool.dto;

public record ScheduleDTO(

        Long scheduleID,
        CourseDTO course,

        String classRoom,

        String time,

        String dateOrDay
) {
}
