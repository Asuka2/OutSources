package com.xdkj.outsources.dao;

import com.xdkj.outsources.entity.Identification;

/**
 * @Author JCX
 * @create 2020-01-06 14:48
 */
public interface IdentificationMapper {
    int deleteByPrimaryKey(Integer identityId);

    int insert(Identification record);

    int insertSelective(Identification record);

    Identification selectByPrimaryKey(Integer identityId);

    int updateByPrimaryKeySelective(Identification record);

    int updateByPrimaryKey(Identification record);
}