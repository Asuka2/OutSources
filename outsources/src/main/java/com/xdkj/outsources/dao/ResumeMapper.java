package com.xdkj.outsources.dao;

import com.xdkj.outsources.entity.Resume;

/**
 * @Author JCX
 * @create 2020-01-06 14:48
 */
public interface ResumeMapper {
    int deleteByPrimaryKey(Integer resumeId);

    int insert(Resume record);

    int insertSelective(Resume record);

    Resume selectByPrimaryKey(Integer resumeId);

    int updateByPrimaryKeySelective(Resume record);

    int updateByPrimaryKey(Resume record);
}