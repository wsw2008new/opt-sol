package com.ai.opt.sol.dao.mapper.interfaces;

import com.ai.opt.sol.dao.mapper.bo.OptApp;
import com.ai.opt.sol.dao.mapper.bo.OptAppCriteria;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface OptAppMapper {
    int countByExample(OptAppCriteria example);

    int deleteByExample(OptAppCriteria example);

    int deleteByPrimaryKey(String appCode);

    int insert(OptApp record);

    int insertSelective(OptApp record);

    List<OptApp> selectByExample(OptAppCriteria example);

    OptApp selectByPrimaryKey(String appCode);

    int updateByExampleSelective(@Param("record") OptApp record, @Param("example") OptAppCriteria example);

    int updateByExample(@Param("record") OptApp record, @Param("example") OptAppCriteria example);

    int updateByPrimaryKeySelective(OptApp record);

    int updateByPrimaryKey(OptApp record);
}