package com.ai.opt.sol.dao.mapper.interfaces;

import com.ai.opt.sol.dao.mapper.bo.OptUpgradeTask;
import com.ai.opt.sol.dao.mapper.bo.OptUpgradeTaskCriteria;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface OptUpgradeTaskMapper {
    int countByExample(OptUpgradeTaskCriteria example);

    int deleteByExample(OptUpgradeTaskCriteria example);

    int deleteByPrimaryKey(String taskNo);

    int insert(OptUpgradeTask record);

    int insertSelective(OptUpgradeTask record);

    List<OptUpgradeTask> selectByExample(OptUpgradeTaskCriteria example);

    OptUpgradeTask selectByPrimaryKey(String taskNo);

    int updateByExampleSelective(@Param("record") OptUpgradeTask record, @Param("example") OptUpgradeTaskCriteria example);

    int updateByExample(@Param("record") OptUpgradeTask record, @Param("example") OptUpgradeTaskCriteria example);

    int updateByPrimaryKeySelective(OptUpgradeTask record);

    int updateByPrimaryKey(OptUpgradeTask record);
}