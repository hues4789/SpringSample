package com.example.springloginapplication.controller;

import java.util.List;

import com.example.springloginapplication.domain.Employee;
import com.example.springloginapplication.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {
    @Autowired
    UserService userService;

        //メニュー画面への遷移
        @GetMapping("/admin")
        String index(Model model) {
            List<Employee>userlist = userService.searchAll();
            model.addAttribute("userlist",userlist);
            return "admin";
        }
}
