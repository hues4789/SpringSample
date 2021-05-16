package com.example.springloginapplication.security;

import com.example.springloginapplication.domain.Employee;

import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class LoginUserDetails extends User{
        //employeeテーブルから取得したオブジェクトを格納
        private final Employee employee;

        //認証処理
        public LoginUserDetails(Employee employee, String role) {
            //employeeテーブルの名前とパスワードでログイン認証を行う
            super(employee.getName(), employee.getPassword(), AuthorityUtils.createAuthorityList(role));
            this.employee = employee;
        }
}
