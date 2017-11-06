package com.question.pojo;

import java.util.ArrayList;
import java.util.List;

public class StudentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudentExample() {
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

        public Criteria andStuidIsNull() {
            addCriterion("stuid is null");
            return (Criteria) this;
        }

        public Criteria andStuidIsNotNull() {
            addCriterion("stuid is not null");
            return (Criteria) this;
        }

        public Criteria andStuidEqualTo(Long value) {
            addCriterion("stuid =", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidNotEqualTo(Long value) {
            addCriterion("stuid <>", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidGreaterThan(Long value) {
            addCriterion("stuid >", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidGreaterThanOrEqualTo(Long value) {
            addCriterion("stuid >=", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidLessThan(Long value) {
            addCriterion("stuid <", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidLessThanOrEqualTo(Long value) {
            addCriterion("stuid <=", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidIn(List<Long> values) {
            addCriterion("stuid in", values, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidNotIn(List<Long> values) {
            addCriterion("stuid not in", values, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidBetween(Long value1, Long value2) {
            addCriterion("stuid between", value1, value2, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidNotBetween(Long value1, Long value2) {
            addCriterion("stuid not between", value1, value2, "stuid");
            return (Criteria) this;
        }

        public Criteria andStunumberIsNull() {
            addCriterion("stunumber is null");
            return (Criteria) this;
        }

        public Criteria andStunumberIsNotNull() {
            addCriterion("stunumber is not null");
            return (Criteria) this;
        }

        public Criteria andStunumberEqualTo(String value) {
            addCriterion("stunumber =", value, "stunumber");
            return (Criteria) this;
        }

        public Criteria andStunumberNotEqualTo(String value) {
            addCriterion("stunumber <>", value, "stunumber");
            return (Criteria) this;
        }

        public Criteria andStunumberGreaterThan(String value) {
            addCriterion("stunumber >", value, "stunumber");
            return (Criteria) this;
        }

        public Criteria andStunumberGreaterThanOrEqualTo(String value) {
            addCriterion("stunumber >=", value, "stunumber");
            return (Criteria) this;
        }

        public Criteria andStunumberLessThan(String value) {
            addCriterion("stunumber <", value, "stunumber");
            return (Criteria) this;
        }

        public Criteria andStunumberLessThanOrEqualTo(String value) {
            addCriterion("stunumber <=", value, "stunumber");
            return (Criteria) this;
        }

        public Criteria andStunumberLike(String value) {
            addCriterion("stunumber like", value, "stunumber");
            return (Criteria) this;
        }

        public Criteria andStunumberNotLike(String value) {
            addCriterion("stunumber not like", value, "stunumber");
            return (Criteria) this;
        }

        public Criteria andStunumberIn(List<String> values) {
            addCriterion("stunumber in", values, "stunumber");
            return (Criteria) this;
        }

        public Criteria andStunumberNotIn(List<String> values) {
            addCriterion("stunumber not in", values, "stunumber");
            return (Criteria) this;
        }

        public Criteria andStunumberBetween(String value1, String value2) {
            addCriterion("stunumber between", value1, value2, "stunumber");
            return (Criteria) this;
        }

        public Criteria andStunumberNotBetween(String value1, String value2) {
            addCriterion("stunumber not between", value1, value2, "stunumber");
            return (Criteria) this;
        }

        public Criteria andStunameIsNull() {
            addCriterion("stuname is null");
            return (Criteria) this;
        }

        public Criteria andStunameIsNotNull() {
            addCriterion("stuname is not null");
            return (Criteria) this;
        }

        public Criteria andStunameEqualTo(String value) {
            addCriterion("stuname =", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameNotEqualTo(String value) {
            addCriterion("stuname <>", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameGreaterThan(String value) {
            addCriterion("stuname >", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameGreaterThanOrEqualTo(String value) {
            addCriterion("stuname >=", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameLessThan(String value) {
            addCriterion("stuname <", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameLessThanOrEqualTo(String value) {
            addCriterion("stuname <=", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameLike(String value) {
            addCriterion("stuname like", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameNotLike(String value) {
            addCriterion("stuname not like", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameIn(List<String> values) {
            addCriterion("stuname in", values, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameNotIn(List<String> values) {
            addCriterion("stuname not in", values, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameBetween(String value1, String value2) {
            addCriterion("stuname between", value1, value2, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameNotBetween(String value1, String value2) {
            addCriterion("stuname not between", value1, value2, "stuname");
            return (Criteria) this;
        }

        public Criteria andStuloginnameIsNull() {
            addCriterion("stuloginname is null");
            return (Criteria) this;
        }

        public Criteria andStuloginnameIsNotNull() {
            addCriterion("stuloginname is not null");
            return (Criteria) this;
        }

        public Criteria andStuloginnameEqualTo(String value) {
            addCriterion("stuloginname =", value, "stuloginname");
            return (Criteria) this;
        }

        public Criteria andStuloginnameNotEqualTo(String value) {
            addCriterion("stuloginname <>", value, "stuloginname");
            return (Criteria) this;
        }

        public Criteria andStuloginnameGreaterThan(String value) {
            addCriterion("stuloginname >", value, "stuloginname");
            return (Criteria) this;
        }

        public Criteria andStuloginnameGreaterThanOrEqualTo(String value) {
            addCriterion("stuloginname >=", value, "stuloginname");
            return (Criteria) this;
        }

        public Criteria andStuloginnameLessThan(String value) {
            addCriterion("stuloginname <", value, "stuloginname");
            return (Criteria) this;
        }

        public Criteria andStuloginnameLessThanOrEqualTo(String value) {
            addCriterion("stuloginname <=", value, "stuloginname");
            return (Criteria) this;
        }

        public Criteria andStuloginnameLike(String value) {
            addCriterion("stuloginname like", value, "stuloginname");
            return (Criteria) this;
        }

        public Criteria andStuloginnameNotLike(String value) {
            addCriterion("stuloginname not like", value, "stuloginname");
            return (Criteria) this;
        }

        public Criteria andStuloginnameIn(List<String> values) {
            addCriterion("stuloginname in", values, "stuloginname");
            return (Criteria) this;
        }

        public Criteria andStuloginnameNotIn(List<String> values) {
            addCriterion("stuloginname not in", values, "stuloginname");
            return (Criteria) this;
        }

        public Criteria andStuloginnameBetween(String value1, String value2) {
            addCriterion("stuloginname between", value1, value2, "stuloginname");
            return (Criteria) this;
        }

        public Criteria andStuloginnameNotBetween(String value1, String value2) {
            addCriterion("stuloginname not between", value1, value2, "stuloginname");
            return (Criteria) this;
        }

        public Criteria andStupwdIsNull() {
            addCriterion("stupwd is null");
            return (Criteria) this;
        }

        public Criteria andStupwdIsNotNull() {
            addCriterion("stupwd is not null");
            return (Criteria) this;
        }

        public Criteria andStupwdEqualTo(String value) {
            addCriterion("stupwd =", value, "stupwd");
            return (Criteria) this;
        }

        public Criteria andStupwdNotEqualTo(String value) {
            addCriterion("stupwd <>", value, "stupwd");
            return (Criteria) this;
        }

        public Criteria andStupwdGreaterThan(String value) {
            addCriterion("stupwd >", value, "stupwd");
            return (Criteria) this;
        }

        public Criteria andStupwdGreaterThanOrEqualTo(String value) {
            addCriterion("stupwd >=", value, "stupwd");
            return (Criteria) this;
        }

        public Criteria andStupwdLessThan(String value) {
            addCriterion("stupwd <", value, "stupwd");
            return (Criteria) this;
        }

        public Criteria andStupwdLessThanOrEqualTo(String value) {
            addCriterion("stupwd <=", value, "stupwd");
            return (Criteria) this;
        }

        public Criteria andStupwdLike(String value) {
            addCriterion("stupwd like", value, "stupwd");
            return (Criteria) this;
        }

        public Criteria andStupwdNotLike(String value) {
            addCriterion("stupwd not like", value, "stupwd");
            return (Criteria) this;
        }

        public Criteria andStupwdIn(List<String> values) {
            addCriterion("stupwd in", values, "stupwd");
            return (Criteria) this;
        }

        public Criteria andStupwdNotIn(List<String> values) {
            addCriterion("stupwd not in", values, "stupwd");
            return (Criteria) this;
        }

        public Criteria andStupwdBetween(String value1, String value2) {
            addCriterion("stupwd between", value1, value2, "stupwd");
            return (Criteria) this;
        }

        public Criteria andStupwdNotBetween(String value1, String value2) {
            addCriterion("stupwd not between", value1, value2, "stupwd");
            return (Criteria) this;
        }

        public Criteria andStuphoneIsNull() {
            addCriterion("stuphone is null");
            return (Criteria) this;
        }

        public Criteria andStuphoneIsNotNull() {
            addCriterion("stuphone is not null");
            return (Criteria) this;
        }

        public Criteria andStuphoneEqualTo(String value) {
            addCriterion("stuphone =", value, "stuphone");
            return (Criteria) this;
        }

        public Criteria andStuphoneNotEqualTo(String value) {
            addCriterion("stuphone <>", value, "stuphone");
            return (Criteria) this;
        }

        public Criteria andStuphoneGreaterThan(String value) {
            addCriterion("stuphone >", value, "stuphone");
            return (Criteria) this;
        }

        public Criteria andStuphoneGreaterThanOrEqualTo(String value) {
            addCriterion("stuphone >=", value, "stuphone");
            return (Criteria) this;
        }

        public Criteria andStuphoneLessThan(String value) {
            addCriterion("stuphone <", value, "stuphone");
            return (Criteria) this;
        }

        public Criteria andStuphoneLessThanOrEqualTo(String value) {
            addCriterion("stuphone <=", value, "stuphone");
            return (Criteria) this;
        }

        public Criteria andStuphoneLike(String value) {
            addCriterion("stuphone like", value, "stuphone");
            return (Criteria) this;
        }

        public Criteria andStuphoneNotLike(String value) {
            addCriterion("stuphone not like", value, "stuphone");
            return (Criteria) this;
        }

        public Criteria andStuphoneIn(List<String> values) {
            addCriterion("stuphone in", values, "stuphone");
            return (Criteria) this;
        }

        public Criteria andStuphoneNotIn(List<String> values) {
            addCriterion("stuphone not in", values, "stuphone");
            return (Criteria) this;
        }

        public Criteria andStuphoneBetween(String value1, String value2) {
            addCriterion("stuphone between", value1, value2, "stuphone");
            return (Criteria) this;
        }

        public Criteria andStuphoneNotBetween(String value1, String value2) {
            addCriterion("stuphone not between", value1, value2, "stuphone");
            return (Criteria) this;
        }

        public Criteria andStuqqIsNull() {
            addCriterion("stuqq is null");
            return (Criteria) this;
        }

        public Criteria andStuqqIsNotNull() {
            addCriterion("stuqq is not null");
            return (Criteria) this;
        }

        public Criteria andStuqqEqualTo(String value) {
            addCriterion("stuqq =", value, "stuqq");
            return (Criteria) this;
        }

        public Criteria andStuqqNotEqualTo(String value) {
            addCriterion("stuqq <>", value, "stuqq");
            return (Criteria) this;
        }

        public Criteria andStuqqGreaterThan(String value) {
            addCriterion("stuqq >", value, "stuqq");
            return (Criteria) this;
        }

        public Criteria andStuqqGreaterThanOrEqualTo(String value) {
            addCriterion("stuqq >=", value, "stuqq");
            return (Criteria) this;
        }

        public Criteria andStuqqLessThan(String value) {
            addCriterion("stuqq <", value, "stuqq");
            return (Criteria) this;
        }

        public Criteria andStuqqLessThanOrEqualTo(String value) {
            addCriterion("stuqq <=", value, "stuqq");
            return (Criteria) this;
        }

        public Criteria andStuqqLike(String value) {
            addCriterion("stuqq like", value, "stuqq");
            return (Criteria) this;
        }

        public Criteria andStuqqNotLike(String value) {
            addCriterion("stuqq not like", value, "stuqq");
            return (Criteria) this;
        }

        public Criteria andStuqqIn(List<String> values) {
            addCriterion("stuqq in", values, "stuqq");
            return (Criteria) this;
        }

        public Criteria andStuqqNotIn(List<String> values) {
            addCriterion("stuqq not in", values, "stuqq");
            return (Criteria) this;
        }

        public Criteria andStuqqBetween(String value1, String value2) {
            addCriterion("stuqq between", value1, value2, "stuqq");
            return (Criteria) this;
        }

        public Criteria andStuqqNotBetween(String value1, String value2) {
            addCriterion("stuqq not between", value1, value2, "stuqq");
            return (Criteria) this;
        }

        public Criteria andStumajorIsNull() {
            addCriterion("stumajor is null");
            return (Criteria) this;
        }

        public Criteria andStumajorIsNotNull() {
            addCriterion("stumajor is not null");
            return (Criteria) this;
        }

        public Criteria andStumajorEqualTo(String value) {
            addCriterion("stumajor =", value, "stumajor");
            return (Criteria) this;
        }

        public Criteria andStumajorNotEqualTo(String value) {
            addCriterion("stumajor <>", value, "stumajor");
            return (Criteria) this;
        }

        public Criteria andStumajorGreaterThan(String value) {
            addCriterion("stumajor >", value, "stumajor");
            return (Criteria) this;
        }

        public Criteria andStumajorGreaterThanOrEqualTo(String value) {
            addCriterion("stumajor >=", value, "stumajor");
            return (Criteria) this;
        }

        public Criteria andStumajorLessThan(String value) {
            addCriterion("stumajor <", value, "stumajor");
            return (Criteria) this;
        }

        public Criteria andStumajorLessThanOrEqualTo(String value) {
            addCriterion("stumajor <=", value, "stumajor");
            return (Criteria) this;
        }

        public Criteria andStumajorLike(String value) {
            addCriterion("stumajor like", value, "stumajor");
            return (Criteria) this;
        }

        public Criteria andStumajorNotLike(String value) {
            addCriterion("stumajor not like", value, "stumajor");
            return (Criteria) this;
        }

        public Criteria andStumajorIn(List<String> values) {
            addCriterion("stumajor in", values, "stumajor");
            return (Criteria) this;
        }

        public Criteria andStumajorNotIn(List<String> values) {
            addCriterion("stumajor not in", values, "stumajor");
            return (Criteria) this;
        }

        public Criteria andStumajorBetween(String value1, String value2) {
            addCriterion("stumajor between", value1, value2, "stumajor");
            return (Criteria) this;
        }

        public Criteria andStumajorNotBetween(String value1, String value2) {
            addCriterion("stumajor not between", value1, value2, "stumajor");
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