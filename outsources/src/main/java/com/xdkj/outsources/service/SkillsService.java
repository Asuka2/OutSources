package com.xdkj.outsources.service;

import com.xdkj.outsources.entity.Skills;
    /**
 * @Author JCX
 * @create 2020-01-06 14:48
 */
public interface SkillsService{


    int deleteByPrimaryKey(Integer skillId);

    int insert(Skills record);

    int insertSelective(Skills record);

    Skills selectByPrimaryKey(Integer skillId);

    int updateByPrimaryKeySelective(Skills record);

    int updateByPrimaryKey(Skills record);

}
