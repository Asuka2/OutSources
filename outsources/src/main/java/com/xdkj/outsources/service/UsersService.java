package com.xdkj.outsources.service;

import com.xdkj.outsources.entity.Users;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.multipart.MultipartFile;

/**
 * @Author JCX
 * @create 2020-01-06 14:10
 */
public interface UsersService {


    int deleteByPrimaryKey(Integer userId);

    int insert(Users record);

    int insertSelective(Users record);

    Users selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(Users record);

    int updateByPrimaryKey(Users record);

    Users selectAllByUserEmailAndUserPassword(String userEmail, String userPassword);

    String verifyUserEmail(String userEmail);

    String sendVerifyMail(String verifyMail);

    int updateUserPasswordByUserEmail(String updatedUserPassword,String userEmail);

    Boolean updateUserImg(MultipartFile imgFile,Integer userId);

}

