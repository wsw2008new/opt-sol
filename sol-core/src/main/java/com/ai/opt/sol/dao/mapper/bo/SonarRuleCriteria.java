package com.ai.opt.sol.dao.mapper.bo;

import java.util.ArrayList;
import java.util.List;

public class SonarRuleCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public SonarRuleCriteria() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimitStart(Integer limitStart) {
        this.limitStart=limitStart;
    }

    public Integer getLimitStart() {
        return limitStart;
    }

    public void setLimitEnd(Integer limitEnd) {
        this.limitEnd=limitEnd;
    }

    public Integer getLimitEnd() {
        return limitEnd;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andRuleIdIsNull() {
            addCriterion("rule_id is null");
            return (Criteria) this;
        }

        public Criteria andRuleIdIsNotNull() {
            addCriterion("rule_id is not null");
            return (Criteria) this;
        }

        public Criteria andRuleIdEqualTo(String value) {
            addCriterion("rule_id =", value, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdNotEqualTo(String value) {
            addCriterion("rule_id <>", value, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdGreaterThan(String value) {
            addCriterion("rule_id >", value, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdGreaterThanOrEqualTo(String value) {
            addCriterion("rule_id >=", value, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdLessThan(String value) {
            addCriterion("rule_id <", value, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdLessThanOrEqualTo(String value) {
            addCriterion("rule_id <=", value, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdLike(String value) {
            addCriterion("rule_id like", value, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdNotLike(String value) {
            addCriterion("rule_id not like", value, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdIn(List<String> values) {
            addCriterion("rule_id in", values, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdNotIn(List<String> values) {
            addCriterion("rule_id not in", values, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdBetween(String value1, String value2) {
            addCriterion("rule_id between", value1, value2, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdNotBetween(String value1, String value2) {
            addCriterion("rule_id not between", value1, value2, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleTitleIsNull() {
            addCriterion("rule_title is null");
            return (Criteria) this;
        }

        public Criteria andRuleTitleIsNotNull() {
            addCriterion("rule_title is not null");
            return (Criteria) this;
        }

        public Criteria andRuleTitleEqualTo(String value) {
            addCriterion("rule_title =", value, "ruleTitle");
            return (Criteria) this;
        }

        public Criteria andRuleTitleNotEqualTo(String value) {
            addCriterion("rule_title <>", value, "ruleTitle");
            return (Criteria) this;
        }

        public Criteria andRuleTitleGreaterThan(String value) {
            addCriterion("rule_title >", value, "ruleTitle");
            return (Criteria) this;
        }

        public Criteria andRuleTitleGreaterThanOrEqualTo(String value) {
            addCriterion("rule_title >=", value, "ruleTitle");
            return (Criteria) this;
        }

        public Criteria andRuleTitleLessThan(String value) {
            addCriterion("rule_title <", value, "ruleTitle");
            return (Criteria) this;
        }

        public Criteria andRuleTitleLessThanOrEqualTo(String value) {
            addCriterion("rule_title <=", value, "ruleTitle");
            return (Criteria) this;
        }

        public Criteria andRuleTitleLike(String value) {
            addCriterion("rule_title like", value, "ruleTitle");
            return (Criteria) this;
        }

        public Criteria andRuleTitleNotLike(String value) {
            addCriterion("rule_title not like", value, "ruleTitle");
            return (Criteria) this;
        }

        public Criteria andRuleTitleIn(List<String> values) {
            addCriterion("rule_title in", values, "ruleTitle");
            return (Criteria) this;
        }

        public Criteria andRuleTitleNotIn(List<String> values) {
            addCriterion("rule_title not in", values, "ruleTitle");
            return (Criteria) this;
        }

        public Criteria andRuleTitleBetween(String value1, String value2) {
            addCriterion("rule_title between", value1, value2, "ruleTitle");
            return (Criteria) this;
        }

        public Criteria andRuleTitleNotBetween(String value1, String value2) {
            addCriterion("rule_title not between", value1, value2, "ruleTitle");
            return (Criteria) this;
        }

        public Criteria andRulePriorityIsNull() {
            addCriterion("rule_priority is null");
            return (Criteria) this;
        }

        public Criteria andRulePriorityIsNotNull() {
            addCriterion("rule_priority is not null");
            return (Criteria) this;
        }

        public Criteria andRulePriorityEqualTo(String value) {
            addCriterion("rule_priority =", value, "rulePriority");
            return (Criteria) this;
        }

        public Criteria andRulePriorityNotEqualTo(String value) {
            addCriterion("rule_priority <>", value, "rulePriority");
            return (Criteria) this;
        }

        public Criteria andRulePriorityGreaterThan(String value) {
            addCriterion("rule_priority >", value, "rulePriority");
            return (Criteria) this;
        }

        public Criteria andRulePriorityGreaterThanOrEqualTo(String value) {
            addCriterion("rule_priority >=", value, "rulePriority");
            return (Criteria) this;
        }

        public Criteria andRulePriorityLessThan(String value) {
            addCriterion("rule_priority <", value, "rulePriority");
            return (Criteria) this;
        }

        public Criteria andRulePriorityLessThanOrEqualTo(String value) {
            addCriterion("rule_priority <=", value, "rulePriority");
            return (Criteria) this;
        }

        public Criteria andRulePriorityLike(String value) {
            addCriterion("rule_priority like", value, "rulePriority");
            return (Criteria) this;
        }

        public Criteria andRulePriorityNotLike(String value) {
            addCriterion("rule_priority not like", value, "rulePriority");
            return (Criteria) this;
        }

        public Criteria andRulePriorityIn(List<String> values) {
            addCriterion("rule_priority in", values, "rulePriority");
            return (Criteria) this;
        }

        public Criteria andRulePriorityNotIn(List<String> values) {
            addCriterion("rule_priority not in", values, "rulePriority");
            return (Criteria) this;
        }

        public Criteria andRulePriorityBetween(String value1, String value2) {
            addCriterion("rule_priority between", value1, value2, "rulePriority");
            return (Criteria) this;
        }

        public Criteria andRulePriorityNotBetween(String value1, String value2) {
            addCriterion("rule_priority not between", value1, value2, "rulePriority");
            return (Criteria) this;
        }

        public Criteria andRuleKeyIsNull() {
            addCriterion("rule_key is null");
            return (Criteria) this;
        }

        public Criteria andRuleKeyIsNotNull() {
            addCriterion("rule_key is not null");
            return (Criteria) this;
        }

        public Criteria andRuleKeyEqualTo(String value) {
            addCriterion("rule_key =", value, "ruleKey");
            return (Criteria) this;
        }

        public Criteria andRuleKeyNotEqualTo(String value) {
            addCriterion("rule_key <>", value, "ruleKey");
            return (Criteria) this;
        }

        public Criteria andRuleKeyGreaterThan(String value) {
            addCriterion("rule_key >", value, "ruleKey");
            return (Criteria) this;
        }

        public Criteria andRuleKeyGreaterThanOrEqualTo(String value) {
            addCriterion("rule_key >=", value, "ruleKey");
            return (Criteria) this;
        }

        public Criteria andRuleKeyLessThan(String value) {
            addCriterion("rule_key <", value, "ruleKey");
            return (Criteria) this;
        }

        public Criteria andRuleKeyLessThanOrEqualTo(String value) {
            addCriterion("rule_key <=", value, "ruleKey");
            return (Criteria) this;
        }

        public Criteria andRuleKeyLike(String value) {
            addCriterion("rule_key like", value, "ruleKey");
            return (Criteria) this;
        }

        public Criteria andRuleKeyNotLike(String value) {
            addCriterion("rule_key not like", value, "ruleKey");
            return (Criteria) this;
        }

        public Criteria andRuleKeyIn(List<String> values) {
            addCriterion("rule_key in", values, "ruleKey");
            return (Criteria) this;
        }

        public Criteria andRuleKeyNotIn(List<String> values) {
            addCriterion("rule_key not in", values, "ruleKey");
            return (Criteria) this;
        }

        public Criteria andRuleKeyBetween(String value1, String value2) {
            addCriterion("rule_key between", value1, value2, "ruleKey");
            return (Criteria) this;
        }

        public Criteria andRuleKeyNotBetween(String value1, String value2) {
            addCriterion("rule_key not between", value1, value2, "ruleKey");
            return (Criteria) this;
        }

        public Criteria andRulePluginIsNull() {
            addCriterion("rule_plugin is null");
            return (Criteria) this;
        }

        public Criteria andRulePluginIsNotNull() {
            addCriterion("rule_plugin is not null");
            return (Criteria) this;
        }

        public Criteria andRulePluginEqualTo(String value) {
            addCriterion("rule_plugin =", value, "rulePlugin");
            return (Criteria) this;
        }

        public Criteria andRulePluginNotEqualTo(String value) {
            addCriterion("rule_plugin <>", value, "rulePlugin");
            return (Criteria) this;
        }

        public Criteria andRulePluginGreaterThan(String value) {
            addCriterion("rule_plugin >", value, "rulePlugin");
            return (Criteria) this;
        }

        public Criteria andRulePluginGreaterThanOrEqualTo(String value) {
            addCriterion("rule_plugin >=", value, "rulePlugin");
            return (Criteria) this;
        }

        public Criteria andRulePluginLessThan(String value) {
            addCriterion("rule_plugin <", value, "rulePlugin");
            return (Criteria) this;
        }

        public Criteria andRulePluginLessThanOrEqualTo(String value) {
            addCriterion("rule_plugin <=", value, "rulePlugin");
            return (Criteria) this;
        }

        public Criteria andRulePluginLike(String value) {
            addCriterion("rule_plugin like", value, "rulePlugin");
            return (Criteria) this;
        }

        public Criteria andRulePluginNotLike(String value) {
            addCriterion("rule_plugin not like", value, "rulePlugin");
            return (Criteria) this;
        }

        public Criteria andRulePluginIn(List<String> values) {
            addCriterion("rule_plugin in", values, "rulePlugin");
            return (Criteria) this;
        }

        public Criteria andRulePluginNotIn(List<String> values) {
            addCriterion("rule_plugin not in", values, "rulePlugin");
            return (Criteria) this;
        }

        public Criteria andRulePluginBetween(String value1, String value2) {
            addCriterion("rule_plugin between", value1, value2, "rulePlugin");
            return (Criteria) this;
        }

        public Criteria andRulePluginNotBetween(String value1, String value2) {
            addCriterion("rule_plugin not between", value1, value2, "rulePlugin");
            return (Criteria) this;
        }

        public Criteria andRuleExplainIsNull() {
            addCriterion("rule_explain is null");
            return (Criteria) this;
        }

        public Criteria andRuleExplainIsNotNull() {
            addCriterion("rule_explain is not null");
            return (Criteria) this;
        }

        public Criteria andRuleExplainEqualTo(String value) {
            addCriterion("rule_explain =", value, "ruleExplain");
            return (Criteria) this;
        }

        public Criteria andRuleExplainNotEqualTo(String value) {
            addCriterion("rule_explain <>", value, "ruleExplain");
            return (Criteria) this;
        }

        public Criteria andRuleExplainGreaterThan(String value) {
            addCriterion("rule_explain >", value, "ruleExplain");
            return (Criteria) this;
        }

        public Criteria andRuleExplainGreaterThanOrEqualTo(String value) {
            addCriterion("rule_explain >=", value, "ruleExplain");
            return (Criteria) this;
        }

        public Criteria andRuleExplainLessThan(String value) {
            addCriterion("rule_explain <", value, "ruleExplain");
            return (Criteria) this;
        }

        public Criteria andRuleExplainLessThanOrEqualTo(String value) {
            addCriterion("rule_explain <=", value, "ruleExplain");
            return (Criteria) this;
        }

        public Criteria andRuleExplainLike(String value) {
            addCriterion("rule_explain like", value, "ruleExplain");
            return (Criteria) this;
        }

        public Criteria andRuleExplainNotLike(String value) {
            addCriterion("rule_explain not like", value, "ruleExplain");
            return (Criteria) this;
        }

        public Criteria andRuleExplainIn(List<String> values) {
            addCriterion("rule_explain in", values, "ruleExplain");
            return (Criteria) this;
        }

        public Criteria andRuleExplainNotIn(List<String> values) {
            addCriterion("rule_explain not in", values, "ruleExplain");
            return (Criteria) this;
        }

        public Criteria andRuleExplainBetween(String value1, String value2) {
            addCriterion("rule_explain between", value1, value2, "ruleExplain");
            return (Criteria) this;
        }

        public Criteria andRuleExplainNotBetween(String value1, String value2) {
            addCriterion("rule_explain not between", value1, value2, "ruleExplain");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}