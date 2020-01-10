package com.xdkj.outsources.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.xdkj.outsources.dao.HuihuaMapper;
import com.xdkj.outsources.entity.Huihua;
import com.xdkj.outsources.service.HuihuaService;

import java.util.List;

/**
 * @Author JCX
 * @create 2020-01-09 14:58
 */
@Service
public class HuihuaServiceImpl implements HuihuaService{

    @Resource
    private HuihuaMapper huihuaMapper;

    @Override
    public int deleteByPrimaryKey(Integer huihuaId) {
        return huihuaMapper.deleteByPrimaryKey(huihuaId);
    }

    @Override
    public int insert(Huihua record) {
        return huihuaMapper.insert(record);
    }

    @Override
    public int insertSelective(Huihua record) {
        return huihuaMapper.insertSelective(record);
    }

    @Override
    public Huihua selectByPrimaryKey(Integer huihuaId) {
        return huihuaMapper.selectByPrimaryKey(huihuaId);
    }

    @Override
    public int updateByPrimaryKeySelective(Huihua record) {
        return huihuaMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Huihua record) {
        return huihuaMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Huihua> selectAllByHuihuaFasongAndHuihuaJieshou(Integer huihuaFasong, Integer huihuaJieshou) {
        return huihuaMapper.selectAllByHuihuaFasongAndHuihuaJieshou(huihuaFasong,huihuaJieshou);
    }

}
