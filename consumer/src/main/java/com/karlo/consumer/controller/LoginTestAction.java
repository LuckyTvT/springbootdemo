package com.karlo.consumer.controller;

import com.karlo.consumer.service.ConsumerService;
import org.apache.zookeeper.Login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginTestAction {

    @Autowired
    ConsumerService consumerService;

    @RequestMapping("/login/{username}/{password}")
    @ResponseBody
    public boolean login(@PathVariable String username,@PathVariable String password){
        return consumerService.check(username, password);
    }


}
