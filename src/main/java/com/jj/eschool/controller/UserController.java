package com.jj.eschool.controller;

import com.jj.eschool.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class UserController {


    private final UserService userService;

    @GetMapping("/profile")
    public String profile(Model model) {
        // Замените "username" на имя пользователя, полученное из контекста аутентификации или сессии
        String username = "username";
        model.addAttribute("user", userService.findByUsername(username));
        return "profile";
    }
}
