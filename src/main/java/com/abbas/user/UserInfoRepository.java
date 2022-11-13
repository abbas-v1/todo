package com.abbas.user;

import com.abbas.user.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository for UserInfo
 *
 * @author abbas
 */
@Repository
public interface UserInfoRepository extends JpaRepository<UserInfo, Integer> {

    UserInfo findByUserName(String userName);

}
