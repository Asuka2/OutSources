package com.xdkj.outsources.service;

import com.xdkj.outsources.entity.Huihua;

import java.util.List;

/**
 * @Author JCX
 * @create 2020-01-09 14:58
 */
public interface HuihuaService{


    int deleteByPrimaryKey(Integer huihuaId);

    int insert(Huihua record);

    int insertSelective(Huihua record);

    Huihua selectByPrimaryKey(Integer huihuaId);

    int updateByPrimaryKeySelective(Huihua record);

    int updateByPrimaryKey(Huihua record);

    List<Huihua> selectAllByHuihuaFasongAndHuihuaJieshou(Integer huihuaFasong, Integer huihuaJieshou);

    }
