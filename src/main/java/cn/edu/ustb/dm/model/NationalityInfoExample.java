package cn.edu.ustb.dm.model;

import java.util.ArrayList;
import java.util.List;

public class NationalityInfoExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table nationality_info
     *
     * @mbggenerated Sat May 18 14:09:44 CST 2013
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table nationality_info
     *
     * @mbggenerated Sat May 18 14:09:44 CST 2013
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table nationality_info
     *
     * @mbggenerated Sat May 18 14:09:44 CST 2013
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nationality_info
     *
     * @mbggenerated Sat May 18 14:09:44 CST 2013
     */
    public NationalityInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nationality_info
     *
     * @mbggenerated Sat May 18 14:09:44 CST 2013
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nationality_info
     *
     * @mbggenerated Sat May 18 14:09:44 CST 2013
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nationality_info
     *
     * @mbggenerated Sat May 18 14:09:44 CST 2013
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nationality_info
     *
     * @mbggenerated Sat May 18 14:09:44 CST 2013
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nationality_info
     *
     * @mbggenerated Sat May 18 14:09:44 CST 2013
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nationality_info
     *
     * @mbggenerated Sat May 18 14:09:44 CST 2013
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nationality_info
     *
     * @mbggenerated Sat May 18 14:09:44 CST 2013
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nationality_info
     *
     * @mbggenerated Sat May 18 14:09:44 CST 2013
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nationality_info
     *
     * @mbggenerated Sat May 18 14:09:44 CST 2013
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nationality_info
     *
     * @mbggenerated Sat May 18 14:09:44 CST 2013
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table nationality_info
     *
     * @mbggenerated Sat May 18 14:09:44 CST 2013
     */
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

        public Criteria andNATIONALITY_IDIsNull() {
            addCriterion("NATIONALITY_ID is null");
            return (Criteria) this;
        }

        public Criteria andNATIONALITY_IDIsNotNull() {
            addCriterion("NATIONALITY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andNATIONALITY_IDEqualTo(Integer value) {
            addCriterion("NATIONALITY_ID =", value, "NATIONALITY_ID");
            return (Criteria) this;
        }

        public Criteria andNATIONALITY_IDNotEqualTo(Integer value) {
            addCriterion("NATIONALITY_ID <>", value, "NATIONALITY_ID");
            return (Criteria) this;
        }

        public Criteria andNATIONALITY_IDGreaterThan(Integer value) {
            addCriterion("NATIONALITY_ID >", value, "NATIONALITY_ID");
            return (Criteria) this;
        }

        public Criteria andNATIONALITY_IDGreaterThanOrEqualTo(Integer value) {
            addCriterion("NATIONALITY_ID >=", value, "NATIONALITY_ID");
            return (Criteria) this;
        }

        public Criteria andNATIONALITY_IDLessThan(Integer value) {
            addCriterion("NATIONALITY_ID <", value, "NATIONALITY_ID");
            return (Criteria) this;
        }

        public Criteria andNATIONALITY_IDLessThanOrEqualTo(Integer value) {
            addCriterion("NATIONALITY_ID <=", value, "NATIONALITY_ID");
            return (Criteria) this;
        }

        public Criteria andNATIONALITY_IDIn(List<Integer> values) {
            addCriterion("NATIONALITY_ID in", values, "NATIONALITY_ID");
            return (Criteria) this;
        }

        public Criteria andNATIONALITY_IDNotIn(List<Integer> values) {
            addCriterion("NATIONALITY_ID not in", values, "NATIONALITY_ID");
            return (Criteria) this;
        }

        public Criteria andNATIONALITY_IDBetween(Integer value1, Integer value2) {
            addCriterion("NATIONALITY_ID between", value1, value2, "NATIONALITY_ID");
            return (Criteria) this;
        }

        public Criteria andNATIONALITY_IDNotBetween(Integer value1, Integer value2) {
            addCriterion("NATIONALITY_ID not between", value1, value2, "NATIONALITY_ID");
            return (Criteria) this;
        }

        public Criteria andNATIONALITY_NAMEIsNull() {
            addCriterion("NATIONALITY_NAME is null");
            return (Criteria) this;
        }

        public Criteria andNATIONALITY_NAMEIsNotNull() {
            addCriterion("NATIONALITY_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNATIONALITY_NAMEEqualTo(String value) {
            addCriterion("NATIONALITY_NAME =", value, "NATIONALITY_NAME");
            return (Criteria) this;
        }

        public Criteria andNATIONALITY_NAMENotEqualTo(String value) {
            addCriterion("NATIONALITY_NAME <>", value, "NATIONALITY_NAME");
            return (Criteria) this;
        }

        public Criteria andNATIONALITY_NAMEGreaterThan(String value) {
            addCriterion("NATIONALITY_NAME >", value, "NATIONALITY_NAME");
            return (Criteria) this;
        }

        public Criteria andNATIONALITY_NAMEGreaterThanOrEqualTo(String value) {
            addCriterion("NATIONALITY_NAME >=", value, "NATIONALITY_NAME");
            return (Criteria) this;
        }

        public Criteria andNATIONALITY_NAMELessThan(String value) {
            addCriterion("NATIONALITY_NAME <", value, "NATIONALITY_NAME");
            return (Criteria) this;
        }

        public Criteria andNATIONALITY_NAMELessThanOrEqualTo(String value) {
            addCriterion("NATIONALITY_NAME <=", value, "NATIONALITY_NAME");
            return (Criteria) this;
        }

        public Criteria andNATIONALITY_NAMELike(String value) {
            addCriterion("NATIONALITY_NAME like", value, "NATIONALITY_NAME");
            return (Criteria) this;
        }

        public Criteria andNATIONALITY_NAMENotLike(String value) {
            addCriterion("NATIONALITY_NAME not like", value, "NATIONALITY_NAME");
            return (Criteria) this;
        }

        public Criteria andNATIONALITY_NAMEIn(List<String> values) {
            addCriterion("NATIONALITY_NAME in", values, "NATIONALITY_NAME");
            return (Criteria) this;
        }

        public Criteria andNATIONALITY_NAMENotIn(List<String> values) {
            addCriterion("NATIONALITY_NAME not in", values, "NATIONALITY_NAME");
            return (Criteria) this;
        }

        public Criteria andNATIONALITY_NAMEBetween(String value1, String value2) {
            addCriterion("NATIONALITY_NAME between", value1, value2, "NATIONALITY_NAME");
            return (Criteria) this;
        }

        public Criteria andNATIONALITY_NAMENotBetween(String value1, String value2) {
            addCriterion("NATIONALITY_NAME not between", value1, value2, "NATIONALITY_NAME");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table nationality_info
     *
     * @mbggenerated do_not_delete_during_merge Sat May 18 14:09:44 CST 2013
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table nationality_info
     *
     * @mbggenerated Sat May 18 14:09:44 CST 2013
     */
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