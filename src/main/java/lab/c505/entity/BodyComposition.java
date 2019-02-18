package lab.c505.entity;

import java.math.BigDecimal;
import java.util.Date;

public class BodyComposition {
    private String bodyCompositionId;

    private BigDecimal height;

    private BigDecimal weight;

    private BigDecimal bmi;

    private BigDecimal muscleWeight;

    private BigDecimal fatWeight;

    private BigDecimal bodyFatPercentage;

    private String medicalHistoryId;

    private Date createTime;

    private String createUser;

    private Date modifyTime;

    private String modifyUser;

    private Integer deleteFlag;

    private Integer version;

    public BodyComposition(String bodyCompositionId, BigDecimal height, BigDecimal weight, BigDecimal bmi, BigDecimal muscleWeight, BigDecimal fatWeight, BigDecimal bodyFatPercentage, String medicalHistoryId, Date createTime, String createUser, Date modifyTime, String modifyUser, Integer deleteFlag, Integer version) {
        this.bodyCompositionId = bodyCompositionId;
        this.height = height;
        this.weight = weight;
        this.bmi = bmi;
        this.muscleWeight = muscleWeight;
        this.fatWeight = fatWeight;
        this.bodyFatPercentage = bodyFatPercentage;
        this.medicalHistoryId = medicalHistoryId;
        this.createTime = createTime;
        this.createUser = createUser;
        this.modifyTime = modifyTime;
        this.modifyUser = modifyUser;
        this.deleteFlag = deleteFlag;
        this.version = version;
    }

    public BodyComposition() {
        super();
    }

    public String getBodyCompositionId() {
        return bodyCompositionId;
    }

    public void setBodyCompositionId(String bodyCompositionId) {
        this.bodyCompositionId = bodyCompositionId == null ? null : bodyCompositionId.trim();
    }

    public BigDecimal getHeight() {
        return height;
    }

    public void setHeight(BigDecimal height) {
        this.height = height;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public BigDecimal getBmi() {
        return bmi;
    }

    public void setBmi(BigDecimal bmi) {
        this.bmi = bmi;
    }

    public BigDecimal getMuscleWeight() {
        return muscleWeight;
    }

    public void setMuscleWeight(BigDecimal muscleWeight) {
        this.muscleWeight = muscleWeight;
    }

    public BigDecimal getFatWeight() {
        return fatWeight;
    }

    public void setFatWeight(BigDecimal fatWeight) {
        this.fatWeight = fatWeight;
    }

    public BigDecimal getBodyFatPercentage() {
        return bodyFatPercentage;
    }

    public void setBodyFatPercentage(BigDecimal bodyFatPercentage) {
        this.bodyFatPercentage = bodyFatPercentage;
    }

    public String getMedicalHistoryId() {
        return medicalHistoryId;
    }

    public void setMedicalHistoryId(String medicalHistoryId) {
        this.medicalHistoryId = medicalHistoryId == null ? null : medicalHistoryId.trim();
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