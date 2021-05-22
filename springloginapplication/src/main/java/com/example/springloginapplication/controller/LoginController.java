package com.example.springloginapplication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class LoginController {

        //ログイン画面への遷移
        @GetMapping("/login")
        public String getLogin(Model mode) {
            log.debug("id");
            return "login";
        }
    
        //ログイン成功時のメニュー画面への遷移
        @PostMapping("/login")
        public String postLogin(Model model) {
            log.debug("id");
            return "redirect:/menu";
        }
    
}
