package lab.c505.entity;

import java.util.Date;

public class Patient {
    private String patient_id;

    private String name;

    private String num_id;

    private String gender;

    private String nation;

    private String province;

    private String city;

    private String district;

    private String address;

    private Date birthday;

    private Integer sick_age;

    private String mobile_phone;

    private String telphone;

    private String emerge_people;

    private String emerge_phone;

    private String emerge_relationship;

    private String married;

    private String profession;

    private String education;

    private String income;

    private String profession_status;

    private Date create_time;

    private String create_user;

    private Date modify_time;

    private String modify_user;

    private Integer delete_flag;

    private Integer version;

    public Patient(String patient_id, String name, String num_id, String gender, String nation, String province, String city, String district, String address, Date birthday, Integer sick_age, String mobile_phone, String telphone, String emerge_people, String emerge_phone, String emerge_relationship, String married, String profession, String education, String income, String profession_status, Date create_time, String create_user, Date modify_time, String modify_user, Integer delete_flag, Integer version) {
        this.patient_id = patient_id;
        this.name = name;
        this.num_id = num_id;
        this.gender = gender;
        this.nation = nation;
        this.province = province;
        this.city = city;
        this.district = district;
        this.address = address;
        this.birthday = birthday;
        this.sick_age = sick_age;
        this.mobile_phone = mobile_phone;
        this.telphone = telphone;
        this.emerge_people = emerge_people;
        this.emerge_phone = emerge_phone;
        this.emerge_relationship = emerge_relationship;
        this.married = married;
        this.profession = profession;
        this.education = education;
        this.income = income;
        this.profession_status = profession_status;
        this.create_time = create_time;
        this.create_user = create_user;
        this.modify_time = modify_time;
        this.modify_user = modify_user;
        this.delete_flag = delete_flag;
        this.version = version;
    }

    public Patient() {
        super();
    }

    public String getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(String patient_id) {
        this.patient_id = patient_id == null ? null : patient_id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getNum_id() {
        return num_id;
    }

    public void setNum_id(String num_id) {
        this.num_id = num_id == null ? null : num_id.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation == null ? null : nation.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district == null ? null : district.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Integer getSick_age() {
        return sick_age;
    }

    public void setSick_age(Integer sick_age) {
        this.sick_age = sick_age;
    }

    public String getMobile_phone() {
        return mobile_phone;
    }

    public void setMobile_phone(String mobile_phone) {
        this.mobile_phone = mobile_phone == null ? null : mobile_phone.trim();
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone == null ? null : telphone.trim();
    }

    public String getEmerge_people() {
        return emerge_people;
    }

    public void setEmerge_people(String emerge_people) {
        this.emerge_people = emerge_people == null ? null : emerge_people.trim();
    }

    public String getEmerge_phone() {
        return emerge_phone;
    }

    public void setEmerge_phone(String emerge_phone) {
        this.emerge_phone = emerge_phone == null ? null : emerge_phone.trim();
    }

    public String getEmerge_relationship() {
        return emerge_relationship;
    }

    public void setEmerge_relationship(String emerge_relationship) {
        this.emerge_relationship = emerge_relationship == null ? null : emerge_relationship.trim();
    }

    public String getMarried() {
        return married;
    }

    public void setMarried(String married) {
        this.married = married == null ? null : married.trim();
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession == null ? null : profession.trim();
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education == null ? null : education.trim();
    }

    public String getIncome() {
        return income;
    }

    public void setIncome(String income) {
        this.income = income == null ? null : income.trim();
    }

    public String getProfession_status() {
        return profession_status;
    }

    public void setProfession_status(String profession_status) {
        this.profession_status = profession_status == null ? null : profession_status.trim();
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public String getCreate_user() {
        return create_user;
    }

    public void setCreate_user(String create_user) {
        this.create_user = create_user == null ? null : create_user.trim();
    }

    public Date getModify_time() {
        return modify_time;
    }

    public void setModify_time(Date modify_time) {
        this.modify_time = modify_time;
    }

    public String getModify_user() {
        return modify_user;
    }

    public void setModify_user(String modify_user) {
        this.modify_user = modify_user == null ? null : modify_user.trim();
    }

    public Integer getDelete_flag() {
        return delete_flag;
    }

    public void setDelete_flag(Integer delete_flag) {
        this.delete_flag = delete_flag;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }
}