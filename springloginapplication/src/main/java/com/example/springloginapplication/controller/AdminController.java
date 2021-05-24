package com.example.springloginapplication.controller;

import java.util.List;
import java.util.stream.Collectors;

import com.example.springloginapplication.domain.Employee;
import com.example.springloginapplication.domain.EmployeeCsv;
import com.example.springloginapplication.service.UserService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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

        @GetMapping(value="/*.csv",produces = MediaType.APPLICATION_OCTET_STREAM_VALUE + "; charset=UTF-8; Content-Disposition: attachment")
        @ResponseBody
        public Object csv() throws JsonProcessingException{
            List<Employee>userlist = userService.searchAll();
            List<EmployeeCsv> csvs =userlist.stream().map(e->new EmployeeCsv(e.getId(), e.getName(), e.getPassword(), e.getRole()))
            .collect(Collectors.toList());

            //dataformat-csvライブラリ使用
            CsvMapper mapper = new CsvMapper();
            CsvSchema schema = mapper.schemaFor(EmployeeCsv.class).withHeader();
            return mapper.writer(schema).writeValueAsString(csvs);
            
        }
}
