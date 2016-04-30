package com.ai.opt.sol.dao.mapper.interfaces;

import com.ai.opt.sol.dao.mapper.bo.ApiDesignDocLog;
import com.ai.opt.sol.dao.mapper.bo.ApiDesignDocLogCriteria;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface ApiDesignDocLogMapper {
    int countByExample(ApiDesignDocLogCriteria example);

    int deleteByExample(ApiDesignDocLogCriteria example);

    int deleteByPrimaryKey(Long logId);

    int insert(ApiDesignDocLog record);

    int insertSelective(ApiDesignDocLog record);

    List<ApiDesignDocLog> selectByExample(ApiDesignDocLogCriteria example);

    ApiDesignDocLog selectByPrimaryKey(Long logId);

    int updateByExampleSelective(@Param("record") ApiDesignDocLog record, @Param("example") ApiDesignDocLogCriteria example);

    int updateByExample(@Param("record") ApiDesignDocLog record, @Param("example") ApiDesignDocLogCriteria example);

    int updateByPrimaryKeySelective(ApiDesignDocLog record);

    int updateByPrimaryKey(ApiDesignDocLog record);
}