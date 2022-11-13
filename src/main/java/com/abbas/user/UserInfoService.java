package com.abbas.user;

import com.abbas.user.UserInfo;
import com.abbas.user.UserInfoRepository;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Service for UserInfo
 *
 * @author abbas
 */
@Service
@Slf4j
public class UserInfoService {

    @Autowired
    private UserInfoRepository userInfoRepository;

    public void createUser(String userName) {
        log.debug("Create new user by name : {}", userName);
        UserInfo userInfo = new UserInfo();
        userInfo.setUserName(userName);
        userInfoRepository.save(userInfo);
    }

    public List<UserInfo> getAllUsers() {
        log.debug("Get all users");
        return userInfoRepository.findAll();
    }

    public UserInfo getUser(String userName) {
        log.debug("Get user by name : {}", userName);
        return userInfoRepository.findByUserName(userName);
    }

}
