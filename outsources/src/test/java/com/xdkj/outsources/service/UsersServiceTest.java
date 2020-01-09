package com.xdkj.outsources.service;

import com.xdkj.outsources.entity.Users;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.DigestUtils;


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

    @Test
    void sendSimpleMail() {
        String verifyString = usersService.sendVerifyMail("1241563018@qq.com");
        System.out.println(verifyString);
    }

    //    md5盐值字符串，用于混淆md5
    private final String slat = "asdgi128f9wfal]d[l;a]clla][pdq[wjf[ja";
    @Test
    void md5Test(){
        String md51 = getMd5("123456");
        String md52 = getMd5("123456");
        String md53 = getMd5("123456");
        System.out.println("md51 = "+md51);
        System.out.println("md52 = "+md52);
        System.out.println("md53 = "+md53);

    }
    private String getMd5(String userPassword){
        String base = userPassword+"/"+slat;
        String md5 = DigestUtils.md5DigestAsHex(base.getBytes());
        return md5;
    }
}