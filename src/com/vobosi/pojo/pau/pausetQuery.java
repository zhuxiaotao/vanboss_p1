package com.vobosi.pojo.pau;

import java.util.ArrayList;
import java.util.List;

public class pausetQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer pageNo = 1;

    protected Integer startRow;

    protected Integer pageSize = 10;

    protected String fields;

    public pausetQuery() {
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

        public Criteria andTemsetIsNull() {
            addCriterion("temset is null");
            return (Criteria) this;
        }

        public Criteria andTemsetIsNotNull() {
            addCriterion("temset is not null");
            return (Criteria) this;
        }

        public Criteria andTemsetEqualTo(Integer value) {
            addCriterion("temset =", value, "temset");
            return (Criteria) this;
        }

        public Criteria andTemsetNotEqualTo(Integer value) {
            addCriterion("temset <>", value, "temset");
            return (Criteria) this;
        }

        public Criteria andTemsetGreaterThan(Integer value) {
            addCriterion("temset >", value, "temset");
            return (Criteria) this;
        }

        public Criteria andTemsetGreaterThanOrEqualTo(Integer value) {
            addCriterion("temset >=", value, "temset");
            return (Criteria) this;
        }

        public Criteria andTemsetLessThan(Integer value) {
            addCriterion("temset <", value, "temset");
            return (Criteria) this;
        }

        public Criteria andTemsetLessThanOrEqualTo(Integer value) {
            addCriterion("temset <=", value, "temset");
            return (Criteria) this;
        }

        public Criteria andTemsetIn(List<Integer> values) {
            addCriterion("temset in", values, "temset");
            return (Criteria) this;
        }

        public Criteria andTemsetNotIn(List<Integer> values) {
            addCriterion("temset not in", values, "temset");
            return (Criteria) this;
        }

        public Criteria andTemsetBetween(Integer value1, Integer value2) {
            addCriterion("temset between", value1, value2, "temset");
            return (Criteria) this;
        }

        public Criteria andTemsetNotBetween(Integer value1, Integer value2) {
            addCriterion("temset not between", value1, value2, "temset");
            return (Criteria) this;
        }

        public Criteria andHumsetIsNull() {
            addCriterion("humset is null");
            return (Criteria) this;
        }

        public Criteria andHumsetIsNotNull() {
            addCriterion("humset is not null");
            return (Criteria) this;
        }

        public Criteria andHumsetEqualTo(Integer value) {
            addCriterion("humset =", value, "humset");
            return (Criteria) this;
        }

        public Criteria andHumsetNotEqualTo(Integer value) {
            addCriterion("humset <>", value, "humset");
            return (Criteria) this;
        }

        public Criteria andHumsetGreaterThan(Integer value) {
            addCriterion("humset >", value, "humset");
            return (Criteria) this;
        }

        public Criteria andHumsetGreaterThanOrEqualTo(Integer value) {
            addCriterion("humset >=", value, "humset");
            return (Criteria) this;
        }

        public Criteria andHumsetLessThan(Integer value) {
            addCriterion("humset <", value, "humset");
            return (Criteria) this;
        }

        public Criteria andHumsetLessThanOrEqualTo(Integer value) {
            addCriterion("humset <=", value, "humset");
            return (Criteria) this;
        }

        public Criteria andHumsetIn(List<Integer> values) {
            addCriterion("humset in", values, "humset");
            return (Criteria) this;
        }

        public Criteria andHumsetNotIn(List<Integer> values) {
            addCriterion("humset not in", values, "humset");
            return (Criteria) this;
        }

        public Criteria andHumsetBetween(Integer value1, Integer value2) {
            addCriterion("humset between", value1, value2, "humset");
            return (Criteria) this;
        }

        public Criteria andHumsetNotBetween(Integer value1, Integer value2) {
            addCriterion("humset not between", value1, value2, "humset");
            return (Criteria) this;
        }

        public Criteria andPresetIsNull() {
            addCriterion("preset is null");
            return (Criteria) this;
        }

        public Criteria andPresetIsNotNull() {
            addCriterion("preset is not null");
            return (Criteria) this;
        }

        public Criteria andPresetEqualTo(Integer value) {
            addCriterion("preset =", value, "preset");
            return (Criteria) this;
        }

        public Criteria andPresetNotEqualTo(Integer value) {
            addCriterion("preset <>", value, "preset");
            return (Criteria) this;
        }

        public Criteria andPresetGreaterThan(Integer value) {
            addCriterion("preset >", value, "preset");
            return (Criteria) this;
        }

        public Criteria andPresetGreaterThanOrEqualTo(Integer value) {
            addCriterion("preset >=", value, "preset");
            return (Criteria) this;
        }

        public Criteria andPresetLessThan(Integer value) {
            addCriterion("preset <", value, "preset");
            return (Criteria) this;
        }

        public Criteria andPresetLessThanOrEqualTo(Integer value) {
            addCriterion("preset <=", value, "preset");
            return (Criteria) this;
        }

        public Criteria andPresetIn(List<Integer> values) {
            addCriterion("preset in", values, "preset");
            return (Criteria) this;
        }

        public Criteria andPresetNotIn(List<Integer> values) {
            addCriterion("preset not in", values, "preset");
            return (Criteria) this;
        }

        public Criteria andPresetBetween(Integer value1, Integer value2) {
            addCriterion("preset between", value1, value2, "preset");
            return (Criteria) this;
        }

        public Criteria andPresetNotBetween(Integer value1, Integer value2) {
            addCriterion("preset not between", value1, value2, "preset");
            return (Criteria) this;
        }

        public Criteria andControlsetIsNull() {
            addCriterion("controlset is null");
            return (Criteria) this;
        }

        public Criteria andControlsetIsNotNull() {
            addCriterion("controlset is not null");
            return (Criteria) this;
        }

        public Criteria andControlsetEqualTo(String value) {
            addCriterion("controlset =", value, "controlset");
            return (Criteria) this;
        }

        public Criteria andControlsetNotEqualTo(String value) {
            addCriterion("controlset <>", value, "controlset");
            return (Criteria) this;
        }

        public Criteria andControlsetGreaterThan(String value) {
            addCriterion("controlset >", value, "controlset");
            return (Criteria) this;
        }

        public Criteria andControlsetGreaterThanOrEqualTo(String value) {
            addCriterion("controlset >=", value, "controlset");
            return (Criteria) this;
        }

        public Criteria andControlsetLessThan(String value) {
            addCriterion("controlset <", value, "controlset");
            return (Criteria) this;
        }

        public Criteria andControlsetLessThanOrEqualTo(String value) {
            addCriterion("controlset <=", value, "controlset");
            return (Criteria) this;
        }

        public Criteria andControlsetLike(String value) {
            addCriterion("controlset like", value, "controlset");
            return (Criteria) this;
        }

        public Criteria andControlsetNotLike(String value) {
            addCriterion("controlset not like", value, "controlset");
            return (Criteria) this;
        }

        public Criteria andControlsetIn(List<String> values) {
            addCriterion("controlset in", values, "controlset");
            return (Criteria) this;
        }

        public Criteria andControlsetNotIn(List<String> values) {
            addCriterion("controlset not in", values, "controlset");
            return (Criteria) this;
        }

        public Criteria andControlsetBetween(String value1, String value2) {
            addCriterion("controlset between", value1, value2, "controlset");
            return (Criteria) this;
        }

        public Criteria andControlsetNotBetween(String value1, String value2) {
            addCriterion("controlset not between", value1, value2, "controlset");
            return (Criteria) this;
        }

        public Criteria andWhoIsNull() {
            addCriterion("who is null");
            return (Criteria) this;
        }

        public Criteria andWhoIsNotNull() {
            addCriterion("who is not null");
            return (Criteria) this;
        }

        public Criteria andWhoEqualTo(String value) {
            addCriterion("who =", value, "who");
            return (Criteria) this;
        }

        public Criteria andWhoNotEqualTo(String value) {
            addCriterion("who <>", value, "who");
            return (Criteria) this;
        }

        public Criteria andWhoGreaterThan(String value) {
            addCriterion("who >", value, "who");
            return (Criteria) this;
        }

        public Criteria andWhoGreaterThanOrEqualTo(String value) {
            addCriterion("who >=", value, "who");
            return (Criteria) this;
        }

        public Criteria andWhoLessThan(String value) {
            addCriterion("who <", value, "who");
            return (Criteria) this;
        }

        public Criteria andWhoLessThanOrEqualTo(String value) {
            addCriterion("who <=", value, "who");
            return (Criteria) this;
        }

        public Criteria andWhoLike(String value) {
            addCriterion("who like", value, "who");
            return (Criteria) this;
        }

        public Criteria andWhoNotLike(String value) {
            addCriterion("who not like", value, "who");
            return (Criteria) this;
        }

        public Criteria andWhoIn(List<String> values) {
            addCriterion("who in", values, "who");
            return (Criteria) this;
        }

        public Criteria andWhoNotIn(List<String> values) {
            addCriterion("who not in", values, "who");
            return (Criteria) this;
        }

        public Criteria andWhoBetween(String value1, String value2) {
            addCriterion("who between", value1, value2, "who");
            return (Criteria) this;
        }

        public Criteria andWhoNotBetween(String value1, String value2) {
            addCriterion("who not between", value1, value2, "who");
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