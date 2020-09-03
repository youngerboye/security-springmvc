package com.young.security.springmvc.controller;

import com.young.security.springmvc.model.AuthenticationRequest;
import com.young.security.springmvc.model.UserDto;
import com.young.security.springmvc.service.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    private AuthenticationService authenticationService;

    @RequestMapping(value = "login",produces = "text/plain;")
    public String login(@RequestBody AuthenticationRequest request){
        UserDto authentication = authenticationService.authentication(request);

        return authentication.getUsername()+"登录成功";
    }
}
