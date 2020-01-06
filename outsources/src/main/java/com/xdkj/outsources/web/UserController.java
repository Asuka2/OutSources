package com.xdkj.outsources.web;

import com.xdkj.outsources.entity.Users;
import com.xdkj.outsources.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author JCX
 * @create 2020-01-06 14:17
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UsersService usersService;
    @RequestMapping(value = "/getuserbyid",method = RequestMethod.GET)
    public Map<String,Object> getUserById(Integer userId){
        Map<String, Object> modelMap = new HashMap<>();
        Users user = usersService.selectByPrimaryKey(userId);
        modelMap.put("user",user);
        return modelMap;
    }
}
