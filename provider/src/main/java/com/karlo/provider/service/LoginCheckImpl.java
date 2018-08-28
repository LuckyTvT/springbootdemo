package com.karlo.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.karlo.providerAPI.LoginCheck;
import org.springframework.stereotype.Component;

@Service(interfaceClass = LoginCheck.class)
@Component
public class LoginCheckImpl implements LoginCheck {

    @Override
    public boolean LoginCheck(String username, String password) {
        String root = "root";
        if (username.equals(root) && password.equals(root)) {
            return true;
        }
        return false;

    }
}
