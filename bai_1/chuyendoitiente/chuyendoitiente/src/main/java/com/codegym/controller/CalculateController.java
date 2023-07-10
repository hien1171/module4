package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
@Controller
public class CalculateController {
//    @GetMapping("/calculate")
//    public String showFormCreate(){
//        return "c";
//    }

    @GetMapping("/calculate")
    public String showForm(){
        return "calculate";
    }

    @PostMapping("/calculate")
    public String save(@RequestParam float dong, Model model
                    ){
       float usd=dong/23000;
       model.addAttribute("usd",usd);

        return "calculate";
    }
}
