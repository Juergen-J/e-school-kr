package com.jj.eschool.repository;

import com.jj.eschool.entity.Grades;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GradesRepository extends CrudRepository<Grades, Long> {

    List<Grades> findGradesByStudentUsername(String username);
}
