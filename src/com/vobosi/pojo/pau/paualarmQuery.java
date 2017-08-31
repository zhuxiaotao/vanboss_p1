package com.vobosi.pojo.pau;

import java.util.ArrayList;
import java.util.List;

public class paualarmQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer pageNo = 1;

    protected Integer startRow;

    protected Integer pageSize = 10;

    protected String fields;

    public paualarmQuery() {
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

        public Criteria andScreen1IsNull() {
            addCriterion("screen1 is null");
            return (Criteria) this;
        }

        public Criteria andScreen1IsNotNull() {
            addCriterion("screen1 is not null");
            return (Criteria) this;
        }

        public Criteria andScreen1EqualTo(String value) {
            addCriterion("screen1 =", value, "screen1");
            return (Criteria) this;
        }

        public Criteria andScreen1NotEqualTo(String value) {
            addCriterion("screen1 <>", value, "screen1");
            return (Criteria) this;
        }

        public Criteria andScreen1GreaterThan(String value) {
            addCriterion("screen1 >", value, "screen1");
            return (Criteria) this;
        }

        public Criteria andScreen1GreaterThanOrEqualTo(String value) {
            addCriterion("screen1 >=", value, "screen1");
            return (Criteria) this;
        }

        public Criteria andScreen1LessThan(String value) {
            addCriterion("screen1 <", value, "screen1");
            return (Criteria) this;
        }

        public Criteria andScreen1LessThanOrEqualTo(String value) {
            addCriterion("screen1 <=", value, "screen1");
            return (Criteria) this;
        }

        public Criteria andScreen1Like(String value) {
            addCriterion("screen1 like", value, "screen1");
            return (Criteria) this;
        }

        public Criteria andScreen1NotLike(String value) {
            addCriterion("screen1 not like", value, "screen1");
            return (Criteria) this;
        }

        public Criteria andScreen1In(List<String> values) {
            addCriterion("screen1 in", values, "screen1");
            return (Criteria) this;
        }

        public Criteria andScreen1NotIn(List<String> values) {
            addCriterion("screen1 not in", values, "screen1");
            return (Criteria) this;
        }

        public Criteria andScreen1Between(String value1, String value2) {
            addCriterion("screen1 between", value1, value2, "screen1");
            return (Criteria) this;
        }

        public Criteria andScreen1NotBetween(String value1, String value2) {
            addCriterion("screen1 not between", value1, value2, "screen1");
            return (Criteria) this;
        }

        public Criteria andScreen2IsNull() {
            addCriterion("screen2 is null");
            return (Criteria) this;
        }

        public Criteria andScreen2IsNotNull() {
            addCriterion("screen2 is not null");
            return (Criteria) this;
        }

        public Criteria andScreen2EqualTo(String value) {
            addCriterion("screen2 =", value, "screen2");
            return (Criteria) this;
        }

        public Criteria andScreen2NotEqualTo(String value) {
            addCriterion("screen2 <>", value, "screen2");
            return (Criteria) this;
        }

        public Criteria andScreen2GreaterThan(String value) {
            addCriterion("screen2 >", value, "screen2");
            return (Criteria) this;
        }

        public Criteria andScreen2GreaterThanOrEqualTo(String value) {
            addCriterion("screen2 >=", value, "screen2");
            return (Criteria) this;
        }

        public Criteria andScreen2LessThan(String value) {
            addCriterion("screen2 <", value, "screen2");
            return (Criteria) this;
        }

        public Criteria andScreen2LessThanOrEqualTo(String value) {
            addCriterion("screen2 <=", value, "screen2");
            return (Criteria) this;
        }

        public Criteria andScreen2Like(String value) {
            addCriterion("screen2 like", value, "screen2");
            return (Criteria) this;
        }

        public Criteria andScreen2NotLike(String value) {
            addCriterion("screen2 not like", value, "screen2");
            return (Criteria) this;
        }

        public Criteria andScreen2In(List<String> values) {
            addCriterion("screen2 in", values, "screen2");
            return (Criteria) this;
        }

        public Criteria andScreen2NotIn(List<String> values) {
            addCriterion("screen2 not in", values, "screen2");
            return (Criteria) this;
        }

        public Criteria andScreen2Between(String value1, String value2) {
            addCriterion("screen2 between", value1, value2, "screen2");
            return (Criteria) this;
        }

        public Criteria andScreen2NotBetween(String value1, String value2) {
            addCriterion("screen2 not between", value1, value2, "screen2");
            return (Criteria) this;
        }

        public Criteria andThemostatIsNull() {
            addCriterion("themostat is null");
            return (Criteria) this;
        }

        public Criteria andThemostatIsNotNull() {
            addCriterion("themostat is not null");
            return (Criteria) this;
        }

        public Criteria andThemostatEqualTo(String value) {
            addCriterion("themostat =", value, "themostat");
            return (Criteria) this;
        }

        public Criteria andThemostatNotEqualTo(String value) {
            addCriterion("themostat <>", value, "themostat");
            return (Criteria) this;
        }

        public Criteria andThemostatGreaterThan(String value) {
            addCriterion("themostat >", value, "themostat");
            return (Criteria) this;
        }

        public Criteria andThemostatGreaterThanOrEqualTo(String value) {
            addCriterion("themostat >=", value, "themostat");
            return (Criteria) this;
        }

        public Criteria andThemostatLessThan(String value) {
            addCriterion("themostat <", value, "themostat");
            return (Criteria) this;
        }

        public Criteria andThemostatLessThanOrEqualTo(String value) {
            addCriterion("themostat <=", value, "themostat");
            return (Criteria) this;
        }

        public Criteria andThemostatLike(String value) {
            addCriterion("themostat like", value, "themostat");
            return (Criteria) this;
        }

        public Criteria andThemostatNotLike(String value) {
            addCriterion("themostat not like", value, "themostat");
            return (Criteria) this;
        }

        public Criteria andThemostatIn(List<String> values) {
            addCriterion("themostat in", values, "themostat");
            return (Criteria) this;
        }

        public Criteria andThemostatNotIn(List<String> values) {
            addCriterion("themostat not in", values, "themostat");
            return (Criteria) this;
        }

        public Criteria andThemostatBetween(String value1, String value2) {
            addCriterion("themostat between", value1, value2, "themostat");
            return (Criteria) this;
        }

        public Criteria andThemostatNotBetween(String value1, String value2) {
            addCriterion("themostat not between", value1, value2, "themostat");
            return (Criteria) this;
        }

        public Criteria andMotorIsNull() {
            addCriterion("motor is null");
            return (Criteria) this;
        }

        public Criteria andMotorIsNotNull() {
            addCriterion("motor is not null");
            return (Criteria) this;
        }

        public Criteria andMotorEqualTo(String value) {
            addCriterion("motor =", value, "motor");
            return (Criteria) this;
        }

        public Criteria andMotorNotEqualTo(String value) {
            addCriterion("motor <>", value, "motor");
            return (Criteria) this;
        }

        public Criteria andMotorGreaterThan(String value) {
            addCriterion("motor >", value, "motor");
            return (Criteria) this;
        }

        public Criteria andMotorGreaterThanOrEqualTo(String value) {
            addCriterion("motor >=", value, "motor");
            return (Criteria) this;
        }

        public Criteria andMotorLessThan(String value) {
            addCriterion("motor <", value, "motor");
            return (Criteria) this;
        }

        public Criteria andMotorLessThanOrEqualTo(String value) {
            addCriterion("motor <=", value, "motor");
            return (Criteria) this;
        }

        public Criteria andMotorLike(String value) {
            addCriterion("motor like", value, "motor");
            return (Criteria) this;
        }

        public Criteria andMotorNotLike(String value) {
            addCriterion("motor not like", value, "motor");
            return (Criteria) this;
        }

        public Criteria andMotorIn(List<String> values) {
            addCriterion("motor in", values, "motor");
            return (Criteria) this;
        }

        public Criteria andMotorNotIn(List<String> values) {
            addCriterion("motor not in", values, "motor");
            return (Criteria) this;
        }

        public Criteria andMotorBetween(String value1, String value2) {
            addCriterion("motor between", value1, value2, "motor");
            return (Criteria) this;
        }

        public Criteria andMotorNotBetween(String value1, String value2) {
            addCriterion("motor not between", value1, value2, "motor");
            return (Criteria) this;
        }

        public Criteria andOtherIsNull() {
            addCriterion("other is null");
            return (Criteria) this;
        }

        public Criteria andOtherIsNotNull() {
            addCriterion("other is not null");
            return (Criteria) this;
        }

        public Criteria andOtherEqualTo(String value) {
            addCriterion("other =", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotEqualTo(String value) {
            addCriterion("other <>", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherGreaterThan(String value) {
            addCriterion("other >", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherGreaterThanOrEqualTo(String value) {
            addCriterion("other >=", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherLessThan(String value) {
            addCriterion("other <", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherLessThanOrEqualTo(String value) {
            addCriterion("other <=", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherLike(String value) {
            addCriterion("other like", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotLike(String value) {
            addCriterion("other not like", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherIn(List<String> values) {
            addCriterion("other in", values, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotIn(List<String> values) {
            addCriterion("other not in", values, "other");
            return (Criteria) this;
        }

        public Criteria andOtherBetween(String value1, String value2) {
            addCriterion("other between", value1, value2, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotBetween(String value1, String value2) {
            addCriterion("other not between", value1, value2, "other");
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