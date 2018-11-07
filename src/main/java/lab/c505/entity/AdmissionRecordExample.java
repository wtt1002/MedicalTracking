package lab.c505.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class AdmissionRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdmissionRecordExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andAr_idIsNull() {
            addCriterion("ar_id is null");
            return (Criteria) this;
        }

        public Criteria andAr_idIsNotNull() {
            addCriterion("ar_id is not null");
            return (Criteria) this;
        }

        public Criteria andAr_idEqualTo(Long value) {
            addCriterion("ar_id =", value, "ar_id");
            return (Criteria) this;
        }

        public Criteria andAr_idNotEqualTo(Long value) {
            addCriterion("ar_id <>", value, "ar_id");
            return (Criteria) this;
        }

        public Criteria andAr_idGreaterThan(Long value) {
            addCriterion("ar_id >", value, "ar_id");
            return (Criteria) this;
        }

        public Criteria andAr_idGreaterThanOrEqualTo(Long value) {
            addCriterion("ar_id >=", value, "ar_id");
            return (Criteria) this;
        }

        public Criteria andAr_idLessThan(Long value) {
            addCriterion("ar_id <", value, "ar_id");
            return (Criteria) this;
        }

        public Criteria andAr_idLessThanOrEqualTo(Long value) {
            addCriterion("ar_id <=", value, "ar_id");
            return (Criteria) this;
        }

        public Criteria andAr_idIn(List<Long> values) {
            addCriterion("ar_id in", values, "ar_id");
            return (Criteria) this;
        }

        public Criteria andAr_idNotIn(List<Long> values) {
            addCriterion("ar_id not in", values, "ar_id");
            return (Criteria) this;
        }

        public Criteria andAr_idBetween(Long value1, Long value2) {
            addCriterion("ar_id between", value1, value2, "ar_id");
            return (Criteria) this;
        }

        public Criteria andAr_idNotBetween(Long value1, Long value2) {
            addCriterion("ar_id not between", value1, value2, "ar_id");
            return (Criteria) this;
        }

        public Criteria andHosp_idIsNull() {
            addCriterion("hosp_id is null");
            return (Criteria) this;
        }

        public Criteria andHosp_idIsNotNull() {
            addCriterion("hosp_id is not null");
            return (Criteria) this;
        }

        public Criteria andHosp_idEqualTo(Long value) {
            addCriterion("hosp_id =", value, "hosp_id");
            return (Criteria) this;
        }

        public Criteria andHosp_idNotEqualTo(Long value) {
            addCriterion("hosp_id <>", value, "hosp_id");
            return (Criteria) this;
        }

        public Criteria andHosp_idGreaterThan(Long value) {
            addCriterion("hosp_id >", value, "hosp_id");
            return (Criteria) this;
        }

        public Criteria andHosp_idGreaterThanOrEqualTo(Long value) {
            addCriterion("hosp_id >=", value, "hosp_id");
            return (Criteria) this;
        }

        public Criteria andHosp_idLessThan(Long value) {
            addCriterion("hosp_id <", value, "hosp_id");
            return (Criteria) this;
        }

        public Criteria andHosp_idLessThanOrEqualTo(Long value) {
            addCriterion("hosp_id <=", value, "hosp_id");
            return (Criteria) this;
        }

        public Criteria andHosp_idIn(List<Long> values) {
            addCriterion("hosp_id in", values, "hosp_id");
            return (Criteria) this;
        }

        public Criteria andHosp_idNotIn(List<Long> values) {
            addCriterion("hosp_id not in", values, "hosp_id");
            return (Criteria) this;
        }

        public Criteria andHosp_idBetween(Long value1, Long value2) {
            addCriterion("hosp_id between", value1, value2, "hosp_id");
            return (Criteria) this;
        }

        public Criteria andHosp_idNotBetween(Long value1, Long value2) {
            addCriterion("hosp_id not between", value1, value2, "hosp_id");
            return (Criteria) this;
        }

        public Criteria andPatient_idIsNull() {
            addCriterion("patient_id is null");
            return (Criteria) this;
        }

        public Criteria andPatient_idIsNotNull() {
            addCriterion("patient_id is not null");
            return (Criteria) this;
        }

        public Criteria andPatient_idEqualTo(Long value) {
            addCriterion("patient_id =", value, "patient_id");
            return (Criteria) this;
        }

        public Criteria andPatient_idNotEqualTo(Long value) {
            addCriterion("patient_id <>", value, "patient_id");
            return (Criteria) this;
        }

        public Criteria andPatient_idGreaterThan(Long value) {
            addCriterion("patient_id >", value, "patient_id");
            return (Criteria) this;
        }

        public Criteria andPatient_idGreaterThanOrEqualTo(Long value) {
            addCriterion("patient_id >=", value, "patient_id");
            return (Criteria) this;
        }

        public Criteria andPatient_idLessThan(Long value) {
            addCriterion("patient_id <", value, "patient_id");
            return (Criteria) this;
        }

        public Criteria andPatient_idLessThanOrEqualTo(Long value) {
            addCriterion("patient_id <=", value, "patient_id");
            return (Criteria) this;
        }

        public Criteria andPatient_idIn(List<Long> values) {
            addCriterion("patient_id in", values, "patient_id");
            return (Criteria) this;
        }

        public Criteria andPatient_idNotIn(List<Long> values) {
            addCriterion("patient_id not in", values, "patient_id");
            return (Criteria) this;
        }

        public Criteria andPatient_idBetween(Long value1, Long value2) {
            addCriterion("patient_id between", value1, value2, "patient_id");
            return (Criteria) this;
        }

        public Criteria andPatient_idNotBetween(Long value1, Long value2) {
            addCriterion("patient_id not between", value1, value2, "patient_id");
            return (Criteria) this;
        }

        public Criteria andAd_numberIsNull() {
            addCriterion("ad_number is null");
            return (Criteria) this;
        }

        public Criteria andAd_numberIsNotNull() {
            addCriterion("ad_number is not null");
            return (Criteria) this;
        }

        public Criteria andAd_numberEqualTo(String value) {
            addCriterion("ad_number =", value, "ad_number");
            return (Criteria) this;
        }

        public Criteria andAd_numberNotEqualTo(String value) {
            addCriterion("ad_number <>", value, "ad_number");
            return (Criteria) this;
        }

        public Criteria andAd_numberGreaterThan(String value) {
            addCriterion("ad_number >", value, "ad_number");
            return (Criteria) this;
        }

        public Criteria andAd_numberGreaterThanOrEqualTo(String value) {
            addCriterion("ad_number >=", value, "ad_number");
            return (Criteria) this;
        }

        public Criteria andAd_numberLessThan(String value) {
            addCriterion("ad_number <", value, "ad_number");
            return (Criteria) this;
        }

        public Criteria andAd_numberLessThanOrEqualTo(String value) {
            addCriterion("ad_number <=", value, "ad_number");
            return (Criteria) this;
        }

        public Criteria andAd_numberLike(String value) {
            addCriterion("ad_number like", value, "ad_number");
            return (Criteria) this;
        }

        public Criteria andAd_numberNotLike(String value) {
            addCriterion("ad_number not like", value, "ad_number");
            return (Criteria) this;
        }

        public Criteria andAd_numberIn(List<String> values) {
            addCriterion("ad_number in", values, "ad_number");
            return (Criteria) this;
        }

        public Criteria andAd_numberNotIn(List<String> values) {
            addCriterion("ad_number not in", values, "ad_number");
            return (Criteria) this;
        }

        public Criteria andAd_numberBetween(String value1, String value2) {
            addCriterion("ad_number between", value1, value2, "ad_number");
            return (Criteria) this;
        }

        public Criteria andAd_numberNotBetween(String value1, String value2) {
            addCriterion("ad_number not between", value1, value2, "ad_number");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNull() {
            addCriterion("\"operator\" is null");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNotNull() {
            addCriterion("\"operator\" is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorEqualTo(String value) {
            addCriterion("\"operator\" =", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotEqualTo(String value) {
            addCriterion("\"operator\" <>", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThan(String value) {
            addCriterion("\"operator\" >", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThanOrEqualTo(String value) {
            addCriterion("\"operator\" >=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThan(String value) {
            addCriterion("\"operator\" <", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThanOrEqualTo(String value) {
            addCriterion("\"operator\" <=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLike(String value) {
            addCriterion("\"operator\" like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotLike(String value) {
            addCriterion("\"operator\" not like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorIn(List<String> values) {
            addCriterion("\"operator\" in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotIn(List<String> values) {
            addCriterion("\"operator\" not in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorBetween(String value1, String value2) {
            addCriterion("\"operator\" between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotBetween(String value1, String value2) {
            addCriterion("\"operator\" not between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andMain_diagIsNull() {
            addCriterion("main_diag is null");
            return (Criteria) this;
        }

        public Criteria andMain_diagIsNotNull() {
            addCriterion("main_diag is not null");
            return (Criteria) this;
        }

        public Criteria andMain_diagEqualTo(Byte value) {
            addCriterion("main_diag =", value, "main_diag");
            return (Criteria) this;
        }

        public Criteria andMain_diagNotEqualTo(Byte value) {
            addCriterion("main_diag <>", value, "main_diag");
            return (Criteria) this;
        }

        public Criteria andMain_diagGreaterThan(Byte value) {
            addCriterion("main_diag >", value, "main_diag");
            return (Criteria) this;
        }

        public Criteria andMain_diagGreaterThanOrEqualTo(Byte value) {
            addCriterion("main_diag >=", value, "main_diag");
            return (Criteria) this;
        }

        public Criteria andMain_diagLessThan(Byte value) {
            addCriterion("main_diag <", value, "main_diag");
            return (Criteria) this;
        }

        public Criteria andMain_diagLessThanOrEqualTo(Byte value) {
            addCriterion("main_diag <=", value, "main_diag");
            return (Criteria) this;
        }

        public Criteria andMain_diagIn(List<Byte> values) {
            addCriterion("main_diag in", values, "main_diag");
            return (Criteria) this;
        }

        public Criteria andMain_diagNotIn(List<Byte> values) {
            addCriterion("main_diag not in", values, "main_diag");
            return (Criteria) this;
        }

        public Criteria andMain_diagBetween(Byte value1, Byte value2) {
            addCriterion("main_diag between", value1, value2, "main_diag");
            return (Criteria) this;
        }

        public Criteria andMain_diagNotBetween(Byte value1, Byte value2) {
            addCriterion("main_diag not between", value1, value2, "main_diag");
            return (Criteria) this;
        }

        public Criteria andDetail_diagIsNull() {
            addCriterion("detail_diag is null");
            return (Criteria) this;
        }

        public Criteria andDetail_diagIsNotNull() {
            addCriterion("detail_diag is not null");
            return (Criteria) this;
        }

        public Criteria andDetail_diagEqualTo(String value) {
            addCriterion("detail_diag =", value, "detail_diag");
            return (Criteria) this;
        }

        public Criteria andDetail_diagNotEqualTo(String value) {
            addCriterion("detail_diag <>", value, "detail_diag");
            return (Criteria) this;
        }

        public Criteria andDetail_diagGreaterThan(String value) {
            addCriterion("detail_diag >", value, "detail_diag");
            return (Criteria) this;
        }

        public Criteria andDetail_diagGreaterThanOrEqualTo(String value) {
            addCriterion("detail_diag >=", value, "detail_diag");
            return (Criteria) this;
        }

        public Criteria andDetail_diagLessThan(String value) {
            addCriterion("detail_diag <", value, "detail_diag");
            return (Criteria) this;
        }

        public Criteria andDetail_diagLessThanOrEqualTo(String value) {
            addCriterion("detail_diag <=", value, "detail_diag");
            return (Criteria) this;
        }

        public Criteria andDetail_diagLike(String value) {
            addCriterion("detail_diag like", value, "detail_diag");
            return (Criteria) this;
        }

        public Criteria andDetail_diagNotLike(String value) {
            addCriterion("detail_diag not like", value, "detail_diag");
            return (Criteria) this;
        }

        public Criteria andDetail_diagIn(List<String> values) {
            addCriterion("detail_diag in", values, "detail_diag");
            return (Criteria) this;
        }

        public Criteria andDetail_diagNotIn(List<String> values) {
            addCriterion("detail_diag not in", values, "detail_diag");
            return (Criteria) this;
        }

        public Criteria andDetail_diagBetween(String value1, String value2) {
            addCriterion("detail_diag between", value1, value2, "detail_diag");
            return (Criteria) this;
        }

        public Criteria andDetail_diagNotBetween(String value1, String value2) {
            addCriterion("detail_diag not between", value1, value2, "detail_diag");
            return (Criteria) this;
        }

        public Criteria andCreate_timeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreate_timeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreate_timeEqualTo(Date value) {
            addCriterionForJDBCDate("create_time =", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeNotEqualTo(Date value) {
            addCriterionForJDBCDate("create_time <>", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeGreaterThan(Date value) {
            addCriterionForJDBCDate("create_time >", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("create_time >=", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeLessThan(Date value) {
            addCriterionForJDBCDate("create_time <", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("create_time <=", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeIn(List<Date> values) {
            addCriterionForJDBCDate("create_time in", values, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeNotIn(List<Date> values) {
            addCriterionForJDBCDate("create_time not in", values, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("create_time between", value1, value2, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("create_time not between", value1, value2, "create_time");
            return (Criteria) this;
        }

        public Criteria andUpt_timeIsNull() {
            addCriterion("upt_time is null");
            return (Criteria) this;
        }

        public Criteria andUpt_timeIsNotNull() {
            addCriterion("upt_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpt_timeEqualTo(Date value) {
            addCriterionForJDBCDate("upt_time =", value, "upt_time");
            return (Criteria) this;
        }

        public Criteria andUpt_timeNotEqualTo(Date value) {
            addCriterionForJDBCDate("upt_time <>", value, "upt_time");
            return (Criteria) this;
        }

        public Criteria andUpt_timeGreaterThan(Date value) {
            addCriterionForJDBCDate("upt_time >", value, "upt_time");
            return (Criteria) this;
        }

        public Criteria andUpt_timeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("upt_time >=", value, "upt_time");
            return (Criteria) this;
        }

        public Criteria andUpt_timeLessThan(Date value) {
            addCriterionForJDBCDate("upt_time <", value, "upt_time");
            return (Criteria) this;
        }

        public Criteria andUpt_timeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("upt_time <=", value, "upt_time");
            return (Criteria) this;
        }

        public Criteria andUpt_timeIn(List<Date> values) {
            addCriterionForJDBCDate("upt_time in", values, "upt_time");
            return (Criteria) this;
        }

        public Criteria andUpt_timeNotIn(List<Date> values) {
            addCriterionForJDBCDate("upt_time not in", values, "upt_time");
            return (Criteria) this;
        }

        public Criteria andUpt_timeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("upt_time between", value1, value2, "upt_time");
            return (Criteria) this;
        }

        public Criteria andUpt_timeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("upt_time not between", value1, value2, "upt_time");
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