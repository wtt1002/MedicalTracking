package lab.c505.entity;

import java.util.Date;

public class RehabilitationTrainCategory {
    private String rehabilitationTrainCategoryId;

    private String rehabilitationTrainCategoryCode;

    private String rehabilitationTrainCategoryName;

    private Date createTime;

    private String createUser;

    private Date modifyTime;

    private String modifyUser;

    private Integer deleteFlag;

    private Integer version;

    public RehabilitationTrainCategory(String rehabilitationTrainCategoryId, String rehabilitationTrainCategoryCode, String rehabilitationTrainCategoryName, Date createTime, String createUser, Date modifyTime, String modifyUser, Integer deleteFlag, Integer version) {
        this.rehabilitationTrainCategoryId = rehabilitationTrainCategoryId;
        this.rehabilitationTrainCategoryCode = rehabilitationTrainCategoryCode;
        this.rehabilitationTrainCategoryName = rehabilitationTrainCategoryName;
        this.createTime = createTime;
        this.createUser = createUser;
        this.modifyTime = modifyTime;
        this.modifyUser = modifyUser;
        this.deleteFlag = deleteFlag;
        this.version = version;
    }

    public RehabilitationTrainCategory() {
        super();
    }

    public String getRehabilitationTrainCategoryId() {
        return rehabilitationTrainCategoryId;
    }

    public void setRehabilitationTrainCategoryId(String rehabilitationTrainCategoryId) {
        this.rehabilitationTrainCategoryId = rehabilitationTrainCategoryId == null ? null : rehabilitationTrainCategoryId.trim();
    }

    public String getRehabilitationTrainCategoryCode() {
        return rehabilitationTrainCategoryCode;
    }

    public void setRehabilitationTrainCategoryCode(String rehabilitationTrainCategoryCode) {
        this.rehabilitationTrainCategoryCode = rehabilitationTrainCategoryCode == null ? null : rehabilitationTrainCategoryCode.trim();
    }

    public String getRehabilitationTrainCategoryName() {
        return rehabilitationTrainCategoryName;
    }

    public void setRehabilitationTrainCategoryName(String rehabilitationTrainCategoryName) {
        this.rehabilitationTrainCategoryName = rehabilitationTrainCategoryName == null ? null : rehabilitationTrainCategoryName.trim();
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