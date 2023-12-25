package com.jj.eschool.mapper;

import com.jj.eschool.dto.GradesDTO;
import com.jj.eschool.entity.Grades;
import com.jj.eschool.entity.enums.Grade;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

import java.util.List;

@Mapper
public interface GradesMapper {

    List<GradesDTO> mapGrades(Iterable<Grades> gradesList);

    @Mapping(target = "grade", source = "grade", qualifiedByName = "mapGradeNumber")
    @Mapping(target = "student.name", source = "student.personalInfo.lastName")
    @Mapping(target = "student.gruppe", source = "student.personalInfo.groupClass")
    GradesDTO mapGrade(Grades grade);

    @Named("mapGradeNumber")
    default int mapGradeNumber(Grade grade) {
        return grade.getValue();
    }
}
