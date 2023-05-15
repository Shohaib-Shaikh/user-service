package com.project.user.controller;

import com.example.demo.utility.ConstantUrlHelper;
import com.project.user.entities.User;
import com.project.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(ConstantUrlHelper.USER_URL)
public class UserController {


    @Autowired
    private UserService userService;

    @PostMapping(ConstantUrlHelper.CREATE_URL)
    public User createEntity(@RequestBody User user){
        return userService.create(user);
    }

    @GetMapping("/message")
    public String getMessageFromUserService(){
        return "This is user service API";
    }


}
