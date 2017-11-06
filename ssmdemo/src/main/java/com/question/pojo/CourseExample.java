package com.question.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CourseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CourseExample() {
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

        public Criteria andCrseidIsNull() {
            addCriterion("crseid is null");
            return (Criteria) this;
        }

        public Criteria andCrseidIsNotNull() {
            addCriterion("crseid is not null");
            return (Criteria) this;
        }

        public Criteria andCrseidEqualTo(Long value) {
            addCriterion("crseid =", value, "crseid");
            return (Criteria) this;
        }

        public Criteria andCrseidNotEqualTo(Long value) {
            addCriterion("crseid <>", value, "crseid");
            return (Criteria) this;
        }

        public Criteria andCrseidGreaterThan(Long value) {
            addCriterion("crseid >", value, "crseid");
            return (Criteria) this;
        }

        public Criteria andCrseidGreaterThanOrEqualTo(Long value) {
            addCriterion("crseid >=", value, "crseid");
            return (Criteria) this;
        }

        public Criteria andCrseidLessThan(Long value) {
            addCriterion("crseid <", value, "crseid");
            return (Criteria) this;
        }

        public Criteria andCrseidLessThanOrEqualTo(Long value) {
            addCriterion("crseid <=", value, "crseid");
            return (Criteria) this;
        }

        public Criteria andCrseidIn(List<Long> values) {
            addCriterion("crseid in", values, "crseid");
            return (Criteria) this;
        }

        public Criteria andCrseidNotIn(List<Long> values) {
            addCriterion("crseid not in", values, "crseid");
            return (Criteria) this;
        }

        public Criteria andCrseidBetween(Long value1, Long value2) {
            addCriterion("crseid between", value1, value2, "crseid");
            return (Criteria) this;
        }

        public Criteria andCrseidNotBetween(Long value1, Long value2) {
            addCriterion("crseid not between", value1, value2, "crseid");
            return (Criteria) this;
        }

        public Criteria andTchidIsNull() {
            addCriterion("tchid is null");
            return (Criteria) this;
        }

        public Criteria andTchidIsNotNull() {
            addCriterion("tchid is not null");
            return (Criteria) this;
        }

        public Criteria andTchidEqualTo(Long value) {
            addCriterion("tchid =", value, "tchid");
            return (Criteria) this;
        }

        public Criteria andTchidNotEqualTo(Long value) {
            addCriterion("tchid <>", value, "tchid");
            return (Criteria) this;
        }

        public Criteria andTchidGreaterThan(Long value) {
            addCriterion("tchid >", value, "tchid");
            return (Criteria) this;
        }

        public Criteria andTchidGreaterThanOrEqualTo(Long value) {
            addCriterion("tchid >=", value, "tchid");
            return (Criteria) this;
        }

        public Criteria andTchidLessThan(Long value) {
            addCriterion("tchid <", value, "tchid");
            return (Criteria) this;
        }

        public Criteria andTchidLessThanOrEqualTo(Long value) {
            addCriterion("tchid <=", value, "tchid");
            return (Criteria) this;
        }

        public Criteria andTchidIn(List<Long> values) {
            addCriterion("tchid in", values, "tchid");
            return (Criteria) this;
        }

        public Criteria andTchidNotIn(List<Long> values) {
            addCriterion("tchid not in", values, "tchid");
            return (Criteria) this;
        }

        public Criteria andTchidBetween(Long value1, Long value2) {
            addCriterion("tchid between", value1, value2, "tchid");
            return (Criteria) this;
        }

        public Criteria andTchidNotBetween(Long value1, Long value2) {
            addCriterion("tchid not between", value1, value2, "tchid");
            return (Criteria) this;
        }

        public Criteria andCrsurlIsNull() {
            addCriterion("crsurl is null");
            return (Criteria) this;
        }

        public Criteria andCrsurlIsNotNull() {
            addCriterion("crsurl is not null");
            return (Criteria) this;
        }

        public Criteria andCrsurlEqualTo(String value) {
            addCriterion("crsurl =", value, "crsurl");
            return (Criteria) this;
        }

        public Criteria andCrsurlNotEqualTo(String value) {
            addCriterion("crsurl <>", value, "crsurl");
            return (Criteria) this;
        }

        public Criteria andCrsurlGreaterThan(String value) {
            addCriterion("crsurl >", value, "crsurl");
            return (Criteria) this;
        }

        public Criteria andCrsurlGreaterThanOrEqualTo(String value) {
            addCriterion("crsurl >=", value, "crsurl");
            return (Criteria) this;
        }

        public Criteria andCrsurlLessThan(String value) {
            addCriterion("crsurl <", value, "crsurl");
            return (Criteria) this;
        }

        public Criteria andCrsurlLessThanOrEqualTo(String value) {
            addCriterion("crsurl <=", value, "crsurl");
            return (Criteria) this;
        }

        public Criteria andCrsurlLike(String value) {
            addCriterion("crsurl like", value, "crsurl");
            return (Criteria) this;
        }

        public Criteria andCrsurlNotLike(String value) {
            addCriterion("crsurl not like", value, "crsurl");
            return (Criteria) this;
        }

        public Criteria andCrsurlIn(List<String> values) {
            addCriterion("crsurl in", values, "crsurl");
            return (Criteria) this;
        }

        public Criteria andCrsurlNotIn(List<String> values) {
            addCriterion("crsurl not in", values, "crsurl");
            return (Criteria) this;
        }

        public Criteria andCrsurlBetween(String value1, String value2) {
            addCriterion("crsurl between", value1, value2, "crsurl");
            return (Criteria) this;
        }

        public Criteria andCrsurlNotBetween(String value1, String value2) {
            addCriterion("crsurl not between", value1, value2, "crsurl");
            return (Criteria) this;
        }

        public Criteria andCrstopicIsNull() {
            addCriterion("crstopic is null");
            return (Criteria) this;
        }

        public Criteria andCrstopicIsNotNull() {
            addCriterion("crstopic is not null");
            return (Criteria) this;
        }

        public Criteria andCrstopicEqualTo(String value) {
            addCriterion("crstopic =", value, "crstopic");
            return (Criteria) this;
        }

        public Criteria andCrstopicNotEqualTo(String value) {
            addCriterion("crstopic <>", value, "crstopic");
            return (Criteria) this;
        }

        public Criteria andCrstopicGreaterThan(String value) {
            addCriterion("crstopic >", value, "crstopic");
            return (Criteria) this;
        }

        public Criteria andCrstopicGreaterThanOrEqualTo(String value) {
            addCriterion("crstopic >=", value, "crstopic");
            return (Criteria) this;
        }

        public Criteria andCrstopicLessThan(String value) {
            addCriterion("crstopic <", value, "crstopic");
            return (Criteria) this;
        }

        public Criteria andCrstopicLessThanOrEqualTo(String value) {
            addCriterion("crstopic <=", value, "crstopic");
            return (Criteria) this;
        }

        public Criteria andCrstopicLike(String value) {
            addCriterion("crstopic like", value, "crstopic");
            return (Criteria) this;
        }

        public Criteria andCrstopicNotLike(String value) {
            addCriterion("crstopic not like", value, "crstopic");
            return (Criteria) this;
        }

        public Criteria andCrstopicIn(List<String> values) {
            addCriterion("crstopic in", values, "crstopic");
            return (Criteria) this;
        }

        public Criteria andCrstopicNotIn(List<String> values) {
            addCriterion("crstopic not in", values, "crstopic");
            return (Criteria) this;
        }

        public Criteria andCrstopicBetween(String value1, String value2) {
            addCriterion("crstopic between", value1, value2, "crstopic");
            return (Criteria) this;
        }

        public Criteria andCrstopicNotBetween(String value1, String value2) {
            addCriterion("crstopic not between", value1, value2, "crstopic");
            return (Criteria) this;
        }

        public Criteria andCrsdescribeIsNull() {
            addCriterion("crsdescribe is null");
            return (Criteria) this;
        }

        public Criteria andCrsdescribeIsNotNull() {
            addCriterion("crsdescribe is not null");
            return (Criteria) this;
        }

        public Criteria andCrsdescribeEqualTo(String value) {
            addCriterion("crsdescribe =", value, "crsdescribe");
            return (Criteria) this;
        }

        public Criteria andCrsdescribeNotEqualTo(String value) {
            addCriterion("crsdescribe <>", value, "crsdescribe");
            return (Criteria) this;
        }

        public Criteria andCrsdescribeGreaterThan(String value) {
            addCriterion("crsdescribe >", value, "crsdescribe");
            return (Criteria) this;
        }

        public Criteria andCrsdescribeGreaterThanOrEqualTo(String value) {
            addCriterion("crsdescribe >=", value, "crsdescribe");
            return (Criteria) this;
        }

        public Criteria andCrsdescribeLessThan(String value) {
            addCriterion("crsdescribe <", value, "crsdescribe");
            return (Criteria) this;
        }

        public Criteria andCrsdescribeLessThanOrEqualTo(String value) {
            addCriterion("crsdescribe <=", value, "crsdescribe");
            return (Criteria) this;
        }

        public Criteria andCrsdescribeLike(String value) {
            addCriterion("crsdescribe like", value, "crsdescribe");
            return (Criteria) this;
        }

        public Criteria andCrsdescribeNotLike(String value) {
            addCriterion("crsdescribe not like", value, "crsdescribe");
            return (Criteria) this;
        }

        public Criteria andCrsdescribeIn(List<String> values) {
            addCriterion("crsdescribe in", values, "crsdescribe");
            return (Criteria) this;
        }

        public Criteria andCrsdescribeNotIn(List<String> values) {
            addCriterion("crsdescribe not in", values, "crsdescribe");
            return (Criteria) this;
        }

        public Criteria andCrsdescribeBetween(String value1, String value2) {
            addCriterion("crsdescribe between", value1, value2, "crsdescribe");
            return (Criteria) this;
        }

        public Criteria andCrsdescribeNotBetween(String value1, String value2) {
            addCriterion("crsdescribe not between", value1, value2, "crsdescribe");
            return (Criteria) this;
        }

        public Criteria andCrstimeIsNull() {
            addCriterion("crstime is null");
            return (Criteria) this;
        }

        public Criteria andCrstimeIsNotNull() {
            addCriterion("crstime is not null");
            return (Criteria) this;
        }

        public Criteria andCrstimeEqualTo(Date value) {
            addCriterion("crstime =", value, "crstime");
            return (Criteria) this;
        }

        public Criteria andCrstimeNotEqualTo(Date value) {
            addCriterion("crstime <>", value, "crstime");
            return (Criteria) this;
        }

        public Criteria andCrstimeGreaterThan(Date value) {
            addCriterion("crstime >", value, "crstime");
            return (Criteria) this;
        }

        public Criteria andCrstimeGreaterThanOrEqualTo(Date value) {
            addCriterion("crstime >=", value, "crstime");
            return (Criteria) this;
        }

        public Criteria andCrstimeLessThan(Date value) {
            addCriterion("crstime <", value, "crstime");
            return (Criteria) this;
        }

        public Criteria andCrstimeLessThanOrEqualTo(Date value) {
            addCriterion("crstime <=", value, "crstime");
            return (Criteria) this;
        }

        public Criteria andCrstimeIn(List<Date> values) {
            addCriterion("crstime in", values, "crstime");
            return (Criteria) this;
        }

        public Criteria andCrstimeNotIn(List<Date> values) {
            addCriterion("crstime not in", values, "crstime");
            return (Criteria) this;
        }

        public Criteria andCrstimeBetween(Date value1, Date value2) {
            addCriterion("crstime between", value1, value2, "crstime");
            return (Criteria) this;
        }

        public Criteria andCrstimeNotBetween(Date value1, Date value2) {
            addCriterion("crstime not between", value1, value2, "crstime");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
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