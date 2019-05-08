package com.karlo.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.karlo.providerAPI.LoginCheck;
import lombok.Data;
import org.junit.jupiter.api.Test;
import org.springframework.stereotype.Component;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

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
    @Test
    public void test(){
        User user = new User();
        user.setName(null);
        t(user);
    }


    public void t(@Valid User user){
        System.out.println(user.getName());
        System.out.println(user.getCardId());
    }



}


@Data
class User {

    @NotNull
    private String name;
    @NotNull
    private int id;
    @NotNull
    private double cardId;

}



