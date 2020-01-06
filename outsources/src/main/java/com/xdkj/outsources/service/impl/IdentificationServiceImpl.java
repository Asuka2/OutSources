package com.xdkj.outsources.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.xdkj.outsources.entity.Identification;
import com.xdkj.outsources.dao.IdentificationMapper;
import com.xdkj.outsources.service.IdentificationService;
/**
 * @Author JCX
 * @create 2020-01-06 14:48
 */
@Service
public class IdentificationServiceImpl implements IdentificationService{

    @Resource
    private IdentificationMapper identificationMapper;

    @Override
    public int deleteByPrimaryKey(Integer identityId) {
        return identificationMapper.deleteByPrimaryKey(identityId);
    }

    @Override
    public int insert(Identification record) {
        return identificationMapper.insert(record);
    }

    @Override
    public int insertSelective(Identification record) {
        return identificationMapper.insertSelective(record);
    }

    @Override
    public Identification selectByPrimaryKey(Integer identityId) {
        return identificationMapper.selectByPrimaryKey(identityId);
    }

    @Override
    public int updateByPrimaryKeySelective(Identification record) {
        return identificationMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Identification record) {
        return identificationMapper.updateByPrimaryKey(record);
    }

}
