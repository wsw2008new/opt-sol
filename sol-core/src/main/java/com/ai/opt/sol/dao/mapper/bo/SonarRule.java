package com.ai.opt.sol.dao.mapper.bo;

public class SonarRule {
    private String ruleId;

    private String ruleTitle;

    private String rulePriority;

    private String ruleKey;

    private String rulePlugin;

    private String ruleExplain;

    public String getRuleId() {
        return ruleId;
    }

    public void setRuleId(String ruleId) {
        this.ruleId = ruleId == null ? null : ruleId.trim();
    }

    public String getRuleTitle() {
        return ruleTitle;
    }

    public void setRuleTitle(String ruleTitle) {
        this.ruleTitle = ruleTitle == null ? null : ruleTitle.trim();
    }

    public String getRulePriority() {
        return rulePriority;
    }

    public void setRulePriority(String rulePriority) {
        this.rulePriority = rulePriority == null ? null : rulePriority.trim();
    }

    public String getRuleKey() {
        return ruleKey;
    }

    public void setRuleKey(String ruleKey) {
        this.ruleKey = ruleKey == null ? null : ruleKey.trim();
    }

    public String getRulePlugin() {
        return rulePlugin;
    }

    public void setRulePlugin(String rulePlugin) {
        this.rulePlugin = rulePlugin == null ? null : rulePlugin.trim();
    }

    public String getRuleExplain() {
        return ruleExplain;
    }

    public void setRuleExplain(String ruleExplain) {
        this.ruleExplain = ruleExplain == null ? null : ruleExplain.trim();
    }
}