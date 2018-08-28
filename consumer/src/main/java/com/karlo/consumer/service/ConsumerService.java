package com.karlo.consumer.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.karlo.providerAPI.LoginCheck;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

    @Reference
    private LoginCheck loginCheck;

    public boolean check(String username,String password){
        return loginCheck.LoginCheck(username, password);
    }

}
