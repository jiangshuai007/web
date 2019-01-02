package com.ynu.sei.lib.repositories;

import com.ynu.sei.lib.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;


@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void saveUserTest() {
        User user = new User(LocalDateTime.now(), "user1", "17687045376","123", "Male", "hoho");
        userRepository.save(user);
    }

    @Test
    @Transactional
    @Rollback(false)
    public void updateUserInfoTest() {
        User user = userRepository.getByName("");
        user.setName("姜帅");
        userRepository.save(user);
    }
}