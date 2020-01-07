package com.xdkj.outsources.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.xdkj.outsources.entity.Liuyan;
import com.xdkj.outsources.dao.LiuyanMapper;
import com.xdkj.outsources.service.LiuyanService;
/**
@author wc
@create 2020-01-07-9:52
*/
@Service
public class LiuyanServiceImpl implements LiuyanService{

    @Resource
    private LiuyanMapper liuyanMapper;

    @Override
    public int deleteByPrimaryKey(Integer lyId) {
        return liuyanMapper.deleteByPrimaryKey(lyId);
    }

    @Override
    public int insert(Liuyan record) {
        return liuyanMapper.insert(record);
    }

    @Override
    public int insertSelective(Liuyan record) {
        return liuyanMapper.insertSelective(record);
    }

    @Override
    public Liuyan selectByPrimaryKey(Integer lyId) {
        return liuyanMapper.selectByPrimaryKey(lyId);
    }

    @Override
    public int updateByPrimaryKeySelective(Liuyan record) {
        return liuyanMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Liuyan record) {
        return liuyanMapper.updateByPrimaryKey(record);
    }

}
