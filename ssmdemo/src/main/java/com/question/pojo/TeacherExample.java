package com.question.pojo;

import java.util.ArrayList;
import java.util.List;

public class TeacherExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeacherExample() {
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

        public Criteria andTchnumberIsNull() {
            addCriterion("tchnumber is null");
            return (Criteria) this;
        }

        public Criteria andTchnumberIsNotNull() {
            addCriterion("tchnumber is not null");
            return (Criteria) this;
        }

        public Criteria andTchnumberEqualTo(String value) {
            addCriterion("tchnumber =", value, "tchnumber");
            return (Criteria) this;
        }

        public Criteria andTchnumberNotEqualTo(String value) {
            addCriterion("tchnumber <>", value, "tchnumber");
            return (Criteria) this;
        }

        public Criteria andTchnumberGreaterThan(String value) {
            addCriterion("tchnumber >", value, "tchnumber");
            return (Criteria) this;
        }

        public Criteria andTchnumberGreaterThanOrEqualTo(String value) {
            addCriterion("tchnumber >=", value, "tchnumber");
            return (Criteria) this;
        }

        public Criteria andTchnumberLessThan(String value) {
            addCriterion("tchnumber <", value, "tchnumber");
            return (Criteria) this;
        }

        public Criteria andTchnumberLessThanOrEqualTo(String value) {
            addCriterion("tchnumber <=", value, "tchnumber");
            return (Criteria) this;
        }

        public Criteria andTchnumberLike(String value) {
            addCriterion("tchnumber like", value, "tchnumber");
            return (Criteria) this;
        }

        public Criteria andTchnumberNotLike(String value) {
            addCriterion("tchnumber not like", value, "tchnumber");
            return (Criteria) this;
        }

        public Criteria andTchnumberIn(List<String> values) {
            addCriterion("tchnumber in", values, "tchnumber");
            return (Criteria) this;
        }

        public Criteria andTchnumberNotIn(List<String> values) {
            addCriterion("tchnumber not in", values, "tchnumber");
            return (Criteria) this;
        }

        public Criteria andTchnumberBetween(String value1, String value2) {
            addCriterion("tchnumber between", value1, value2, "tchnumber");
            return (Criteria) this;
        }

        public Criteria andTchnumberNotBetween(String value1, String value2) {
            addCriterion("tchnumber not between", value1, value2, "tchnumber");
            return (Criteria) this;
        }

        public Criteria andTchnameIsNull() {
            addCriterion("tchname is null");
            return (Criteria) this;
        }

        public Criteria andTchnameIsNotNull() {
            addCriterion("tchname is not null");
            return (Criteria) this;
        }

        public Criteria andTchnameEqualTo(String value) {
            addCriterion("tchname =", value, "tchname");
            return (Criteria) this;
        }

        public Criteria andTchnameNotEqualTo(String value) {
            addCriterion("tchname <>", value, "tchname");
            return (Criteria) this;
        }

        public Criteria andTchnameGreaterThan(String value) {
            addCriterion("tchname >", value, "tchname");
            return (Criteria) this;
        }

        public Criteria andTchnameGreaterThanOrEqualTo(String value) {
            addCriterion("tchname >=", value, "tchname");
            return (Criteria) this;
        }

        public Criteria andTchnameLessThan(String value) {
            addCriterion("tchname <", value, "tchname");
            return (Criteria) this;
        }

        public Criteria andTchnameLessThanOrEqualTo(String value) {
            addCriterion("tchname <=", value, "tchname");
            return (Criteria) this;
        }

        public Criteria andTchnameLike(String value) {
            addCriterion("tchname like", value, "tchname");
            return (Criteria) this;
        }

        public Criteria andTchnameNotLike(String value) {
            addCriterion("tchname not like", value, "tchname");
            return (Criteria) this;
        }

        public Criteria andTchnameIn(List<String> values) {
            addCriterion("tchname in", values, "tchname");
            return (Criteria) this;
        }

        public Criteria andTchnameNotIn(List<String> values) {
            addCriterion("tchname not in", values, "tchname");
            return (Criteria) this;
        }

        public Criteria andTchnameBetween(String value1, String value2) {
            addCriterion("tchname between", value1, value2, "tchname");
            return (Criteria) this;
        }

        public Criteria andTchnameNotBetween(String value1, String value2) {
            addCriterion("tchname not between", value1, value2, "tchname");
            return (Criteria) this;
        }

        public Criteria andTchloginnameIsNull() {
            addCriterion("tchloginname is null");
            return (Criteria) this;
        }

        public Criteria andTchloginnameIsNotNull() {
            addCriterion("tchloginname is not null");
            return (Criteria) this;
        }

        public Criteria andTchloginnameEqualTo(String value) {
            addCriterion("tchloginname =", value, "tchloginname");
            return (Criteria) this;
        }

        public Criteria andTchloginnameNotEqualTo(String value) {
            addCriterion("tchloginname <>", value, "tchloginname");
            return (Criteria) this;
        }

