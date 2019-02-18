package lab.c505.entity;

import java.util.Date;

public class InspectionConclusion {
    private String inspectionConclusionId;

    private String medicalHistoryId;

    private String examCategory;

    private String examConclusion;

    private Date examTime;

    private Integer examIndex;

    private Date createTime;

    private String createUser;

    private Date modifyTime;

    private String modifyUser;

    private Integer deleteFlag;

    private Integer version;

    public InspectionConclusion(String inspectionConclusionId, String medicalHistoryId, String examCategory, String examConclusion, Date examTime, Integer examIndex, Date createTime, String createUser, Date modifyTime, String modifyUser, Integer deleteFlag, Integer version) {
        this.inspectionConclusionId = inspectionConclusionId;
        this.medicalHistoryId = medicalHistoryId;
        this.examCategory = examCategory;
        this.examConclusion = examConclusion;
        this.examTime = examTime;
        this.examIndex = examIndex;
        this.createTime = createTime;
        this.createUser = createUser;
        this.modifyTime = modifyTime;
        this.modifyUser = modifyUser;
        this.deleteFlag = deleteFlag;
        this.version = version;
    }

    public InspectionConclusion() {
        super();
    }

    public String getInspectionConclusionId() {
        return inspectionConclusionId;
    }

    public void setInspectionConclusionId(String inspectionConclusionId) {
        this.inspectionConclusionId = inspectionConclusionId == null ? null : inspectionConclusionId.trim();
    }

    public String getMedicalHistoryId() {
        return medicalHistoryId;
    }

    public void setMedicalHistoryId(String medicalHistoryId) {
        this.medicalHistoryId = medicalHistoryId == null ? null : medicalHistoryId.trim();
    }

    public String getExamCategory() {
        return examCategory;
    }

    public void setExamCategory(String examCategory) {
        this.examCategory = examCategory == null ? null : examCategory.trim();
    }

    public String getExamConclusion() {
        return examConclusion;
    }

    public void setExamConclusion(String examConclusion) {
        this.examConclusion = examConclusion == null ? null : examConclusion.trim();
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