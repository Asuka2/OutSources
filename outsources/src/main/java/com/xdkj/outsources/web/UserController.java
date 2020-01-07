package com.xdkj.outsources.web;

import com.xdkj.outsources.entity.Users;
import com.xdkj.outsources.service.UsersService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author JCX
 * @create 2020-01-06 16:30
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UsersService usersService;

    /**
     *
     * @param userId
     * @return
     */
    @ApiOperation(value = "根据ID查询用户",notes = "查询用户的方法")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query",name = "userId",value = "用户ID",required = true,dataType = "int")
    })
    @RequestMapping(value = "/getuserbyid",method = RequestMethod.POST)
    public Map<String,Object> getUserById(Integer userId){
        Map<String, Object> modelMap = new HashMap<>();
        Users user = usersService.selectByPrimaryKey(userId);
        modelMap.put("user",user);
        return modelMap;
    }
}
