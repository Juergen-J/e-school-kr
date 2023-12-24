package com.jj.eschool.dto;

import com.jj.eschool.entity.enums.Status;

public record AttendanceDTO(
        StudentDTO student,

        ScheduleDTO schedule,

        Status status
) {
}
