package com.xdkj.outsources.service;

import com.xdkj.outsources.entity.Users;
    /**
 * @Author JCX
 * @create 2020-01-06 14:10
 */
public interface UsersService{


    int deleteByPrimaryKey(Integer userId);

    int insert(Users record);

    int insertSelective(Users record);

    Users selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(Users record);

    int updateByPrimaryKey(Users record);

}
