package com.jj.eschool.service;

import com.jj.eschool.dto.CourseDTO;
import com.jj.eschool.dto.GradesDTO;
import com.jj.eschool.dto.StudentDTO;
import com.jj.eschool.entity.enums.Grade;
import com.jj.eschool.entity.enums.UserRole;
import com.jj.eschool.mapper.GradesMapper;
import com.jj.eschool.repository.GradesRepository;
import lombok.RequiredArgsConstructor;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class GradeService {

    private final GradesRepository gradesRepository;

    private final GradesMapper gradesMapper = Mappers.getMapper(GradesMapper.class);

    public List<GradesDTO> getAll() {
        var grades = gradesRepository.findAll();
        return gradesMapper.mapGrades(grades);
    }

    public List<GradesDTO> getGradesByUserName(String username) {
        var grades = gradesRepository.findGradesByStudentUsername(username);
        return gradesMapper.mapGrades(grades);
    }
}
