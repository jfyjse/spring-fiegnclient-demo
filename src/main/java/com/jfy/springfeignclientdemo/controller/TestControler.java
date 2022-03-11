package com.jfy.springfeignclientdemo.controller;

import com.jfy.springfeignclientdemo.api.UserClient;
import com.jfy.springfeignclientdemo.dto.UserSchema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestControler {
    @Autowired
    public UserClient userClient;
    @GetMapping("/test/users")
    public List<UserSchema> getAllUsersRest(){
        return userClient.getUsers();
    }

}
