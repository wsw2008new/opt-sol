package com.ai.opt.sol.dao.mapper.interfaces;

import com.ai.opt.sol.dao.mapper.bo.ApiDesignDoc;
import com.ai.opt.sol.dao.mapper.bo.ApiDesignDocCriteria;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface ApiDesignDocMapper {
    int countByExample(ApiDesignDocCriteria example);

    int deleteByExample(ApiDesignDocCriteria example);

    int deleteByPrimaryKey(Long apiDesignId);

    int insert(ApiDesignDoc record);

    int insertSelective(ApiDesignDoc record);

    List<ApiDesignDoc> selectByExample(ApiDesignDocCriteria example);

    ApiDesignDoc selectByPrimaryKey(Long apiDesignId);

    int updateByExampleSelective(@Param("record") ApiDesignDoc record, @Param("example") ApiDesignDocCriteria example);

    int updateByExample(@Param("record") ApiDesignDoc record, @Param("example") ApiDesignDocCriteria example);

    int updateByPrimaryKeySelective(ApiDesignDoc record);

    int updateByPrimaryKey(ApiDesignDoc record);
}