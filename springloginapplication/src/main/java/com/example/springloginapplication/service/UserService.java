package com.example.springloginapplication.service;

import java.util.List;

import com.example.springloginapplication.domain.Employee;
import com.example.springloginapplication.mybatis.mapper.EmployeeMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    
    @Autowired
    EmployeeMapper  employeeMapper;
                  
    public List<Employee> searchAll(){
        return employeeMapper.selectAll();
    }         

}
