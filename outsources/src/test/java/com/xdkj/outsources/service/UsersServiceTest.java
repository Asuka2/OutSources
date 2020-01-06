package com.xdkj.outsources.service;

import com.xdkj.outsources.entity.Users;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


/**
 * @Author JCX
 * @create 2020-01-06 14:12
 */
@RunWith(SpringRunner.class)
@SpringBootTest
class UsersServiceTest {

    @Autowired
    private UsersService usersService;
    @Test
    void selectByPrimaryKey() {
        Users user = usersService.selectByPrimaryKey(1);
        System.out.println(user);

    }
}