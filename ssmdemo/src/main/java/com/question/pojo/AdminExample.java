package com.question.pojo;

import java.util.ArrayList;
import java.util.List;

public class AdminExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdminExample() {
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

        public Criteria andAdmidIsNull() {
            addCriterion("admid is null");
            return (Criteria) this;
        }

        public Criteria andAdmidIsNotNull() {
            addCriterion("admid is not null");
            return (Criteria) this;
        }

        public Criteria andAdmidEqualTo(Long value) {
            addCriterion("admid =", value, "admid");
            return (Criteria) this;
        }

        public Criteria andAdmidNotEqualTo(Long value) {
            addCriterion("admid <>", value, "admid");
            return (Criteria) this;
        }

        public Criteria andAdmidGreaterThan(Long value) {
            addCriterion("admid >", value, "admid");
            return (Criteria) this;
        }

        public Criteria andAdmidGreaterThanOrEqualTo(Long value) {
            addCriterion("admid >=", value, "admid");
            return (Criteria) this;
        }

        public Criteria andAdmidLessThan(Long value) {
            addCriterion("admid <", value, "admid");
            return (Criteria) this;
        }

        public Criteria andAdmidLessThanOrEqualTo(Long value) {
            addCriterion("admid <=", value, "admid");
            return (Criteria) this;
        }

        public Criteria andAdmidIn(List<Long> values) {
            addCriterion("admid in", values, "admid");
            return (Criteria) this;
        }

        public Criteria andAdmidNotIn(List<Long> values) {
            addCriterion("admid not in", values, "admid");
            return (Criteria) this;
        }

        public Criteria andAdmidBetween(Long value1, Long value2) {
            addCriterion("admid between", value1, value2, "admid");
            return (Criteria) this;
        }

        public Criteria andAdmidNotBetween(Long value1, Long value2) {
            addCriterion("admid not between", value1, value2, "admid");
            return (Criteria) this;
        }

        public Criteria andAdmnameIsNull() {
            addCriterion("admname is null");
            return (Criteria) this;
        }

        public Criteria andAdmnameIsNotNull() {
            addCriterion("admname is not null");
            return (Criteria) this;
        }

        public Criteria andAdmnameEqualTo(String value) {
            addCriterion("admname =", value, "admname");
            return (Criteria) this;
        }

        public Criteria andAdmnameNotEqualTo(String value) {
            addCriterion("admname <>", value, "admname");
            return (Criteria) this;
        }

        public Criteria andAdmnameGreaterThan(String value) {
            addCriterion("admname >", value, "admname");
            return (Criteria) this;
        }

        public Criteria andAdmnameGreaterThanOrEqualTo(String value) {
            addCriterion("admname >=", value, "admname");
            return (Criteria) this;
        }

        public Criteria andAdmnameLessThan(String value) {
            addCriterion("admname <", value, "admname");
            return (Criteria) this;
        }

        public Criteria andAdmnameLessThanOrEqualTo(String value) {
            addCriterion("admname <=", value, "admname");
            return (Criteria) this;
        }

        public Criteria andAdmnameLike(String value) {
            addCriterion("admname like", value, "admname");
            return (Criteria) this;
        }

        public Criteria andAdmnameNotLike(String value) {
            addCriterion("admname not like", value, "admname");
            return (Criteria) this;
        }

        public Criteria andAdmnameIn(List<String> values) {
            addCriterion("admname in", values, "admname");
            return (Criteria) this;
        }

        public Criteria andAdmnameNotIn(List<String> values) {
            addCriterion("admname not in", values, "admname");
            return (Criteria) this;
        }

        public Criteria andAdmnameBetween(String value1, String value2) {
            addCriterion("admname between", value1, value2, "admname");
            return (Criteria) this;
        }

        public Criteria andAdmnameNotBetween(String value1, String value2) {
            addCriterion("admname not between", value1, value2, "admname");
            return (Criteria) this;
        }

        public Criteria andAdmusernameIsNull() {
            addCriterion("admusername is null");
            return (Criteria) this;
        }

