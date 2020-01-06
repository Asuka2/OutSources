package com.xdkj.outsources.dao;

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
}