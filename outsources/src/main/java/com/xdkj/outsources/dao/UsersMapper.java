package com.xdkj.outsources.dao;
import org.apache.ibatis.annotations.Param;
import java.util.List;

import com.xdkj.outsources.entity.Users;

/**
 * @Author JCX
 * @create 2020-01-06 17:09
 */
public interface UsersMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(Users record);

    int insertSelective(Users record);

    Users selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(Users record);

    int updateByPrimaryKey(Users record);

    Users selectAllByUserEmailAndUserPassword(@Param("userEmail")String userEmail,@Param("userPassword")String userPassword);

    Users selectByUserEmail(String userEmail);

    int updateUserPasswordByUserEmail(@Param("updatedUserPassword")String updatedUserPassword,@Param("userEmail")String userEmail);


}