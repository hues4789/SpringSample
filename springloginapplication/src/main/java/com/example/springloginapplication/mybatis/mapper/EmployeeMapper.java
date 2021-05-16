package com.example.springloginapplication.mybatis.mapper;

import com.example.springloginapplication.domain.Employee;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface EmployeeMapper {
    @Select({"select * from employee where name = #{name} limit 1"})
    Employee selectByName(String name);
}
