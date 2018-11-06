package lab.c505.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PatientExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PatientExample() {
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

        public Criteria andPatient_numberIsNull() {
            addCriterion("patient_number is null");
            return (Criteria) this;
        }

        public Criteria andPatient_numberIsNotNull() {
            addCriterion("patient_number is not null");
            return (Criteria) this;
        }

        public Criteria andPatient_numberEqualTo(String value) {
            addCriterion("patient_number =", value, "patient_number");
            return (Criteria) this;
        }

        public Criteria andPatient_numberNotEqualTo(String value) {
            addCriterion("patient_number <>", value, "patient_number");
            return (Criteria) this;
        }

        public Criteria andPatient_numberGreaterThan(String value) {
            addCriterion("patient_number >", value, "patient_number");
            return (Criteria) this;
        }

        public Criteria andPatient_numberGreaterThanOrEqualTo(String value) {
            addCriterion("patient_number >=", value, "patient_number");
            return (Criteria) this;
        }

        public Criteria andPatient_numberLessThan(String value) {
            addCriterion("patient_number <", value, "patient_number");
            return (Criteria) this;
        }

        public Criteria andPatient_numberLessThanOrEqualTo(String value) {
            addCriterion("patient_number <=", value, "patient_number");
            return (Criteria) this;
        }

        public Criteria andPatient_numberLike(String value) {
            addCriterion("patient_number like", value, "patient_number");
            return (Criteria) this;
        }

        public Criteria andPatient_numberNotLike(String value) {
            addCriterion("patient_number not like", value, "patient_number");
            return (Criteria) this;
        }

        public Criteria andPatient_numberIn(List<String> values) {
            addCriterion("patient_number in", values, "patient_number");
            return (Criteria) this;
        }

        public Criteria andPatient_numberNotIn(List<String> values) {
            addCriterion("patient_number not in", values, "patient_number");
            return (Criteria) this;
        }

        public Criteria andPatient_numberBetween(String value1, String value2) {
            addCriterion("patient_number between", value1, value2, "patient_number");
            return (Criteria) this;
        }

        public Criteria andPatient_numberNotBetween(String value1, String value2) {
            addCriterion("patient_number not between", value1, value2, "patient_number");
            return (Criteria) this;
        }

        public Criteria andPatient_nameIsNull() {
            addCriterion("patient_name is null");
            return (Criteria) this;
        }

        public Criteria andPatient_nameIsNotNull() {
            addCriterion("patient_name is not null");
            return (Criteria) this;
        }

        public Criteria andPatient_nameEqualTo(String value) {
            addCriterion("patient_name =", value, "patient_name");
            return (Criteria) this;
        }

        public Criteria andPatient_nameNotEqualTo(String value) {
            addCriterion("patient_name <>", value, "patient_name");
            return (Criteria) this;
        }

        public Criteria andPatient_nameGreaterThan(String value) {
            addCriterion("patient_name >", value, "patient_name");
            return (Criteria) this;
        }

        public Criteria andPatient_nameGreaterThanOrEqualTo(String value) {
            addCriterion("patient_name >=", value, "patient_name");
            return (Criteria) this;
        }

        public Criteria andPatient_nameLessThan(String value) {
            addCriterion("patient_name <", value, "patient_name");
            return (Criteria) this;
        }

        public Criteria andPatient_nameLessThanOrEqualTo(String value) {
            addCriterion("patient_name <=", value, "patient_name");
            return (Criteria) this;
        }

        public Criteria andPatient_nameLike(String value) {
            addCriterion("patient_name like", value, "patient_name");
            return (Criteria) this;
        }

        public Criteria andPatient_nameNotLike(String value) {
            addCriterion("patient_name not like", value, "patient_name");
            return (Criteria) this;
        }

        public Criteria andPatient_nameIn(List<String> values) {
            addCriterion("patient_name in", values, "patient_name");
            return (Criteria) this;
        }

        public Criteria andPatient_nameNotIn(List<String> values) {
            addCriterion("patient_name not in", values, "patient_name");
            return (Criteria) this;
        }

        public Criteria andPatient_nameBetween(String value1, String value2) {
            addCriterion("patient_name between", value1, value2, "patient_name");
            return (Criteria) this;
        }

        public Criteria andPatient_nameNotBetween(String value1, String value2) {
            addCriterion("patient_name not between", value1, value2, "patient_name");
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

        public Criteria andPatient_nationIsNull() {
            addCriterion("patient_nation is null");
            return (Criteria) this;
        }

        public Criteria andPatient_nationIsNotNull() {
            addCriterion("patient_nation is not null");
            return (Criteria) this;
        }

        public Criteria andPatient_nationEqualTo(Byte value) {
            addCriterion("patient_nation =", value, "patient_nation");
            return (Criteria) this;
        }

        public Criteria andPatient_nationNotEqualTo(Byte value) {
            addCriterion("patient_nation <>", value, "patient_nation");
            return (Criteria) this;
        }

        public Criteria andPatient_nationGreaterThan(Byte value) {
            addCriterion("patient_nation >", value, "patient_nation");
            return (Criteria) this;
        }

        public Criteria andPatient_nationGreaterThanOrEqualTo(Byte value) {
            addCriterion("patient_nation >=", value, "patient_nation");
            return (Criteria) this;
        }

        public Criteria andPatient_nationLessThan(Byte value) {
            addCriterion("patient_nation <", value, "patient_nation");
            return (Criteria) this;
        }

        public Criteria andPatient_nationLessThanOrEqualTo(Byte value) {
            addCriterion("patient_nation <=", value, "patient_nation");
            return (Criteria) this;
        }

        public Criteria andPatient_nationIn(List<Byte> values) {
            addCriterion("patient_nation in", values, "patient_nation");
            return (Criteria) this;
        }

        public Criteria andPatient_nationNotIn(List<Byte> values) {
            addCriterion("patient_nation not in", values, "patient_nation");
            return (Criteria) this;
        }

        public Criteria andPatient_nationBetween(Byte value1, Byte value2) {
            addCriterion("patient_nation between", value1, value2, "patient_nation");
            return (Criteria) this;
        }

        public Criteria andPatient_nationNotBetween(Byte value1, Byte value2) {
            addCriterion("patient_nation not between", value1, value2, "patient_nation");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(Date value) {
            addCriterionForJDBCDate("birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andOnset_ageIsNull() {
            addCriterion("onset_age is null");
            return (Criteria) this;
        }

        public Criteria andOnset_ageIsNotNull() {
            addCriterion("onset_age is not null");
            return (Criteria) this;
        }

        public Criteria andOnset_ageEqualTo(Byte value) {
            addCriterion("onset_age =", value, "onset_age");
            return (Criteria) this;
        }

        public Criteria andOnset_ageNotEqualTo(Byte value) {
            addCriterion("onset_age <>", value, "onset_age");
            return (Criteria) this;
        }

        public Criteria andOnset_ageGreaterThan(Byte value) {
            addCriterion("onset_age >", value, "onset_age");
            return (Criteria) this;
        }

        public Criteria andOnset_ageGreaterThanOrEqualTo(Byte value) {
            addCriterion("onset_age >=", value, "onset_age");
            return (Criteria) this;
        }

        public Criteria andOnset_ageLessThan(Byte value) {
            addCriterion("onset_age <", value, "onset_age");
            return (Criteria) this;
        }

        public Criteria andOnset_ageLessThanOrEqualTo(Byte value) {
            addCriterion("onset_age <=", value, "onset_age");
            return (Criteria) this;
        }

        public Criteria andOnset_ageIn(List<Byte> values) {
            addCriterion("onset_age in", values, "onset_age");
            return (Criteria) this;
        }

        public Criteria andOnset_ageNotIn(List<Byte> values) {
            addCriterion("onset_age not in", values, "onset_age");
            return (Criteria) this;
        }

        public Criteria andOnset_ageBetween(Byte value1, Byte value2) {
            addCriterion("onset_age between", value1, value2, "onset_age");
            return (Criteria) this;
        }

        public Criteria andOnset_ageNotBetween(Byte value1, Byte value2) {
            addCriterion("onset_age not between", value1, value2, "onset_age");
            return (Criteria) this;
        }

        public Criteria andMobile_phoneIsNull() {
            addCriterion("mobile_phone is null");
            return (Criteria) this;
        }

        public Criteria andMobile_phoneIsNotNull() {
            addCriterion("mobile_phone is not null");
            return (Criteria) this;
        }

        public Criteria andMobile_phoneEqualTo(String value) {
            addCriterion("mobile_phone =", value, "mobile_phone");
            return (Criteria) this;
        }

        public Criteria andMobile_phoneNotEqualTo(String value) {
            addCriterion("mobile_phone <>", value, "mobile_phone");
            return (Criteria) this;
        }

        public Criteria andMobile_phoneGreaterThan(String value) {
            addCriterion("mobile_phone >", value, "mobile_phone");
            return (Criteria) this;
        }

        public Criteria andMobile_phoneGreaterThanOrEqualTo(String value) {
            addCriterion("mobile_phone >=", value, "mobile_phone");
            return (Criteria) this;
        }

        public Criteria andMobile_phoneLessThan(String value) {
            addCriterion("mobile_phone <", value, "mobile_phone");
            return (Criteria) this;
        }

        public Criteria andMobile_phoneLessThanOrEqualTo(String value) {
            addCriterion("mobile_phone <=", value, "mobile_phone");
            return (Criteria) this;
        }

        public Criteria andMobile_phoneLike(String value) {
            addCriterion("mobile_phone like", value, "mobile_phone");
            return (Criteria) this;
        }

        public Criteria andMobile_phoneNotLike(String value) {
            addCriterion("mobile_phone not like", value, "mobile_phone");
            return (Criteria) this;
        }

        public Criteria andMobile_phoneIn(List<String> values) {
            addCriterion("mobile_phone in", values, "mobile_phone");
            return (Criteria) this;
        }

        public Criteria andMobile_phoneNotIn(List<String> values) {
            addCriterion("mobile_phone not in", values, "mobile_phone");
            return (Criteria) this;
        }

        public Criteria andMobile_phoneBetween(String value1, String value2) {
            addCriterion("mobile_phone between", value1, value2, "mobile_phone");
            return (Criteria) this;
        }

        public Criteria andMobile_phoneNotBetween(String value1, String value2) {
            addCriterion("mobile_phone not between", value1, value2, "mobile_phone");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNull() {
            addCriterion("telephone is null");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNotNull() {
            addCriterion("telephone is not null");
            return (Criteria) this;
        }

        public Criteria andTelephoneEqualTo(String value) {
            addCriterion("telephone =", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotEqualTo(String value) {
            addCriterion("telephone <>", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThan(String value) {
            addCriterion("telephone >", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("telephone >=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThan(String value) {
            addCriterion("telephone <", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThanOrEqualTo(String value) {
            addCriterion("telephone <=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLike(String value) {
            addCriterion("telephone like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotLike(String value) {
            addCriterion("telephone not like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneIn(List<String> values) {
            addCriterion("telephone in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotIn(List<String> values) {
            addCriterion("telephone not in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneBetween(String value1, String value2) {
            addCriterion("telephone between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotBetween(String value1, String value2) {
            addCriterion("telephone not between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andEmergency_contactIsNull() {
            addCriterion("emergency_contact is null");
            return (Criteria) this;
        }

        public Criteria andEmergency_contactIsNotNull() {
            addCriterion("emergency_contact is not null");
            return (Criteria) this;
        }

        public Criteria andEmergency_contactEqualTo(String value) {
            addCriterion("emergency_contact =", value, "emergency_contact");
            return (Criteria) this;
        }

        public Criteria andEmergency_contactNotEqualTo(String value) {
            addCriterion("emergency_contact <>", value, "emergency_contact");
            return (Criteria) this;
        }

        public Criteria andEmergency_contactGreaterThan(String value) {
            addCriterion("emergency_contact >", value, "emergency_contact");
            return (Criteria) this;
        }

        public Criteria andEmergency_contactGreaterThanOrEqualTo(String value) {
            addCriterion("emergency_contact >=", value, "emergency_contact");
            return (Criteria) this;
        }

        public Criteria andEmergency_contactLessThan(String value) {
            addCriterion("emergency_contact <", value, "emergency_contact");
            return (Criteria) this;
        }

        public Criteria andEmergency_contactLessThanOrEqualTo(String value) {
            addCriterion("emergency_contact <=", value, "emergency_contact");
            return (Criteria) this;
        }

        public Criteria andEmergency_contactLike(String value) {
            addCriterion("emergency_contact like", value, "emergency_contact");
            return (Criteria) this;
        }

        public Criteria andEmergency_contactNotLike(String value) {
            addCriterion("emergency_contact not like", value, "emergency_contact");
            return (Criteria) this;
        }

        public Criteria andEmergency_contactIn(List<String> values) {
            addCriterion("emergency_contact in", values, "emergency_contact");
            return (Criteria) this;
        }

        public Criteria andEmergency_contactNotIn(List<String> values) {
            addCriterion("emergency_contact not in", values, "emergency_contact");
            return (Criteria) this;
        }

        public Criteria andEmergency_contactBetween(String value1, String value2) {
            addCriterion("emergency_contact between", value1, value2, "emergency_contact");
            return (Criteria) this;
        }

        public Criteria andEmergency_contactNotBetween(String value1, String value2) {
            addCriterion("emergency_contact not between", value1, value2, "emergency_contact");
            return (Criteria) this;
        }

        public Criteria andEmergency_phoneIsNull() {
            addCriterion("emergency_phone is null");
            return (Criteria) this;
        }

        public Criteria andEmergency_phoneIsNotNull() {
            addCriterion("emergency_phone is not null");
            return (Criteria) this;
        }

        public Criteria andEmergency_phoneEqualTo(String value) {
            addCriterion("emergency_phone =", value, "emergency_phone");
            return (Criteria) this;
        }

        public Criteria andEmergency_phoneNotEqualTo(String value) {
            addCriterion("emergency_phone <>", value, "emergency_phone");
            return (Criteria) this;
        }

        public Criteria andEmergency_phoneGreaterThan(String value) {
            addCriterion("emergency_phone >", value, "emergency_phone");
            return (Criteria) this;
        }

        public Criteria andEmergency_phoneGreaterThanOrEqualTo(String value) {
            addCriterion("emergency_phone >=", value, "emergency_phone");
            return (Criteria) this;
        }

        public Criteria andEmergency_phoneLessThan(String value) {
            addCriterion("emergency_phone <", value, "emergency_phone");
            return (Criteria) this;
        }

        public Criteria andEmergency_phoneLessThanOrEqualTo(String value) {
            addCriterion("emergency_phone <=", value, "emergency_phone");
            return (Criteria) this;
        }

        public Criteria andEmergency_phoneLike(String value) {
            addCriterion("emergency_phone like", value, "emergency_phone");
            return (Criteria) this;
        }

        public Criteria andEmergency_phoneNotLike(String value) {
            addCriterion("emergency_phone not like", value, "emergency_phone");
            return (Criteria) this;
        }

        public Criteria andEmergency_phoneIn(List<String> values) {
            addCriterion("emergency_phone in", values, "emergency_phone");
            return (Criteria) this;
        }

        public Criteria andEmergency_phoneNotIn(List<String> values) {
            addCriterion("emergency_phone not in", values, "emergency_phone");
            return (Criteria) this;
        }

        public Criteria andEmergency_phoneBetween(String value1, String value2) {
            addCriterion("emergency_phone between", value1, value2, "emergency_phone");
            return (Criteria) this;
        }

        public Criteria andEmergency_phoneNotBetween(String value1, String value2) {
            addCriterion("emergency_phone not between", value1, value2, "emergency_phone");
            return (Criteria) this;
        }

        public Criteria andIs_marriedIsNull() {
            addCriterion("is_married is null");
            return (Criteria) this;
        }

        public Criteria andIs_marriedIsNotNull() {
            addCriterion("is_married is not null");
            return (Criteria) this;
        }

        public Criteria andIs_marriedEqualTo(Byte value) {
            addCriterion("is_married =", value, "is_married");
            return (Criteria) this;
        }

        public Criteria andIs_marriedNotEqualTo(Byte value) {
            addCriterion("is_married <>", value, "is_married");
            return (Criteria) this;
        }

        public Criteria andIs_marriedGreaterThan(Byte value) {
            addCriterion("is_married >", value, "is_married");
            return (Criteria) this;
        }

        public Criteria andIs_marriedGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_married >=", value, "is_married");
            return (Criteria) this;
        }

        public Criteria andIs_marriedLessThan(Byte value) {
            addCriterion("is_married <", value, "is_married");
            return (Criteria) this;
        }

        public Criteria andIs_marriedLessThanOrEqualTo(Byte value) {
            addCriterion("is_married <=", value, "is_married");
            return (Criteria) this;
        }

        public Criteria andIs_marriedIn(List<Byte> values) {
            addCriterion("is_married in", values, "is_married");
            return (Criteria) this;
        }

        public Criteria andIs_marriedNotIn(List<Byte> values) {
            addCriterion("is_married not in", values, "is_married");
            return (Criteria) this;
        }

        public Criteria andIs_marriedBetween(Byte value1, Byte value2) {
            addCriterion("is_married between", value1, value2, "is_married");
            return (Criteria) this;
        }

        public Criteria andIs_marriedNotBetween(Byte value1, Byte value2) {
            addCriterion("is_married not between", value1, value2, "is_married");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNull() {
            addCriterion("province is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("province is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(Byte value) {
            addCriterion("province =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(Byte value) {
            addCriterion("province <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(Byte value) {
            addCriterion("province >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(Byte value) {
            addCriterion("province >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(Byte value) {
            addCriterion("province <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(Byte value) {
            addCriterion("province <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<Byte> values) {
            addCriterion("province in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<Byte> values) {
            addCriterion("province not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(Byte value1, Byte value2) {
            addCriterion("province between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(Byte value1, Byte value2) {
            addCriterion("province not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(Byte value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(Byte value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(Byte value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(Byte value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(Byte value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(Byte value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<Byte> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<Byte> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(Byte value1, Byte value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(Byte value1, Byte value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCountyIsNull() {
            addCriterion("county is null");
            return (Criteria) this;
        }

        public Criteria andCountyIsNotNull() {
            addCriterion("county is not null");
            return (Criteria) this;
        }

        public Criteria andCountyEqualTo(Byte value) {
            addCriterion("county =", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyNotEqualTo(Byte value) {
            addCriterion("county <>", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyGreaterThan(Byte value) {
            addCriterion("county >", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyGreaterThanOrEqualTo(Byte value) {
            addCriterion("county >=", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyLessThan(Byte value) {
            addCriterion("county <", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyLessThanOrEqualTo(Byte value) {
            addCriterion("county <=", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyIn(List<Byte> values) {
            addCriterion("county in", values, "county");
            return (Criteria) this;
        }

        public Criteria andCountyNotIn(List<Byte> values) {
            addCriterion("county not in", values, "county");
            return (Criteria) this;
        }

        public Criteria andCountyBetween(Byte value1, Byte value2) {
            addCriterion("county between", value1, value2, "county");
            return (Criteria) this;
        }

        public Criteria andCountyNotBetween(Byte value1, Byte value2) {
            addCriterion("county not between", value1, value2, "county");
            return (Criteria) this;
        }

        public Criteria andMedical_methodIsNull() {
            addCriterion("medical_method is null");
            return (Criteria) this;
        }

        public Criteria andMedical_methodIsNotNull() {
            addCriterion("medical_method is not null");
            return (Criteria) this;
        }

        public Criteria andMedical_methodEqualTo(Byte value) {
            addCriterion("medical_method =", value, "medical_method");
            return (Criteria) this;
        }

        public Criteria andMedical_methodNotEqualTo(Byte value) {
            addCriterion("medical_method <>", value, "medical_method");
            return (Criteria) this;
        }

        public Criteria andMedical_methodGreaterThan(Byte value) {
            addCriterion("medical_method >", value, "medical_method");
            return (Criteria) this;
        }

        public Criteria andMedical_methodGreaterThanOrEqualTo(Byte value) {
            addCriterion("medical_method >=", value, "medical_method");
            return (Criteria) this;
        }

        public Criteria andMedical_methodLessThan(Byte value) {
            addCriterion("medical_method <", value, "medical_method");
            return (Criteria) this;
        }

        public Criteria andMedical_methodLessThanOrEqualTo(Byte value) {
            addCriterion("medical_method <=", value, "medical_method");
            return (Criteria) this;
        }

        public Criteria andMedical_methodIn(List<Byte> values) {
            addCriterion("medical_method in", values, "medical_method");
            return (Criteria) this;
        }

        public Criteria andMedical_methodNotIn(List<Byte> values) {
            addCriterion("medical_method not in", values, "medical_method");
            return (Criteria) this;
        }

        public Criteria andMedical_methodBetween(Byte value1, Byte value2) {
            addCriterion("medical_method between", value1, value2, "medical_method");
            return (Criteria) this;
        }

        public Criteria andMedical_methodNotBetween(Byte value1, Byte value2) {
            addCriterion("medical_method not between", value1, value2, "medical_method");
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