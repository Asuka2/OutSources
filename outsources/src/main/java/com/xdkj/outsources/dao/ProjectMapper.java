package com.xdkj.outsources.dao;

import com.xdkj.outsources.entity.Project;

/**
 * @Author JCX
 * @create 2020-01-08 17:51
 */
public interface ProjectMapper {
    int deleteByPrimaryKey(Integer projectId);

    int insert(Project record);

    int insertSelective(Project record);

    Project selectByPrimaryKey(Integer projectId);

    int updateByPrimaryKeySelective(Project record);

    int updateByPrimaryKey(Project record);
}