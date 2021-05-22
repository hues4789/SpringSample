package com.example.springloginapplication.security;

import com.example.springloginapplication.domain.Employee;
import com.example.springloginapplication.mybatis.mapper.EmployeeMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class LoginUserDetailsService implements UserDetailsService{

    @Autowired
    EmployeeMapper employeeMapper;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            

    @Override
    public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
        //入力された名前をキーにemployeeテーブルのレコードを1件取得
        Employee employee = employeeMapper.selectByName(name);

        //該当レコードが取得できなかった場合はエラーにする
        if  (employee   ==  null)   {
            throw new UsernameNotFoundException("Wrong email or password");
        }

        return new LoginUserDetails(employee);
    }
    
}
