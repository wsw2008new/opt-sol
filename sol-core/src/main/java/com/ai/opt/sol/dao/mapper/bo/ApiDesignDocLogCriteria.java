package com.ai.opt.sol.dao.mapper.bo;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class ApiDesignDocLogCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public ApiDesignDocLogCriteria() {
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

        public Criteria andLogIdIsNull() {
            addCriterion("LOG_ID is null");
            return (Criteria) this;
        }

        public Criteria andLogIdIsNotNull() {
            addCriterion("LOG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLogIdEqualTo(Long value) {
            addCriterion("LOG_ID =", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdNotEqualTo(Long value) {
            addCriterion("LOG_ID <>", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdGreaterThan(Long value) {
            addCriterion("LOG_ID >", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdGreaterThanOrEqualTo(Long value) {
            addCriterion("LOG_ID >=", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdLessThan(Long value) {
            addCriterion("LOG_ID <", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdLessThanOrEqualTo(Long value) {
            addCriterion("LOG_ID <=", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdIn(List<Long> values) {
            addCriterion("LOG_ID in", values, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdNotIn(List<Long> values) {
            addCriterion("LOG_ID not in", values, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdBetween(Long value1, Long value2) {
            addCriterion("LOG_ID between", value1, value2, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdNotBetween(Long value1, Long value2) {
            addCriterion("LOG_ID not between", value1, value2, "logId");
            return (Criteria) this;
        }

        public Criteria andLogTypeIsNull() {
            addCriterion("LOG_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andLogTypeIsNotNull() {
            addCriterion("LOG_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andLogTypeEqualTo(String value) {
            addCriterion("LOG_TYPE =", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeNotEqualTo(String value) {
            addCriterion("LOG_TYPE <>", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeGreaterThan(String value) {
            addCriterion("LOG_TYPE >", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeGreaterThanOrEqualTo(String value) {
            addCriterion("LOG_TYPE >=", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeLessThan(String value) {
            addCriterion("LOG_TYPE <", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeLessThanOrEqualTo(String value) {
            addCriterion("LOG_TYPE <=", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeLike(String value) {
            addCriterion("LOG_TYPE like", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeNotLike(String value) {
            addCriterion("LOG_TYPE not like", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeIn(List<String> values) {
            addCriterion("LOG_TYPE in", values, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeNotIn(List<String> values) {
            addCriterion("LOG_TYPE not in", values, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeBetween(String value1, String value2) {
            addCriterion("LOG_TYPE between", value1, value2, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeNotBetween(String value1, String value2) {
            addCriterion("LOG_TYPE not between", value1, value2, "logType");
            return (Criteria) this;
        }

        public Criteria andApiDesignIdIsNull() {
            addCriterion("API_DESIGN_ID is null");
            return (Criteria) this;
        }

        public Criteria andApiDesignIdIsNotNull() {
            addCriterion("API_DESIGN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andApiDesignIdEqualTo(Long value) {
            addCriterion("API_DESIGN_ID =", value, "apiDesignId");
            return (Criteria) this;
        }

        public Criteria andApiDesignIdNotEqualTo(Long value) {
            addCriterion("API_DESIGN_ID <>", value, "apiDesignId");
            return (Criteria) this;
        }

        public Criteria andApiDesignIdGreaterThan(Long value) {
            addCriterion("API_DESIGN_ID >", value, "apiDesignId");
            return (Criteria) this;
        }

        public Criteria andApiDesignIdGreaterThanOrEqualTo(Long value) {
            addCriterion("API_DESIGN_ID >=", value, "apiDesignId");
            return (Criteria) this;
        }

        public Criteria andApiDesignIdLessThan(Long value) {
            addCriterion("API_DESIGN_ID <", value, "apiDesignId");
            return (Criteria) this;
        }

        public Criteria andApiDesignIdLessThanOrEqualTo(Long value) {
            addCriterion("API_DESIGN_ID <=", value, "apiDesignId");
            return (Criteria) this;
        }

        public Criteria andApiDesignIdIn(List<Long> values) {
            addCriterion("API_DESIGN_ID in", values, "apiDesignId");
            return (Criteria) this;
        }

        public Criteria andApiDesignIdNotIn(List<Long> values) {
            addCriterion("API_DESIGN_ID not in", values, "apiDesignId");
            return (Criteria) this;
        }

        public Criteria andApiDesignIdBetween(Long value1, Long value2) {
            addCriterion("API_DESIGN_ID between", value1, value2, "apiDesignId");
            return (Criteria) this;
        }

        public Criteria andApiDesignIdNotBetween(Long value1, Long value2) {
            addCriterion("API_DESIGN_ID not between", value1, value2, "apiDesignId");
            return (Criteria) this;
        }

        public Criteria andApiCodeIsNull() {
            addCriterion("API_CODE is null");
            return (Criteria) this;
        }

        public Criteria andApiCodeIsNotNull() {
            addCriterion("API_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andApiCodeEqualTo(String value) {
            addCriterion("API_CODE =", value, "apiCode");
            return (Criteria) this;
        }

        public Criteria andApiCodeNotEqualTo(String value) {
            addCriterion("API_CODE <>", value, "apiCode");
            return (Criteria) this;
        }

        public Criteria andApiCodeGreaterThan(String value) {
            addCriterion("API_CODE >", value, "apiCode");
            return (Criteria) this;
        }

        public Criteria andApiCodeGreaterThanOrEqualTo(String value) {
            addCriterion("API_CODE >=", value, "apiCode");
            return (Criteria) this;
        }

        public Criteria andApiCodeLessThan(String value) {
            addCriterion("API_CODE <", value, "apiCode");
            return (Criteria) this;
        }

        public Criteria andApiCodeLessThanOrEqualTo(String value) {
            addCriterion("API_CODE <=", value, "apiCode");
            return (Criteria) this;
        }

        public Criteria andApiCodeLike(String value) {
            addCriterion("API_CODE like", value, "apiCode");
            return (Criteria) this;
        }

        public Criteria andApiCodeNotLike(String value) {
            addCriterion("API_CODE not like", value, "apiCode");
            return (Criteria) this;
        }

        public Criteria andApiCodeIn(List<String> values) {
            addCriterion("API_CODE in", values, "apiCode");
            return (Criteria) this;
        }

        public Criteria andApiCodeNotIn(List<String> values) {
            addCriterion("API_CODE not in", values, "apiCode");
            return (Criteria) this;
        }

        public Criteria andApiCodeBetween(String value1, String value2) {
            addCriterion("API_CODE between", value1, value2, "apiCode");
            return (Criteria) this;
        }

        public Criteria andApiCodeNotBetween(String value1, String value2) {
            addCriterion("API_CODE not between", value1, value2, "apiCode");
            return (Criteria) this;
        }

        public Criteria andApiNameIsNull() {
            addCriterion("API_NAME is null");
            return (Criteria) this;
        }

        public Criteria andApiNameIsNotNull() {
            addCriterion("API_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andApiNameEqualTo(String value) {
            addCriterion("API_NAME =", value, "apiName");
            return (Criteria) this;
        }

        public Criteria andApiNameNotEqualTo(String value) {
            addCriterion("API_NAME <>", value, "apiName");
            return (Criteria) this;
        }

        public Criteria andApiNameGreaterThan(String value) {
            addCriterion("API_NAME >", value, "apiName");
            return (Criteria) this;
        }

        public Criteria andApiNameGreaterThanOrEqualTo(String value) {
            addCriterion("API_NAME >=", value, "apiName");
            return (Criteria) this;
        }

        public Criteria andApiNameLessThan(String value) {
            addCriterion("API_NAME <", value, "apiName");
            return (Criteria) this;
        }

        public Criteria andApiNameLessThanOrEqualTo(String value) {
            addCriterion("API_NAME <=", value, "apiName");
            return (Criteria) this;
        }

        public Criteria andApiNameLike(String value) {
            addCriterion("API_NAME like", value, "apiName");
            return (Criteria) this;
        }

        public Criteria andApiNameNotLike(String value) {
            addCriterion("API_NAME not like", value, "apiName");
            return (Criteria) this;
        }

        public Criteria andApiNameIn(List<String> values) {
            addCriterion("API_NAME in", values, "apiName");
            return (Criteria) this;
        }

        public Criteria andApiNameNotIn(List<String> values) {
            addCriterion("API_NAME not in", values, "apiName");
            return (Criteria) this;
        }

        public Criteria andApiNameBetween(String value1, String value2) {
            addCriterion("API_NAME between", value1, value2, "apiName");
            return (Criteria) this;
        }

        public Criteria andApiNameNotBetween(String value1, String value2) {
            addCriterion("API_NAME not between", value1, value2, "apiName");
            return (Criteria) this;
        }

        public Criteria andCenterNameIsNull() {
            addCriterion("CENTER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCenterNameIsNotNull() {
            addCriterion("CENTER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCenterNameEqualTo(String value) {
            addCriterion("CENTER_NAME =", value, "centerName");
            return (Criteria) this;
        }

        public Criteria andCenterNameNotEqualTo(String value) {
            addCriterion("CENTER_NAME <>", value, "centerName");
            return (Criteria) this;
        }

        public Criteria andCenterNameGreaterThan(String value) {
            addCriterion("CENTER_NAME >", value, "centerName");
            return (Criteria) this;
        }

        public Criteria andCenterNameGreaterThanOrEqualTo(String value) {
            addCriterion("CENTER_NAME >=", value, "centerName");
            return (Criteria) this;
        }

        public Criteria andCenterNameLessThan(String value) {
            addCriterion("CENTER_NAME <", value, "centerName");
            return (Criteria) this;
        }

        public Criteria andCenterNameLessThanOrEqualTo(String value) {
            addCriterion("CENTER_NAME <=", value, "centerName");
            return (Criteria) this;
        }

        public Criteria andCenterNameLike(String value) {
            addCriterion("CENTER_NAME like", value, "centerName");
            return (Criteria) this;
        }

        public Criteria andCenterNameNotLike(String value) {
            addCriterion("CENTER_NAME not like", value, "centerName");
            return (Criteria) this;
        }

        public Criteria andCenterNameIn(List<String> values) {
            addCriterion("CENTER_NAME in", values, "centerName");
            return (Criteria) this;
        }

        public Criteria andCenterNameNotIn(List<String> values) {
            addCriterion("CENTER_NAME not in", values, "centerName");
            return (Criteria) this;
        }

        public Criteria andCenterNameBetween(String value1, String value2) {
            addCriterion("CENTER_NAME between", value1, value2, "centerName");
            return (Criteria) this;
        }

        public Criteria andCenterNameNotBetween(String value1, String value2) {
            addCriterion("CENTER_NAME not between", value1, value2, "centerName");
            return (Criteria) this;
        }

        public Criteria andRawFileUrlIsNull() {
            addCriterion("RAW_FILE_URL is null");
            return (Criteria) this;
        }

        public Criteria andRawFileUrlIsNotNull() {
            addCriterion("RAW_FILE_URL is not null");
            return (Criteria) this;
        }

        public Criteria andRawFileUrlEqualTo(String value) {
            addCriterion("RAW_FILE_URL =", value, "rawFileUrl");
            return (Criteria) this;
        }

        public Criteria andRawFileUrlNotEqualTo(String value) {
            addCriterion("RAW_FILE_URL <>", value, "rawFileUrl");
            return (Criteria) this;
        }

        public Criteria andRawFileUrlGreaterThan(String value) {
            addCriterion("RAW_FILE_URL >", value, "rawFileUrl");
            return (Criteria) this;
        }

        public Criteria andRawFileUrlGreaterThanOrEqualTo(String value) {
            addCriterion("RAW_FILE_URL >=", value, "rawFileUrl");
            return (Criteria) this;
        }

        public Criteria andRawFileUrlLessThan(String value) {
            addCriterion("RAW_FILE_URL <", value, "rawFileUrl");
            return (Criteria) this;
        }

        public Criteria andRawFileUrlLessThanOrEqualTo(String value) {
            addCriterion("RAW_FILE_URL <=", value, "rawFileUrl");
            return (Criteria) this;
        }

        public Criteria andRawFileUrlLike(String value) {
            addCriterion("RAW_FILE_URL like", value, "rawFileUrl");
            return (Criteria) this;
        }

        public Criteria andRawFileUrlNotLike(String value) {
            addCriterion("RAW_FILE_URL not like", value, "rawFileUrl");
            return (Criteria) this;
        }

        public Criteria andRawFileUrlIn(List<String> values) {
            addCriterion("RAW_FILE_URL in", values, "rawFileUrl");
            return (Criteria) this;
        }

        public Criteria andRawFileUrlNotIn(List<String> values) {
            addCriterion("RAW_FILE_URL not in", values, "rawFileUrl");
            return (Criteria) this;
        }

        public Criteria andRawFileUrlBetween(String value1, String value2) {
            addCriterion("RAW_FILE_URL between", value1, value2, "rawFileUrl");
            return (Criteria) this;
        }

        public Criteria andRawFileUrlNotBetween(String value1, String value2) {
            addCriterion("RAW_FILE_URL not between", value1, value2, "rawFileUrl");
            return (Criteria) this;
        }

        public Criteria andSwfFileUrlIsNull() {
            addCriterion("SWF_FILE_URL is null");
            return (Criteria) this;
        }

        public Criteria andSwfFileUrlIsNotNull() {
            addCriterion("SWF_FILE_URL is not null");
            return (Criteria) this;
        }

        public Criteria andSwfFileUrlEqualTo(String value) {
            addCriterion("SWF_FILE_URL =", value, "swfFileUrl");
            return (Criteria) this;
        }

        public Criteria andSwfFileUrlNotEqualTo(String value) {
            addCriterion("SWF_FILE_URL <>", value, "swfFileUrl");
            return (Criteria) this;
        }

        public Criteria andSwfFileUrlGreaterThan(String value) {
            addCriterion("SWF_FILE_URL >", value, "swfFileUrl");
            return (Criteria) this;
        }

        public Criteria andSwfFileUrlGreaterThanOrEqualTo(String value) {
            addCriterion("SWF_FILE_URL >=", value, "swfFileUrl");
            return (Criteria) this;
        }

        public Criteria andSwfFileUrlLessThan(String value) {
            addCriterion("SWF_FILE_URL <", value, "swfFileUrl");
            return (Criteria) this;
        }

        public Criteria andSwfFileUrlLessThanOrEqualTo(String value) {
            addCriterion("SWF_FILE_URL <=", value, "swfFileUrl");
            return (Criteria) this;
        }

        public Criteria andSwfFileUrlLike(String value) {
            addCriterion("SWF_FILE_URL like", value, "swfFileUrl");
            return (Criteria) this;
        }

        public Criteria andSwfFileUrlNotLike(String value) {
            addCriterion("SWF_FILE_URL not like", value, "swfFileUrl");
            return (Criteria) this;
        }

        public Criteria andSwfFileUrlIn(List<String> values) {
            addCriterion("SWF_FILE_URL in", values, "swfFileUrl");
            return (Criteria) this;
        }

        public Criteria andSwfFileUrlNotIn(List<String> values) {
            addCriterion("SWF_FILE_URL not in", values, "swfFileUrl");
            return (Criteria) this;
        }

        public Criteria andSwfFileUrlBetween(String value1, String value2) {
            addCriterion("SWF_FILE_URL between", value1, value2, "swfFileUrl");
            return (Criteria) this;
        }

        public Criteria andSwfFileUrlNotBetween(String value1, String value2) {
            addCriterion("SWF_FILE_URL not between", value1, value2, "swfFileUrl");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Timestamp value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Timestamp value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Timestamp value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Timestamp value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Timestamp value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Timestamp> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Timestamp> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Timestamp value1, Timestamp value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Timestamp value) {
            addCriterion("UPDATE_TIME =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Timestamp value) {
            addCriterion("UPDATE_TIME <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Timestamp value) {
            addCriterion("UPDATE_TIME >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("UPDATE_TIME >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Timestamp value) {
            addCriterion("UPDATE_TIME <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Timestamp value) {
            addCriterion("UPDATE_TIME <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Timestamp> values) {
            addCriterion("UPDATE_TIME in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Timestamp> values) {
            addCriterion("UPDATE_TIME not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Timestamp value1, Timestamp value2) {
            addCriterion("UPDATE_TIME between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("UPDATE_TIME not between", value1, value2, "updateTime");
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