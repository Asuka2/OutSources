package com.xdkj.outsources.web;

import com.xdkj.outsources.entity.Users;
import com.xdkj.outsources.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author MavaL
 * @createtime 2020--01--06--15:15
 */
@RestController
@RequestMapping("/mgr")
public class MgrController {

    @Autowired
    private UsersService usersService;

    @RequestMapping(value = "/getUserList",method = RequestMethod.GET)
    public String userList(){

        return "Test";
    }

}
