package com.example.springloginapplication.domain;

import lombok.Data;

@Data
public class Employee {
    private Long id;
    private String name;
    private String password;
    private String role;
}
