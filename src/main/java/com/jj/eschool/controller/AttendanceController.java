package com.jj.eschool.controller;

import com.jj.eschool.entity.enums.UserRole;
import com.jj.eschool.service.AttendanceService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class AttendanceController {

    private final AttendanceService attendanceService;

    @GetMapping("/attendance")
    public String attendance(Model model) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String role = auth.getAuthorities().toString();
        String username = auth.getName();
        if (role.contains(UserRole.TEACHER.toString())) {

            model.addAttribute("attendances", attendanceService.getAll());
        } else {
            model.addAttribute("attendances", attendanceService.getAttendanceByUserName(username));
        }
        model.addAttribute("role", role);

        return "attendance";
    }
}
