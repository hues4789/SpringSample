package com.example.springloginapplication.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.AllArgsConstructor;
import lombok.Value;

//CSV作成
@Value
@AllArgsConstructor
@JsonPropertyOrder({"id","name","password","role"})

public class EmployeeCsv{
    @JsonProperty("id")
    private long id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("password")
    private String password;
    @JsonProperty("role")
    private String role;
}
