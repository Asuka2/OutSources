package com.xdkj.outsources.dao;

import com.xdkj.outsources.entity.Works;

/**
 * @Author JCX
 * @create 2020-01-08 14:37
 */
public interface WorksMapper {
    int deleteByPrimaryKey(Integer worksId);

    int insert(Works record);

    int insertSelective(Works record);

    Works selectByPrimaryKey(Integer worksId);

    int updateByPrimaryKeySelective(Works record);

    int updateByPrimaryKey(Works record);
}