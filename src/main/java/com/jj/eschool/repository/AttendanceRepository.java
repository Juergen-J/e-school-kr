package com.jj.eschool.repository;

import com.jj.eschool.entity.Attendance;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AttendanceRepository extends CrudRepository<Attendance, Long> {

    List<Attendance> findAttendancesByStudentUsername(String studentusername);
}
