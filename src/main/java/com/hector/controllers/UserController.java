package com.hector.controllers;

import com.hector.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @ResponseBody
    @GetMapping("/users")
    public User index(){
        User user = new User();
        user.setAge(30);
        user.setName("刘伟");
        return  user;
    }
}