        public Criteria andAdmusernameIsNotNull() {
            addCriterion("admusername is not null");
            return (Criteria) this;
        }

        public Criteria andAdmusernameEqualTo(String value) {
            addCriterion("admusername =", value, "admusername");
            return (Criteria) this;
        }

        public Criteria andAdmusernameNotEqualTo(String value) {
            addCriterion("admusername <>", value, "admusername");
            return (Criteria) this;
        }

        public Criteria andAdmusernameGreaterThan(String value) {
            addCriterion("admusername >", value, "admusername");
            return (Criteria) this;
        }

        public Criteria andAdmusernameGreaterThanOrEqualTo(String value) {
            addCriterion("admusername >=", value, "admusername");
            return (Criteria) this;
        }

        public Criteria andAdmusernameLessThan(String value) {
            addCriterion("admusername <", value, "admusername");
            return (Criteria) this;
        }

        public Criteria andAdmusernameLessThanOrEqualTo(String value) {
            addCriterion("admusername <=", value, "admusername");
            return (Criteria) this;
        }

        public Criteria andAdmusernameLike(String value) {
            addCriterion("admusername like", value, "admusername");
            return (Criteria) this;
        }

        public Criteria andAdmusernameNotLike(String value) {
            addCriterion("admusername not like", value, "admusername");
            return (Criteria) this;
        }

        public Criteria andAdmusernameIn(List<String> values) {
            addCriterion("admusername in", values, "admusername");
            return (Criteria) this;
        }

        public Criteria andAdmusernameNotIn(List<String> values) {
            addCriterion("admusername not in", values, "admusername");
            return (Criteria) this;
        }

        public Criteria andAdmusernameBetween(String value1, String value2) {
            addCriterion("admusername between", value1, value2, "admusername");
            return (Criteria) this;
        }

        public Criteria andAdmusernameNotBetween(String value1, String value2) {
            addCriterion("admusername not between", value1, value2, "admusername");
            return (Criteria) this;
        }

        public Criteria andAdmpwdIsNull() {
            addCriterion("admpwd is null");
            return (Criteria) this;
        }

        public Criteria andAdmpwdIsNotNull() {
            addCriterion("admpwd is not null");
            return (Criteria) this;
        }

        public Criteria andAdmpwdEqualTo(String value) {
            addCriterion("admpwd =", value, "admpwd");
            return (Criteria) this;
        }

        public Criteria andAdmpwdNotEqualTo(String value) {
            addCriterion("admpwd <>", value, "admpwd");
            return (Criteria) this;
        }

        public Criteria andAdmpwdGreaterThan(String value) {
            addCriterion("admpwd >", value, "admpwd");
            return (Criteria) this;
        }

        public Criteria andAdmpwdGreaterThanOrEqualTo(String value) {
            addCriterion("admpwd >=", value, "admpwd");
            return (Criteria) this;
        }

        public Criteria andAdmpwdLessThan(String value) {
            addCriterion("admpwd <", value, "admpwd");
            return (Criteria) this;
        }

        public Criteria andAdmpwdLessThanOrEqualTo(String value) {
            addCriterion("admpwd <=", value, "admpwd");
            return (Criteria) this;
        }

        public Criteria andAdmpwdLike(String value) {
            addCriterion("admpwd like", value, "admpwd");
            return (Criteria) this;
        }

        public Criteria andAdmpwdNotLike(String value) {
            addCriterion("admpwd not like", value, "admpwd");
            return (Criteria) this;
        }

        public Criteria andAdmpwdIn(List<String> values) {
            addCriterion("admpwd in", values, "admpwd");
            return (Criteria) this;
        }

        public Criteria andAdmpwdNotIn(List<String> values) {
            addCriterion("admpwd not in", values, "admpwd");
            return (Criteria) this;
        }

        public Criteria andAdmpwdBetween(String value1, String value2) {
            addCriterion("admpwd between", value1, value2, "admpwd");
            return (Criteria) this;
        }

        public Criteria andAdmpwdNotBetween(String value1, String value2) {
            addCriterion("admpwd not between", value1, value2, "admpwd");
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