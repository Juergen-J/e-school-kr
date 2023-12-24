package com.jj.eschool.controller;

import com.jj.eschool.service.ElectronicLibraryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class ElectronicLibraryController {

    private final ElectronicLibraryService electronicLibraryService;

    @GetMapping("/electronic-library")
    public String electronicLibrary(Model model) {
        model.addAttribute("resources", electronicLibraryService.findAll());
        return "electronic-library";
    }
}
