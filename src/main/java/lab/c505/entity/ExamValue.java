package lab.c505.entity;

import java.math.BigDecimal;
import java.util.Date;

public class ExamValue {
    private String examValueId;

    private String examItemId;

    private String medicalHistoryId;

    private BigDecimal examValue;

    private Date examTime;

    private Integer examIndex;

    private Date createTime;

    private String createUser;

    private Date modifyTime;

    private String modifyUser;

    private Integer deleteFlag;

    private Integer version;

    public ExamValue(String examValueId, String examItemId, String medicalHistoryId, BigDecimal examValue, Date examTime, Integer examIndex, Date createTime, String createUser, Date modifyTime, String modifyUser, Integer deleteFlag, Integer version) {
        this.examValueId = examValueId;
        this.examItemId = examItemId;
        this.medicalHistoryId = medicalHistoryId;
        this.examValue = examValue;
        this.examTime = examTime;
        this.examIndex = examIndex;
        this.createTime = createTime;
        this.createUser = createUser;
        this.modifyTime = modifyTime;
        this.modifyUser = modifyUser;
        this.deleteFlag = deleteFlag;
        this.version = version;
    }

    public ExamValue() {
        super();
    }

    public String getExamValueId() {
        return examValueId;
    }

    public void setExamValueId(String examValueId) {
        this.examValueId = examValueId == null ? null : examValueId.trim();
    }

    public String getExamItemId() {
        return examItemId;
    }

    public void setExamItemId(String examItemId) {
        this.examItemId = examItemId == null ? null : examItemId.trim();
    }

    public String getMedicalHistoryId() {
        return medicalHistoryId;
    }

    public void setMedicalHistoryId(String medicalHistoryId) {
        this.medicalHistoryId = medicalHistoryId == null ? null : medicalHistoryId.trim();
    }

    public BigDecimal getExamValue() {
        return examValue;
    }

    public void setExamValue(BigDecimal examValue) {
        this.examValue = examValue;
    }

    public Date getExamTime() {
        return examTime;
    }

    public void setExamTime(Date examTime) {
        this.examTime = examTime;
    }

    public Integer getExamIndex() {
        return examIndex;
    }

    public void setExamIndex(Integer examIndex) {
        this.examIndex = examIndex;
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