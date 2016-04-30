package com.ai.opt.sol.dao.mapper.interfaces;

import com.ai.opt.sol.dao.mapper.bo.SonarRule;
import com.ai.opt.sol.dao.mapper.bo.SonarRuleCriteria;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface SonarRuleMapper {
    int countByExample(SonarRuleCriteria example);

    int deleteByExample(SonarRuleCriteria example);

    int deleteByPrimaryKey(String ruleId);

    int insert(SonarRule record);

    int insertSelective(SonarRule record);

    List<SonarRule> selectByExample(SonarRuleCriteria example);

    SonarRule selectByPrimaryKey(String ruleId);

    int updateByExampleSelective(@Param("record") SonarRule record, @Param("example") SonarRuleCriteria example);

    int updateByExample(@Param("record") SonarRule record, @Param("example") SonarRuleCriteria example);

    int updateByPrimaryKeySelective(SonarRule record);

    int updateByPrimaryKey(SonarRule record);
}