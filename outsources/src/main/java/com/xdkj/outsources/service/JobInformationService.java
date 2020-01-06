package com.xdkj.outsources.service;

import com.xdkj.outsources.entity.JobInformation;
    /**
 * @Author JCX
 * @create 2020-01-06 14:48
 */
public interface JobInformationService{


    int deleteByPrimaryKey(Integer jobId);

    int insert(JobInformation record);

    int insertSelective(JobInformation record);

    JobInformation selectByPrimaryKey(Integer jobId);

    int updateByPrimaryKeySelective(JobInformation record);

    int updateByPrimaryKey(JobInformation record);

}
