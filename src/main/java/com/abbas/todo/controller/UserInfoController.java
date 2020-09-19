package com.abbas.todo.controller;

import com.abbas.todo.entity.UserInfo;
import com.abbas.todo.service.UserInfoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Controller for UserInfo
 *
 * @author abbas
 */
@RestController
@RequestMapping("/user")
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService;

    @PostMapping
    public void createUser(String userName) {
        userName = "Khan";
        userInfoService.createUser(userName);
    }

    @GetMapping
    public List<UserInfo> getAllUsers() {
        return userInfoService.getAllUsers();
    }

    @GetMapping("/{userName}")
    public UserInfo getUser(@PathVariable("userName") String userName) {
        return userInfoService.getUser(userName);
    }

}
