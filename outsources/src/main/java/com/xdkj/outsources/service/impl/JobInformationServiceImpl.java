package com.xdkj.outsources.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.xdkj.outsources.dao.JobInformationMapper;
import com.xdkj.outsources.entity.JobInformation;
import com.xdkj.outsources.service.JobInformationService;
/**
 * @Author JCX
 * @create 2020-01-06 14:48
 */
@Service
public class JobInformationServiceImpl implements JobInformationService{

    @Resource
    private JobInformationMapper jobInformationMapper;

    @Override
    public int deleteByPrimaryKey(Integer jobId) {
        return jobInformationMapper.deleteByPrimaryKey(jobId);
    }

    @Override
    public int insert(JobInformation record) {
        return jobInformationMapper.insert(record);
    }

    @Override
    public int insertSelective(JobInformation record) {
        return jobInformationMapper.insertSelective(record);
    }

    @Override
    public JobInformation selectByPrimaryKey(Integer jobId) {
        return jobInformationMapper.selectByPrimaryKey(jobId);
    }

    @Override
    public int updateByPrimaryKeySelective(JobInformation record) {
        return jobInformationMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(JobInformation record) {
        return jobInformationMapper.updateByPrimaryKey(record);
    }

}
