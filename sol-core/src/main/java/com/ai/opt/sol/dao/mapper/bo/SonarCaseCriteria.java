package com.ai.opt.sol.dao.mapper.bo;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class SonarCaseCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public SonarCaseCriteria() {
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

        public Criteria andCaseIdIsNull() {
            addCriterion("case_id is null");
            return (Criteria) this;
        }

        public Criteria andCaseIdIsNotNull() {
            addCriterion("case_id is not null");
            return (Criteria) this;
        }

        public Criteria andCaseIdEqualTo(String value) {
            addCriterion("case_id =", value, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdNotEqualTo(String value) {
            addCriterion("case_id <>", value, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdGreaterThan(String value) {
            addCriterion("case_id >", value, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdGreaterThanOrEqualTo(String value) {
            addCriterion("case_id >=", value, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdLessThan(String value) {
            addCriterion("case_id <", value, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdLessThanOrEqualTo(String value) {
            addCriterion("case_id <=", value, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdLike(String value) {
            addCriterion("case_id like", value, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdNotLike(String value) {
            addCriterion("case_id not like", value, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdIn(List<String> values) {
            addCriterion("case_id in", values, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdNotIn(List<String> values) {
            addCriterion("case_id not in", values, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdBetween(String value1, String value2) {
            addCriterion("case_id between", value1, value2, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdNotBetween(String value1, String value2) {
            addCriterion("case_id not between", value1, value2, "caseId");
            return (Criteria) this;
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

        public Criteria andViolationCodeIsNull() {
            addCriterion("violation_code is null");
            return (Criteria) this;
        }

        public Criteria andViolationCodeIsNotNull() {
            addCriterion("violation_code is not null");
            return (Criteria) this;
        }

        public Criteria andViolationCodeEqualTo(String value) {
            addCriterion("violation_code =", value, "violationCode");
            return (Criteria) this;
        }

        public Criteria andViolationCodeNotEqualTo(String value) {
            addCriterion("violation_code <>", value, "violationCode");
            return (Criteria) this;
        }

        public Criteria andViolationCodeGreaterThan(String value) {
            addCriterion("violation_code >", value, "violationCode");
            return (Criteria) this;
        }

        public Criteria andViolationCodeGreaterThanOrEqualTo(String value) {
            addCriterion("violation_code >=", value, "violationCode");
            return (Criteria) this;
        }

        public Criteria andViolationCodeLessThan(String value) {
            addCriterion("violation_code <", value, "violationCode");
            return (Criteria) this;
        }

        public Criteria andViolationCodeLessThanOrEqualTo(String value) {
            addCriterion("violation_code <=", value, "violationCode");
            return (Criteria) this;
        }

        public Criteria andViolationCodeLike(String value) {
            addCriterion("violation_code like", value, "violationCode");
            return (Criteria) this;
        }

        public Criteria andViolationCodeNotLike(String value) {
            addCriterion("violation_code not like", value, "violationCode");
            return (Criteria) this;
        }

        public Criteria andViolationCodeIn(List<String> values) {
            addCriterion("violation_code in", values, "violationCode");
            return (Criteria) this;
        }

        public Criteria andViolationCodeNotIn(List<String> values) {
            addCriterion("violation_code not in", values, "violationCode");
            return (Criteria) this;
        }

        public Criteria andViolationCodeBetween(String value1, String value2) {
            addCriterion("violation_code between", value1, value2, "violationCode");
            return (Criteria) this;
        }

        public Criteria andViolationCodeNotBetween(String value1, String value2) {
            addCriterion("violation_code not between", value1, value2, "violationCode");
            return (Criteria) this;
        }

        public Criteria andCorrectCodeIsNull() {
            addCriterion("correct_code is null");
            return (Criteria) this;
        }

        public Criteria andCorrectCodeIsNotNull() {
            addCriterion("correct_code is not null");
            return (Criteria) this;
        }

        public Criteria andCorrectCodeEqualTo(String value) {
            addCriterion("correct_code =", value, "correctCode");
            return (Criteria) this;
        }

        public Criteria andCorrectCodeNotEqualTo(String value) {
            addCriterion("correct_code <>", value, "correctCode");
            return (Criteria) this;
        }

        public Criteria andCorrectCodeGreaterThan(String value) {
            addCriterion("correct_code >", value, "correctCode");
            return (Criteria) this;
        }

        public Criteria andCorrectCodeGreaterThanOrEqualTo(String value) {
            addCriterion("correct_code >=", value, "correctCode");
            return (Criteria) this;
        }

        public Criteria andCorrectCodeLessThan(String value) {
            addCriterion("correct_code <", value, "correctCode");
            return (Criteria) this;
        }

        public Criteria andCorrectCodeLessThanOrEqualTo(String value) {
            addCriterion("correct_code <=", value, "correctCode");
            return (Criteria) this;
        }

        public Criteria andCorrectCodeLike(String value) {
            addCriterion("correct_code like", value, "correctCode");
            return (Criteria) this;
        }

        public Criteria andCorrectCodeNotLike(String value) {
            addCriterion("correct_code not like", value, "correctCode");
            return (Criteria) this;
        }

        public Criteria andCorrectCodeIn(List<String> values) {
            addCriterion("correct_code in", values, "correctCode");
            return (Criteria) this;
        }

        public Criteria andCorrectCodeNotIn(List<String> values) {
            addCriterion("correct_code not in", values, "correctCode");
            return (Criteria) this;
        }

        public Criteria andCorrectCodeBetween(String value1, String value2) {
            addCriterion("correct_code between", value1, value2, "correctCode");
            return (Criteria) this;
        }

        public Criteria andCorrectCodeNotBetween(String value1, String value2) {
            addCriterion("correct_code not between", value1, value2, "correctCode");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andContributorIsNull() {
            addCriterion("contributor is null");
            return (Criteria) this;
        }

        public Criteria andContributorIsNotNull() {
            addCriterion("contributor is not null");
            return (Criteria) this;
        }

        public Criteria andContributorEqualTo(String value) {
            addCriterion("contributor =", value, "contributor");
            return (Criteria) this;
        }

        public Criteria andContributorNotEqualTo(String value) {
            addCriterion("contributor <>", value, "contributor");
            return (Criteria) this;
        }

        public Criteria andContributorGreaterThan(String value) {
            addCriterion("contributor >", value, "contributor");
            return (Criteria) this;
        }

        public Criteria andContributorGreaterThanOrEqualTo(String value) {
            addCriterion("contributor >=", value, "contributor");
            return (Criteria) this;
        }

        public Criteria andContributorLessThan(String value) {
            addCriterion("contributor <", value, "contributor");
            return (Criteria) this;
        }

        public Criteria andContributorLessThanOrEqualTo(String value) {
            addCriterion("contributor <=", value, "contributor");
            return (Criteria) this;
        }

        public Criteria andContributorLike(String value) {
            addCriterion("contributor like", value, "contributor");
            return (Criteria) this;
        }

        public Criteria andContributorNotLike(String value) {
            addCriterion("contributor not like", value, "contributor");
            return (Criteria) this;
        }

        public Criteria andContributorIn(List<String> values) {
            addCriterion("contributor in", values, "contributor");
            return (Criteria) this;
        }

        public Criteria andContributorNotIn(List<String> values) {
            addCriterion("contributor not in", values, "contributor");
            return (Criteria) this;
        }

        public Criteria andContributorBetween(String value1, String value2) {
            addCriterion("contributor between", value1, value2, "contributor");
            return (Criteria) this;
        }

        public Criteria andContributorNotBetween(String value1, String value2) {
            addCriterion("contributor not between", value1, value2, "contributor");
            return (Criteria) this;
        }

        public Criteria andInsertTimeIsNull() {
            addCriterion("insert_time is null");
            return (Criteria) this;
        }

        public Criteria andInsertTimeIsNotNull() {
            addCriterion("insert_time is not null");
            return (Criteria) this;
        }

        public Criteria andInsertTimeEqualTo(Timestamp value) {
            addCriterion("insert_time =", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeNotEqualTo(Timestamp value) {
            addCriterion("insert_time <>", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeGreaterThan(Timestamp value) {
            addCriterion("insert_time >", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("insert_time >=", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeLessThan(Timestamp value) {
            addCriterion("insert_time <", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeLessThanOrEqualTo(Timestamp value) {
            addCriterion("insert_time <=", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeIn(List<Timestamp> values) {
            addCriterion("insert_time in", values, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeNotIn(List<Timestamp> values) {
            addCriterion("insert_time not in", values, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeBetween(Timestamp value1, Timestamp value2) {
            addCriterion("insert_time between", value1, value2, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("insert_time not between", value1, value2, "insertTime");
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