package com.jfy.springfeignclientdemo.api;

import com.jfy.springfeignclientdemo.dto.UserSchema;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(url = "${feign.client.url}" , name = "USER")
//@FeignClient(url = "https://jsonplaceholder.typicode.com/" , name = "USER")
public interface UserClient {
    @GetMapping("/users")
    public List<UserSchema> getUsers();
}
