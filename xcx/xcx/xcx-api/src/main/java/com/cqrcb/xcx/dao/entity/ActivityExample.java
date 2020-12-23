package com.cqrcb.xcx.dao.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ActivityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ActivityExample() {
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

        public Criteria andActIdIsNull() {
            addCriterion("act_id is null");
            return (Criteria) this;
        }

        public Criteria andActIdIsNotNull() {
            addCriterion("act_id is not null");
            return (Criteria) this;
        }

        public Criteria andActIdEqualTo(String value) {
            addCriterion("act_id =", value, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdNotEqualTo(String value) {
            addCriterion("act_id <>", value, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdGreaterThan(String value) {
            addCriterion("act_id >", value, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdGreaterThanOrEqualTo(String value) {
            addCriterion("act_id >=", value, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdLessThan(String value) {
            addCriterion("act_id <", value, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdLessThanOrEqualTo(String value) {
            addCriterion("act_id <=", value, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdLike(String value) {
            addCriterion("act_id like", value, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdNotLike(String value) {
            addCriterion("act_id not like", value, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdIn(List<String> values) {
            addCriterion("act_id in", values, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdNotIn(List<String> values) {
            addCriterion("act_id not in", values, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdBetween(String value1, String value2) {
            addCriterion("act_id between", value1, value2, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdNotBetween(String value1, String value2) {
            addCriterion("act_id not between", value1, value2, "actId");
            return (Criteria) this;
        }

        public Criteria andActNameIsNull() {
            addCriterion("act_name is null");
            return (Criteria) this;
        }

        public Criteria andActNameIsNotNull() {
            addCriterion("act_name is not null");
            return (Criteria) this;
        }

        public Criteria andActNameEqualTo(String value) {
            addCriterion("act_name =", value, "actName");
            return (Criteria) this;
        }

        public Criteria andActNameNotEqualTo(String value) {
            addCriterion("act_name <>", value, "actName");
            return (Criteria) this;
        }

        public Criteria andActNameGreaterThan(String value) {
            addCriterion("act_name >", value, "actName");
            return (Criteria) this;
        }

        public Criteria andActNameGreaterThanOrEqualTo(String value) {
            addCriterion("act_name >=", value, "actName");
            return (Criteria) this;
        }

        public Criteria andActNameLessThan(String value) {
            addCriterion("act_name <", value, "actName");
            return (Criteria) this;
        }

        public Criteria andActNameLessThanOrEqualTo(String value) {
            addCriterion("act_name <=", value, "actName");
            return (Criteria) this;
        }

        public Criteria andActNameLike(String value) {
            addCriterion("act_name like", value, "actName");
            return (Criteria) this;
        }

        public Criteria andActNameNotLike(String value) {
            addCriterion("act_name not like", value, "actName");
            return (Criteria) this;
        }

        public Criteria andActNameIn(List<String> values) {
            addCriterion("act_name in", values, "actName");
            return (Criteria) this;
        }

        public Criteria andActNameNotIn(List<String> values) {
            addCriterion("act_name not in", values, "actName");
            return (Criteria) this;
        }

        public Criteria andActNameBetween(String value1, String value2) {
            addCriterion("act_name between", value1, value2, "actName");
            return (Criteria) this;
        }

        public Criteria andActNameNotBetween(String value1, String value2) {
            addCriterion("act_name not between", value1, value2, "actName");
            return (Criteria) this;
        }

        public Criteria andActBeginTimeIsNull() {
            addCriterion("act_begin_time is null");
            return (Criteria) this;
        }

        public Criteria andActBeginTimeIsNotNull() {
            addCriterion("act_begin_time is not null");
            return (Criteria) this;
        }

        public Criteria andActBeginTimeEqualTo(Date value) {
            addCriterion("act_begin_time =", value, "actBeginTime");
            return (Criteria) this;
        }

        public Criteria andActBeginTimeNotEqualTo(Date value) {
            addCriterion("act_begin_time <>", value, "actBeginTime");
            return (Criteria) this;
        }

        public Criteria andActBeginTimeGreaterThan(Date value) {
            addCriterion("act_begin_time >", value, "actBeginTime");
            return (Criteria) this;
        }

        public Criteria andActBeginTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("act_begin_time >=", value, "actBeginTime");
            return (Criteria) this;
        }

        public Criteria andActBeginTimeLessThan(Date value) {
            addCriterion("act_begin_time <", value, "actBeginTime");
            return (Criteria) this;
        }

        public Criteria andActBeginTimeLessThanOrEqualTo(Date value) {
            addCriterion("act_begin_time <=", value, "actBeginTime");
            return (Criteria) this;
        }

        public Criteria andActBeginTimeIn(List<Date> values) {
            addCriterion("act_begin_time in", values, "actBeginTime");
            return (Criteria) this;
        }

        public Criteria andActBeginTimeNotIn(List<Date> values) {
            addCriterion("act_begin_time not in", values, "actBeginTime");
            return (Criteria) this;
        }

        public Criteria andActBeginTimeBetween(Date value1, Date value2) {
            addCriterion("act_begin_time between", value1, value2, "actBeginTime");
            return (Criteria) this;
        }

        public Criteria andActBeginTimeNotBetween(Date value1, Date value2) {
            addCriterion("act_begin_time not between", value1, value2, "actBeginTime");
            return (Criteria) this;
        }

        public Criteria andActEndTimeIsNull() {
            addCriterion("act_end_time is null");
            return (Criteria) this;
        }

        public Criteria andActEndTimeIsNotNull() {
            addCriterion("act_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andActEndTimeEqualTo(Date value) {
            addCriterion("act_end_time =", value, "actEndTime");
            return (Criteria) this;
        }

        public Criteria andActEndTimeNotEqualTo(Date value) {
            addCriterion("act_end_time <>", value, "actEndTime");
            return (Criteria) this;
        }

        public Criteria andActEndTimeGreaterThan(Date value) {
            addCriterion("act_end_time >", value, "actEndTime");
            return (Criteria) this;
        }

        public Criteria andActEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("act_end_time >=", value, "actEndTime");
            return (Criteria) this;
        }

        public Criteria andActEndTimeLessThan(Date value) {
            addCriterion("act_end_time <", value, "actEndTime");
            return (Criteria) this;
        }

        public Criteria andActEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("act_end_time <=", value, "actEndTime");
            return (Criteria) this;
        }

        public Criteria andActEndTimeIn(List<Date> values) {
            addCriterion("act_end_time in", values, "actEndTime");
            return (Criteria) this;
        }

        public Criteria andActEndTimeNotIn(List<Date> values) {
            addCriterion("act_end_time not in", values, "actEndTime");
            return (Criteria) this;
        }

        public Criteria andActEndTimeBetween(Date value1, Date value2) {
            addCriterion("act_end_time between", value1, value2, "actEndTime");
            return (Criteria) this;
        }

        public Criteria andActEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("act_end_time not between", value1, value2, "actEndTime");
            return (Criteria) this;
        }

        public Criteria andActStatusIsNull() {
            addCriterion("act_status is null");
            return (Criteria) this;
        }

        public Criteria andActStatusIsNotNull() {
            addCriterion("act_status is not null");
            return (Criteria) this;
        }

        public Criteria andActStatusEqualTo(String value) {
            addCriterion("act_status =", value, "actStatus");
            return (Criteria) this;
        }

        public Criteria andActStatusNotEqualTo(String value) {
            addCriterion("act_status <>", value, "actStatus");
            return (Criteria) this;
        }

        public Criteria andActStatusGreaterThan(String value) {
            addCriterion("act_status >", value, "actStatus");
            return (Criteria) this;
        }

        public Criteria andActStatusGreaterThanOrEqualTo(String value) {
            addCriterion("act_status >=", value, "actStatus");
            return (Criteria) this;
        }

        public Criteria andActStatusLessThan(String value) {
            addCriterion("act_status <", value, "actStatus");
            return (Criteria) this;
        }

        public Criteria andActStatusLessThanOrEqualTo(String value) {
            addCriterion("act_status <=", value, "actStatus");
            return (Criteria) this;
        }

        public Criteria andActStatusLike(String value) {
            addCriterion("act_status like", value, "actStatus");
            return (Criteria) this;
        }

        public Criteria andActStatusNotLike(String value) {
            addCriterion("act_status not like", value, "actStatus");
            return (Criteria) this;
        }

        public Criteria andActStatusIn(List<String> values) {
            addCriterion("act_status in", values, "actStatus");
            return (Criteria) this;
        }

        public Criteria andActStatusNotIn(List<String> values) {
            addCriterion("act_status not in", values, "actStatus");
            return (Criteria) this;
        }

        public Criteria andActStatusBetween(String value1, String value2) {
            addCriterion("act_status between", value1, value2, "actStatus");
            return (Criteria) this;
        }

        public Criteria andActStatusNotBetween(String value1, String value2) {
            addCriterion("act_status not between", value1, value2, "actStatus");
            return (Criteria) this;
        }

        public Criteria andRpAmountIsNull() {
            addCriterion("rp_amount is null");
            return (Criteria) this;
        }

        public Criteria andRpAmountIsNotNull() {
            addCriterion("rp_amount is not null");
            return (Criteria) this;
        }

        public Criteria andRpAmountEqualTo(String value) {
            addCriterion("rp_amount =", value, "rpAmount");
            return (Criteria) this;
        }

        public Criteria andRpAmountNotEqualTo(String value) {
            addCriterion("rp_amount <>", value, "rpAmount");
            return (Criteria) this;
        }

        public Criteria andRpAmountGreaterThan(String value) {
            addCriterion("rp_amount >", value, "rpAmount");
            return (Criteria) this;
        }

        public Criteria andRpAmountGreaterThanOrEqualTo(String value) {
            addCriterion("rp_amount >=", value, "rpAmount");
            return (Criteria) this;
        }

        public Criteria andRpAmountLessThan(String value) {
            addCriterion("rp_amount <", value, "rpAmount");
            return (Criteria) this;
        }

        public Criteria andRpAmountLessThanOrEqualTo(String value) {
            addCriterion("rp_amount <=", value, "rpAmount");
            return (Criteria) this;
        }

        public Criteria andRpAmountLike(String value) {
            addCriterion("rp_amount like", value, "rpAmount");
            return (Criteria) this;
        }

        public Criteria andRpAmountNotLike(String value) {
            addCriterion("rp_amount not like", value, "rpAmount");
            return (Criteria) this;
        }

        public Criteria andRpAmountIn(List<String> values) {
            addCriterion("rp_amount in", values, "rpAmount");
            return (Criteria) this;
        }

        public Criteria andRpAmountNotIn(List<String> values) {
            addCriterion("rp_amount not in", values, "rpAmount");
            return (Criteria) this;
        }

        public Criteria andRpAmountBetween(String value1, String value2) {
            addCriterion("rp_amount between", value1, value2, "rpAmount");
            return (Criteria) this;
        }

        public Criteria andRpAmountNotBetween(String value1, String value2) {
            addCriterion("rp_amount not between", value1, value2, "rpAmount");
            return (Criteria) this;
        }

        public Criteria andRpIntegralIsNull() {
            addCriterion("rp_integral is null");
            return (Criteria) this;
        }

        public Criteria andRpIntegralIsNotNull() {
            addCriterion("rp_integral is not null");
            return (Criteria) this;
        }

        public Criteria andRpIntegralEqualTo(String value) {
            addCriterion("rp_integral =", value, "rpIntegral");
            return (Criteria) this;
        }

        public Criteria andRpIntegralNotEqualTo(String value) {
            addCriterion("rp_integral <>", value, "rpIntegral");
            return (Criteria) this;
        }

        public Criteria andRpIntegralGreaterThan(String value) {
            addCriterion("rp_integral >", value, "rpIntegral");
            return (Criteria) this;
        }

        public Criteria andRpIntegralGreaterThanOrEqualTo(String value) {
            addCriterion("rp_integral >=", value, "rpIntegral");
            return (Criteria) this;
        }

        public Criteria andRpIntegralLessThan(String value) {
            addCriterion("rp_integral <", value, "rpIntegral");
            return (Criteria) this;
        }

        public Criteria andRpIntegralLessThanOrEqualTo(String value) {
            addCriterion("rp_integral <=", value, "rpIntegral");
            return (Criteria) this;
        }

        public Criteria andRpIntegralLike(String value) {
            addCriterion("rp_integral like", value, "rpIntegral");
            return (Criteria) this;
        }

        public Criteria andRpIntegralNotLike(String value) {
            addCriterion("rp_integral not like", value, "rpIntegral");
            return (Criteria) this;
        }

        public Criteria andRpIntegralIn(List<String> values) {
            addCriterion("rp_integral in", values, "rpIntegral");
            return (Criteria) this;
        }

        public Criteria andRpIntegralNotIn(List<String> values) {
            addCriterion("rp_integral not in", values, "rpIntegral");
            return (Criteria) this;
        }

        public Criteria andRpIntegralBetween(String value1, String value2) {
            addCriterion("rp_integral between", value1, value2, "rpIntegral");
            return (Criteria) this;
        }

        public Criteria andRpIntegralNotBetween(String value1, String value2) {
            addCriterion("rp_integral not between", value1, value2, "rpIntegral");
            return (Criteria) this;
        }

        public Criteria andActTypeIsNull() {
            addCriterion("act_type is null");
            return (Criteria) this;
        }

        public Criteria andActTypeIsNotNull() {
            addCriterion("act_type is not null");
            return (Criteria) this;
        }

        public Criteria andActTypeEqualTo(String value) {
            addCriterion("act_type =", value, "actType");
            return (Criteria) this;
        }

        public Criteria andActTypeNotEqualTo(String value) {
            addCriterion("act_type <>", value, "actType");
            return (Criteria) this;
        }

        public Criteria andActTypeGreaterThan(String value) {
            addCriterion("act_type >", value, "actType");
            return (Criteria) this;
        }

        public Criteria andActTypeGreaterThanOrEqualTo(String value) {
            addCriterion("act_type >=", value, "actType");
            return (Criteria) this;
        }

        public Criteria andActTypeLessThan(String value) {
            addCriterion("act_type <", value, "actType");
            return (Criteria) this;
        }

        public Criteria andActTypeLessThanOrEqualTo(String value) {
            addCriterion("act_type <=", value, "actType");
            return (Criteria) this;
        }

        public Criteria andActTypeLike(String value) {
            addCriterion("act_type like", value, "actType");
            return (Criteria) this;
        }

        public Criteria andActTypeNotLike(String value) {
            addCriterion("act_type not like", value, "actType");
            return (Criteria) this;
        }

        public Criteria andActTypeIn(List<String> values) {
            addCriterion("act_type in", values, "actType");
            return (Criteria) this;
        }

        public Criteria andActTypeNotIn(List<String> values) {
            addCriterion("act_type not in", values, "actType");
            return (Criteria) this;
        }

        public Criteria andActTypeBetween(String value1, String value2) {
            addCriterion("act_type between", value1, value2, "actType");
            return (Criteria) this;
        }

        public Criteria andActTypeNotBetween(String value1, String value2) {
            addCriterion("act_type not between", value1, value2, "actType");
            return (Criteria) this;
        }

        public Criteria andActPeriodIsNull() {
            addCriterion("act_period is null");
            return (Criteria) this;
        }

        public Criteria andActPeriodIsNotNull() {
            addCriterion("act_period is not null");
            return (Criteria) this;
        }

        public Criteria andActPeriodEqualTo(String value) {
            addCriterion("act_period =", value, "actPeriod");
            return (Criteria) this;
        }

        public Criteria andActPeriodNotEqualTo(String value) {
            addCriterion("act_period <>", value, "actPeriod");
            return (Criteria) this;
        }

        public Criteria andActPeriodGreaterThan(String value) {
            addCriterion("act_period >", value, "actPeriod");
            return (Criteria) this;
        }

        public Criteria andActPeriodGreaterThanOrEqualTo(String value) {
            addCriterion("act_period >=", value, "actPeriod");
            return (Criteria) this;
        }

        public Criteria andActPeriodLessThan(String value) {
            addCriterion("act_period <", value, "actPeriod");
            return (Criteria) this;
        }

        public Criteria andActPeriodLessThanOrEqualTo(String value) {
            addCriterion("act_period <=", value, "actPeriod");
            return (Criteria) this;
        }

        public Criteria andActPeriodLike(String value) {
            addCriterion("act_period like", value, "actPeriod");
            return (Criteria) this;
        }

        public Criteria andActPeriodNotLike(String value) {
            addCriterion("act_period not like", value, "actPeriod");
            return (Criteria) this;
        }

        public Criteria andActPeriodIn(List<String> values) {
            addCriterion("act_period in", values, "actPeriod");
            return (Criteria) this;
        }

        public Criteria andActPeriodNotIn(List<String> values) {
            addCriterion("act_period not in", values, "actPeriod");
            return (Criteria) this;
        }

        public Criteria andActPeriodBetween(String value1, String value2) {
            addCriterion("act_period between", value1, value2, "actPeriod");
            return (Criteria) this;
        }

        public Criteria andActPeriodNotBetween(String value1, String value2) {
            addCriterion("act_period not between", value1, value2, "actPeriod");
            return (Criteria) this;
        }

        public Criteria andLimitNumIsNull() {
            addCriterion("limit_num is null");
            return (Criteria) this;
        }

        public Criteria andLimitNumIsNotNull() {
            addCriterion("limit_num is not null");
            return (Criteria) this;
        }

        public Criteria andLimitNumEqualTo(String value) {
            addCriterion("limit_num =", value, "limitNum");
            return (Criteria) this;
        }

        public Criteria andLimitNumNotEqualTo(String value) {
            addCriterion("limit_num <>", value, "limitNum");
            return (Criteria) this;
        }

        public Criteria andLimitNumGreaterThan(String value) {
            addCriterion("limit_num >", value, "limitNum");
            return (Criteria) this;
        }

        public Criteria andLimitNumGreaterThanOrEqualTo(String value) {
            addCriterion("limit_num >=", value, "limitNum");
            return (Criteria) this;
        }

        public Criteria andLimitNumLessThan(String value) {
            addCriterion("limit_num <", value, "limitNum");
            return (Criteria) this;
        }

        public Criteria andLimitNumLessThanOrEqualTo(String value) {
            addCriterion("limit_num <=", value, "limitNum");
            return (Criteria) this;
        }

        public Criteria andLimitNumLike(String value) {
            addCriterion("limit_num like", value, "limitNum");
            return (Criteria) this;
        }

        public Criteria andLimitNumNotLike(String value) {
            addCriterion("limit_num not like", value, "limitNum");
            return (Criteria) this;
        }

        public Criteria andLimitNumIn(List<String> values) {
            addCriterion("limit_num in", values, "limitNum");
            return (Criteria) this;
        }

        public Criteria andLimitNumNotIn(List<String> values) {
            addCriterion("limit_num not in", values, "limitNum");
            return (Criteria) this;
        }

        public Criteria andLimitNumBetween(String value1, String value2) {
            addCriterion("limit_num between", value1, value2, "limitNum");
            return (Criteria) this;
        }

        public Criteria andLimitNumNotBetween(String value1, String value2) {
            addCriterion("limit_num not between", value1, value2, "limitNum");
            return (Criteria) this;
        }

        public Criteria andLimitTypeIsNull() {
            addCriterion("limit_type is null");
            return (Criteria) this;
        }

        public Criteria andLimitTypeIsNotNull() {
            addCriterion("limit_type is not null");
            return (Criteria) this;
        }

        public Criteria andLimitTypeEqualTo(String value) {
            addCriterion("limit_type =", value, "limitType");
            return (Criteria) this;
        }

        public Criteria andLimitTypeNotEqualTo(String value) {
            addCriterion("limit_type <>", value, "limitType");
            return (Criteria) this;
        }

        public Criteria andLimitTypeGreaterThan(String value) {
            addCriterion("limit_type >", value, "limitType");
            return (Criteria) this;
        }

        public Criteria andLimitTypeGreaterThanOrEqualTo(String value) {
            addCriterion("limit_type >=", value, "limitType");
            return (Criteria) this;
        }

        public Criteria andLimitTypeLessThan(String value) {
            addCriterion("limit_type <", value, "limitType");
            return (Criteria) this;
        }

        public Criteria andLimitTypeLessThanOrEqualTo(String value) {
            addCriterion("limit_type <=", value, "limitType");
            return (Criteria) this;
        }

        public Criteria andLimitTypeLike(String value) {
            addCriterion("limit_type like", value, "limitType");
            return (Criteria) this;
        }

        public Criteria andLimitTypeNotLike(String value) {
            addCriterion("limit_type not like", value, "limitType");
            return (Criteria) this;
        }

        public Criteria andLimitTypeIn(List<String> values) {
            addCriterion("limit_type in", values, "limitType");
            return (Criteria) this;
        }

        public Criteria andLimitTypeNotIn(List<String> values) {
            addCriterion("limit_type not in", values, "limitType");
            return (Criteria) this;
        }

        public Criteria andLimitTypeBetween(String value1, String value2) {
            addCriterion("limit_type between", value1, value2, "limitType");
            return (Criteria) this;
        }

        public Criteria andLimitTypeNotBetween(String value1, String value2) {
            addCriterion("limit_type not between", value1, value2, "limitType");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNull() {
            addCriterion("create_by is null");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNotNull() {
            addCriterion("create_by is not null");
            return (Criteria) this;
        }

        public Criteria andCreateByEqualTo(String value) {
            addCriterion("create_by =", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotEqualTo(String value) {
            addCriterion("create_by <>", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThan(String value) {
            addCriterion("create_by >", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThanOrEqualTo(String value) {
            addCriterion("create_by >=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThan(String value) {
            addCriterion("create_by <", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThanOrEqualTo(String value) {
            addCriterion("create_by <=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLike(String value) {
            addCriterion("create_by like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotLike(String value) {
            addCriterion("create_by not like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByIn(List<String> values) {
            addCriterion("create_by in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotIn(List<String> values) {
            addCriterion("create_by not in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByBetween(String value1, String value2) {
            addCriterion("create_by between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotBetween(String value1, String value2) {
            addCriterion("create_by not between", value1, value2, "createBy");
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

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andModifyByIsNull() {
            addCriterion("modify_by is null");
            return (Criteria) this;
        }

        public Criteria andModifyByIsNotNull() {
            addCriterion("modify_by is not null");
            return (Criteria) this;
        }

        public Criteria andModifyByEqualTo(String value) {
            addCriterion("modify_by =", value, "modifyBy");
            return (Criteria) this;
        }

        public Criteria andModifyByNotEqualTo(String value) {
            addCriterion("modify_by <>", value, "modifyBy");
            return (Criteria) this;
        }

        public Criteria andModifyByGreaterThan(String value) {
            addCriterion("modify_by >", value, "modifyBy");
            return (Criteria) this;
        }

        public Criteria andModifyByGreaterThanOrEqualTo(String value) {
            addCriterion("modify_by >=", value, "modifyBy");
            return (Criteria) this;
        }

        public Criteria andModifyByLessThan(String value) {
            addCriterion("modify_by <", value, "modifyBy");
            return (Criteria) this;
        }

        public Criteria andModifyByLessThanOrEqualTo(String value) {
            addCriterion("modify_by <=", value, "modifyBy");
            return (Criteria) this;
        }

        public Criteria andModifyByLike(String value) {
            addCriterion("modify_by like", value, "modifyBy");
            return (Criteria) this;
        }

        public Criteria andModifyByNotLike(String value) {
            addCriterion("modify_by not like", value, "modifyBy");
            return (Criteria) this;
        }

        public Criteria andModifyByIn(List<String> values) {
            addCriterion("modify_by in", values, "modifyBy");
            return (Criteria) this;
        }

        public Criteria andModifyByNotIn(List<String> values) {
            addCriterion("modify_by not in", values, "modifyBy");
            return (Criteria) this;
        }

        public Criteria andModifyByBetween(String value1, String value2) {
            addCriterion("modify_by between", value1, value2, "modifyBy");
            return (Criteria) this;
        }

        public Criteria andModifyByNotBetween(String value1, String value2) {
            addCriterion("modify_by not between", value1, value2, "modifyBy");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNull() {
            addCriterion("modify_time is null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNotNull() {
            addCriterion("modify_time is not null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeEqualTo(Date value) {
            addCriterion("modify_time =", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotEqualTo(Date value) {
            addCriterion("modify_time <>", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThan(Date value) {
            addCriterion("modify_time >", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("modify_time >=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThan(Date value) {
            addCriterion("modify_time <", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("modify_time <=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIn(List<Date> values) {
            addCriterion("modify_time in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotIn(List<Date> values) {
            addCriterion("modify_time not in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeBetween(Date value1, Date value2) {
            addCriterion("modify_time between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("modify_time not between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeIsNull() {
            addCriterion("release_time is null");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeIsNotNull() {
            addCriterion("release_time is not null");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeEqualTo(Date value) {
            addCriterion("release_time =", value, "releaseTime");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeNotEqualTo(Date value) {
            addCriterion("release_time <>", value, "releaseTime");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeGreaterThan(Date value) {
            addCriterion("release_time >", value, "releaseTime");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("release_time >=", value, "releaseTime");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeLessThan(Date value) {
            addCriterion("release_time <", value, "releaseTime");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeLessThanOrEqualTo(Date value) {
            addCriterion("release_time <=", value, "releaseTime");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeIn(List<Date> values) {
            addCriterion("release_time in", values, "releaseTime");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeNotIn(List<Date> values) {
            addCriterion("release_time not in", values, "releaseTime");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeBetween(Date value1, Date value2) {
            addCriterion("release_time between", value1, value2, "releaseTime");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeNotBetween(Date value1, Date value2) {
            addCriterion("release_time not between", value1, value2, "releaseTime");
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

        public Criteria andIsDeleteIsNull() {
            addCriterion("is_delete is null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNotNull() {
            addCriterion("is_delete is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteEqualTo(String value) {
            addCriterion("is_delete =", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotEqualTo(String value) {
            addCriterion("is_delete <>", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThan(String value) {
            addCriterion("is_delete >", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThanOrEqualTo(String value) {
            addCriterion("is_delete >=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThan(String value) {
            addCriterion("is_delete <", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThanOrEqualTo(String value) {
            addCriterion("is_delete <=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLike(String value) {
            addCriterion("is_delete like", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotLike(String value) {
            addCriterion("is_delete not like", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIn(List<String> values) {
            addCriterion("is_delete in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotIn(List<String> values) {
            addCriterion("is_delete not in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteBetween(String value1, String value2) {
            addCriterion("is_delete between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotBetween(String value1, String value2) {
            addCriterion("is_delete not between", value1, value2, "isDelete");
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