package lab.c505.entity;

import java.util.Date;

public class Patient {
    private Long patient_id;

    private String patient_number;

    private String patient_name;

    private Byte gender;

    private Byte patient_nation;

    private Date birthday;

    private Byte onset_age;

    private String mobile_phone;

    private String telephone;

    private String emergency_contact;

    private String emergency_phone;

    private Byte is_married;

    private Byte province;

    private Byte city;

    private Byte county;

    private Byte medical_method;

    public Long getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(Long patient_id) {
        this.patient_id = patient_id;
    }

    public String getPatient_number() {
        return patient_number;
    }

    public void setPatient_number(String patient_number) {
        this.patient_number = patient_number;
    }

    public String getPatient_name() {
        return patient_name;
    }

    public void setPatient_name(String patient_name) {
        this.patient_name = patient_name;
    }

    public Byte getGender() {
        return gender;
    }

    public void setGender(Byte gender) {
        this.gender = gender;
    }

    public Byte getPatient_nation() {
        return patient_nation;
    }

    public void setPatient_nation(Byte patient_nation) {
        this.patient_nation = patient_nation;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Byte getOnset_age() {
        return onset_age;
    }

    public void setOnset_age(Byte onset_age) {
        this.onset_age = onset_age;
    }

    public String getMobile_phone() {
        return mobile_phone;
    }

    public void setMobile_phone(String mobile_phone) {
        this.mobile_phone = mobile_phone;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmergency_contact() {
        return emergency_contact;
    }

    public void setEmergency_contact(String emergency_contact) {
        this.emergency_contact = emergency_contact;
    }

    public String getEmergency_phone() {
        return emergency_phone;
    }

    public void setEmergency_phone(String emergency_phone) {
        this.emergency_phone = emergency_phone;
    }

    public Byte getIs_married() {
        return is_married;
    }

    public void setIs_married(Byte is_married) {
        this.is_married = is_married;
    }

    public Byte getProvince() {
        return province;
    }

    public void setProvince(Byte province) {
        this.province = province;
    }

    public Byte getCity() {
        return city;
    }

    public void setCity(Byte city) {
        this.city = city;
    }

    public Byte getCounty() {
        return county;
    }

    public void setCounty(Byte county) {
        this.county = county;
    }

    public Byte getMedical_method() {
        return medical_method;
    }

    public void setMedical_method(Byte medical_method) {
        this.medical_method = medical_method;
    }
}