        public Criteria andTchloginnameGreaterThan(String value) {
            addCriterion("tchloginname >", value, "tchloginname");
            return (Criteria) this;
        }

        public Criteria andTchloginnameGreaterThanOrEqualTo(String value) {
            addCriterion("tchloginname >=", value, "tchloginname");
            return (Criteria) this;
        }

        public Criteria andTchloginnameLessThan(String value) {
            addCriterion("tchloginname <", value, "tchloginname");
            return (Criteria) this;
        }

        public Criteria andTchloginnameLessThanOrEqualTo(String value) {
            addCriterion("tchloginname <=", value, "tchloginname");
            return (Criteria) this;
        }

        public Criteria andTchloginnameLike(String value) {
            addCriterion("tchloginname like", value, "tchloginname");
            return (Criteria) this;
        }

        public Criteria andTchloginnameNotLike(String value) {
            addCriterion("tchloginname not like", value, "tchloginname");
            return (Criteria) this;
        }

        public Criteria andTchloginnameIn(List<String> values) {
            addCriterion("tchloginname in", values, "tchloginname");
            return (Criteria) this;
        }

        public Criteria andTchloginnameNotIn(List<String> values) {
            addCriterion("tchloginname not in", values, "tchloginname");
            return (Criteria) this;
        }

        public Criteria andTchloginnameBetween(String value1, String value2) {
            addCriterion("tchloginname between", value1, value2, "tchloginname");
            return (Criteria) this;
        }

        public Criteria andTchloginnameNotBetween(String value1, String value2) {
            addCriterion("tchloginname not between", value1, value2, "tchloginname");
            return (Criteria) this;
        }

        public Criteria andTchpwdIsNull() {
            addCriterion("tchpwd is null");
            return (Criteria) this;
        }

        public Criteria andTchpwdIsNotNull() {
            addCriterion("tchpwd is not null");
            return (Criteria) this;
        }

        public Criteria andTchpwdEqualTo(String value) {
            addCriterion("tchpwd =", value, "tchpwd");
            return (Criteria) this;
        }

        public Criteria andTchpwdNotEqualTo(String value) {
            addCriterion("tchpwd <>", value, "tchpwd");
            return (Criteria) this;
        }

        public Criteria andTchpwdGreaterThan(String value) {
            addCriterion("tchpwd >", value, "tchpwd");
            return (Criteria) this;
        }

        public Criteria andTchpwdGreaterThanOrEqualTo(String value) {
            addCriterion("tchpwd >=", value, "tchpwd");
            return (Criteria) this;
        }

        public Criteria andTchpwdLessThan(String value) {
            addCriterion("tchpwd <", value, "tchpwd");
            return (Criteria) this;
        }

        public Criteria andTchpwdLessThanOrEqualTo(String value) {
            addCriterion("tchpwd <=", value, "tchpwd");
            return (Criteria) this;
        }

        public Criteria andTchpwdLike(String value) {
            addCriterion("tchpwd like", value, "tchpwd");
            return (Criteria) this;
        }

        public Criteria andTchpwdNotLike(String value) {
            addCriterion("tchpwd not like", value, "tchpwd");
            return (Criteria) this;
        }

        public Criteria andTchpwdIn(List<String> values) {
            addCriterion("tchpwd in", values, "tchpwd");
            return (Criteria) this;
        }

        public Criteria andTchpwdNotIn(List<String> values) {
            addCriterion("tchpwd not in", values, "tchpwd");
            return (Criteria) this;
        }

        public Criteria andTchpwdBetween(String value1, String value2) {
            addCriterion("tchpwd between", value1, value2, "tchpwd");
            return (Criteria) this;
        }

        public Criteria andTchpwdNotBetween(String value1, String value2) {
            addCriterion("tchpwd not between", value1, value2, "tchpwd");
            return (Criteria) this;
        }

        public Criteria andTchphoneIsNull() {
            addCriterion("tchphone is null");
            return (Criteria) this;
        }

        public Criteria andTchphoneIsNotNull() {
            addCriterion("tchphone is not null");
            return (Criteria) this;
        }

        public Criteria andTchphoneEqualTo(String value) {
            addCriterion("tchphone =", value, "tchphone");
            return (Criteria) this;
        }

        public Criteria andTchphoneNotEqualTo(String value) {
            addCriterion("tchphone <>", value, "tchphone");
            return (Criteria) this;
        }

        public Criteria andTchphoneGreaterThan(String value) {
            addCriterion("tchphone >", value, "tchphone");
            return (Criteria) this;
        }

        public Criteria andTchphoneGreaterThanOrEqualTo(String value) {
            addCriterion("tchphone >=", value, "tchphone");
            return (Criteria) this;
        }

        public Criteria andTchphoneLessThan(String value) {
            addCriterion("tchphone <", value, "tchphone");
            return (Criteria) this;
        }

        public Criteria andTchphoneLessThanOrEqualTo(String value) {
            addCriterion("tchphone <=", value, "tchphone");
            return (Criteria) this;
        }

        public Criteria andTchphoneLike(String value) {
            addCriterion("tchphone like", value, "tchphone");
            return (Criteria) this;
        }

