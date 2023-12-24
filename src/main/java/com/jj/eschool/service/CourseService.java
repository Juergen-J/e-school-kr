package com.jj.eschool.service;

import com.jj.eschool.dto.CourseDTO;
import com.jj.eschool.mapper.CourseMapper;
import com.jj.eschool.repository.CourseRepository;
import lombok.RequiredArgsConstructor;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CourseService {

    private final CourseMapper courseMapper = Mappers.getMapper(CourseMapper.class);

    private final CourseRepository courseRepository;

    public CourseDTO findById(Long id) {

        return null;
    }
}
