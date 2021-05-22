package com.example.springloginapplication.security;

import com.example.springloginapplication.domain.Employee;

import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
@EqualsAndHashCode(callSuper=false)
public class LoginUserDetails extends User{
        //employeeテーブルから取得したオブジェクトを格納
        private final Employee employee;

        //認証処理
        public LoginUserDetails(Employee employee) {
            
            //employeeテーブルの名前とパスワードでログイン認証を行う
            super(employee.getName(), employee.getPassword(), AuthorityUtils.createAuthorityList(employee.getRole()));
            log.info("name:{} password:{} role:{}",employee.getName(),employee.getPassword(),employee.getRole());
            this.employee = employee;
        }
}
