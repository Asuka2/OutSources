package com.xdkj.outsources.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.xdkj.outsources.dao.UsersMapper;
import com.xdkj.outsources.entity.Users;
import com.xdkj.outsources.service.UsersService;
import org.springframework.util.DigestUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.Random;

/**
 * @Author JCX
 * @create 2020-01-06 14:10
 */
@Service
public class UsersServiceImpl implements UsersService {

    @Resource
    private UsersMapper usersMapper;

    @Override
    public int deleteByPrimaryKey(Integer userId) {
        return usersMapper.deleteByPrimaryKey(userId);
    }

    @Override
    public int insert(Users record) {
        return usersMapper.insert(record);
    }

    @Override
    public int insertSelective(Users record) {
        record.setUserPassword(getMd5(record.getUserPassword()));
        return usersMapper.insertSelective(record);
    }

    @Override
    public Users selectByPrimaryKey(Integer userId) {
        return usersMapper.selectByPrimaryKey(userId);
    }

    @Override
    public int updateByPrimaryKeySelective(Users record) {

        return usersMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Users record) {
        return usersMapper.updateByPrimaryKey(record);
    }

//    md5盐值字符串，用于混淆md5
    private final String slat = "asdgi128f9wfal]d[l;a]clla][pdq[wjf[ja";
    @Override
    public Users selectAllByUserEmailAndUserPassword(String userEmail, String userPassword) {
        userPassword = getMd5(userPassword);
        return usersMapper.selectAllByUserEmailAndUserPassword(userEmail,userPassword);
    }
    private String getMd5(String userPassword){
        String base = userPassword+"/"+slat;
        String md5 = DigestUtils.md5DigestAsHex(base.getBytes());
        return md5;
    }
    /**
     * 发件人
     */
    @Value("${lance.mail.sender}")
    private String from;
    @Autowired
    private JavaMailSender javaMailSender;
    /**
     * 发送验证码
     * @param verifyMail 用户邮箱
     * @return 返回验证码
     */
    @Override
    public String sendVerifyMail(String verifyMail) {
        try {
                SimpleMailMessage message = new SimpleMailMessage();
                String verifyString = getVerifyString();
                message.setFrom(from);
                message.setTo(verifyMail);
                message.setSubject("邮箱验证码。");
                message.setText("验证码为："+verifyString);
                javaMailSender.send(message);
                return verifyString;
        } catch (MailException e) {
            throw new RuntimeException("发送失败，失败原因："+e.getMessage());
        }
    }

    @Override
    public int updateUserPasswordByUserEmail(String userPassword, String userEmail) {
        try {
            Users user = usersMapper.selectByUserEmail(userEmail);
            if (user==null||"".equals(user)){
                throw new RuntimeException("用户不存在（该邮箱未注册）！");
            }else {
                return usersMapper.updateUserPasswordByUserEmail(getMd5(userPassword), userEmail);
            }
        } catch (RuntimeException e) {
            throw new RuntimeException("发生错误！"+e.getMessage());
        }
    }

    /**
     * 上传头像
     * @param imgFile 头像文件
     * @param userId 用户ID
     * @return 返回true或false
     */
    @Override
    public Boolean updateUserImg(MultipartFile imgFile, Integer userId) {
        try {
            String filename = imgFile.getOriginalFilename();
            String uploadPath = "D:\\SpringBoot\\outsources\\src\\main\\resources\\img\\";
            imgFile.transferTo(new File(uploadPath + filename));
            Users user = new Users();
            user.setUserId(userId);
            user.setUserImg("/img/" + filename);
            int i = usersMapper.updateByPrimaryKeySelective(user);
            return i > 0 ? true : false;
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    /**
     * 验证邮箱是否被注册
     * @param userEmail 被验证的邮箱
     * @return 返回验证码
     */
    @Override
    public String verifyUserEmail(String userEmail) {
        try {
            Users user = usersMapper.selectByUserEmail(userEmail);
            if (user==null||"".equals(user)){
                String verifyString = sendVerifyMail(userEmail);
                return verifyString;
            }else {
                throw new RuntimeException("该邮箱已注册！");
            }
        } catch (RuntimeException e) {
            throw new RuntimeException("发生错误！"+e.getMessage());
        }
    }

    private String getVerifyString(){
        Random random = new Random();
        String verifyString = "";
        while (verifyString.length()<6){
            int i = random.nextInt(9);
            verifyString += i;
        }
        return verifyString;
    }



}

