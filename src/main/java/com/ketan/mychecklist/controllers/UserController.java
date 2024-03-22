package com.ketan.mychecklist.controllers;

import com.ketan.mychecklist.entity.MclUser;
import com.ketan.mychecklist.repo.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class UserController {

    @Autowired
    private UserService userService;
    @GetMapping("/users")
    public String getUsers(){
        return "returning users";
    }

    @PostMapping("/users")
    public void createUser(@RequestBody MclUser mcluser){

        mcluser.setUserId(UUID.randomUUID().toString());

        System.out.println(userService.saveUser(mcluser));

    }

}
