package com.jj.eschool.mapper;

import com.jj.eschool.dto.ScheduleDTO;
import com.jj.eschool.entity.Schedule;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface ScheduleMapper {


    List<ScheduleDTO> mapSchedules(Iterable<Schedule> schedules);

    ScheduleDTO mapSchedule(Schedule schedule);
}
