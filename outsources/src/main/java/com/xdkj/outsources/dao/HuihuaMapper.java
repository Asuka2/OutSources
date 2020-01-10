package com.xdkj.outsources.dao;

import com.xdkj.outsources.entity.Huihua;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author JCX
 * @create 2020-01-09 14:58
 */
public interface HuihuaMapper {
    int deleteByPrimaryKey(Integer huihuaId);

    int insert(Huihua record);

    int insertSelective(Huihua record);

    Huihua selectByPrimaryKey(Integer huihuaId);

    int updateByPrimaryKeySelective(Huihua record);

    int updateByPrimaryKey(Huihua record);

    List<Huihua> selectAllByHuihuaFasongAndHuihuaJieshou(@Param("huihuaFasong")Integer huihuaFasong, @Param("huihuaJieshou")Integer huihuaJieshou);


}