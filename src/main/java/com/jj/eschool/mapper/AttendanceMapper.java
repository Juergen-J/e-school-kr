package com.jj.eschool.mapper;

import com.jj.eschool.dto.AttendanceDTO;
import com.jj.eschool.dto.ScheduleDTO;
import com.jj.eschool.entity.Attendance;
import com.jj.eschool.entity.Schedule;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper
public interface AttendanceMapper {
    List<AttendanceDTO> mapAttendances(Iterable<Attendance> attendances);


    @Mapping(target = "student.name", source = "student.personalInfo.lastName")
    @Mapping(target = "student.gruppe", source = "student.personalInfo.groupClass")
    AttendanceDTO mapAttendance(Attendance attendance);

    ScheduleDTO mapSchedule(Schedule schedule);
}
