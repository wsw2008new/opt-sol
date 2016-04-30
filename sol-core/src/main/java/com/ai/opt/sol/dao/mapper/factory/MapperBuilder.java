package com.ai.opt.sol.dao.mapper.factory;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ai.opt.sol.dao.mapper.interfaces.OptAppMapper;
import com.ai.opt.sol.dao.mapper.interfaces.OptProductMapper;

@Component
public class MapperBuilder {

    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    public OptAppMapper getOptAppMapper() {
        return sqlSessionTemplate.getMapper(OptAppMapper.class);
    }

    public OptProductMapper getOptProductMapper() {
        return sqlSessionTemplate.getMapper(OptProductMapper.class);
    }

}
