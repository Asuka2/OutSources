package com.xdkj.outsources.dao;

import com.xdkj.outsources.entity.Liuyan;

/**
@author wc
@create 2020-01-07-9:52
*/
public interface LiuyanMapper {
    int deleteByPrimaryKey(Integer lyId);

    int insert(Liuyan record);

    int insertSelective(Liuyan record);

    Liuyan selectByPrimaryKey(Integer lyId);

    int updateByPrimaryKeySelective(Liuyan record);

    int updateByPrimaryKey(Liuyan record);
}