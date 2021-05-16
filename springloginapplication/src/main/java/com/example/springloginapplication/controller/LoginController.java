package com.example.springloginapplication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

        //ログイン画面への遷移
        @GetMapping("/login")
        public String getLogin(Model mode) {
            return "login";
        }
    
        //ログイン成功時のメニュー画面への遷移
        @PostMapping("/login")
        public String postLogin(Model model) {
            return "redirect:/menu";
        }
    
}
