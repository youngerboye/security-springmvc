package com.young.security.springmvc.service.impl;

import com.young.security.springmvc.model.AuthenticationRequest;
import com.young.security.springmvc.model.UserDto;
import com.young.security.springmvc.service.AuthenticationService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {
    @Override
    public UserDto authentication(AuthenticationRequest authenticationRequest) {

        //1。校验参数是否为空
        if (authenticationRequest == null || authenticationRequest.getUsername() == null ||
                authenticationRequest.getPassword() == null) {
            throw new RuntimeException("账号或者密码为空");

        }
        //采用模拟方法
        String username = authenticationRequest.getUsername();
        UserDto userDto = userDtoMap.get(username);
        if(userDto==null){
            throw new RuntimeException("用户不存在");
        }
        if(!userDto.getPassword().equals(authenticationRequest.getPassword())){
            throw new RuntimeException("密码错误");

        }
        return userDto;
    }

    private Map<String, UserDto> userDtoMap = new HashMap<>();

    {
        userDtoMap.put("zhangsan", new UserDto("1010", "zhangsan", "123", "张三", "133443"));
        userDtoMap.put("lisi", new UserDto("1010", "lisi", "123", "李四", "133443"));

    }
}
