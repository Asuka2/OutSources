package com.xdkj.outsources.service;

import com.xdkj.outsources.entity.Works;
    /**
 * @Author JCX
 * @create 2020-01-06 14:49
 */
public interface WorksService{


    int deleteByPrimaryKey(Integer worksId);

    int insert(Works record);

    int insertSelective(Works record);

    Works selectByPrimaryKey(Integer worksId);

    int updateByPrimaryKeySelective(Works record);

    int updateByPrimaryKey(Works record);

}
