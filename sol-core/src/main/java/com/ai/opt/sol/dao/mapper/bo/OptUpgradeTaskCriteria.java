package com.ai.opt.sol.dao.mapper.bo;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class OptUpgradeTaskCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public OptUpgradeTaskCriteria() {
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

        public Criteria andTaskNoIsNull() {
            addCriterion("task_no is null");
            return (Criteria) this;
        }

        public Criteria andTaskNoIsNotNull() {
            addCriterion("task_no is not null");
            return (Criteria) this;
        }

        public Criteria andTaskNoEqualTo(String value) {
            addCriterion("task_no =", value, "taskNo");
            return (Criteria) this;
        }

        public Criteria andTaskNoNotEqualTo(String value) {
            addCriterion("task_no <>", value, "taskNo");
            return (Criteria) this;
        }

        public Criteria andTaskNoGreaterThan(String value) {
            addCriterion("task_no >", value, "taskNo");
            return (Criteria) this;
        }

        public Criteria andTaskNoGreaterThanOrEqualTo(String value) {
            addCriterion("task_no >=", value, "taskNo");
            return (Criteria) this;
        }

        public Criteria andTaskNoLessThan(String value) {
            addCriterion("task_no <", value, "taskNo");
            return (Criteria) this;
        }

        public Criteria andTaskNoLessThanOrEqualTo(String value) {
            addCriterion("task_no <=", value, "taskNo");
            return (Criteria) this;
        }

        public Criteria andTaskNoLike(String value) {
            addCriterion("task_no like", value, "taskNo");
            return (Criteria) this;
        }

        public Criteria andTaskNoNotLike(String value) {
            addCriterion("task_no not like", value, "taskNo");
            return (Criteria) this;
        }

        public Criteria andTaskNoIn(List<String> values) {
            addCriterion("task_no in", values, "taskNo");
            return (Criteria) this;
        }

        public Criteria andTaskNoNotIn(List<String> values) {
            addCriterion("task_no not in", values, "taskNo");
            return (Criteria) this;
        }

        public Criteria andTaskNoBetween(String value1, String value2) {
            addCriterion("task_no between", value1, value2, "taskNo");
            return (Criteria) this;
        }

        public Criteria andTaskNoNotBetween(String value1, String value2) {
            addCriterion("task_no not between", value1, value2, "taskNo");
            return (Criteria) this;
        }

        public Criteria andUpgNoIsNull() {
            addCriterion("upg_no is null");
            return (Criteria) this;
        }

        public Criteria andUpgNoIsNotNull() {
            addCriterion("upg_no is not null");
            return (Criteria) this;
        }

        public Criteria andUpgNoEqualTo(String value) {
            addCriterion("upg_no =", value, "upgNo");
            return (Criteria) this;
        }

        public Criteria andUpgNoNotEqualTo(String value) {
            addCriterion("upg_no <>", value, "upgNo");
            return (Criteria) this;
        }

        public Criteria andUpgNoGreaterThan(String value) {
            addCriterion("upg_no >", value, "upgNo");
            return (Criteria) this;
        }

        public Criteria andUpgNoGreaterThanOrEqualTo(String value) {
            addCriterion("upg_no >=", value, "upgNo");
            return (Criteria) this;
        }

        public Criteria andUpgNoLessThan(String value) {
            addCriterion("upg_no <", value, "upgNo");
            return (Criteria) this;
        }

        public Criteria andUpgNoLessThanOrEqualTo(String value) {
            addCriterion("upg_no <=", value, "upgNo");
            return (Criteria) this;
        }

        public Criteria andUpgNoLike(String value) {
            addCriterion("upg_no like", value, "upgNo");
            return (Criteria) this;
        }

        public Criteria andUpgNoNotLike(String value) {
            addCriterion("upg_no not like", value, "upgNo");
            return (Criteria) this;
        }

        public Criteria andUpgNoIn(List<String> values) {
            addCriterion("upg_no in", values, "upgNo");
            return (Criteria) this;
        }

        public Criteria andUpgNoNotIn(List<String> values) {
            addCriterion("upg_no not in", values, "upgNo");
            return (Criteria) this;
        }

        public Criteria andUpgNoBetween(String value1, String value2) {
            addCriterion("upg_no between", value1, value2, "upgNo");
            return (Criteria) this;
        }

        public Criteria andUpgNoNotBetween(String value1, String value2) {
            addCriterion("upg_no not between", value1, value2, "upgNo");
            return (Criteria) this;
        }

        public Criteria andAppCodeIsNull() {
            addCriterion("app_code is null");
            return (Criteria) this;
        }

        public Criteria andAppCodeIsNotNull() {
            addCriterion("app_code is not null");
            return (Criteria) this;
        }

        public Criteria andAppCodeEqualTo(String value) {
            addCriterion("app_code =", value, "appCode");
            return (Criteria) this;
        }

        public Criteria andAppCodeNotEqualTo(String value) {
            addCriterion("app_code <>", value, "appCode");
            return (Criteria) this;
        }

        public Criteria andAppCodeGreaterThan(String value) {
            addCriterion("app_code >", value, "appCode");
            return (Criteria) this;
        }

        public Criteria andAppCodeGreaterThanOrEqualTo(String value) {
            addCriterion("app_code >=", value, "appCode");
            return (Criteria) this;
        }

        public Criteria andAppCodeLessThan(String value) {
            addCriterion("app_code <", value, "appCode");
            return (Criteria) this;
        }

        public Criteria andAppCodeLessThanOrEqualTo(String value) {
            addCriterion("app_code <=", value, "appCode");
            return (Criteria) this;
        }

        public Criteria andAppCodeLike(String value) {
            addCriterion("app_code like", value, "appCode");
            return (Criteria) this;
        }

        public Criteria andAppCodeNotLike(String value) {
            addCriterion("app_code not like", value, "appCode");
            return (Criteria) this;
        }

        public Criteria andAppCodeIn(List<String> values) {
            addCriterion("app_code in", values, "appCode");
            return (Criteria) this;
        }

        public Criteria andAppCodeNotIn(List<String> values) {
            addCriterion("app_code not in", values, "appCode");
            return (Criteria) this;
        }

        public Criteria andAppCodeBetween(String value1, String value2) {
            addCriterion("app_code between", value1, value2, "appCode");
            return (Criteria) this;
        }

        public Criteria andAppCodeNotBetween(String value1, String value2) {
            addCriterion("app_code not between", value1, value2, "appCode");
            return (Criteria) this;
        }

        public Criteria andSecretKeyIsNull() {
            addCriterion("secret_key is null");
            return (Criteria) this;
        }

        public Criteria andSecretKeyIsNotNull() {
            addCriterion("secret_key is not null");
            return (Criteria) this;
        }

        public Criteria andSecretKeyEqualTo(String value) {
            addCriterion("secret_key =", value, "secretKey");
            return (Criteria) this;
        }

        public Criteria andSecretKeyNotEqualTo(String value) {
            addCriterion("secret_key <>", value, "secretKey");
            return (Criteria) this;
        }

        public Criteria andSecretKeyGreaterThan(String value) {
            addCriterion("secret_key >", value, "secretKey");
            return (Criteria) this;
        }

        public Criteria andSecretKeyGreaterThanOrEqualTo(String value) {
            addCriterion("secret_key >=", value, "secretKey");
            return (Criteria) this;
        }

        public Criteria andSecretKeyLessThan(String value) {
            addCriterion("secret_key <", value, "secretKey");
            return (Criteria) this;
        }

        public Criteria andSecretKeyLessThanOrEqualTo(String value) {
            addCriterion("secret_key <=", value, "secretKey");
            return (Criteria) this;
        }

        public Criteria andSecretKeyLike(String value) {
            addCriterion("secret_key like", value, "secretKey");
            return (Criteria) this;
        }

        public Criteria andSecretKeyNotLike(String value) {
            addCriterion("secret_key not like", value, "secretKey");
            return (Criteria) this;
        }

        public Criteria andSecretKeyIn(List<String> values) {
            addCriterion("secret_key in", values, "secretKey");
            return (Criteria) this;
        }

        public Criteria andSecretKeyNotIn(List<String> values) {
            addCriterion("secret_key not in", values, "secretKey");
            return (Criteria) this;
        }

        public Criteria andSecretKeyBetween(String value1, String value2) {
            addCriterion("secret_key between", value1, value2, "secretKey");
            return (Criteria) this;
        }

        public Criteria andSecretKeyNotBetween(String value1, String value2) {
            addCriterion("secret_key not between", value1, value2, "secretKey");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Timestamp value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Timestamp value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Timestamp value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Timestamp value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Timestamp value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Timestamp> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Timestamp> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Timestamp value1, Timestamp value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andFeedbackStateIsNull() {
            addCriterion("feedback_state is null");
            return (Criteria) this;
        }

        public Criteria andFeedbackStateIsNotNull() {
            addCriterion("feedback_state is not null");
            return (Criteria) this;
        }

        public Criteria andFeedbackStateEqualTo(String value) {
            addCriterion("feedback_state =", value, "feedbackState");
            return (Criteria) this;
        }

        public Criteria andFeedbackStateNotEqualTo(String value) {
            addCriterion("feedback_state <>", value, "feedbackState");
            return (Criteria) this;
        }

        public Criteria andFeedbackStateGreaterThan(String value) {
            addCriterion("feedback_state >", value, "feedbackState");
            return (Criteria) this;
        }

        public Criteria andFeedbackStateGreaterThanOrEqualTo(String value) {
            addCriterion("feedback_state >=", value, "feedbackState");
            return (Criteria) this;
        }

        public Criteria andFeedbackStateLessThan(String value) {
            addCriterion("feedback_state <", value, "feedbackState");
            return (Criteria) this;
        }

        public Criteria andFeedbackStateLessThanOrEqualTo(String value) {
            addCriterion("feedback_state <=", value, "feedbackState");
            return (Criteria) this;
        }

        public Criteria andFeedbackStateLike(String value) {
            addCriterion("feedback_state like", value, "feedbackState");
            return (Criteria) this;
        }

        public Criteria andFeedbackStateNotLike(String value) {
            addCriterion("feedback_state not like", value, "feedbackState");
            return (Criteria) this;
        }

        public Criteria andFeedbackStateIn(List<String> values) {
            addCriterion("feedback_state in", values, "feedbackState");
            return (Criteria) this;
        }

        public Criteria andFeedbackStateNotIn(List<String> values) {
            addCriterion("feedback_state not in", values, "feedbackState");
            return (Criteria) this;
        }

        public Criteria andFeedbackStateBetween(String value1, String value2) {
            addCriterion("feedback_state between", value1, value2, "feedbackState");
            return (Criteria) this;
        }

        public Criteria andFeedbackStateNotBetween(String value1, String value2) {
            addCriterion("feedback_state not between", value1, value2, "feedbackState");
            return (Criteria) this;
        }

        public Criteria andFeedbackTimeIsNull() {
            addCriterion("feedback_time is null");
            return (Criteria) this;
        }

        public Criteria andFeedbackTimeIsNotNull() {
            addCriterion("feedback_time is not null");
            return (Criteria) this;
        }

        public Criteria andFeedbackTimeEqualTo(Timestamp value) {
            addCriterion("feedback_time =", value, "feedbackTime");
            return (Criteria) this;
        }

        public Criteria andFeedbackTimeNotEqualTo(Timestamp value) {
            addCriterion("feedback_time <>", value, "feedbackTime");
            return (Criteria) this;
        }

        public Criteria andFeedbackTimeGreaterThan(Timestamp value) {
            addCriterion("feedback_time >", value, "feedbackTime");
            return (Criteria) this;
        }

        public Criteria andFeedbackTimeGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("feedback_time >=", value, "feedbackTime");
            return (Criteria) this;
        }

        public Criteria andFeedbackTimeLessThan(Timestamp value) {
            addCriterion("feedback_time <", value, "feedbackTime");
            return (Criteria) this;
        }

        public Criteria andFeedbackTimeLessThanOrEqualTo(Timestamp value) {
            addCriterion("feedback_time <=", value, "feedbackTime");
            return (Criteria) this;
        }

        public Criteria andFeedbackTimeIn(List<Timestamp> values) {
            addCriterion("feedback_time in", values, "feedbackTime");
            return (Criteria) this;
        }

        public Criteria andFeedbackTimeNotIn(List<Timestamp> values) {
            addCriterion("feedback_time not in", values, "feedbackTime");
            return (Criteria) this;
        }

        public Criteria andFeedbackTimeBetween(Timestamp value1, Timestamp value2) {
            addCriterion("feedback_time between", value1, value2, "feedbackTime");
            return (Criteria) this;
        }

        public Criteria andFeedbackTimeNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("feedback_time not between", value1, value2, "feedbackTime");
            return (Criteria) this;
        }

        public Criteria andFeedbackDescIsNull() {
            addCriterion("feedback_desc is null");
            return (Criteria) this;
        }

        public Criteria andFeedbackDescIsNotNull() {
            addCriterion("feedback_desc is not null");
            return (Criteria) this;
        }

        public Criteria andFeedbackDescEqualTo(String value) {
            addCriterion("feedback_desc =", value, "feedbackDesc");
            return (Criteria) this;
        }

        public Criteria andFeedbackDescNotEqualTo(String value) {
            addCriterion("feedback_desc <>", value, "feedbackDesc");
            return (Criteria) this;
        }

        public Criteria andFeedbackDescGreaterThan(String value) {
            addCriterion("feedback_desc >", value, "feedbackDesc");
            return (Criteria) this;
        }

        public Criteria andFeedbackDescGreaterThanOrEqualTo(String value) {
            addCriterion("feedback_desc >=", value, "feedbackDesc");
            return (Criteria) this;
        }

        public Criteria andFeedbackDescLessThan(String value) {
            addCriterion("feedback_desc <", value, "feedbackDesc");
            return (Criteria) this;
        }

        public Criteria andFeedbackDescLessThanOrEqualTo(String value) {
            addCriterion("feedback_desc <=", value, "feedbackDesc");
            return (Criteria) this;
        }

        public Criteria andFeedbackDescLike(String value) {
            addCriterion("feedback_desc like", value, "feedbackDesc");
            return (Criteria) this;
        }

        public Criteria andFeedbackDescNotLike(String value) {
            addCriterion("feedback_desc not like", value, "feedbackDesc");
            return (Criteria) this;
        }

        public Criteria andFeedbackDescIn(List<String> values) {
            addCriterion("feedback_desc in", values, "feedbackDesc");
            return (Criteria) this;
        }

        public Criteria andFeedbackDescNotIn(List<String> values) {
            addCriterion("feedback_desc not in", values, "feedbackDesc");
            return (Criteria) this;
        }

        public Criteria andFeedbackDescBetween(String value1, String value2) {
            addCriterion("feedback_desc between", value1, value2, "feedbackDesc");
            return (Criteria) this;
        }

        public Criteria andFeedbackDescNotBetween(String value1, String value2) {
            addCriterion("feedback_desc not between", value1, value2, "feedbackDesc");
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