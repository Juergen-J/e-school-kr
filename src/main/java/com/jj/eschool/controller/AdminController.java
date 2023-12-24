package com.jj.eschool.controller;

import com.jj.eschool.dto.UserDTO;
import com.jj.eschool.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
@RequiredArgsConstructor
public class AdminController {

    private final UserService userService;

    @GetMapping("/adduser")
    public String addUserForm() {
        return "add-user";
    }
    @GetMapping("/dashboard")
    public String dashboard(Model model) {
        model.addAttribute("users", userService.findAll());
        return "admin-dashboard";
    }

    @PostMapping("/adduser")
    public String addUser(@ModelAttribute UserDTO userDTO) {
        userService.save(userDTO);
        return "redirect:/admin/dashboard";
    }
}
