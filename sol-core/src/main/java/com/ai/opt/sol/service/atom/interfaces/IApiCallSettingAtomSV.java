package com.ai.opt.sol.service.atom.interfaces;

import java.util.List;

import com.ai.opt.sol.dao.mapper.bo.ApiCallSetting;

public interface IApiCallSettingAtomSV {

    void add(ApiCallSetting record);

    void update(ApiCallSetting record);

    ApiCallSetting getApiCallSetting(String settingId);

    ApiCallSetting getApiCallSetting(String appName,String interfaceName, String method);
    
    int getApiCallSettingCount(String appName);
    
    List<ApiCallSetting> getApiCallSettings(String appName);
    
}
