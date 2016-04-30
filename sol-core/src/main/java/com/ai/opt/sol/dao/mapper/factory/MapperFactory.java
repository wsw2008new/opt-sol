package com.ai.opt.sol.dao.mapper.factory;

import javax.annotation.PostConstruct;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ai.opt.sol.dao.mapper.interfaces.ApiCallCaseMapper;
import com.ai.opt.sol.dao.mapper.interfaces.ApiCallCaseReqParamMapper;
import com.ai.opt.sol.dao.mapper.interfaces.ApiCallSettingMapper;
import com.ai.opt.sol.dao.mapper.interfaces.ApiCallSettingReqMapper;
import com.ai.opt.sol.dao.mapper.interfaces.ApiDesignDocMapper;
import com.ai.opt.sol.dao.mapper.interfaces.OptUpgradeTaskMapper;
import com.ai.opt.sol.dao.mapper.interfaces.SonarCaseMapper;
import com.ai.opt.sol.dao.mapper.interfaces.SonarRuleMapper;

@Component
public class MapperFactory {

    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    private static SqlSessionTemplate st;

    @PostConstruct
    public void init() {
        setSqlSessionTemplate(sqlSessionTemplate);
    }

    public static void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        MapperFactory.st = sqlSessionTemplate;
    }

    public static ApiDesignDocMapper getApiDesignDocMapper() {
        return st.getMapper(ApiDesignDocMapper.class);
    }

    public static SonarCaseMapper getSonarCaseMapper() {
        return st.getMapper(SonarCaseMapper.class);
    }

    public static SonarRuleMapper getSonarRuleMapper() {
        return st.getMapper(SonarRuleMapper.class);
    }

    public static ApiCallSettingMapper getApiCallSettingMapper() {
        return st.getMapper(ApiCallSettingMapper.class);
    }

    public static ApiCallSettingReqMapper getApiCallSettingReqMapper() {
        return st.getMapper(ApiCallSettingReqMapper.class);
    }

    public static ApiCallCaseReqParamMapper getApiCallCaseReqParamMapper() {
        return st.getMapper(ApiCallCaseReqParamMapper.class);
    }

    public static ApiCallCaseMapper getApiCallCaseMapper() {
        return st.getMapper(ApiCallCaseMapper.class);
    }

    public static OptUpgradeTaskMapper getOptUpgradeTaskMapper() {
        return st.getMapper(OptUpgradeTaskMapper.class);
    }

}
