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
        var result = scheduleMapper.mapSchedules(schedules);

        return List.of(new ScheduleDTO(new CourseDTO(
                2L,
                "IT - Java Programming",
                "I teach you, how is Java worked",
                "I"
        ), "Room 234A", "12.12.2023 20.00-21.00"));
    }
}
