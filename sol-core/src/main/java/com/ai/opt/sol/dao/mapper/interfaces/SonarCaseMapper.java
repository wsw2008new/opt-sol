package com.ai.opt.sol.dao.mapper.interfaces;

import com.ai.opt.sol.dao.mapper.bo.SonarCase;
import com.ai.opt.sol.dao.mapper.bo.SonarCaseCriteria;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface SonarCaseMapper {
    int countByExample(SonarCaseCriteria example);

    int deleteByExample(SonarCaseCriteria example);

    int deleteByPrimaryKey(String caseId);

    int insert(SonarCase record);

    int insertSelective(SonarCase record);

    List<SonarCase> selectByExample(SonarCaseCriteria example);

    SonarCase selectByPrimaryKey(String caseId);

    int updateByExampleSelective(@Param("record") SonarCase record, @Param("example") SonarCaseCriteria example);

    int updateByExample(@Param("record") SonarCase record, @Param("example") SonarCaseCriteria example);

    int updateByPrimaryKeySelective(SonarCase record);

    int updateByPrimaryKey(SonarCase record);
}