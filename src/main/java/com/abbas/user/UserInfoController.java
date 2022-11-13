package com.abbas.user;

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
@CrossOrigin(origins = "${cross.origin}")
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService;

    @PostMapping
    public void createUser(@RequestBody String userName) {
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
