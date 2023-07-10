package com.codegym.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/mail")
public class StudentController {
    @ModelAttribute("languages")
    public String[] getLanguages(){
        return new String[]{"English","Vietnamese","Chinese","Japanese"};
    }

    @GetMapping("/mail")
    public String showForm(Model model){
        Object mail;
        model.addAttribute("mail",mail);
        return "mail";
    }
}