        public Criteria andTchphoneNotLike(String value) {
            addCriterion("tchphone not like", value, "tchphone");
            return (Criteria) this;
        }

        public Criteria andTchphoneIn(List<String> values) {
            addCriterion("tchphone in", values, "tchphone");
            return (Criteria) this;
        }

        public Criteria andTchphoneNotIn(List<String> values) {
            addCriterion("tchphone not in", values, "tchphone");
            return (Criteria) this;
        }

        public Criteria andTchphoneBetween(String value1, String value2) {
            addCriterion("tchphone between", value1, value2, "tchphone");
            return (Criteria) this;
        }

        public Criteria andTchphoneNotBetween(String value1, String value2) {
            addCriterion("tchphone not between", value1, value2, "tchphone");
            return (Criteria) this;
        }

        public Criteria andTchmailIsNull() {
            addCriterion("tchmail is null");
            return (Criteria) this;
        }

        public Criteria andTchmailIsNotNull() {
            addCriterion("tchmail is not null");
            return (Criteria) this;
        }

        public Criteria andTchmailEqualTo(String value) {
            addCriterion("tchmail =", value, "tchmail");
            return (Criteria) this;
        }

        public Criteria andTchmailNotEqualTo(String value) {
            addCriterion("tchmail <>", value, "tchmail");
            return (Criteria) this;
        }

        public Criteria andTchmailGreaterThan(String value) {
            addCriterion("tchmail >", value, "tchmail");
            return (Criteria) this;
        }

        public Criteria andTchmailGreaterThanOrEqualTo(String value) {
            addCriterion("tchmail >=", value, "tchmail");
            return (Criteria) this;
        }

        public Criteria andTchmailLessThan(String value) {
            addCriterion("tchmail <", value, "tchmail");
            return (Criteria) this;
        }

        public Criteria andTchmailLessThanOrEqualTo(String value) {
            addCriterion("tchmail <=", value, "tchmail");
            return (Criteria) this;
        }

        public Criteria andTchmailLike(String value) {
            addCriterion("tchmail like", value, "tchmail");
            return (Criteria) this;
        }

        public Criteria andTchmailNotLike(String value) {
            addCriterion("tchmail not like", value, "tchmail");
            return (Criteria) this;
        }

        public Criteria andTchmailIn(List<String> values) {
            addCriterion("tchmail in", values, "tchmail");
            return (Criteria) this;
        }

        public Criteria andTchmailNotIn(List<String> values) {
            addCriterion("tchmail not in", values, "tchmail");
            return (Criteria) this;
        }

        public Criteria andTchmailBetween(String value1, String value2) {
            addCriterion("tchmail between", value1, value2, "tchmail");
            return (Criteria) this;
        }

        public Criteria andTchmailNotBetween(String value1, String value2) {
            addCriterion("tchmail not between", value1, value2, "tchmail");
            return (Criteria) this;
        }

        public Criteria andTchresearchIsNull() {
            addCriterion("tchresearch is null");
            return (Criteria) this;
        }

        public Criteria andTchresearchIsNotNull() {
            addCriterion("tchresearch is not null");
            return (Criteria) this;
        }

        public Criteria andTchresearchEqualTo(String value) {
            addCriterion("tchresearch =", value, "tchresearch");
            return (Criteria) this;
        }

        public Criteria andTchresearchNotEqualTo(String value) {
            addCriterion("tchresearch <>", value, "tchresearch");
            return (Criteria) this;
        }

        public Criteria andTchresearchGreaterThan(String value) {
            addCriterion("tchresearch >", value, "tchresearch");
            return (Criteria) this;
        }

        public Criteria andTchresearchGreaterThanOrEqualTo(String value) {
            addCriterion("tchresearch >=", value, "tchresearch");
            return (Criteria) this;
        }

        public Criteria andTchresearchLessThan(String value) {
            addCriterion("tchresearch <", value, "tchresearch");
            return (Criteria) this;
        }

        public Criteria andTchresearchLessThanOrEqualTo(String value) {
            addCriterion("tchresearch <=", value, "tchresearch");
            return (Criteria) this;
        }

        public Criteria andTchresearchLike(String value) {
            addCriterion("tchresearch like", value, "tchresearch");
            return (Criteria) this;
        }

        public Criteria andTchresearchNotLike(String value) {
            addCriterion("tchresearch not like", value, "tchresearch");
            return (Criteria) this;
        }

        public Criteria andTchresearchIn(List<String> values) {
            addCriterion("tchresearch in", values, "tchresearch");
            return (Criteria) this;
        }

        public Criteria andTchresearchNotIn(List<String> values) {
            addCriterion("tchresearch not in", values, "tchresearch");
            return (Criteria) this;
        }

        public Criteria andTchresearchBetween(String value1, String value2) {
            addCriterion("tchresearch between", value1, value2, "tchresearch");
            return (Criteria) this;
        }

        public Criteria andTchresearchNotBetween(String value1, String value2) {
            addCriterion("tchresearch not between", value1, value2, "tchresearch");
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