package com.ai.opt.sol.dao.mapper.bo;

import java.sql.Timestamp;

public class ApiDesignDoc {
    private Long apiDesignId;

    private String apiCode;

    private String apiName;

    private String centerName;

    private String rawFileUrl;

    private String swfFileUrl;

    private Timestamp createTime;

    private Timestamp updateTime;

    public Long getApiDesignId() {
        return apiDesignId;
    }

    public void setApiDesignId(Long apiDesignId) {
        this.apiDesignId = apiDesignId;
    }

    public String getApiCode() {
        return apiCode;
    }

    public void setApiCode(String apiCode) {
        this.apiCode = apiCode == null ? null : apiCode.trim();
    }

    public String getApiName() {
        return apiName;
    }

    public void setApiName(String apiName) {
        this.apiName = apiName == null ? null : apiName.trim();
    }

    public String getCenterName() {
        return centerName;
    }

    public void setCenterName(String centerName) {
        this.centerName = centerName == null ? null : centerName.trim();
    }

    public String getRawFileUrl() {
        return rawFileUrl;
    }

    public void setRawFileUrl(String rawFileUrl) {
        this.rawFileUrl = rawFileUrl == null ? null : rawFileUrl.trim();
    }

    public String getSwfFileUrl() {
        return swfFileUrl;
    }

    public void setSwfFileUrl(String swfFileUrl) {
        this.swfFileUrl = swfFileUrl == null ? null : swfFileUrl.trim();
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }
}