package com.example.springloginapplication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MenuController {
        //メニュー画面への遷移
        @GetMapping("/menu")
        String index() {
            return "menu";
        }
}
