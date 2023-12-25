package com.jj.eschool.service;

import com.jj.eschool.dto.CourseDTO;
import com.jj.eschool.dto.ScheduleDTO;
import com.jj.eschool.entity.enums.DaysOfWeek;
import com.jj.eschool.mapper.ScheduleMapper;
import com.jj.eschool.repository.ScheduleRepository;
import lombok.RequiredArgsConstructor;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ScheduleService {

    private final ScheduleMapper scheduleMapper = Mappers.getMapper(ScheduleMapper.class);

    private final ScheduleRepository scheduleRepository;

    public List<ScheduleDTO> findAll() {
        var schedules = scheduleRepository.findAll();
        return scheduleMapper.mapSchedules(schedules);
    }

    public ScheduleDTO findById(Long id) {
        var schedule = scheduleRepository.findById(id).orElseThrow();
        return scheduleMapper.mapSchedule(schedule);
    }

    public void save(ScheduleDTO scheduleDTO) {
        var toSave = scheduleMapper.mapSchedule(scheduleDTO);

        scheduleRepository.save(toSave);
    }
}
