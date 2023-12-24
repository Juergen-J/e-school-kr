package com.jj.eschool.repository;

import com.jj.eschool.entity.Grades;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GradesRepository extends CrudRepository<Grades, Long> {
}
