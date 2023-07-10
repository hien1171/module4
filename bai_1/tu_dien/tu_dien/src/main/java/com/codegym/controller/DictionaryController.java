package com.codegym.controller;

import com.codegym.service.DictionaryService;
import com.codegym.service.IDictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@Controller
public class DictionaryController {

    @Autowired
      private IDictionaryService dictionaryService;
    @GetMapping("/dictionary")
    public String showForm(){
        return "dictionary";
    }

    @PostMapping("/dictionary")
    public String translate(@RequestParam String tiengViet, Model model){
        Map<String,String> map=dictionaryService.listWord();

        String el = "khong tim thay";

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
            if(entry.getKey().equals(tiengViet)){
                el=entry.getValue();
            }
        }
        model.addAttribute("el",el);
        return "dictionary";
    }
}
