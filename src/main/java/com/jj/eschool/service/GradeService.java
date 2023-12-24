package com.jj.eschool.service;

import com.jj.eschool.dto.CourseDTO;
import com.jj.eschool.dto.GradesDTO;
import com.jj.eschool.dto.StudentDTO;
import com.jj.eschool.entity.enums.Grade;
import com.jj.eschool.entity.enums.UserRole;
import com.jj.eschool.repository.GradesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class GradeService {

    private final GradesRepository gradesRepository;

    public List<GradesDTO> getGradesByRoleAndUserId(UserRole role, long userId) {

        if (role == UserRole.TEACHER) {

            return List.of(new GradesDTO(
                    new StudentDTO(1L, "student name", "5A"),
                    new CourseDTO(2L, "CourseName", "Description", "teacherName"),
                    Grade.FIFE.getValue(), LocalDate.now()
            ));
        }

        return null;
    }
}
