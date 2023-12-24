package com.jj.eschool.controller;

import com.jj.eschool.entity.enums.UserRole;
import com.jj.eschool.service.AttendanceService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class AttendanceController {

    private final AttendanceService attendanceService;

    @GetMapping("/attendance")
    public String attendance(Model model) {

        UserRole role = UserRole.TEACHER;
        var userId = 7L;
        model.addAttribute("role", role.toString());

        model.addAttribute("attendances", attendanceService.findAllByUserIdAndRole(userId, role));
        return "attendance";
    }
}
