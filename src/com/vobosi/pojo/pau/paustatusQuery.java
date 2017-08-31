package com.vobosi.pojo.pau;

import java.util.ArrayList;
import java.util.List;

public class paustatusQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer pageNo = 1;

    protected Integer startRow;

    protected Integer pageSize = 10;

    protected String fields;

    public paustatusQuery() {
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

    public void setPageNo(Integer pageNo) {
        this.pageNo=pageNo;
        this.startRow = (pageNo-1)*this.pageSize;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setStartRow(Integer startRow) {
        this.startRow=startRow;
    }

    public Integer getStartRow() {
        return startRow;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize=pageSize;
        this.startRow = (pageNo-1)*this.pageSize;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setFields(String fields) {
        this.fields=fields;
    }

    public String getFields() {
        return fields;
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

        public Criteria andStimeIsNull() {
            addCriterion("stime is null");
            return (Criteria) this;
        }

        public Criteria andStimeIsNotNull() {
            addCriterion("stime is not null");
            return (Criteria) this;
        }

        public Criteria andStimeEqualTo(Integer value) {
            addCriterion("stime =", value, "stime");
            return (Criteria) this;
        }

        public Criteria andStimeNotEqualTo(Integer value) {
            addCriterion("stime <>", value, "stime");
            return (Criteria) this;
        }

        public Criteria andStimeGreaterThan(Integer value) {
            addCriterion("stime >", value, "stime");
            return (Criteria) this;
        }

        public Criteria andStimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("stime >=", value, "stime");
            return (Criteria) this;
        }

        public Criteria andStimeLessThan(Integer value) {
            addCriterion("stime <", value, "stime");
            return (Criteria) this;
        }

        public Criteria andStimeLessThanOrEqualTo(Integer value) {
            addCriterion("stime <=", value, "stime");
            return (Criteria) this;
        }

        public Criteria andStimeIn(List<Integer> values) {
            addCriterion("stime in", values, "stime");
            return (Criteria) this;
        }

        public Criteria andStimeNotIn(List<Integer> values) {
            addCriterion("stime not in", values, "stime");
            return (Criteria) this;
        }

        public Criteria andStimeBetween(Integer value1, Integer value2) {
            addCriterion("stime between", value1, value2, "stime");
            return (Criteria) this;
        }

        public Criteria andStimeNotBetween(Integer value1, Integer value2) {
            addCriterion("stime not between", value1, value2, "stime");
            return (Criteria) this;
        }

        public Criteria andTemns1IsNull() {
            addCriterion("temns1 is null");
            return (Criteria) this;
        }

        public Criteria andTemns1IsNotNull() {
            addCriterion("temns1 is not null");
            return (Criteria) this;
        }

        public Criteria andTemns1EqualTo(Integer value) {
            addCriterion("temns1 =", value, "temns1");
            return (Criteria) this;
        }

        public Criteria andTemns1NotEqualTo(Integer value) {
            addCriterion("temns1 <>", value, "temns1");
            return (Criteria) this;
        }

        public Criteria andTemns1GreaterThan(Integer value) {
            addCriterion("temns1 >", value, "temns1");
            return (Criteria) this;
        }

        public Criteria andTemns1GreaterThanOrEqualTo(Integer value) {
            addCriterion("temns1 >=", value, "temns1");
            return (Criteria) this;
        }

        public Criteria andTemns1LessThan(Integer value) {
            addCriterion("temns1 <", value, "temns1");
            return (Criteria) this;
        }

        public Criteria andTemns1LessThanOrEqualTo(Integer value) {
            addCriterion("temns1 <=", value, "temns1");
            return (Criteria) this;
        }

        public Criteria andTemns1In(List<Integer> values) {
            addCriterion("temns1 in", values, "temns1");
            return (Criteria) this;
        }

        public Criteria andTemns1NotIn(List<Integer> values) {
            addCriterion("temns1 not in", values, "temns1");
            return (Criteria) this;
        }

        public Criteria andTemns1Between(Integer value1, Integer value2) {
            addCriterion("temns1 between", value1, value2, "temns1");
            return (Criteria) this;
        }

        public Criteria andTemns1NotBetween(Integer value1, Integer value2) {
            addCriterion("temns1 not between", value1, value2, "temns1");
            return (Criteria) this;
        }

        public Criteria andTemns2IsNull() {
            addCriterion("temns2 is null");
            return (Criteria) this;
        }

        public Criteria andTemns2IsNotNull() {
            addCriterion("temns2 is not null");
            return (Criteria) this;
        }

        public Criteria andTemns2EqualTo(Integer value) {
            addCriterion("temns2 =", value, "temns2");
            return (Criteria) this;
        }

        public Criteria andTemns2NotEqualTo(Integer value) {
            addCriterion("temns2 <>", value, "temns2");
            return (Criteria) this;
        }

        public Criteria andTemns2GreaterThan(Integer value) {
            addCriterion("temns2 >", value, "temns2");
            return (Criteria) this;
        }

        public Criteria andTemns2GreaterThanOrEqualTo(Integer value) {
            addCriterion("temns2 >=", value, "temns2");
            return (Criteria) this;
        }

        public Criteria andTemns2LessThan(Integer value) {
            addCriterion("temns2 <", value, "temns2");
            return (Criteria) this;
        }

        public Criteria andTemns2LessThanOrEqualTo(Integer value) {
            addCriterion("temns2 <=", value, "temns2");
            return (Criteria) this;
        }

        public Criteria andTemns2In(List<Integer> values) {
            addCriterion("temns2 in", values, "temns2");
            return (Criteria) this;
        }

        public Criteria andTemns2NotIn(List<Integer> values) {
            addCriterion("temns2 not in", values, "temns2");
            return (Criteria) this;
        }

        public Criteria andTemns2Between(Integer value1, Integer value2) {
            addCriterion("temns2 between", value1, value2, "temns2");
            return (Criteria) this;
        }

        public Criteria andTemns2NotBetween(Integer value1, Integer value2) {
            addCriterion("temns2 not between", value1, value2, "temns2");
            return (Criteria) this;
        }

        public Criteria andTemns3IsNull() {
            addCriterion("temns3 is null");
            return (Criteria) this;
        }

        public Criteria andTemns3IsNotNull() {
            addCriterion("temns3 is not null");
            return (Criteria) this;
        }

        public Criteria andTemns3EqualTo(Integer value) {
            addCriterion("temns3 =", value, "temns3");
            return (Criteria) this;
        }

        public Criteria andTemns3NotEqualTo(Integer value) {
            addCriterion("temns3 <>", value, "temns3");
            return (Criteria) this;
        }

        public Criteria andTemns3GreaterThan(Integer value) {
            addCriterion("temns3 >", value, "temns3");
            return (Criteria) this;
        }

        public Criteria andTemns3GreaterThanOrEqualTo(Integer value) {
            addCriterion("temns3 >=", value, "temns3");
            return (Criteria) this;
        }

        public Criteria andTemns3LessThan(Integer value) {
            addCriterion("temns3 <", value, "temns3");
            return (Criteria) this;
        }

        public Criteria andTemns3LessThanOrEqualTo(Integer value) {
            addCriterion("temns3 <=", value, "temns3");
            return (Criteria) this;
        }

        public Criteria andTemns3In(List<Integer> values) {
            addCriterion("temns3 in", values, "temns3");
            return (Criteria) this;
        }

        public Criteria andTemns3NotIn(List<Integer> values) {
            addCriterion("temns3 not in", values, "temns3");
            return (Criteria) this;
        }

        public Criteria andTemns3Between(Integer value1, Integer value2) {
            addCriterion("temns3 between", value1, value2, "temns3");
            return (Criteria) this;
        }

        public Criteria andTemns3NotBetween(Integer value1, Integer value2) {
            addCriterion("temns3 not between", value1, value2, "temns3");
            return (Criteria) this;
        }

        public Criteria andHumns1IsNull() {
            addCriterion("humns1 is null");
            return (Criteria) this;
        }

        public Criteria andHumns1IsNotNull() {
            addCriterion("humns1 is not null");
            return (Criteria) this;
        }

        public Criteria andHumns1EqualTo(Integer value) {
            addCriterion("humns1 =", value, "humns1");
            return (Criteria) this;
        }

        public Criteria andHumns1NotEqualTo(Integer value) {
            addCriterion("humns1 <>", value, "humns1");
            return (Criteria) this;
        }

        public Criteria andHumns1GreaterThan(Integer value) {
            addCriterion("humns1 >", value, "humns1");
            return (Criteria) this;
        }

        public Criteria andHumns1GreaterThanOrEqualTo(Integer value) {
            addCriterion("humns1 >=", value, "humns1");
            return (Criteria) this;
        }

        public Criteria andHumns1LessThan(Integer value) {
            addCriterion("humns1 <", value, "humns1");
            return (Criteria) this;
        }

        public Criteria andHumns1LessThanOrEqualTo(Integer value) {
            addCriterion("humns1 <=", value, "humns1");
            return (Criteria) this;
        }

        public Criteria andHumns1In(List<Integer> values) {
            addCriterion("humns1 in", values, "humns1");
            return (Criteria) this;
        }

        public Criteria andHumns1NotIn(List<Integer> values) {
            addCriterion("humns1 not in", values, "humns1");
            return (Criteria) this;
        }

        public Criteria andHumns1Between(Integer value1, Integer value2) {
            addCriterion("humns1 between", value1, value2, "humns1");
            return (Criteria) this;
        }

        public Criteria andHumns1NotBetween(Integer value1, Integer value2) {
            addCriterion("humns1 not between", value1, value2, "humns1");
            return (Criteria) this;
        }

        public Criteria andHumns2IsNull() {
            addCriterion("humns2 is null");
            return (Criteria) this;
        }

        public Criteria andHumns2IsNotNull() {
            addCriterion("humns2 is not null");
            return (Criteria) this;
        }

        public Criteria andHumns2EqualTo(Integer value) {
            addCriterion("humns2 =", value, "humns2");
            return (Criteria) this;
        }

        public Criteria andHumns2NotEqualTo(Integer value) {
            addCriterion("humns2 <>", value, "humns2");
            return (Criteria) this;
        }

        public Criteria andHumns2GreaterThan(Integer value) {
            addCriterion("humns2 >", value, "humns2");
            return (Criteria) this;
        }

        public Criteria andHumns2GreaterThanOrEqualTo(Integer value) {
            addCriterion("humns2 >=", value, "humns2");
            return (Criteria) this;
        }

        public Criteria andHumns2LessThan(Integer value) {
            addCriterion("humns2 <", value, "humns2");
            return (Criteria) this;
        }

        public Criteria andHumns2LessThanOrEqualTo(Integer value) {
            addCriterion("humns2 <=", value, "humns2");
            return (Criteria) this;
        }

        public Criteria andHumns2In(List<Integer> values) {
            addCriterion("humns2 in", values, "humns2");
            return (Criteria) this;
        }

        public Criteria andHumns2NotIn(List<Integer> values) {
            addCriterion("humns2 not in", values, "humns2");
            return (Criteria) this;
        }

        public Criteria andHumns2Between(Integer value1, Integer value2) {
            addCriterion("humns2 between", value1, value2, "humns2");
            return (Criteria) this;
        }

        public Criteria andHumns2NotBetween(Integer value1, Integer value2) {
            addCriterion("humns2 not between", value1, value2, "humns2");
            return (Criteria) this;
        }

        public Criteria andHumns3IsNull() {
            addCriterion("humns3 is null");
            return (Criteria) this;
        }

        public Criteria andHumns3IsNotNull() {
            addCriterion("humns3 is not null");
            return (Criteria) this;
        }

        public Criteria andHumns3EqualTo(Integer value) {
            addCriterion("humns3 =", value, "humns3");
            return (Criteria) this;
        }

        public Criteria andHumns3NotEqualTo(Integer value) {
            addCriterion("humns3 <>", value, "humns3");
            return (Criteria) this;
        }

        public Criteria andHumns3GreaterThan(Integer value) {
            addCriterion("humns3 >", value, "humns3");
            return (Criteria) this;
        }

        public Criteria andHumns3GreaterThanOrEqualTo(Integer value) {
            addCriterion("humns3 >=", value, "humns3");
            return (Criteria) this;
        }

        public Criteria andHumns3LessThan(Integer value) {
            addCriterion("humns3 <", value, "humns3");
            return (Criteria) this;
        }

        public Criteria andHumns3LessThanOrEqualTo(Integer value) {
            addCriterion("humns3 <=", value, "humns3");
            return (Criteria) this;
        }

        public Criteria andHumns3In(List<Integer> values) {
            addCriterion("humns3 in", values, "humns3");
            return (Criteria) this;
        }

        public Criteria andHumns3NotIn(List<Integer> values) {
            addCriterion("humns3 not in", values, "humns3");
            return (Criteria) this;
        }

        public Criteria andHumns3Between(Integer value1, Integer value2) {
            addCriterion("humns3 between", value1, value2, "humns3");
            return (Criteria) this;
        }

        public Criteria andHumns3NotBetween(Integer value1, Integer value2) {
            addCriterion("humns3 not between", value1, value2, "humns3");
            return (Criteria) this;
        }

        public Criteria andTemos1IsNull() {
            addCriterion("temos1 is null");
            return (Criteria) this;
        }

        public Criteria andTemos1IsNotNull() {
            addCriterion("temos1 is not null");
            return (Criteria) this;
        }

        public Criteria andTemos1EqualTo(Integer value) {
            addCriterion("temos1 =", value, "temos1");
            return (Criteria) this;
        }

        public Criteria andTemos1NotEqualTo(Integer value) {
            addCriterion("temos1 <>", value, "temos1");
            return (Criteria) this;
        }

        public Criteria andTemos1GreaterThan(Integer value) {
            addCriterion("temos1 >", value, "temos1");
            return (Criteria) this;
        }

        public Criteria andTemos1GreaterThanOrEqualTo(Integer value) {
            addCriterion("temos1 >=", value, "temos1");
            return (Criteria) this;
        }

        public Criteria andTemos1LessThan(Integer value) {
            addCriterion("temos1 <", value, "temos1");
            return (Criteria) this;
        }

        public Criteria andTemos1LessThanOrEqualTo(Integer value) {
            addCriterion("temos1 <=", value, "temos1");
            return (Criteria) this;
        }

        public Criteria andTemos1In(List<Integer> values) {
            addCriterion("temos1 in", values, "temos1");
            return (Criteria) this;
        }

        public Criteria andTemos1NotIn(List<Integer> values) {
            addCriterion("temos1 not in", values, "temos1");
            return (Criteria) this;
        }

        public Criteria andTemos1Between(Integer value1, Integer value2) {
            addCriterion("temos1 between", value1, value2, "temos1");
            return (Criteria) this;
        }

        public Criteria andTemos1NotBetween(Integer value1, Integer value2) {
            addCriterion("temos1 not between", value1, value2, "temos1");
            return (Criteria) this;
        }

        public Criteria andTemos2IsNull() {
            addCriterion("temos2 is null");
            return (Criteria) this;
        }

        public Criteria andTemos2IsNotNull() {
            addCriterion("temos2 is not null");
            return (Criteria) this;
        }

        public Criteria andTemos2EqualTo(Integer value) {
            addCriterion("temos2 =", value, "temos2");
            return (Criteria) this;
        }

        public Criteria andTemos2NotEqualTo(Integer value) {
            addCriterion("temos2 <>", value, "temos2");
            return (Criteria) this;
        }

        public Criteria andTemos2GreaterThan(Integer value) {
            addCriterion("temos2 >", value, "temos2");
            return (Criteria) this;
        }

        public Criteria andTemos2GreaterThanOrEqualTo(Integer value) {
            addCriterion("temos2 >=", value, "temos2");
            return (Criteria) this;
        }

        public Criteria andTemos2LessThan(Integer value) {
            addCriterion("temos2 <", value, "temos2");
            return (Criteria) this;
        }

        public Criteria andTemos2LessThanOrEqualTo(Integer value) {
            addCriterion("temos2 <=", value, "temos2");
            return (Criteria) this;
        }

        public Criteria andTemos2In(List<Integer> values) {
            addCriterion("temos2 in", values, "temos2");
            return (Criteria) this;
        }

        public Criteria andTemos2NotIn(List<Integer> values) {
            addCriterion("temos2 not in", values, "temos2");
            return (Criteria) this;
        }

        public Criteria andTemos2Between(Integer value1, Integer value2) {
            addCriterion("temos2 between", value1, value2, "temos2");
            return (Criteria) this;
        }

        public Criteria andTemos2NotBetween(Integer value1, Integer value2) {
            addCriterion("temos2 not between", value1, value2, "temos2");
            return (Criteria) this;
        }

        public Criteria andTemos3IsNull() {
            addCriterion("temos3 is null");
            return (Criteria) this;
        }

        public Criteria andTemos3IsNotNull() {
            addCriterion("temos3 is not null");
            return (Criteria) this;
        }

        public Criteria andTemos3EqualTo(Integer value) {
            addCriterion("temos3 =", value, "temos3");
            return (Criteria) this;
        }

        public Criteria andTemos3NotEqualTo(Integer value) {
            addCriterion("temos3 <>", value, "temos3");
            return (Criteria) this;
        }

        public Criteria andTemos3GreaterThan(Integer value) {
            addCriterion("temos3 >", value, "temos3");
            return (Criteria) this;
        }

        public Criteria andTemos3GreaterThanOrEqualTo(Integer value) {
            addCriterion("temos3 >=", value, "temos3");
            return (Criteria) this;
        }

        public Criteria andTemos3LessThan(Integer value) {
            addCriterion("temos3 <", value, "temos3");
            return (Criteria) this;
        }

        public Criteria andTemos3LessThanOrEqualTo(Integer value) {
            addCriterion("temos3 <=", value, "temos3");
            return (Criteria) this;
        }

        public Criteria andTemos3In(List<Integer> values) {
            addCriterion("temos3 in", values, "temos3");
            return (Criteria) this;
        }

        public Criteria andTemos3NotIn(List<Integer> values) {
            addCriterion("temos3 not in", values, "temos3");
            return (Criteria) this;
        }

        public Criteria andTemos3Between(Integer value1, Integer value2) {
            addCriterion("temos3 between", value1, value2, "temos3");
            return (Criteria) this;
        }

        public Criteria andTemos3NotBetween(Integer value1, Integer value2) {
            addCriterion("temos3 not between", value1, value2, "temos3");
            return (Criteria) this;
        }

        public Criteria andHumos1IsNull() {
            addCriterion("humos1 is null");
            return (Criteria) this;
        }

        public Criteria andHumos1IsNotNull() {
            addCriterion("humos1 is not null");
            return (Criteria) this;
        }

        public Criteria andHumos1EqualTo(Integer value) {
            addCriterion("humos1 =", value, "humos1");
            return (Criteria) this;
        }

        public Criteria andHumos1NotEqualTo(Integer value) {
            addCriterion("humos1 <>", value, "humos1");
            return (Criteria) this;
        }

        public Criteria andHumos1GreaterThan(Integer value) {
            addCriterion("humos1 >", value, "humos1");
            return (Criteria) this;
        }

        public Criteria andHumos1GreaterThanOrEqualTo(Integer value) {
            addCriterion("humos1 >=", value, "humos1");
            return (Criteria) this;
        }

        public Criteria andHumos1LessThan(Integer value) {
            addCriterion("humos1 <", value, "humos1");
            return (Criteria) this;
        }

        public Criteria andHumos1LessThanOrEqualTo(Integer value) {
            addCriterion("humos1 <=", value, "humos1");
            return (Criteria) this;
        }

        public Criteria andHumos1In(List<Integer> values) {
            addCriterion("humos1 in", values, "humos1");
            return (Criteria) this;
        }

        public Criteria andHumos1NotIn(List<Integer> values) {
            addCriterion("humos1 not in", values, "humos1");
            return (Criteria) this;
        }

        public Criteria andHumos1Between(Integer value1, Integer value2) {
            addCriterion("humos1 between", value1, value2, "humos1");
            return (Criteria) this;
        }

        public Criteria andHumos1NotBetween(Integer value1, Integer value2) {
            addCriterion("humos1 not between", value1, value2, "humos1");
            return (Criteria) this;
        }

        public Criteria andHumos2IsNull() {
            addCriterion("humos2 is null");
            return (Criteria) this;
        }

        public Criteria andHumos2IsNotNull() {
            addCriterion("humos2 is not null");
            return (Criteria) this;
        }

        public Criteria andHumos2EqualTo(Integer value) {
            addCriterion("humos2 =", value, "humos2");
            return (Criteria) this;
        }

        public Criteria andHumos2NotEqualTo(Integer value) {
            addCriterion("humos2 <>", value, "humos2");
            return (Criteria) this;
        }

        public Criteria andHumos2GreaterThan(Integer value) {
            addCriterion("humos2 >", value, "humos2");
            return (Criteria) this;
        }

        public Criteria andHumos2GreaterThanOrEqualTo(Integer value) {
            addCriterion("humos2 >=", value, "humos2");
            return (Criteria) this;
        }

        public Criteria andHumos2LessThan(Integer value) {
            addCriterion("humos2 <", value, "humos2");
            return (Criteria) this;
        }

        public Criteria andHumos2LessThanOrEqualTo(Integer value) {
            addCriterion("humos2 <=", value, "humos2");
            return (Criteria) this;
        }

        public Criteria andHumos2In(List<Integer> values) {
            addCriterion("humos2 in", values, "humos2");
            return (Criteria) this;
        }

        public Criteria andHumos2NotIn(List<Integer> values) {
            addCriterion("humos2 not in", values, "humos2");
            return (Criteria) this;
        }

        public Criteria andHumos2Between(Integer value1, Integer value2) {
            addCriterion("humos2 between", value1, value2, "humos2");
            return (Criteria) this;
        }

        public Criteria andHumos2NotBetween(Integer value1, Integer value2) {
            addCriterion("humos2 not between", value1, value2, "humos2");
            return (Criteria) this;
        }

        public Criteria andHumos3IsNull() {
            addCriterion("humos3 is null");
            return (Criteria) this;
        }

        public Criteria andHumos3IsNotNull() {
            addCriterion("humos3 is not null");
            return (Criteria) this;
        }

        public Criteria andHumos3EqualTo(Integer value) {
            addCriterion("humos3 =", value, "humos3");
            return (Criteria) this;
        }

        public Criteria andHumos3NotEqualTo(Integer value) {
            addCriterion("humos3 <>", value, "humos3");
            return (Criteria) this;
        }

        public Criteria andHumos3GreaterThan(Integer value) {
            addCriterion("humos3 >", value, "humos3");
            return (Criteria) this;
        }

        public Criteria andHumos3GreaterThanOrEqualTo(Integer value) {
            addCriterion("humos3 >=", value, "humos3");
            return (Criteria) this;
        }

        public Criteria andHumos3LessThan(Integer value) {
            addCriterion("humos3 <", value, "humos3");
            return (Criteria) this;
        }

        public Criteria andHumos3LessThanOrEqualTo(Integer value) {
            addCriterion("humos3 <=", value, "humos3");
            return (Criteria) this;
        }

        public Criteria andHumos3In(List<Integer> values) {
            addCriterion("humos3 in", values, "humos3");
            return (Criteria) this;
        }

        public Criteria andHumos3NotIn(List<Integer> values) {
            addCriterion("humos3 not in", values, "humos3");
            return (Criteria) this;
        }

        public Criteria andHumos3Between(Integer value1, Integer value2) {
            addCriterion("humos3 between", value1, value2, "humos3");
            return (Criteria) this;
        }

        public Criteria andHumos3NotBetween(Integer value1, Integer value2) {
            addCriterion("humos3 not between", value1, value2, "humos3");
            return (Criteria) this;
        }

        public Criteria andPreos1IsNull() {
            addCriterion("preos1 is null");
            return (Criteria) this;
        }

        public Criteria andPreos1IsNotNull() {
            addCriterion("preos1 is not null");
            return (Criteria) this;
        }

        public Criteria andPreos1EqualTo(Integer value) {
            addCriterion("preos1 =", value, "preos1");
            return (Criteria) this;
        }

        public Criteria andPreos1NotEqualTo(Integer value) {
            addCriterion("preos1 <>", value, "preos1");
            return (Criteria) this;
        }

        public Criteria andPreos1GreaterThan(Integer value) {
            addCriterion("preos1 >", value, "preos1");
            return (Criteria) this;
        }

        public Criteria andPreos1GreaterThanOrEqualTo(Integer value) {
            addCriterion("preos1 >=", value, "preos1");
            return (Criteria) this;
        }

        public Criteria andPreos1LessThan(Integer value) {
            addCriterion("preos1 <", value, "preos1");
            return (Criteria) this;
        }

        public Criteria andPreos1LessThanOrEqualTo(Integer value) {
            addCriterion("preos1 <=", value, "preos1");
            return (Criteria) this;
        }

        public Criteria andPreos1In(List<Integer> values) {
            addCriterion("preos1 in", values, "preos1");
            return (Criteria) this;
        }

        public Criteria andPreos1NotIn(List<Integer> values) {
            addCriterion("preos1 not in", values, "preos1");
            return (Criteria) this;
        }

        public Criteria andPreos1Between(Integer value1, Integer value2) {
            addCriterion("preos1 between", value1, value2, "preos1");
            return (Criteria) this;
        }

        public Criteria andPreos1NotBetween(Integer value1, Integer value2) {
            addCriterion("preos1 not between", value1, value2, "preos1");
            return (Criteria) this;
        }

        public Criteria andPreos2IsNull() {
            addCriterion("preos2 is null");
            return (Criteria) this;
        }

        public Criteria andPreos2IsNotNull() {
            addCriterion("preos2 is not null");
            return (Criteria) this;
        }

        public Criteria andPreos2EqualTo(Integer value) {
            addCriterion("preos2 =", value, "preos2");
            return (Criteria) this;
        }

        public Criteria andPreos2NotEqualTo(Integer value) {
            addCriterion("preos2 <>", value, "preos2");
            return (Criteria) this;
        }

        public Criteria andPreos2GreaterThan(Integer value) {
            addCriterion("preos2 >", value, "preos2");
            return (Criteria) this;
        }

        public Criteria andPreos2GreaterThanOrEqualTo(Integer value) {
            addCriterion("preos2 >=", value, "preos2");
            return (Criteria) this;
        }

        public Criteria andPreos2LessThan(Integer value) {
            addCriterion("preos2 <", value, "preos2");
            return (Criteria) this;
        }

        public Criteria andPreos2LessThanOrEqualTo(Integer value) {
            addCriterion("preos2 <=", value, "preos2");
            return (Criteria) this;
        }

        public Criteria andPreos2In(List<Integer> values) {
            addCriterion("preos2 in", values, "preos2");
            return (Criteria) this;
        }

        public Criteria andPreos2NotIn(List<Integer> values) {
            addCriterion("preos2 not in", values, "preos2");
            return (Criteria) this;
        }

        public Criteria andPreos2Between(Integer value1, Integer value2) {
            addCriterion("preos2 between", value1, value2, "preos2");
            return (Criteria) this;
        }

        public Criteria andPreos2NotBetween(Integer value1, Integer value2) {
            addCriterion("preos2 not between", value1, value2, "preos2");
            return (Criteria) this;
        }

        public Criteria andPreos3IsNull() {
            addCriterion("preos3 is null");
            return (Criteria) this;
        }

        public Criteria andPreos3IsNotNull() {
            addCriterion("preos3 is not null");
            return (Criteria) this;
        }

        public Criteria andPreos3EqualTo(Integer value) {
            addCriterion("preos3 =", value, "preos3");
            return (Criteria) this;
        }

        public Criteria andPreos3NotEqualTo(Integer value) {
            addCriterion("preos3 <>", value, "preos3");
            return (Criteria) this;
        }

        public Criteria andPreos3GreaterThan(Integer value) {
            addCriterion("preos3 >", value, "preos3");
            return (Criteria) this;
        }

        public Criteria andPreos3GreaterThanOrEqualTo(Integer value) {
            addCriterion("preos3 >=", value, "preos3");
            return (Criteria) this;
        }

        public Criteria andPreos3LessThan(Integer value) {
            addCriterion("preos3 <", value, "preos3");
            return (Criteria) this;
        }

        public Criteria andPreos3LessThanOrEqualTo(Integer value) {
            addCriterion("preos3 <=", value, "preos3");
            return (Criteria) this;
        }

        public Criteria andPreos3In(List<Integer> values) {
            addCriterion("preos3 in", values, "preos3");
            return (Criteria) this;
        }

        public Criteria andPreos3NotIn(List<Integer> values) {
            addCriterion("preos3 not in", values, "preos3");
            return (Criteria) this;
        }

        public Criteria andPreos3Between(Integer value1, Integer value2) {
            addCriterion("preos3 between", value1, value2, "preos3");
            return (Criteria) this;
        }

        public Criteria andPreos3NotBetween(Integer value1, Integer value2) {
            addCriterion("preos3 not between", value1, value2, "preos3");
            return (Criteria) this;
        }

        public Criteria andStatus1IsNull() {
            addCriterion("status1 is null");
            return (Criteria) this;
        }

        public Criteria andStatus1IsNotNull() {
            addCriterion("status1 is not null");
            return (Criteria) this;
        }

        public Criteria andStatus1EqualTo(String value) {
            addCriterion("status1 =", value, "status1");
            return (Criteria) this;
        }

        public Criteria andStatus1NotEqualTo(String value) {
            addCriterion("status1 <>", value, "status1");
            return (Criteria) this;
        }

        public Criteria andStatus1GreaterThan(String value) {
            addCriterion("status1 >", value, "status1");
            return (Criteria) this;
        }

        public Criteria andStatus1GreaterThanOrEqualTo(String value) {
            addCriterion("status1 >=", value, "status1");
            return (Criteria) this;
        }

        public Criteria andStatus1LessThan(String value) {
            addCriterion("status1 <", value, "status1");
            return (Criteria) this;
        }

        public Criteria andStatus1LessThanOrEqualTo(String value) {
            addCriterion("status1 <=", value, "status1");
            return (Criteria) this;
        }

        public Criteria andStatus1Like(String value) {
            addCriterion("status1 like", value, "status1");
            return (Criteria) this;
        }

        public Criteria andStatus1NotLike(String value) {
            addCriterion("status1 not like", value, "status1");
            return (Criteria) this;
        }

        public Criteria andStatus1In(List<String> values) {
            addCriterion("status1 in", values, "status1");
            return (Criteria) this;
        }

        public Criteria andStatus1NotIn(List<String> values) {
            addCriterion("status1 not in", values, "status1");
            return (Criteria) this;
        }

        public Criteria andStatus1Between(String value1, String value2) {
            addCriterion("status1 between", value1, value2, "status1");
            return (Criteria) this;
        }

        public Criteria andStatus1NotBetween(String value1, String value2) {
            addCriterion("status1 not between", value1, value2, "status1");
            return (Criteria) this;
        }

        public Criteria andStatus2IsNull() {
            addCriterion("status2 is null");
            return (Criteria) this;
        }

        public Criteria andStatus2IsNotNull() {
            addCriterion("status2 is not null");
            return (Criteria) this;
        }

        public Criteria andStatus2EqualTo(String value) {
            addCriterion("status2 =", value, "status2");
            return (Criteria) this;
        }

        public Criteria andStatus2NotEqualTo(String value) {
            addCriterion("status2 <>", value, "status2");
            return (Criteria) this;
        }

        public Criteria andStatus2GreaterThan(String value) {
            addCriterion("status2 >", value, "status2");
            return (Criteria) this;
        }

        public Criteria andStatus2GreaterThanOrEqualTo(String value) {
            addCriterion("status2 >=", value, "status2");
            return (Criteria) this;
        }

        public Criteria andStatus2LessThan(String value) {
            addCriterion("status2 <", value, "status2");
            return (Criteria) this;
        }

        public Criteria andStatus2LessThanOrEqualTo(String value) {
            addCriterion("status2 <=", value, "status2");
            return (Criteria) this;
        }

        public Criteria andStatus2Like(String value) {
            addCriterion("status2 like", value, "status2");
            return (Criteria) this;
        }

        public Criteria andStatus2NotLike(String value) {
            addCriterion("status2 not like", value, "status2");
            return (Criteria) this;
        }

        public Criteria andStatus2In(List<String> values) {
            addCriterion("status2 in", values, "status2");
            return (Criteria) this;
        }

        public Criteria andStatus2NotIn(List<String> values) {
            addCriterion("status2 not in", values, "status2");
            return (Criteria) this;
        }

        public Criteria andStatus2Between(String value1, String value2) {
            addCriterion("status2 between", value1, value2, "status2");
            return (Criteria) this;
        }

        public Criteria andStatus2NotBetween(String value1, String value2) {
            addCriterion("status2 not between", value1, value2, "status2");
            return (Criteria) this;
        }

        public Criteria andStatus3IsNull() {
            addCriterion("status3 is null");
            return (Criteria) this;
        }

        public Criteria andStatus3IsNotNull() {
            addCriterion("status3 is not null");
            return (Criteria) this;
        }

        public Criteria andStatus3EqualTo(String value) {
            addCriterion("status3 =", value, "status3");
            return (Criteria) this;
        }

        public Criteria andStatus3NotEqualTo(String value) {
            addCriterion("status3 <>", value, "status3");
            return (Criteria) this;
        }

        public Criteria andStatus3GreaterThan(String value) {
            addCriterion("status3 >", value, "status3");
            return (Criteria) this;
        }

        public Criteria andStatus3GreaterThanOrEqualTo(String value) {
            addCriterion("status3 >=", value, "status3");
            return (Criteria) this;
        }

        public Criteria andStatus3LessThan(String value) {
            addCriterion("status3 <", value, "status3");
            return (Criteria) this;
        }

        public Criteria andStatus3LessThanOrEqualTo(String value) {
            addCriterion("status3 <=", value, "status3");
            return (Criteria) this;
        }

        public Criteria andStatus3Like(String value) {
            addCriterion("status3 like", value, "status3");
            return (Criteria) this;
        }

        public Criteria andStatus3NotLike(String value) {
            addCriterion("status3 not like", value, "status3");
            return (Criteria) this;
        }

        public Criteria andStatus3In(List<String> values) {
            addCriterion("status3 in", values, "status3");
            return (Criteria) this;
        }

        public Criteria andStatus3NotIn(List<String> values) {
            addCriterion("status3 not in", values, "status3");
            return (Criteria) this;
        }

        public Criteria andStatus3Between(String value1, String value2) {
            addCriterion("status3 between", value1, value2, "status3");
            return (Criteria) this;
        }

        public Criteria andStatus3NotBetween(String value1, String value2) {
            addCriterion("status3 not between", value1, value2, "status3");
            return (Criteria) this;
        }

        public Criteria andFre1IsNull() {
            addCriterion("fre1 is null");
            return (Criteria) this;
        }

        public Criteria andFre1IsNotNull() {
            addCriterion("fre1 is not null");
            return (Criteria) this;
        }

        public Criteria andFre1EqualTo(Integer value) {
            addCriterion("fre1 =", value, "fre1");
            return (Criteria) this;
        }

        public Criteria andFre1NotEqualTo(Integer value) {
            addCriterion("fre1 <>", value, "fre1");
            return (Criteria) this;
        }

        public Criteria andFre1GreaterThan(Integer value) {
            addCriterion("fre1 >", value, "fre1");
            return (Criteria) this;
        }

        public Criteria andFre1GreaterThanOrEqualTo(Integer value) {
            addCriterion("fre1 >=", value, "fre1");
            return (Criteria) this;
        }

        public Criteria andFre1LessThan(Integer value) {
            addCriterion("fre1 <", value, "fre1");
            return (Criteria) this;
        }

        public Criteria andFre1LessThanOrEqualTo(Integer value) {
            addCriterion("fre1 <=", value, "fre1");
            return (Criteria) this;
        }

        public Criteria andFre1In(List<Integer> values) {
            addCriterion("fre1 in", values, "fre1");
            return (Criteria) this;
        }

        public Criteria andFre1NotIn(List<Integer> values) {
            addCriterion("fre1 not in", values, "fre1");
            return (Criteria) this;
        }

        public Criteria andFre1Between(Integer value1, Integer value2) {
            addCriterion("fre1 between", value1, value2, "fre1");
            return (Criteria) this;
        }

        public Criteria andFre1NotBetween(Integer value1, Integer value2) {
            addCriterion("fre1 not between", value1, value2, "fre1");
            return (Criteria) this;
        }

        public Criteria andFre2IsNull() {
            addCriterion("fre2 is null");
            return (Criteria) this;
        }

        public Criteria andFre2IsNotNull() {
            addCriterion("fre2 is not null");
            return (Criteria) this;
        }

        public Criteria andFre2EqualTo(Integer value) {
            addCriterion("fre2 =", value, "fre2");
            return (Criteria) this;
        }

        public Criteria andFre2NotEqualTo(Integer value) {
            addCriterion("fre2 <>", value, "fre2");
            return (Criteria) this;
        }

        public Criteria andFre2GreaterThan(Integer value) {
            addCriterion("fre2 >", value, "fre2");
            return (Criteria) this;
        }

        public Criteria andFre2GreaterThanOrEqualTo(Integer value) {
            addCriterion("fre2 >=", value, "fre2");
            return (Criteria) this;
        }

        public Criteria andFre2LessThan(Integer value) {
            addCriterion("fre2 <", value, "fre2");
            return (Criteria) this;
        }

        public Criteria andFre2LessThanOrEqualTo(Integer value) {
            addCriterion("fre2 <=", value, "fre2");
            return (Criteria) this;
        }

        public Criteria andFre2In(List<Integer> values) {
            addCriterion("fre2 in", values, "fre2");
            return (Criteria) this;
        }

        public Criteria andFre2NotIn(List<Integer> values) {
            addCriterion("fre2 not in", values, "fre2");
            return (Criteria) this;
        }

        public Criteria andFre2Between(Integer value1, Integer value2) {
            addCriterion("fre2 between", value1, value2, "fre2");
            return (Criteria) this;
        }

        public Criteria andFre2NotBetween(Integer value1, Integer value2) {
            addCriterion("fre2 not between", value1, value2, "fre2");
            return (Criteria) this;
        }

        public Criteria andFre3IsNull() {
            addCriterion("fre3 is null");
            return (Criteria) this;
        }

        public Criteria andFre3IsNotNull() {
            addCriterion("fre3 is not null");
            return (Criteria) this;
        }

        public Criteria andFre3EqualTo(Integer value) {
            addCriterion("fre3 =", value, "fre3");
            return (Criteria) this;
        }

        public Criteria andFre3NotEqualTo(Integer value) {
            addCriterion("fre3 <>", value, "fre3");
            return (Criteria) this;
        }

        public Criteria andFre3GreaterThan(Integer value) {
            addCriterion("fre3 >", value, "fre3");
            return (Criteria) this;
        }

        public Criteria andFre3GreaterThanOrEqualTo(Integer value) {
            addCriterion("fre3 >=", value, "fre3");
            return (Criteria) this;
        }

        public Criteria andFre3LessThan(Integer value) {
            addCriterion("fre3 <", value, "fre3");
            return (Criteria) this;
        }

        public Criteria andFre3LessThanOrEqualTo(Integer value) {
            addCriterion("fre3 <=", value, "fre3");
            return (Criteria) this;
        }

        public Criteria andFre3In(List<Integer> values) {
            addCriterion("fre3 in", values, "fre3");
            return (Criteria) this;
        }

        public Criteria andFre3NotIn(List<Integer> values) {
            addCriterion("fre3 not in", values, "fre3");
            return (Criteria) this;
        }

        public Criteria andFre3Between(Integer value1, Integer value2) {
            addCriterion("fre3 between", value1, value2, "fre3");
            return (Criteria) this;
        }

        public Criteria andFre3NotBetween(Integer value1, Integer value2) {
            addCriterion("fre3 not between", value1, value2, "fre3");
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