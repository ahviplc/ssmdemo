package com.question.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrdergiveExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrdergiveExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userid is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userid is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Long value) {
            addCriterion("userid =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Long value) {
            addCriterion("userid <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Long value) {
            addCriterion("userid >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Long value) {
            addCriterion("userid >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Long value) {
            addCriterion("userid <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Long value) {
            addCriterion("userid <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Long> values) {
            addCriterion("userid in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Long> values) {
            addCriterion("userid not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Long value1, Long value2) {
            addCriterion("userid between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Long value1, Long value2) {
            addCriterion("userid not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUtelIsNull() {
            addCriterion("utel is null");
            return (Criteria) this;
        }

        public Criteria andUtelIsNotNull() {
            addCriterion("utel is not null");
            return (Criteria) this;
        }

        public Criteria andUtelEqualTo(String value) {
            addCriterion("utel =", value, "utel");
            return (Criteria) this;
        }

        public Criteria andUtelNotEqualTo(String value) {
            addCriterion("utel <>", value, "utel");
            return (Criteria) this;
        }

        public Criteria andUtelGreaterThan(String value) {
            addCriterion("utel >", value, "utel");
            return (Criteria) this;
        }

        public Criteria andUtelGreaterThanOrEqualTo(String value) {
            addCriterion("utel >=", value, "utel");
            return (Criteria) this;
        }

        public Criteria andUtelLessThan(String value) {
            addCriterion("utel <", value, "utel");
            return (Criteria) this;
        }

        public Criteria andUtelLessThanOrEqualTo(String value) {
            addCriterion("utel <=", value, "utel");
            return (Criteria) this;
        }

        public Criteria andUtelLike(String value) {
            addCriterion("utel like", value, "utel");
            return (Criteria) this;
        }

        public Criteria andUtelNotLike(String value) {
            addCriterion("utel not like", value, "utel");
            return (Criteria) this;
        }

        public Criteria andUtelIn(List<String> values) {
            addCriterion("utel in", values, "utel");
            return (Criteria) this;
        }

        public Criteria andUtelNotIn(List<String> values) {
            addCriterion("utel not in", values, "utel");
            return (Criteria) this;
        }

        public Criteria andUtelBetween(String value1, String value2) {
            addCriterion("utel between", value1, value2, "utel");
            return (Criteria) this;
        }

        public Criteria andUtelNotBetween(String value1, String value2) {
            addCriterion("utel not between", value1, value2, "utel");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andGoodsnameIsNull() {
            addCriterion("goodsname is null");
            return (Criteria) this;
        }

        public Criteria andGoodsnameIsNotNull() {
            addCriterion("goodsname is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsnameEqualTo(String value) {
            addCriterion("goodsname =", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameNotEqualTo(String value) {
            addCriterion("goodsname <>", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameGreaterThan(String value) {
            addCriterion("goodsname >", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameGreaterThanOrEqualTo(String value) {
            addCriterion("goodsname >=", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameLessThan(String value) {
            addCriterion("goodsname <", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameLessThanOrEqualTo(String value) {
            addCriterion("goodsname <=", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameLike(String value) {
            addCriterion("goodsname like", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameNotLike(String value) {
            addCriterion("goodsname not like", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameIn(List<String> values) {
            addCriterion("goodsname in", values, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameNotIn(List<String> values) {
            addCriterion("goodsname not in", values, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameBetween(String value1, String value2) {
            addCriterion("goodsname between", value1, value2, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameNotBetween(String value1, String value2) {
            addCriterion("goodsname not between", value1, value2, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodcountsIsNull() {
            addCriterion("goodcounts is null");
            return (Criteria) this;
        }

        public Criteria andGoodcountsIsNotNull() {
            addCriterion("goodcounts is not null");
            return (Criteria) this;
        }

        public Criteria andGoodcountsEqualTo(Integer value) {
            addCriterion("goodcounts =", value, "goodcounts");
            return (Criteria) this;
        }

        public Criteria andGoodcountsNotEqualTo(Integer value) {
            addCriterion("goodcounts <>", value, "goodcounts");
            return (Criteria) this;
        }

        public Criteria andGoodcountsGreaterThan(Integer value) {
            addCriterion("goodcounts >", value, "goodcounts");
            return (Criteria) this;
        }

        public Criteria andGoodcountsGreaterThanOrEqualTo(Integer value) {
            addCriterion("goodcounts >=", value, "goodcounts");
            return (Criteria) this;
        }

        public Criteria andGoodcountsLessThan(Integer value) {
            addCriterion("goodcounts <", value, "goodcounts");
            return (Criteria) this;
        }

        public Criteria andGoodcountsLessThanOrEqualTo(Integer value) {
            addCriterion("goodcounts <=", value, "goodcounts");
            return (Criteria) this;
        }

        public Criteria andGoodcountsIn(List<Integer> values) {
            addCriterion("goodcounts in", values, "goodcounts");
            return (Criteria) this;
        }

        public Criteria andGoodcountsNotIn(List<Integer> values) {
            addCriterion("goodcounts not in", values, "goodcounts");
            return (Criteria) this;
        }

        public Criteria andGoodcountsBetween(Integer value1, Integer value2) {
            addCriterion("goodcounts between", value1, value2, "goodcounts");
            return (Criteria) this;
        }

        public Criteria andGoodcountsNotBetween(Integer value1, Integer value2) {
            addCriterion("goodcounts not between", value1, value2, "goodcounts");
            return (Criteria) this;
        }

        public Criteria andGoodspriceIsNull() {
            addCriterion("goodsprice is null");
            return (Criteria) this;
        }

        public Criteria andGoodspriceIsNotNull() {
            addCriterion("goodsprice is not null");
            return (Criteria) this;
        }

        public Criteria andGoodspriceEqualTo(BigDecimal value) {
            addCriterion("goodsprice =", value, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andGoodspriceNotEqualTo(BigDecimal value) {
            addCriterion("goodsprice <>", value, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andGoodspriceGreaterThan(BigDecimal value) {
            addCriterion("goodsprice >", value, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andGoodspriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("goodsprice >=", value, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andGoodspriceLessThan(BigDecimal value) {
            addCriterion("goodsprice <", value, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andGoodspriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("goodsprice <=", value, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andGoodspriceIn(List<BigDecimal> values) {
            addCriterion("goodsprice in", values, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andGoodspriceNotIn(List<BigDecimal> values) {
            addCriterion("goodsprice not in", values, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andGoodspriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goodsprice between", value1, value2, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andGoodspriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goodsprice not between", value1, value2, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andStartaddressIsNull() {
            addCriterion("startaddress is null");
            return (Criteria) this;
        }

        public Criteria andStartaddressIsNotNull() {
            addCriterion("startaddress is not null");
            return (Criteria) this;
        }

        public Criteria andStartaddressEqualTo(String value) {
            addCriterion("startaddress =", value, "startaddress");
            return (Criteria) this;
        }

        public Criteria andStartaddressNotEqualTo(String value) {
            addCriterion("startaddress <>", value, "startaddress");
            return (Criteria) this;
        }

        public Criteria andStartaddressGreaterThan(String value) {
            addCriterion("startaddress >", value, "startaddress");
            return (Criteria) this;
        }

        public Criteria andStartaddressGreaterThanOrEqualTo(String value) {
            addCriterion("startaddress >=", value, "startaddress");
            return (Criteria) this;
        }

        public Criteria andStartaddressLessThan(String value) {
            addCriterion("startaddress <", value, "startaddress");
            return (Criteria) this;
        }

        public Criteria andStartaddressLessThanOrEqualTo(String value) {
            addCriterion("startaddress <=", value, "startaddress");
            return (Criteria) this;
        }

        public Criteria andStartaddressLike(String value) {
            addCriterion("startaddress like", value, "startaddress");
            return (Criteria) this;
        }

        public Criteria andStartaddressNotLike(String value) {
            addCriterion("startaddress not like", value, "startaddress");
            return (Criteria) this;
        }

        public Criteria andStartaddressIn(List<String> values) {
            addCriterion("startaddress in", values, "startaddress");
            return (Criteria) this;
        }

        public Criteria andStartaddressNotIn(List<String> values) {
            addCriterion("startaddress not in", values, "startaddress");
            return (Criteria) this;
        }

        public Criteria andStartaddressBetween(String value1, String value2) {
            addCriterion("startaddress between", value1, value2, "startaddress");
            return (Criteria) this;
        }

        public Criteria andStartaddressNotBetween(String value1, String value2) {
            addCriterion("startaddress not between", value1, value2, "startaddress");
            return (Criteria) this;
        }

        public Criteria andEndaddressIsNull() {
            addCriterion("endaddress is null");
            return (Criteria) this;
        }

        public Criteria andEndaddressIsNotNull() {
            addCriterion("endaddress is not null");
            return (Criteria) this;
        }

        public Criteria andEndaddressEqualTo(String value) {
            addCriterion("endaddress =", value, "endaddress");
            return (Criteria) this;
        }

        public Criteria andEndaddressNotEqualTo(String value) {
            addCriterion("endaddress <>", value, "endaddress");
            return (Criteria) this;
        }

        public Criteria andEndaddressGreaterThan(String value) {
            addCriterion("endaddress >", value, "endaddress");
            return (Criteria) this;
        }

        public Criteria andEndaddressGreaterThanOrEqualTo(String value) {
            addCriterion("endaddress >=", value, "endaddress");
            return (Criteria) this;
        }

        public Criteria andEndaddressLessThan(String value) {
            addCriterion("endaddress <", value, "endaddress");
            return (Criteria) this;
        }

        public Criteria andEndaddressLessThanOrEqualTo(String value) {
            addCriterion("endaddress <=", value, "endaddress");
            return (Criteria) this;
        }

        public Criteria andEndaddressLike(String value) {
            addCriterion("endaddress like", value, "endaddress");
            return (Criteria) this;
        }

        public Criteria andEndaddressNotLike(String value) {
            addCriterion("endaddress not like", value, "endaddress");
            return (Criteria) this;
        }

        public Criteria andEndaddressIn(List<String> values) {
            addCriterion("endaddress in", values, "endaddress");
            return (Criteria) this;
        }

        public Criteria andEndaddressNotIn(List<String> values) {
            addCriterion("endaddress not in", values, "endaddress");
            return (Criteria) this;
        }

        public Criteria andEndaddressBetween(String value1, String value2) {
            addCriterion("endaddress between", value1, value2, "endaddress");
            return (Criteria) this;
        }

        public Criteria andEndaddressNotBetween(String value1, String value2) {
            addCriterion("endaddress not between", value1, value2, "endaddress");
            return (Criteria) this;
        }

        public Criteria andDescribesIsNull() {
            addCriterion("describes is null");
            return (Criteria) this;
        }

        public Criteria andDescribesIsNotNull() {
            addCriterion("describes is not null");
            return (Criteria) this;
        }

        public Criteria andDescribesEqualTo(String value) {
            addCriterion("describes =", value, "describes");
            return (Criteria) this;
        }

        public Criteria andDescribesNotEqualTo(String value) {
            addCriterion("describes <>", value, "describes");
            return (Criteria) this;
        }

        public Criteria andDescribesGreaterThan(String value) {
            addCriterion("describes >", value, "describes");
            return (Criteria) this;
        }

        public Criteria andDescribesGreaterThanOrEqualTo(String value) {
            addCriterion("describes >=", value, "describes");
            return (Criteria) this;
        }

        public Criteria andDescribesLessThan(String value) {
            addCriterion("describes <", value, "describes");
            return (Criteria) this;
        }

        public Criteria andDescribesLessThanOrEqualTo(String value) {
            addCriterion("describes <=", value, "describes");
            return (Criteria) this;
        }

        public Criteria andDescribesLike(String value) {
            addCriterion("describes like", value, "describes");
            return (Criteria) this;
        }

        public Criteria andDescribesNotLike(String value) {
            addCriterion("describes not like", value, "describes");
            return (Criteria) this;
        }

        public Criteria andDescribesIn(List<String> values) {
            addCriterion("describes in", values, "describes");
            return (Criteria) this;
        }

        public Criteria andDescribesNotIn(List<String> values) {
            addCriterion("describes not in", values, "describes");
            return (Criteria) this;
        }

        public Criteria andDescribesBetween(String value1, String value2) {
            addCriterion("describes between", value1, value2, "describes");
            return (Criteria) this;
        }

        public Criteria andDescribesNotBetween(String value1, String value2) {
            addCriterion("describes not between", value1, value2, "describes");
            return (Criteria) this;
        }

        public Criteria andSalaryIsNull() {
            addCriterion("salary is null");
            return (Criteria) this;
        }

        public Criteria andSalaryIsNotNull() {
            addCriterion("salary is not null");
            return (Criteria) this;
        }

        public Criteria andSalaryEqualTo(BigDecimal value) {
            addCriterion("salary =", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryNotEqualTo(BigDecimal value) {
            addCriterion("salary <>", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryGreaterThan(BigDecimal value) {
            addCriterion("salary >", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("salary >=", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryLessThan(BigDecimal value) {
            addCriterion("salary <", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryLessThanOrEqualTo(BigDecimal value) {
            addCriterion("salary <=", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryIn(List<BigDecimal> values) {
            addCriterion("salary in", values, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryNotIn(List<BigDecimal> values) {
            addCriterion("salary not in", values, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("salary between", value1, value2, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("salary not between", value1, value2, "salary");
            return (Criteria) this;
        }

        public Criteria andAddresseephoneIsNull() {
            addCriterion("addresseephone is null");
            return (Criteria) this;
        }

        public Criteria andAddresseephoneIsNotNull() {
            addCriterion("addresseephone is not null");
            return (Criteria) this;
        }

        public Criteria andAddresseephoneEqualTo(String value) {
            addCriterion("addresseephone =", value, "addresseephone");
            return (Criteria) this;
        }

        public Criteria andAddresseephoneNotEqualTo(String value) {
            addCriterion("addresseephone <>", value, "addresseephone");
            return (Criteria) this;
        }

        public Criteria andAddresseephoneGreaterThan(String value) {
            addCriterion("addresseephone >", value, "addresseephone");
            return (Criteria) this;
        }

        public Criteria andAddresseephoneGreaterThanOrEqualTo(String value) {
            addCriterion("addresseephone >=", value, "addresseephone");
            return (Criteria) this;
        }

        public Criteria andAddresseephoneLessThan(String value) {
            addCriterion("addresseephone <", value, "addresseephone");
            return (Criteria) this;
        }

        public Criteria andAddresseephoneLessThanOrEqualTo(String value) {
            addCriterion("addresseephone <=", value, "addresseephone");
            return (Criteria) this;
        }

        public Criteria andAddresseephoneLike(String value) {
            addCriterion("addresseephone like", value, "addresseephone");
            return (Criteria) this;
        }

        public Criteria andAddresseephoneNotLike(String value) {
            addCriterion("addresseephone not like", value, "addresseephone");
            return (Criteria) this;
        }

        public Criteria andAddresseephoneIn(List<String> values) {
            addCriterion("addresseephone in", values, "addresseephone");
            return (Criteria) this;
        }

        public Criteria andAddresseephoneNotIn(List<String> values) {
            addCriterion("addresseephone not in", values, "addresseephone");
            return (Criteria) this;
        }

        public Criteria andAddresseephoneBetween(String value1, String value2) {
            addCriterion("addresseephone between", value1, value2, "addresseephone");
            return (Criteria) this;
        }

        public Criteria andAddresseephoneNotBetween(String value1, String value2) {
            addCriterion("addresseephone not between", value1, value2, "addresseephone");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(Date value) {
            addCriterion("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(Date value) {
            addCriterion("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(Date value) {
            addCriterion("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(Date value) {
            addCriterion("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(Date value) {
            addCriterion("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<Date> values) {
            addCriterion("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<Date> values) {
            addCriterion("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(Date value1, Date value2) {
            addCriterion("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(Date value1, Date value2) {
            addCriterion("time not between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andDridIsNull() {
            addCriterion("drid is null");
            return (Criteria) this;
        }

        public Criteria andDridIsNotNull() {
            addCriterion("drid is not null");
            return (Criteria) this;
        }

        public Criteria andDridEqualTo(Long value) {
            addCriterion("drid =", value, "drid");
            return (Criteria) this;
        }

        public Criteria andDridNotEqualTo(Long value) {
            addCriterion("drid <>", value, "drid");
            return (Criteria) this;
        }

        public Criteria andDridGreaterThan(Long value) {
            addCriterion("drid >", value, "drid");
            return (Criteria) this;
        }

        public Criteria andDridGreaterThanOrEqualTo(Long value) {
            addCriterion("drid >=", value, "drid");
            return (Criteria) this;
        }

        public Criteria andDridLessThan(Long value) {
            addCriterion("drid <", value, "drid");
            return (Criteria) this;
        }

        public Criteria andDridLessThanOrEqualTo(Long value) {
            addCriterion("drid <=", value, "drid");
            return (Criteria) this;
        }

        public Criteria andDridIn(List<Long> values) {
            addCriterion("drid in", values, "drid");
            return (Criteria) this;
        }

        public Criteria andDridNotIn(List<Long> values) {
            addCriterion("drid not in", values, "drid");
            return (Criteria) this;
        }

        public Criteria andDridBetween(Long value1, Long value2) {
            addCriterion("drid between", value1, value2, "drid");
            return (Criteria) this;
        }

        public Criteria andDridNotBetween(Long value1, Long value2) {
            addCriterion("drid not between", value1, value2, "drid");
            return (Criteria) this;
        }

        public Criteria andDrnameIsNull() {
            addCriterion("drname is null");
            return (Criteria) this;
        }

        public Criteria andDrnameIsNotNull() {
            addCriterion("drname is not null");
            return (Criteria) this;
        }

        public Criteria andDrnameEqualTo(String value) {
            addCriterion("drname =", value, "drname");
            return (Criteria) this;
        }

        public Criteria andDrnameNotEqualTo(String value) {
            addCriterion("drname <>", value, "drname");
            return (Criteria) this;
        }

        public Criteria andDrnameGreaterThan(String value) {
            addCriterion("drname >", value, "drname");
            return (Criteria) this;
        }

        public Criteria andDrnameGreaterThanOrEqualTo(String value) {
            addCriterion("drname >=", value, "drname");
            return (Criteria) this;
        }

        public Criteria andDrnameLessThan(String value) {
            addCriterion("drname <", value, "drname");
            return (Criteria) this;
        }

        public Criteria andDrnameLessThanOrEqualTo(String value) {
            addCriterion("drname <=", value, "drname");
            return (Criteria) this;
        }

        public Criteria andDrnameLike(String value) {
            addCriterion("drname like", value, "drname");
            return (Criteria) this;
        }

        public Criteria andDrnameNotLike(String value) {
            addCriterion("drname not like", value, "drname");
            return (Criteria) this;
        }

        public Criteria andDrnameIn(List<String> values) {
            addCriterion("drname in", values, "drname");
            return (Criteria) this;
        }

        public Criteria andDrnameNotIn(List<String> values) {
            addCriterion("drname not in", values, "drname");
            return (Criteria) this;
        }

        public Criteria andDrnameBetween(String value1, String value2) {
            addCriterion("drname between", value1, value2, "drname");
            return (Criteria) this;
        }

        public Criteria andDrnameNotBetween(String value1, String value2) {
            addCriterion("drname not between", value1, value2, "drname");
            return (Criteria) this;
        }

        public Criteria andCaridIsNull() {
            addCriterion("carid is null");
            return (Criteria) this;
        }

        public Criteria andCaridIsNotNull() {
            addCriterion("carid is not null");
            return (Criteria) this;
        }

        public Criteria andCaridEqualTo(Long value) {
            addCriterion("carid =", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridNotEqualTo(Long value) {
            addCriterion("carid <>", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridGreaterThan(Long value) {
            addCriterion("carid >", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridGreaterThanOrEqualTo(Long value) {
            addCriterion("carid >=", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridLessThan(Long value) {
            addCriterion("carid <", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridLessThanOrEqualTo(Long value) {
            addCriterion("carid <=", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridIn(List<Long> values) {
            addCriterion("carid in", values, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridNotIn(List<Long> values) {
            addCriterion("carid not in", values, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridBetween(Long value1, Long value2) {
            addCriterion("carid between", value1, value2, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridNotBetween(Long value1, Long value2) {
            addCriterion("carid not between", value1, value2, "carid");
            return (Criteria) this;
        }

        public Criteria andCarnameIsNull() {
            addCriterion("carname is null");
            return (Criteria) this;
        }

        public Criteria andCarnameIsNotNull() {
            addCriterion("carname is not null");
            return (Criteria) this;
        }

        public Criteria andCarnameEqualTo(String value) {
            addCriterion("carname =", value, "carname");
            return (Criteria) this;
        }

        public Criteria andCarnameNotEqualTo(String value) {
            addCriterion("carname <>", value, "carname");
            return (Criteria) this;
        }

        public Criteria andCarnameGreaterThan(String value) {
            addCriterion("carname >", value, "carname");
            return (Criteria) this;
        }

        public Criteria andCarnameGreaterThanOrEqualTo(String value) {
            addCriterion("carname >=", value, "carname");
            return (Criteria) this;
        }

        public Criteria andCarnameLessThan(String value) {
            addCriterion("carname <", value, "carname");
            return (Criteria) this;
        }

        public Criteria andCarnameLessThanOrEqualTo(String value) {
            addCriterion("carname <=", value, "carname");
            return (Criteria) this;
        }

        public Criteria andCarnameLike(String value) {
            addCriterion("carname like", value, "carname");
            return (Criteria) this;
        }

        public Criteria andCarnameNotLike(String value) {
            addCriterion("carname not like", value, "carname");
            return (Criteria) this;
        }

        public Criteria andCarnameIn(List<String> values) {
            addCriterion("carname in", values, "carname");
            return (Criteria) this;
        }

        public Criteria andCarnameNotIn(List<String> values) {
            addCriterion("carname not in", values, "carname");
            return (Criteria) this;
        }

        public Criteria andCarnameBetween(String value1, String value2) {
            addCriterion("carname between", value1, value2, "carname");
            return (Criteria) this;
        }

        public Criteria andCarnameNotBetween(String value1, String value2) {
            addCriterion("carname not between", value1, value2, "carname");
            return (Criteria) this;
        }

        public Criteria andGivenumbersIsNull() {
            addCriterion("givenumbers is null");
            return (Criteria) this;
        }

        public Criteria andGivenumbersIsNotNull() {
            addCriterion("givenumbers is not null");
            return (Criteria) this;
        }

        public Criteria andGivenumbersEqualTo(String value) {
            addCriterion("givenumbers =", value, "givenumbers");
            return (Criteria) this;
        }

        public Criteria andGivenumbersNotEqualTo(String value) {
            addCriterion("givenumbers <>", value, "givenumbers");
            return (Criteria) this;
        }

        public Criteria andGivenumbersGreaterThan(String value) {
            addCriterion("givenumbers >", value, "givenumbers");
            return (Criteria) this;
        }

        public Criteria andGivenumbersGreaterThanOrEqualTo(String value) {
            addCriterion("givenumbers >=", value, "givenumbers");
            return (Criteria) this;
        }

        public Criteria andGivenumbersLessThan(String value) {
            addCriterion("givenumbers <", value, "givenumbers");
            return (Criteria) this;
        }

        public Criteria andGivenumbersLessThanOrEqualTo(String value) {
            addCriterion("givenumbers <=", value, "givenumbers");
            return (Criteria) this;
        }

        public Criteria andGivenumbersLike(String value) {
            addCriterion("givenumbers like", value, "givenumbers");
            return (Criteria) this;
        }

        public Criteria andGivenumbersNotLike(String value) {
            addCriterion("givenumbers not like", value, "givenumbers");
            return (Criteria) this;
        }

        public Criteria andGivenumbersIn(List<String> values) {
            addCriterion("givenumbers in", values, "givenumbers");
            return (Criteria) this;
        }

        public Criteria andGivenumbersNotIn(List<String> values) {
            addCriterion("givenumbers not in", values, "givenumbers");
            return (Criteria) this;
        }

        public Criteria andGivenumbersBetween(String value1, String value2) {
            addCriterion("givenumbers between", value1, value2, "givenumbers");
            return (Criteria) this;
        }

        public Criteria andGivenumbersNotBetween(String value1, String value2) {
            addCriterion("givenumbers not between", value1, value2, "givenumbers");
            return (Criteria) this;
        }

        public Criteria andGivetimeIsNull() {
            addCriterion("givetime is null");
            return (Criteria) this;
        }

        public Criteria andGivetimeIsNotNull() {
            addCriterion("givetime is not null");
            return (Criteria) this;
        }

        public Criteria andGivetimeEqualTo(Date value) {
            addCriterion("givetime =", value, "givetime");
            return (Criteria) this;
        }

        public Criteria andGivetimeNotEqualTo(Date value) {
            addCriterion("givetime <>", value, "givetime");
            return (Criteria) this;
        }

        public Criteria andGivetimeGreaterThan(Date value) {
            addCriterion("givetime >", value, "givetime");
            return (Criteria) this;
        }

        public Criteria andGivetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("givetime >=", value, "givetime");
            return (Criteria) this;
        }

        public Criteria andGivetimeLessThan(Date value) {
            addCriterion("givetime <", value, "givetime");
            return (Criteria) this;
        }

        public Criteria andGivetimeLessThanOrEqualTo(Date value) {
            addCriterion("givetime <=", value, "givetime");
            return (Criteria) this;
        }

        public Criteria andGivetimeIn(List<Date> values) {
            addCriterion("givetime in", values, "givetime");
            return (Criteria) this;
        }

        public Criteria andGivetimeNotIn(List<Date> values) {
            addCriterion("givetime not in", values, "givetime");
            return (Criteria) this;
        }

        public Criteria andGivetimeBetween(Date value1, Date value2) {
            addCriterion("givetime between", value1, value2, "givetime");
            return (Criteria) this;
        }

        public Criteria andGivetimeNotBetween(Date value1, Date value2) {
            addCriterion("givetime not between", value1, value2, "givetime");
            return (Criteria) this;
        }

        public Criteria andGivepaceIsNull() {
            addCriterion("givepace is null");
            return (Criteria) this;
        }

        public Criteria andGivepaceIsNotNull() {
            addCriterion("givepace is not null");
            return (Criteria) this;
        }

        public Criteria andGivepaceEqualTo(String value) {
            addCriterion("givepace =", value, "givepace");
            return (Criteria) this;
        }

        public Criteria andGivepaceNotEqualTo(String value) {
            addCriterion("givepace <>", value, "givepace");
            return (Criteria) this;
        }

        public Criteria andGivepaceGreaterThan(String value) {
            addCriterion("givepace >", value, "givepace");
            return (Criteria) this;
        }

        public Criteria andGivepaceGreaterThanOrEqualTo(String value) {
            addCriterion("givepace >=", value, "givepace");
            return (Criteria) this;
        }

        public Criteria andGivepaceLessThan(String value) {
            addCriterion("givepace <", value, "givepace");
            return (Criteria) this;
        }

        public Criteria andGivepaceLessThanOrEqualTo(String value) {
            addCriterion("givepace <=", value, "givepace");
            return (Criteria) this;
        }

        public Criteria andGivepaceLike(String value) {
            addCriterion("givepace like", value, "givepace");
            return (Criteria) this;
        }

        public Criteria andGivepaceNotLike(String value) {
            addCriterion("givepace not like", value, "givepace");
            return (Criteria) this;
        }

        public Criteria andGivepaceIn(List<String> values) {
            addCriterion("givepace in", values, "givepace");
            return (Criteria) this;
        }

        public Criteria andGivepaceNotIn(List<String> values) {
            addCriterion("givepace not in", values, "givepace");
            return (Criteria) this;
        }

        public Criteria andGivepaceBetween(String value1, String value2) {
            addCriterion("givepace between", value1, value2, "givepace");
            return (Criteria) this;
        }

        public Criteria andGivepaceNotBetween(String value1, String value2) {
            addCriterion("givepace not between", value1, value2, "givepace");
            return (Criteria) this;
        }

        public Criteria andFlagIsNull() {
            addCriterion("flag is null");
            return (Criteria) this;
        }

        public Criteria andFlagIsNotNull() {
            addCriterion("flag is not null");
            return (Criteria) this;
        }

        public Criteria andFlagEqualTo(Integer value) {
            addCriterion("flag =", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotEqualTo(Integer value) {
            addCriterion("flag <>", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThan(Integer value) {
            addCriterion("flag >", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("flag >=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThan(Integer value) {
            addCriterion("flag <", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThanOrEqualTo(Integer value) {
            addCriterion("flag <=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagIn(List<Integer> values) {
            addCriterion("flag in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotIn(List<Integer> values) {
            addCriterion("flag not in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagBetween(Integer value1, Integer value2) {
            addCriterion("flag between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("flag not between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andBegintimeIsNull() {
            addCriterion("begintime is null");
            return (Criteria) this;
        }

        public Criteria andBegintimeIsNotNull() {
            addCriterion("begintime is not null");
            return (Criteria) this;
        }

        public Criteria andBegintimeEqualTo(Date value) {
            addCriterion("begintime =", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeNotEqualTo(Date value) {
            addCriterion("begintime <>", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeGreaterThan(Date value) {
            addCriterion("begintime >", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeGreaterThanOrEqualTo(Date value) {
            addCriterion("begintime >=", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeLessThan(Date value) {
            addCriterion("begintime <", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeLessThanOrEqualTo(Date value) {
            addCriterion("begintime <=", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeIn(List<Date> values) {
            addCriterion("begintime in", values, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeNotIn(List<Date> values) {
            addCriterion("begintime not in", values, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeBetween(Date value1, Date value2) {
            addCriterion("begintime between", value1, value2, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeNotBetween(Date value1, Date value2) {
            addCriterion("begintime not between", value1, value2, "begintime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNull() {
            addCriterion("endtime is null");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNotNull() {
            addCriterion("endtime is not null");
            return (Criteria) this;
        }

        public Criteria andEndtimeEqualTo(Date value) {
            addCriterion("endtime =", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotEqualTo(Date value) {
            addCriterion("endtime <>", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThan(Date value) {
            addCriterion("endtime >", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("endtime >=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThan(Date value) {
            addCriterion("endtime <", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThanOrEqualTo(Date value) {
            addCriterion("endtime <=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIn(List<Date> values) {
            addCriterion("endtime in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotIn(List<Date> values) {
            addCriterion("endtime not in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeBetween(Date value1, Date value2) {
            addCriterion("endtime between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotBetween(Date value1, Date value2) {
            addCriterion("endtime not between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andGivetime2IsNull() {
            addCriterion("givetime2 is null");
            return (Criteria) this;
        }

        public Criteria andGivetime2IsNotNull() {
            addCriterion("givetime2 is not null");
            return (Criteria) this;
        }

        public Criteria andGivetime2EqualTo(Date value) {
            addCriterion("givetime2 =", value, "givetime2");
            return (Criteria) this;
        }

        public Criteria andGivetime2NotEqualTo(Date value) {
            addCriterion("givetime2 <>", value, "givetime2");
            return (Criteria) this;
        }

        public Criteria andGivetime2GreaterThan(Date value) {
            addCriterion("givetime2 >", value, "givetime2");
            return (Criteria) this;
        }

        public Criteria andGivetime2GreaterThanOrEqualTo(Date value) {
            addCriterion("givetime2 >=", value, "givetime2");
            return (Criteria) this;
        }

        public Criteria andGivetime2LessThan(Date value) {
            addCriterion("givetime2 <", value, "givetime2");
            return (Criteria) this;
        }

        public Criteria andGivetime2LessThanOrEqualTo(Date value) {
            addCriterion("givetime2 <=", value, "givetime2");
            return (Criteria) this;
        }

        public Criteria andGivetime2In(List<Date> values) {
            addCriterion("givetime2 in", values, "givetime2");
            return (Criteria) this;
        }

        public Criteria andGivetime2NotIn(List<Date> values) {
            addCriterion("givetime2 not in", values, "givetime2");
            return (Criteria) this;
        }

        public Criteria andGivetime2Between(Date value1, Date value2) {
            addCriterion("givetime2 between", value1, value2, "givetime2");
            return (Criteria) this;
        }

        public Criteria andGivetime2NotBetween(Date value1, Date value2) {
            addCriterion("givetime2 not between", value1, value2, "givetime2");
            return (Criteria) this;
        }

        public Criteria andGiveplace2IsNull() {
            addCriterion("giveplace2 is null");
            return (Criteria) this;
        }

        public Criteria andGiveplace2IsNotNull() {
            addCriterion("giveplace2 is not null");
            return (Criteria) this;
        }

        public Criteria andGiveplace2EqualTo(String value) {
            addCriterion("giveplace2 =", value, "giveplace2");
            return (Criteria) this;
        }

        public Criteria andGiveplace2NotEqualTo(String value) {
            addCriterion("giveplace2 <>", value, "giveplace2");
            return (Criteria) this;
        }

        public Criteria andGiveplace2GreaterThan(String value) {
            addCriterion("giveplace2 >", value, "giveplace2");
            return (Criteria) this;
        }

        public Criteria andGiveplace2GreaterThanOrEqualTo(String value) {
            addCriterion("giveplace2 >=", value, "giveplace2");
            return (Criteria) this;
        }

        public Criteria andGiveplace2LessThan(String value) {
            addCriterion("giveplace2 <", value, "giveplace2");
            return (Criteria) this;
        }

        public Criteria andGiveplace2LessThanOrEqualTo(String value) {
            addCriterion("giveplace2 <=", value, "giveplace2");
            return (Criteria) this;
        }

        public Criteria andGiveplace2Like(String value) {
            addCriterion("giveplace2 like", value, "giveplace2");
            return (Criteria) this;
        }

        public Criteria andGiveplace2NotLike(String value) {
            addCriterion("giveplace2 not like", value, "giveplace2");
            return (Criteria) this;
        }

        public Criteria andGiveplace2In(List<String> values) {
            addCriterion("giveplace2 in", values, "giveplace2");
            return (Criteria) this;
        }

        public Criteria andGiveplace2NotIn(List<String> values) {
            addCriterion("giveplace2 not in", values, "giveplace2");
            return (Criteria) this;
        }

        public Criteria andGiveplace2Between(String value1, String value2) {
            addCriterion("giveplace2 between", value1, value2, "giveplace2");
            return (Criteria) this;
        }

        public Criteria andGiveplace2NotBetween(String value1, String value2) {
            addCriterion("giveplace2 not between", value1, value2, "giveplace2");
            return (Criteria) this;
        }

        public Criteria andGivetime3IsNull() {
            addCriterion("givetime3 is null");
            return (Criteria) this;
        }

        public Criteria andGivetime3IsNotNull() {
            addCriterion("givetime3 is not null");
            return (Criteria) this;
        }

        public Criteria andGivetime3EqualTo(Date value) {
            addCriterion("givetime3 =", value, "givetime3");
            return (Criteria) this;
        }

        public Criteria andGivetime3NotEqualTo(Date value) {
            addCriterion("givetime3 <>", value, "givetime3");
            return (Criteria) this;
        }

        public Criteria andGivetime3GreaterThan(Date value) {
            addCriterion("givetime3 >", value, "givetime3");
            return (Criteria) this;
        }

        public Criteria andGivetime3GreaterThanOrEqualTo(Date value) {
            addCriterion("givetime3 >=", value, "givetime3");
            return (Criteria) this;
        }

        public Criteria andGivetime3LessThan(Date value) {
            addCriterion("givetime3 <", value, "givetime3");
            return (Criteria) this;
        }

        public Criteria andGivetime3LessThanOrEqualTo(Date value) {
            addCriterion("givetime3 <=", value, "givetime3");
            return (Criteria) this;
        }

        public Criteria andGivetime3In(List<Date> values) {
            addCriterion("givetime3 in", values, "givetime3");
            return (Criteria) this;
        }

        public Criteria andGivetime3NotIn(List<Date> values) {
            addCriterion("givetime3 not in", values, "givetime3");
            return (Criteria) this;
        }

        public Criteria andGivetime3Between(Date value1, Date value2) {
            addCriterion("givetime3 between", value1, value2, "givetime3");
            return (Criteria) this;
        }

        public Criteria andGivetime3NotBetween(Date value1, Date value2) {
            addCriterion("givetime3 not between", value1, value2, "givetime3");
            return (Criteria) this;
        }

        public Criteria andGiveplace3IsNull() {
            addCriterion("giveplace3 is null");
            return (Criteria) this;
        }

        public Criteria andGiveplace3IsNotNull() {
            addCriterion("giveplace3 is not null");
            return (Criteria) this;
        }

        public Criteria andGiveplace3EqualTo(String value) {
            addCriterion("giveplace3 =", value, "giveplace3");
            return (Criteria) this;
        }

        public Criteria andGiveplace3NotEqualTo(String value) {
            addCriterion("giveplace3 <>", value, "giveplace3");
            return (Criteria) this;
        }

        public Criteria andGiveplace3GreaterThan(String value) {
            addCriterion("giveplace3 >", value, "giveplace3");
            return (Criteria) this;
        }

        public Criteria andGiveplace3GreaterThanOrEqualTo(String value) {
            addCriterion("giveplace3 >=", value, "giveplace3");
            return (Criteria) this;
        }

        public Criteria andGiveplace3LessThan(String value) {
            addCriterion("giveplace3 <", value, "giveplace3");
            return (Criteria) this;
        }

        public Criteria andGiveplace3LessThanOrEqualTo(String value) {
            addCriterion("giveplace3 <=", value, "giveplace3");
            return (Criteria) this;
        }

        public Criteria andGiveplace3Like(String value) {
            addCriterion("giveplace3 like", value, "giveplace3");
            return (Criteria) this;
        }

        public Criteria andGiveplace3NotLike(String value) {
            addCriterion("giveplace3 not like", value, "giveplace3");
            return (Criteria) this;
        }

        public Criteria andGiveplace3In(List<String> values) {
            addCriterion("giveplace3 in", values, "giveplace3");
            return (Criteria) this;
        }

        public Criteria andGiveplace3NotIn(List<String> values) {
            addCriterion("giveplace3 not in", values, "giveplace3");
            return (Criteria) this;
        }

        public Criteria andGiveplace3Between(String value1, String value2) {
            addCriterion("giveplace3 between", value1, value2, "giveplace3");
            return (Criteria) this;
        }

        public Criteria andGiveplace3NotBetween(String value1, String value2) {
            addCriterion("giveplace3 not between", value1, value2, "giveplace3");
            return (Criteria) this;
        }

        public Criteria andGivetime4IsNull() {
            addCriterion("givetime4 is null");
            return (Criteria) this;
        }

        public Criteria andGivetime4IsNotNull() {
            addCriterion("givetime4 is not null");
            return (Criteria) this;
        }

        public Criteria andGivetime4EqualTo(Date value) {
            addCriterion("givetime4 =", value, "givetime4");
            return (Criteria) this;
        }

        public Criteria andGivetime4NotEqualTo(Date value) {
            addCriterion("givetime4 <>", value, "givetime4");
            return (Criteria) this;
        }

        public Criteria andGivetime4GreaterThan(Date value) {
            addCriterion("givetime4 >", value, "givetime4");
            return (Criteria) this;
        }

        public Criteria andGivetime4GreaterThanOrEqualTo(Date value) {
            addCriterion("givetime4 >=", value, "givetime4");
            return (Criteria) this;
        }

        public Criteria andGivetime4LessThan(Date value) {
            addCriterion("givetime4 <", value, "givetime4");
            return (Criteria) this;
        }

        public Criteria andGivetime4LessThanOrEqualTo(Date value) {
            addCriterion("givetime4 <=", value, "givetime4");
            return (Criteria) this;
        }

        public Criteria andGivetime4In(List<Date> values) {
            addCriterion("givetime4 in", values, "givetime4");
            return (Criteria) this;
        }

        public Criteria andGivetime4NotIn(List<Date> values) {
            addCriterion("givetime4 not in", values, "givetime4");
            return (Criteria) this;
        }

        public Criteria andGivetime4Between(Date value1, Date value2) {
            addCriterion("givetime4 between", value1, value2, "givetime4");
            return (Criteria) this;
        }

        public Criteria andGivetime4NotBetween(Date value1, Date value2) {
            addCriterion("givetime4 not between", value1, value2, "givetime4");
            return (Criteria) this;
        }

        public Criteria andGiveplace4IsNull() {
            addCriterion("giveplace4 is null");
            return (Criteria) this;
        }

        public Criteria andGiveplace4IsNotNull() {
            addCriterion("giveplace4 is not null");
            return (Criteria) this;
        }

        public Criteria andGiveplace4EqualTo(String value) {
            addCriterion("giveplace4 =", value, "giveplace4");
            return (Criteria) this;
        }

        public Criteria andGiveplace4NotEqualTo(String value) {
            addCriterion("giveplace4 <>", value, "giveplace4");
            return (Criteria) this;
        }

        public Criteria andGiveplace4GreaterThan(String value) {
            addCriterion("giveplace4 >", value, "giveplace4");
            return (Criteria) this;
        }

        public Criteria andGiveplace4GreaterThanOrEqualTo(String value) {
            addCriterion("giveplace4 >=", value, "giveplace4");
            return (Criteria) this;
        }

        public Criteria andGiveplace4LessThan(String value) {
            addCriterion("giveplace4 <", value, "giveplace4");
            return (Criteria) this;
        }

        public Criteria andGiveplace4LessThanOrEqualTo(String value) {
            addCriterion("giveplace4 <=", value, "giveplace4");
            return (Criteria) this;
        }

        public Criteria andGiveplace4Like(String value) {
            addCriterion("giveplace4 like", value, "giveplace4");
            return (Criteria) this;
        }

        public Criteria andGiveplace4NotLike(String value) {
            addCriterion("giveplace4 not like", value, "giveplace4");
            return (Criteria) this;
        }

        public Criteria andGiveplace4In(List<String> values) {
            addCriterion("giveplace4 in", values, "giveplace4");
            return (Criteria) this;
        }

        public Criteria andGiveplace4NotIn(List<String> values) {
            addCriterion("giveplace4 not in", values, "giveplace4");
            return (Criteria) this;
        }

        public Criteria andGiveplace4Between(String value1, String value2) {
            addCriterion("giveplace4 between", value1, value2, "giveplace4");
            return (Criteria) this;
        }

        public Criteria andGiveplace4NotBetween(String value1, String value2) {
            addCriterion("giveplace4 not between", value1, value2, "giveplace4");
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