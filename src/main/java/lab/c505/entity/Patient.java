package lab.c505.entity;

import java.util.Date;

public class Patient {
    private String patientId;

    private String name;

    private String numId;

    private String gender;

    private String nation;

    private String province;

    private String city;

    private String district;

    private String address;

    private Date birthday;

    private Integer sickAge;

    private String mobilePhone;

    private String telphone;

    private String emergePeople;

    private String emergePhone;

    private String emergeRelationship;

    private String married;

    private String profession;

    private String education;

    private String income;

    private String professionStatus;

    private Date createTime;

    private String createUser;

    private Date modifyTime;

    private String modifyUser;

    private Integer deleteFlag;

    private Integer version;

    public Patient(String patientId, String name, String numId, String gender, String nation, String province, String city, String district, String address, Date birthday, Integer sickAge, String mobilePhone, String telphone, String emergePeople, String emergePhone, String emergeRelationship, String married, String profession, String education, String income, String professionStatus, Date createTime, String createUser, Date modifyTime, String modifyUser, Integer deleteFlag, Integer version) {
        this.patientId = patientId;
        this.name = name;
        this.numId = numId;
        this.gender = gender;
        this.nation = nation;
        this.province = province;
        this.city = city;
        this.district = district;
        this.address = address;
        this.birthday = birthday;
        this.sickAge = sickAge;
        this.mobilePhone = mobilePhone;
        this.telphone = telphone;
        this.emergePeople = emergePeople;
        this.emergePhone = emergePhone;
        this.emergeRelationship = emergeRelationship;
        this.married = married;
        this.profession = profession;
        this.education = education;
        this.income = income;
        this.professionStatus = professionStatus;
        this.createTime = createTime;
        this.createUser = createUser;
        this.modifyTime = modifyTime;
        this.modifyUser = modifyUser;
        this.deleteFlag = deleteFlag;
        this.version = version;
    }

    public Patient() {
        super();
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId == null ? null : patientId.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getNumId() {
        return numId;
    }

    public void setNumId(String numId) {
        this.numId = numId == null ? null : numId.trim();
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

    public Integer getSickAge() {
        return sickAge;
    }

    public void setSickAge(Integer sickAge) {
        this.sickAge = sickAge;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone == null ? null : mobilePhone.trim();
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone == null ? null : telphone.trim();
    }

    public String getEmergePeople() {
        return emergePeople;
    }

    public void setEmergePeople(String emergePeople) {
        this.emergePeople = emergePeople == null ? null : emergePeople.trim();
    }

    public String getEmergePhone() {
        return emergePhone;
    }

    public void setEmergePhone(String emergePhone) {
        this.emergePhone = emergePhone == null ? null : emergePhone.trim();
    }

    public String getEmergeRelationship() {
        return emergeRelationship;
    }

    public void setEmergeRelationship(String emergeRelationship) {
        this.emergeRelationship = emergeRelationship == null ? null : emergeRelationship.trim();
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

    public String getProfessionStatus() {
        return professionStatus;
    }

    public void setProfessionStatus(String professionStatus) {
        this.professionStatus = professionStatus == null ? null : professionStatus.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getModifyUser() {
        return modifyUser;
    }

    public void setModifyUser(String modifyUser) {
        this.modifyUser = modifyUser == null ? null : modifyUser.trim();
    }

    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }
}