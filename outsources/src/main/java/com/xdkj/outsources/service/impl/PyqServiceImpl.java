package com.xdkj.outsources.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.xdkj.outsources.entity.Pyq;
import com.xdkj.outsources.dao.PyqMapper;
import com.xdkj.outsources.service.PyqService;
/**
@author wc
@create 2020-01-07-9:52
*/
@Service
public class PyqServiceImpl implements PyqService{

    @Resource
    private PyqMapper pyqMapper;

    @Override
    public int deleteByPrimaryKey(Integer pyqId) {
        return pyqMapper.deleteByPrimaryKey(pyqId);
    }

    @Override
    public int insert(Pyq record) {
        return pyqMapper.insert(record);
    }

    @Override
    public int insertSelective(Pyq record) {
        return pyqMapper.insertSelective(record);
    }

    @Override
    public Pyq selectByPrimaryKey(Integer pyqId) {
        return pyqMapper.selectByPrimaryKey(pyqId);
    }

    @Override
    public int updateByPrimaryKeySelective(Pyq record) {
        return pyqMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Pyq record) {
        return pyqMapper.updateByPrimaryKey(record);
    }

}
