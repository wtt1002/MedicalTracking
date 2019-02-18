package lab.c505.entity;

import java.math.BigDecimal;
import java.util.Date;

public class MedicalHistory {
    private String medicalHistoryId;

    private String patientId;

    private String admissionNum;

    private Date inTime;

    private Date outTime;

    private String operateDoc;

    private String mainDiagnose;

    private String riskFactor;

    private String preDrugs;

    private Integer bloodPressureH;

    private Integer bloodPressureL;

    private Integer heartRate;

    private BigDecimal height;

    private BigDecimal weight;

    private BigDecimal bmi;

    private Date createTime;

    private String createUser;

    private Date modifyTime;

    private String modifyUser;

    private Integer deleteFlag;

    private Integer version;

    public MedicalHistory(String medicalHistoryId, String patientId, String admissionNum, Date inTime, Date outTime, String operateDoc, String mainDiagnose, String riskFactor, String preDrugs, Integer bloodPressureH, Integer bloodPressureL, Integer heartRate, BigDecimal height, BigDecimal weight, BigDecimal bmi, Date createTime, String createUser, Date modifyTime, String modifyUser, Integer deleteFlag, Integer version) {
        this.medicalHistoryId = medicalHistoryId;
        this.patientId = patientId;
        this.admissionNum = admissionNum;
        this.inTime = inTime;
        this.outTime = outTime;
        this.operateDoc = operateDoc;
        this.mainDiagnose = mainDiagnose;
        this.riskFactor = riskFactor;
        this.preDrugs = preDrugs;
        this.bloodPressureH = bloodPressureH;
        this.bloodPressureL = bloodPressureL;
        this.heartRate = heartRate;
        this.height = height;
        this.weight = weight;
        this.bmi = bmi;
        this.createTime = createTime;
        this.createUser = createUser;
        this.modifyTime = modifyTime;
        this.modifyUser = modifyUser;
        this.deleteFlag = deleteFlag;
        this.version = version;
    }

    public MedicalHistory() {
        super();
    }

    public String getMedicalHistoryId() {
        return medicalHistoryId;
    }

    public void setMedicalHistoryId(String medicalHistoryId) {
        this.medicalHistoryId = medicalHistoryId == null ? null : medicalHistoryId.trim();
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId == null ? null : patientId.trim();
    }

    public String getAdmissionNum() {
        return admissionNum;
    }

    public void setAdmissionNum(String admissionNum) {
        this.admissionNum = admissionNum == null ? null : admissionNum.trim();
    }

    public Date getInTime() {
        return inTime;
    }

    public void setInTime(Date inTime) {
        this.inTime = inTime;
    }

    public Date getOutTime() {
        return outTime;
    }

    public void setOutTime(Date outTime) {
        this.outTime = outTime;
    }

    public String getOperateDoc() {
        return operateDoc;
    }

    public void setOperateDoc(String operateDoc) {
        this.operateDoc = operateDoc == null ? null : operateDoc.trim();
    }

    public String getMainDiagnose() {
        return mainDiagnose;
    }

    public void setMainDiagnose(String mainDiagnose) {
        this.mainDiagnose = mainDiagnose == null ? null : mainDiagnose.trim();
    }

    public String getRiskFactor() {
        return riskFactor;
    }

    public void setRiskFactor(String riskFactor) {
        this.riskFactor = riskFactor == null ? null : riskFactor.trim();
    }

    public String getPreDrugs() {
        return preDrugs;
    }

    public void setPreDrugs(String preDrugs) {
        this.preDrugs = preDrugs == null ? null : preDrugs.trim();
    }

    public Integer getBloodPressureH() {
        return bloodPressureH;
    }

    public void setBloodPressureH(Integer bloodPressureH) {
        this.bloodPressureH = bloodPressureH;
    }

    public Integer getBloodPressureL() {
        return bloodPressureL;
    }

    public void setBloodPressureL(Integer bloodPressureL) {
        this.bloodPressureL = bloodPressureL;
    }

    public Integer getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(Integer heartRate) {
        this.heartRate = heartRate;
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