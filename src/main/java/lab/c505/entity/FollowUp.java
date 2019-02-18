package lab.c505.entity;

import java.util.Date;

public class FollowUp {
    private String followUpId;

    private String medicalHistoryId;

    private String doctorId;

    private Date planTime;

    private Date finalTime;

    private Date planWay;

    private Date finalWay;

    private Integer followUpDuration;

    private String recoveryStatus;

    private String furtherConsultation;

    private String recentSymptoms;

    private Integer followUpIndex;

    private Date createTime;

    private String createUser;

    private Date modifyTime;

    private String modifyUser;

    private Integer deleteFlag;

    private Integer version;

    public FollowUp(String followUpId, String medicalHistoryId, String doctorId, Date planTime, Date finalTime, Date planWay, Date finalWay, Integer followUpDuration, String recoveryStatus, String furtherConsultation, String recentSymptoms, Integer followUpIndex, Date createTime, String createUser, Date modifyTime, String modifyUser, Integer deleteFlag, Integer version) {
        this.followUpId = followUpId;
        this.medicalHistoryId = medicalHistoryId;
        this.doctorId = doctorId;
        this.planTime = planTime;
        this.finalTime = finalTime;
        this.planWay = planWay;
        this.finalWay = finalWay;
        this.followUpDuration = followUpDuration;
        this.recoveryStatus = recoveryStatus;
        this.furtherConsultation = furtherConsultation;
        this.recentSymptoms = recentSymptoms;
        this.followUpIndex = followUpIndex;
        this.createTime = createTime;
        this.createUser = createUser;
        this.modifyTime = modifyTime;
        this.modifyUser = modifyUser;
        this.deleteFlag = deleteFlag;
        this.version = version;
    }

    public FollowUp() {
        super();
    }

    public String getFollowUpId() {
        return followUpId;
    }

    public void setFollowUpId(String followUpId) {
        this.followUpId = followUpId == null ? null : followUpId.trim();
    }

    public String getMedicalHistoryId() {
        return medicalHistoryId;
    }

    public void setMedicalHistoryId(String medicalHistoryId) {
        this.medicalHistoryId = medicalHistoryId == null ? null : medicalHistoryId.trim();
    }

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId == null ? null : doctorId.trim();
    }

    public Date getPlanTime() {
        return planTime;
    }

    public void setPlanTime(Date planTime) {
        this.planTime = planTime;
    }

    public Date getFinalTime() {
        return finalTime;
    }

    public void setFinalTime(Date finalTime) {
        this.finalTime = finalTime;
    }

    public Date getPlanWay() {
        return planWay;
    }

    public void setPlanWay(Date planWay) {
        this.planWay = planWay;
    }

    public Date getFinalWay() {
        return finalWay;
    }

    public void setFinalWay(Date finalWay) {
        this.finalWay = finalWay;
    }

    public Integer getFollowUpDuration() {
        return followUpDuration;
    }

    public void setFollowUpDuration(Integer followUpDuration) {
        this.followUpDuration = followUpDuration;
    }

    public String getRecoveryStatus() {
        return recoveryStatus;
    }

    public void setRecoveryStatus(String recoveryStatus) {
        this.recoveryStatus = recoveryStatus == null ? null : recoveryStatus.trim();
    }

    public String getFurtherConsultation() {
        return furtherConsultation;
    }

    public void setFurtherConsultation(String furtherConsultation) {
        this.furtherConsultation = furtherConsultation == null ? null : furtherConsultation.trim();
    }

    public String getRecentSymptoms() {
        return recentSymptoms;
    }

    public void setRecentSymptoms(String recentSymptoms) {
        this.recentSymptoms = recentSymptoms == null ? null : recentSymptoms.trim();
    }

    public Integer getFollowUpIndex() {
        return followUpIndex;
    }

    public void setFollowUpIndex(Integer followUpIndex) {
        this.followUpIndex = followUpIndex;
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