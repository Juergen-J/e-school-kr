package com.jj.eschool.service;

import com.jj.eschool.dto.AttendanceDTO;
import com.jj.eschool.dto.CourseDTO;
import com.jj.eschool.dto.ScheduleDTO;
import com.jj.eschool.dto.StudentDTO;
import com.jj.eschool.entity.enums.DaysOfWeek;
import com.jj.eschool.entity.enums.Status;
import com.jj.eschool.entity.enums.UserRole;
import com.jj.eschool.repository.AttendanceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AttendanceService {

    private final AttendanceRepository attendanceRepository;

    public List<AttendanceDTO> findAllByUserIdAndRole(long userId, UserRole role) {

        if (role == UserRole.TEACHER) {
            return List.of(new AttendanceDTO(
                    new StudentDTO(6L, "student name", "2q"),
                    new ScheduleDTO(new CourseDTO(
                            3L, "MATHEMATIK", "description of ..", "teacher name"
                    ), "Room 3456", "12.12.2023 12:10-16:00"),
                    Status.PRESENT
            ));
        }

        return null;
    }
}
