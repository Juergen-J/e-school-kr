package com.jj.eschool.controller;

import com.jj.eschool.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
@RequiredArgsConstructor
public class CourseController {


    private final CourseService courseService;

    @GetMapping("/course/{id}")
    public String course(@PathVariable Long id, Model model) {
        model.addAttribute("course", courseService.findById(id));
        return "course";
    }

}
