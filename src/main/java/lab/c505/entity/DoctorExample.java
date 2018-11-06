package lab.c505.entity;

import java.util.ArrayList;
import java.util.List;

public class DoctorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DoctorExample() {
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

        public Criteria andDoctor_idIsNull() {
            addCriterion("doctor_id is null");
            return (Criteria) this;
        }

        public Criteria andDoctor_idIsNotNull() {
            addCriterion("doctor_id is not null");
            return (Criteria) this;
        }

        public Criteria andDoctor_idEqualTo(Long value) {
            addCriterion("doctor_id =", value, "doctor_id");
            return (Criteria) this;
        }

        public Criteria andDoctor_idNotEqualTo(Long value) {
            addCriterion("doctor_id <>", value, "doctor_id");
            return (Criteria) this;
        }

        public Criteria andDoctor_idGreaterThan(Long value) {
            addCriterion("doctor_id >", value, "doctor_id");
            return (Criteria) this;
        }

        public Criteria andDoctor_idGreaterThanOrEqualTo(Long value) {
            addCriterion("doctor_id >=", value, "doctor_id");
            return (Criteria) this;
        }

        public Criteria andDoctor_idLessThan(Long value) {
            addCriterion("doctor_id <", value, "doctor_id");
            return (Criteria) this;
        }

        public Criteria andDoctor_idLessThanOrEqualTo(Long value) {
            addCriterion("doctor_id <=", value, "doctor_id");
            return (Criteria) this;
        }

        public Criteria andDoctor_idIn(List<Long> values) {
            addCriterion("doctor_id in", values, "doctor_id");
            return (Criteria) this;
        }

        public Criteria andDoctor_idNotIn(List<Long> values) {
            addCriterion("doctor_id not in", values, "doctor_id");
            return (Criteria) this;
        }

        public Criteria andDoctor_idBetween(Long value1, Long value2) {
            addCriterion("doctor_id between", value1, value2, "doctor_id");
            return (Criteria) this;
        }

        public Criteria andDoctor_idNotBetween(Long value1, Long value2) {
            addCriterion("doctor_id not between", value1, value2, "doctor_id");
            return (Criteria) this;
        }

        public Criteria andDoctor_numberIsNull() {
            addCriterion("doctor_number is null");
            return (Criteria) this;
        }

        public Criteria andDoctor_numberIsNotNull() {
            addCriterion("doctor_number is not null");
            return (Criteria) this;
        }

        public Criteria andDoctor_numberEqualTo(String value) {
            addCriterion("doctor_number =", value, "doctor_number");
            return (Criteria) this;
        }

        public Criteria andDoctor_numberNotEqualTo(String value) {
            addCriterion("doctor_number <>", value, "doctor_number");
            return (Criteria) this;
        }

        public Criteria andDoctor_numberGreaterThan(String value) {
            addCriterion("doctor_number >", value, "doctor_number");
            return (Criteria) this;
        }

        public Criteria andDoctor_numberGreaterThanOrEqualTo(String value) {
            addCriterion("doctor_number >=", value, "doctor_number");
            return (Criteria) this;
        }

        public Criteria andDoctor_numberLessThan(String value) {
            addCriterion("doctor_number <", value, "doctor_number");
            return (Criteria) this;
        }

        public Criteria andDoctor_numberLessThanOrEqualTo(String value) {
            addCriterion("doctor_number <=", value, "doctor_number");
            return (Criteria) this;
        }

        public Criteria andDoctor_numberLike(String value) {
            addCriterion("doctor_number like", value, "doctor_number");
            return (Criteria) this;
        }

        public Criteria andDoctor_numberNotLike(String value) {
            addCriterion("doctor_number not like", value, "doctor_number");
            return (Criteria) this;
        }

        public Criteria andDoctor_numberIn(List<String> values) {
            addCriterion("doctor_number in", values, "doctor_number");
            return (Criteria) this;
        }

        public Criteria andDoctor_numberNotIn(List<String> values) {
            addCriterion("doctor_number not in", values, "doctor_number");
            return (Criteria) this;
        }

        public Criteria andDoctor_numberBetween(String value1, String value2) {
            addCriterion("doctor_number between", value1, value2, "doctor_number");
            return (Criteria) this;
        }

        public Criteria andDoctor_numberNotBetween(String value1, String value2) {
            addCriterion("doctor_number not between", value1, value2, "doctor_number");
            return (Criteria) this;
        }

        public Criteria andDoctor_nameIsNull() {
            addCriterion("doctor_name is null");
            return (Criteria) this;
        }

        public Criteria andDoctor_nameIsNotNull() {
            addCriterion("doctor_name is not null");
            return (Criteria) this;
        }

        public Criteria andDoctor_nameEqualTo(String value) {
            addCriterion("doctor_name =", value, "doctor_name");
            return (Criteria) this;
        }

        public Criteria andDoctor_nameNotEqualTo(String value) {
            addCriterion("doctor_name <>", value, "doctor_name");
            return (Criteria) this;
        }

        public Criteria andDoctor_nameGreaterThan(String value) {
            addCriterion("doctor_name >", value, "doctor_name");
            return (Criteria) this;
        }

        public Criteria andDoctor_nameGreaterThanOrEqualTo(String value) {
            addCriterion("doctor_name >=", value, "doctor_name");
            return (Criteria) this;
        }

        public Criteria andDoctor_nameLessThan(String value) {
            addCriterion("doctor_name <", value, "doctor_name");
            return (Criteria) this;
        }

        public Criteria andDoctor_nameLessThanOrEqualTo(String value) {
            addCriterion("doctor_name <=", value, "doctor_name");
            return (Criteria) this;
        }

        public Criteria andDoctor_nameLike(String value) {
            addCriterion("doctor_name like", value, "doctor_name");
            return (Criteria) this;
        }

        public Criteria andDoctor_nameNotLike(String value) {
            addCriterion("doctor_name not like", value, "doctor_name");
            return (Criteria) this;
        }

        public Criteria andDoctor_nameIn(List<String> values) {
            addCriterion("doctor_name in", values, "doctor_name");
            return (Criteria) this;
        }

        public Criteria andDoctor_nameNotIn(List<String> values) {
            addCriterion("doctor_name not in", values, "doctor_name");
            return (Criteria) this;
        }

        public Criteria andDoctor_nameBetween(String value1, String value2) {
            addCriterion("doctor_name between", value1, value2, "doctor_name");
            return (Criteria) this;
        }

        public Criteria andDoctor_nameNotBetween(String value1, String value2) {
            addCriterion("doctor_name not between", value1, value2, "doctor_name");
            return (Criteria) this;
        }

        public Criteria andGenderIsNull() {
            addCriterion("gender is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("gender is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(Byte value) {
            addCriterion("gender =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(Byte value) {
            addCriterion("gender <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(Byte value) {
            addCriterion("gender >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(Byte value) {
            addCriterion("gender >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(Byte value) {
            addCriterion("gender <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(Byte value) {
            addCriterion("gender <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<Byte> values) {
            addCriterion("gender in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<Byte> values) {
            addCriterion("gender not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(Byte value1, Byte value2) {
            addCriterion("gender between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(Byte value1, Byte value2) {
            addCriterion("gender not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
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