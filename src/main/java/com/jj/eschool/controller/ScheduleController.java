package com.jj.eschool.controller;

import com.jj.eschool.dto.CourseDTO;
import com.jj.eschool.dto.ScheduleDTO;
import com.jj.eschool.dto.UserDTO;
import com.jj.eschool.service.ScheduleService;
import com.jj.eschool.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/schedule")
public class ScheduleController {

    private final ScheduleService scheduleService;

    private final UserService userService;

    @GetMapping("")
    public String schedule(Model model, Authentication authentication) {
        boolean isAdminOrTeacher = checkIfUserIsAdminOrTeacher(authentication);
        model.addAttribute("schedules", scheduleService.findAll());
        model.addAttribute("isAdminOrTeacher", isAdminOrTeacher);
        return "schedule";
    }

    @GetMapping("/add")
    public String addOrEditScheduleForm(@RequestParam(value = "id", required = false) Long id, Model model) {
        ScheduleDTO scheduleDTO;
        if (id != null) {
            scheduleDTO = scheduleService.findById(id);
        } else {
            scheduleDTO = new ScheduleDTO(null, null, null, null, null);
        }
        List<UserDTO> teachers = userService.findAllTeachers();
        model.addAttribute("scheduleDTO", scheduleDTO);
        model.addAttribute("teachers", teachers);
        return "add-schedule-form";
    }

    @PostMapping("/add")
    public String addSchedule(@ModelAttribute ScheduleDTO scheduleDTO) {
        UserDTO teacher = userService.findById(scheduleDTO.course().teacherId()).get();
        CourseDTO courseDTO = new CourseDTO(
                scheduleDTO.course().courseId(),
                scheduleDTO.course().name(),
                scheduleDTO.course().description(),
                teacher,
                null
        );

        scheduleService.save(new ScheduleDTO(
                scheduleDTO.scheduleID(),
                courseDTO,
                scheduleDTO.classRoom(),
                scheduleDTO.time(),
                scheduleDTO.dateOrDay()));
        return "redirect:/schedule";
    }

    private boolean checkIfUserIsAdminOrTeacher(Authentication authentication) {
        if (authentication == null || !authentication.isAuthenticated()) {
            return false;
        }
        return authentication.getAuthorities().stream()
                .anyMatch(a -> a.getAuthority().equals("ROLE_ADMIN") || a.getAuthority().equals("ROLE_TEACHER"));
    }
}
