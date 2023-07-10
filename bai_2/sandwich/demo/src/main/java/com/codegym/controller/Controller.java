package com.codegym.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.stereotype.Controller
public class Controller {

    @GetMapping("/list")
    public String showForm(){
        return "list";
    }

    @PostMapping("/list")
    public String save(@RequestParam String[] condiment
            , Model model
    ){

        model.addAttribute("condiment",condiment);

        return "list";
    }
}
