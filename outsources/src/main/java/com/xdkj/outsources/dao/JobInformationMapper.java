package com.xdkj.outsources.dao;

import com.xdkj.outsources.entity.JobInformation;

/**
 * @Author JCX
 * @create 2020-01-06 14:48
 */
public interface JobInformationMapper {
    int deleteByPrimaryKey(Integer jobId);

    int insert(JobInformation record);

    int insertSelective(JobInformation record);

    JobInformation selectByPrimaryKey(Integer jobId);

    int updateByPrimaryKeySelective(JobInformation record);

    int updateByPrimaryKey(JobInformation record);
}