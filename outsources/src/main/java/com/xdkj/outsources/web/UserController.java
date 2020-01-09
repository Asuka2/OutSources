package com.xdkj.outsources.web;

import com.xdkj.outsources.entity.Users;
import com.xdkj.outsources.service.UsersService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author JCX
 * @create 2020-01-06 16:30
 */
@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {

    @Autowired
    private UsersService usersService;
    /**
     * 根据Email和Password进行登录
     * @param userEmail 用户Email
     * @param userPassword 用户密码
     * @return 返回一个Users类
     */
    @ApiOperation(value = "根据Email和Password登录",notes = "用户登录")
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public Map<String,Object> login(@RequestParam("userEmail")String userEmail,
                                    @RequestParam("userPassword")String userPassword,
                                    HttpSession session){
        Map<String, Object> modelMap = new HashMap<>();
        Users user = usersService.selectAllByUserEmailAndUserPassword(userEmail, userPassword);
        session.setAttribute("userId",user.getUserId());
        modelMap.put("user",user);
        return modelMap;
    }

    /**
     * 填写用户信息进行注册
     * @param user 用户信息
     * @return 返回1/0 1代表注册成功，0代表注册失败
     */
    @ApiOperation(value = "填写信息进行注册：JSON形式的用户信息",notes = "不包含userId字段,userImg字段为null")
    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public Map<String,Object> register(@ApiParam(name="用户对象",value="不包含userId字段,userImg字段为null(返回值1为成功，0位失败)",required=true)
                                                   Users user){
        System.out.println(user);
        Map<String, Object> modelMap = new HashMap<>();
        modelMap.put("success",usersService.insertSelective(user));
        return modelMap;
    }

    /**
     * 邮箱验证
     * @param userEmail 注册时填写的邮箱
     * @return 返回一个验证码
     */
    @ApiOperation(value = "注册时的邮箱验证",notes = "点击验证，发送邮件（随机数验证码）")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query",name = "userEmail",value = "Email",required = true,dataType = "String"),
})
    @RequestMapping(value = "/verifymail",method = RequestMethod.POST)
    public Map<String,Object> verifyMail(@RequestParam("userEmail")String userEmail){
        Map<String, Object> modelMap = new HashMap<>();
        String verifyString = usersService.verifyUserEmail(userEmail);
        modelMap.put("verifyString",verifyString);
        return modelMap;
    }

    /**
     * 找回密码操作，返回验证码
     * @param userEmail 用户邮箱
     * @return 返回验证码
     */
    @ApiOperation(value = "找回密码操作，返回验证码",notes = "点击找回密码，发送邮件（随机数验证码）")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query",name = "userEmail",value = "Email",required = true,dataType = "String"),
    })
    @RequestMapping(value = "/sendpasswordverifymail",method = RequestMethod.POST)
    public Map<String,Object> sendVerifyMail(@RequestParam("userEmail")String userEmail){
        Map<String, Object> modelMap = new HashMap<>();
        String verifyString = usersService.sendVerifyMail(userEmail);
        modelMap.put("verifyString",verifyString);
        return modelMap;
    }

    /**
     * 根据Email和Password修改用户密码
     * @param userEmail 用户Email
     * @param userPassword 用户密码
     * @return 返回一个0/1，0代表修改失败，1代表修改成功
     */
    @ApiOperation(value = "根据Email和Password修改密码",notes = "找回密码")
    @RequestMapping(value = "/updatepassword",method = RequestMethod.POST)
    public Map<String,Object> updatePassword(@RequestParam("userEmail")String userEmail,
                                             @RequestParam("userPassword")String userPassword){
        Map<String, Object> modelMap = new HashMap<>();
        int i = usersService.updateUserPasswordByUserEmail(userPassword, userEmail);
        modelMap.put("success",i);
        return modelMap;
    }

    /**
     * 上传头像
     * @param imgFile 上传的头像文件
     * @param session  保存userId
     * @return  返回1/0,1代表成功，0代表失败
     * @throws IOException
     */
    @ApiOperation(value = "根据userId修改用户头像",notes = "修改头像，返回值为1时修改成功，为0则修改失败")
    @RequestMapping(value = "/updateimg",method = RequestMethod.POST)
    public Map<String,Object> updateImg(@RequestParam(value = "imgFile") MultipartFile imgFile,
                                        HttpSession session){
        String filename = imgFile.getOriginalFilename();
        Integer userId = (Integer)session.getAttribute("userId");
        Map<String, Object> modelMap = new HashMap<>();
        Boolean success = usersService.updateUserImg(imgFile, 1);
        modelMap.put("success",success);
        return modelMap;
    }

    /**
     * 修改个人基本信息
     * @param user 修改后的个人信息
     * @return 返回1为成功，0为失败
     */
    @ApiOperation(value = "更改信息进行修改个人信息：JSON形式的用户信息",notes = "不包含userId字段、userImg字段、password字段")
    @RequestMapping(value = "/updateinformation",method = RequestMethod.POST)
    public Map<String,Object> updateInformation(@ApiParam(name="用户对象",value="不包含userId字段、userImg字段、password字段(返回值1为成功，0位失败)",required=true)
                                               Users user){
        System.out.println(user);
        Map<String, Object> modelMap = new HashMap<>();
        modelMap.put("success",usersService.updateByPrimaryKeySelective(user));
        return modelMap;
    }



}
