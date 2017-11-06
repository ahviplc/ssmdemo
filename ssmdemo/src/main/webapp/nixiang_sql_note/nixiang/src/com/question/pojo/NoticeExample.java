package com.question.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NoticeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NoticeExample() {
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

        public Criteria andNtcidIsNull() {
            addCriterion("ntcid is null");
            return (Criteria) this;
        }

        public Criteria andNtcidIsNotNull() {
            addCriterion("ntcid is not null");
            return (Criteria) this;
        }

        public Criteria andNtcidEqualTo(Long value) {
            addCriterion("ntcid =", value, "ntcid");
            return (Criteria) this;
        }

        public Criteria andNtcidNotEqualTo(Long value) {
            addCriterion("ntcid <>", value, "ntcid");
            return (Criteria) this;
        }

        public Criteria andNtcidGreaterThan(Long value) {
            addCriterion("ntcid >", value, "ntcid");
            return (Criteria) this;
        }

        public Criteria andNtcidGreaterThanOrEqualTo(Long value) {
            addCriterion("ntcid >=", value, "ntcid");
            return (Criteria) this;
        }

        public Criteria andNtcidLessThan(Long value) {
            addCriterion("ntcid <", value, "ntcid");
            return (Criteria) this;
        }

        public Criteria andNtcidLessThanOrEqualTo(Long value) {
            addCriterion("ntcid <=", value, "ntcid");
            return (Criteria) this;
        }

        public Criteria andNtcidIn(List<Long> values) {
            addCriterion("ntcid in", values, "ntcid");
            return (Criteria) this;
        }

        public Criteria andNtcidNotIn(List<Long> values) {
            addCriterion("ntcid not in", values, "ntcid");
            return (Criteria) this;
        }

        public Criteria andNtcidBetween(Long value1, Long value2) {
            addCriterion("ntcid between", value1, value2, "ntcid");
            return (Criteria) this;
        }

        public Criteria andNtcidNotBetween(Long value1, Long value2) {
            addCriterion("ntcid not between", value1, value2, "ntcid");
            return (Criteria) this;
        }

        public Criteria andNtctopicIsNull() {
            addCriterion("ntctopic is null");
            return (Criteria) this;
        }

        public Criteria andNtctopicIsNotNull() {
            addCriterion("ntctopic is not null");
            return (Criteria) this;
        }

        public Criteria andNtctopicEqualTo(String value) {
            addCriterion("ntctopic =", value, "ntctopic");
            return (Criteria) this;
        }

        public Criteria andNtctopicNotEqualTo(String value) {
            addCriterion("ntctopic <>", value, "ntctopic");
            return (Criteria) this;
        }

        public Criteria andNtctopicGreaterThan(String value) {
            addCriterion("ntctopic >", value, "ntctopic");
            return (Criteria) this;
        }

        public Criteria andNtctopicGreaterThanOrEqualTo(String value) {
            addCriterion("ntctopic >=", value, "ntctopic");
            return (Criteria) this;
        }

        public Criteria andNtctopicLessThan(String value) {
            addCriterion("ntctopic <", value, "ntctopic");
            return (Criteria) this;
        }

        public Criteria andNtctopicLessThanOrEqualTo(String value) {
            addCriterion("ntctopic <=", value, "ntctopic");
            return (Criteria) this;
        }

        public Criteria andNtctopicLike(String value) {
            addCriterion("ntctopic like", value, "ntctopic");
            return (Criteria) this;
        }

        public Criteria andNtctopicNotLike(String value) {
            addCriterion("ntctopic not like", value, "ntctopic");
            return (Criteria) this;
        }

        public Criteria andNtctopicIn(List<String> values) {
            addCriterion("ntctopic in", values, "ntctopic");
            return (Criteria) this;
        }

        public Criteria andNtctopicNotIn(List<String> values) {
            addCriterion("ntctopic not in", values, "ntctopic");
            return (Criteria) this;
        }

        public Criteria andNtctopicBetween(String value1, String value2) {
            addCriterion("ntctopic between", value1, value2, "ntctopic");
            return (Criteria) this;
        }

        public Criteria andNtctopicNotBetween(String value1, String value2) {
            addCriterion("ntctopic not between", value1, value2, "ntctopic");
            return (Criteria) this;
        }

        public Criteria andNtccontentIsNull() {
            addCriterion("ntccontent is null");
            return (Criteria) this;
        }

        public Criteria andNtccontentIsNotNull() {
            addCriterion("ntccontent is not null");
            return (Criteria) this;
        }

        public Criteria andNtccontentEqualTo(String value) {
            addCriterion("ntccontent =", value, "ntccontent");
            return (Criteria) this;
        }

        public Criteria andNtccontentNotEqualTo(String value) {
            addCriterion("ntccontent <>", value, "ntccontent");
            return (Criteria) this;
        }

        public Criteria andNtccontentGreaterThan(String value) {
            addCriterion("ntccontent >", value, "ntccontent");
            return (Criteria) this;
        }

        public Criteria andNtccontentGreaterThanOrEqualTo(String value) {
            addCriterion("ntccontent >=", value, "ntccontent");
            return (Criteria) this;
        }

        public Criteria andNtccontentLessThan(String value) {
            addCriterion("ntccontent <", value, "ntccontent");
            return (Criteria) this;
        }

        public Criteria andNtccontentLessThanOrEqualTo(String value) {
            addCriterion("ntccontent <=", value, "ntccontent");
            return (Criteria) this;
        }

        public Criteria andNtccontentLike(String value) {
            addCriterion("ntccontent like", value, "ntccontent");
            return (Criteria) this;
        }

        public Criteria andNtccontentNotLike(String value) {
            addCriterion("ntccontent not like", value, "ntccontent");
            return (Criteria) this;
        }

        public Criteria andNtccontentIn(List<String> values) {
            addCriterion("ntccontent in", values, "ntccontent");
            return (Criteria) this;
        }

        public Criteria andNtccontentNotIn(List<String> values) {
            addCriterion("ntccontent not in", values, "ntccontent");
            return (Criteria) this;
        }

        public Criteria andNtccontentBetween(String value1, String value2) {
            addCriterion("ntccontent between", value1, value2, "ntccontent");
            return (Criteria) this;
        }

        public Criteria andNtccontentNotBetween(String value1, String value2) {
            addCriterion("ntccontent not between", value1, value2, "ntccontent");
            return (Criteria) this;
        }

        public Criteria andNtctimeIsNull() {
            addCriterion("ntctime is null");
            return (Criteria) this;
        }

        public Criteria andNtctimeIsNotNull() {
            addCriterion("ntctime is not null");
            return (Criteria) this;
        }

        public Criteria andNtctimeEqualTo(Date value) {
            addCriterion("ntctime =", value, "ntctime");
            return (Criteria) this;
        }

        public Criteria andNtctimeNotEqualTo(Date value) {
            addCriterion("ntctime <>", value, "ntctime");
            return (Criteria) this;
        }

        public Criteria andNtctimeGreaterThan(Date value) {
            addCriterion("ntctime >", value, "ntctime");
            return (Criteria) this;
        }

        public Criteria andNtctimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ntctime >=", value, "ntctime");
            return (Criteria) this;
        }

        public Criteria andNtctimeLessThan(Date value) {
            addCriterion("ntctime <", value, "ntctime");
            return (Criteria) this;
        }

        public Criteria andNtctimeLessThanOrEqualTo(Date value) {
            addCriterion("ntctime <=", value, "ntctime");
            return (Criteria) this;
        }

        public Criteria andNtctimeIn(List<Date> values) {
            addCriterion("ntctime in", values, "ntctime");
            return (Criteria) this;
        }

        public Criteria andNtctimeNotIn(List<Date> values) {
            addCriterion("ntctime not in", values, "ntctime");
            return (Criteria) this;
        }

        public Criteria andNtctimeBetween(Date value1, Date value2) {
            addCriterion("ntctime between", value1, value2, "ntctime");
            return (Criteria) this;
        }

        public Criteria andNtctimeNotBetween(Date value1, Date value2) {
            addCriterion("ntctime not between", value1, value2, "ntctime");
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