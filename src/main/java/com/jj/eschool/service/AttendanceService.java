package com.jj.eschool.service;

import com.jj.eschool.dto.*;
import com.jj.eschool.entity.enums.DaysOfWeek;
import com.jj.eschool.entity.enums.Status;
import com.jj.eschool.entity.enums.UserRole;
import com.jj.eschool.mapper.AttendanceMapper;
import com.jj.eschool.repository.AttendanceRepository;
import lombok.RequiredArgsConstructor;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AttendanceService {

    private final AttendanceRepository attendanceRepository;

    private final AttendanceMapper attendanceMapper = Mappers.getMapper(AttendanceMapper.class);

    public List<AttendanceDTO> getAll() {
        var grades = attendanceRepository.findAll();
        return attendanceMapper.mapAttendances(grades);
    }

    public List<AttendanceDTO> getAttendanceByUserName(String username) {
        var attendees = attendanceRepository.findAttendancesByStudentUsername(username);
        return attendanceMapper.mapAttendances(attendees);
    }
}
