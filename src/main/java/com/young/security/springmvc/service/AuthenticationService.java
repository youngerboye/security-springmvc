package com.young.security.springmvc.service;

import com.young.security.springmvc.model.AuthenticationRequest;
import com.young.security.springmvc.model.UserDto;

public interface AuthenticationService {

    /**
     * 用户认证，账号和密码
     */
    UserDto authentication(AuthenticationRequest authenticationRequest);
}
