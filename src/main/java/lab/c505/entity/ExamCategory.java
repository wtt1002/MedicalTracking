package lab.c505.entity;

import java.util.Date;

public class ExamCategory {
    private String examCategoryId;

    private String examCategoryCode;

    private String examCategoryName;

    private Date createTime;

    private String createUser;

    private Date modifyTime;

    private String modifyUser;

    private Integer deleteFlag;

    private Integer version;

    public ExamCategory(String examCategoryId, String examCategoryCode, String examCategoryName, Date createTime, String createUser, Date modifyTime, String modifyUser, Integer deleteFlag, Integer version) {
        this.examCategoryId = examCategoryId;
        this.examCategoryCode = examCategoryCode;
        this.examCategoryName = examCategoryName;
        this.createTime = createTime;
        this.createUser = createUser;
        this.modifyTime = modifyTime;
        this.modifyUser = modifyUser;
        this.deleteFlag = deleteFlag;
        this.version = version;
    }

    public ExamCategory() {
        super();
    }

    public String getExamCategoryId() {
        return examCategoryId;
    }

    public void setExamCategoryId(String examCategoryId) {
        this.examCategoryId = examCategoryId == null ? null : examCategoryId.trim();
    }

    public String getExamCategoryCode() {
        return examCategoryCode;
    }

    public void setExamCategoryCode(String examCategoryCode) {
        this.examCategoryCode = examCategoryCode == null ? null : examCategoryCode.trim();
    }

    public String getExamCategoryName() {
        return examCategoryName;
    }

    public void setExamCategoryName(String examCategoryName) {
        this.examCategoryName = examCategoryName == null ? null : examCategoryName.trim();
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