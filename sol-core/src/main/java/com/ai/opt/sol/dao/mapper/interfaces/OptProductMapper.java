package com.ai.opt.sol.dao.mapper.interfaces;

import com.ai.opt.sol.dao.mapper.bo.OptProduct;
import com.ai.opt.sol.dao.mapper.bo.OptProductCriteria;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface OptProductMapper {
    int countByExample(OptProductCriteria example);

    int deleteByExample(OptProductCriteria example);

    int deleteByPrimaryKey(String productCode);

    int insert(OptProduct record);

    int insertSelective(OptProduct record);

    List<OptProduct> selectByExample(OptProductCriteria example);

    OptProduct selectByPrimaryKey(String productCode);

    int updateByExampleSelective(@Param("record") OptProduct record, @Param("example") OptProductCriteria example);

    int updateByExample(@Param("record") OptProduct record, @Param("example") OptProductCriteria example);

    int updateByPrimaryKeySelective(OptProduct record);

    int updateByPrimaryKey(OptProduct record);
}