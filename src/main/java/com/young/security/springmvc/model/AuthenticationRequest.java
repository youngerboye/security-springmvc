package com.young.security.springmvc.model;

import lombok.Data;

@Data
public class AuthenticationRequest {

    //认证请求参数,账号密码

    private String username;

    private String password;

}
