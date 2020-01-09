package com.xdkj.outsources.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.xdkj.outsources.dao.ResumeMapper;
import com.xdkj.outsources.entity.Resume;
import com.xdkj.outsources.service.ResumeService;

/**
 * @Author JCX
 * @create 2020-01-06 14:48
 */
@Service
public class ResumeServiceImpl implements ResumeService {

    @Resource
    private ResumeMapper resumeMapper;

    @Override
    public int deleteByPrimaryKey(Integer resumeId) {
        return resumeMapper.deleteByPrimaryKey(resumeId);
    }

    @Override
    public int insert(Resume record) {
        return resumeMapper.insert(record);
    }

    @Override
    public int insertSelective(Resume record) {
        return resumeMapper.insertSelective(record);
    }

    @Override
    public Resume selectByPrimaryKey(Integer resumeId) {
        return resumeMapper.selectByPrimaryKey(resumeId);
    }

    @Override
    public int updateByPrimaryKeySelective(Resume record) {
        return resumeMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Resume record) {
        return resumeMapper.updateByPrimaryKey(record);
    }

}

