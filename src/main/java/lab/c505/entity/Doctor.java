package lab.c505.entity;

import java.util.Date;

public class Doctor {
    private String doctorId;

    private String doctorName;

    private Byte gender;

    private String doctorMajor;

    private String deptId;

    private String doctorNum;

    private String qcNum;

    private String qcDate;

    private String opqcNum;

    private String opqcDate;

    private Date createTime;

    private String createUser;

    private Date modifyTime;

    private String modifyUser;

    private Integer deleteFlag;

    private Integer version;

    public Doctor(String doctorId, String doctorName, Byte gender, String doctorMajor, String deptId, String doctorNum, String qcNum, String qcDate, String opqcNum, String opqcDate, Date createTime, String createUser, Date modifyTime, String modifyUser, Integer deleteFlag, Integer version) {
        this.doctorId = doctorId;
        this.doctorName = doctorName;
        this.gender = gender;
        this.doctorMajor = doctorMajor;
        this.deptId = deptId;
        this.doctorNum = doctorNum;
        this.qcNum = qcNum;
        this.qcDate = qcDate;
        this.opqcNum = opqcNum;
        this.opqcDate = opqcDate;
        this.createTime = createTime;
        this.createUser = createUser;
        this.modifyTime = modifyTime;
        this.modifyUser = modifyUser;
        this.deleteFlag = deleteFlag;
        this.version = version;
    }

    public Doctor() {
        super();
    }

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId == null ? null : doctorId.trim();
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName == null ? null : doctorName.trim();
    }

    public Byte getGender() {
        return gender;
    }

    public void setGender(Byte gender) {
        this.gender = gender;
    }

    public String getDoctorMajor() {
        return doctorMajor;
    }

    public void setDoctorMajor(String doctorMajor) {
        this.doctorMajor = doctorMajor == null ? null : doctorMajor.trim();
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId == null ? null : deptId.trim();
    }

    public String getDoctorNum() {
        return doctorNum;
    }

    public void setDoctorNum(String doctorNum) {
        this.doctorNum = doctorNum == null ? null : doctorNum.trim();
    }

    public String getQcNum() {
        return qcNum;
    }

    public void setQcNum(String qcNum) {
        this.qcNum = qcNum == null ? null : qcNum.trim();
    }

    public String getQcDate() {
        return qcDate;
    }

    public void setQcDate(String qcDate) {
        this.qcDate = qcDate == null ? null : qcDate.trim();
    }

    public String getOpqcNum() {
        return opqcNum;
    }

    public void setOpqcNum(String opqcNum) {
        this.opqcNum = opqcNum == null ? null : opqcNum.trim();
    }

    public String getOpqcDate() {
        return opqcDate;
    }

    public void setOpqcDate(String opqcDate) {
        this.opqcDate = opqcDate == null ? null : opqcDate.trim();
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