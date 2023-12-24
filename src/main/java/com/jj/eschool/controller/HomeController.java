package com.jj.eschool.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index(Model model) {
        // Добавление данных в модель, если необходимо
        model.addAttribute("message", "Добро пожаловать в Систему Управления Учебным Процессом");
        return "index";
    }
}
