package com.jj.eschool.controller;

import com.jj.eschool.entity.enums.UserRole;
import com.jj.eschool.service.GradeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class GradesController {

    private final GradeService gradeService;

    @GetMapping("/grades")
    public String grades(Model model) {
//        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
//        String role = auth.getAuthorities().toString();

        UserRole role = UserRole.TEACHER;
        var userId = 7L;
        model.addAttribute("role", role.toString());
        model.addAttribute("grades", gradeService.getGradesByRoleAndUserId(role, userId));

        return "grades";
    }
}
