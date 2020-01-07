package com.xdkj.outsources.service;

import com.xdkj.outsources.entity.Pyq;
    /**
@author wc
@create 2020-01-07-9:52
*/
public interface PyqService{


    int deleteByPrimaryKey(Integer pyqId);

    int insert(Pyq record);

    int insertSelective(Pyq record);

    Pyq selectByPrimaryKey(Integer pyqId);

    int updateByPrimaryKeySelective(Pyq record);

    int updateByPrimaryKey(Pyq record);

}
