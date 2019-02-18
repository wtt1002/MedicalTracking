package lab.c505.entity;

import java.util.Date;

public class RehabilitationItem {
    private String rehabilitationItemId;

    private String rehabilitationItemCode;

    private String rehabilitationItemName;

    private String rehabilitationTrainCategoryId;

    private Date createTime;

    private String createUser;

    private Date modifyTime;

    private String modifyUser;

    private Integer deleteFlag;

    private Integer version;

    public RehabilitationItem(String rehabilitationItemId, String rehabilitationItemCode, String rehabilitationItemName, String rehabilitationTrainCategoryId, Date createTime, String createUser, Date modifyTime, String modifyUser, Integer deleteFlag, Integer version) {
        this.rehabilitationItemId = rehabilitationItemId;
        this.rehabilitationItemCode = rehabilitationItemCode;
        this.rehabilitationItemName = rehabilitationItemName;
        this.rehabilitationTrainCategoryId = rehabilitationTrainCategoryId;
        this.createTime = createTime;
        this.createUser = createUser;
        this.modifyTime = modifyTime;
        this.modifyUser = modifyUser;
        this.deleteFlag = deleteFlag;
        this.version = version;
    }

    public RehabilitationItem() {
        super();
    }

    public String getRehabilitationItemId() {
        return rehabilitationItemId;
    }

    public void setRehabilitationItemId(String rehabilitationItemId) {
        this.rehabilitationItemId = rehabilitationItemId == null ? null : rehabilitationItemId.trim();
    }

    public String getRehabilitationItemCode() {
        return rehabilitationItemCode;
    }

    public void setRehabilitationItemCode(String rehabilitationItemCode) {
        this.rehabilitationItemCode = rehabilitationItemCode == null ? null : rehabilitationItemCode.trim();
    }

    public String getRehabilitationItemName() {
        return rehabilitationItemName;
    }

    public void setRehabilitationItemName(String rehabilitationItemName) {
        this.rehabilitationItemName = rehabilitationItemName == null ? null : rehabilitationItemName.trim();
    }

    public String getRehabilitationTrainCategoryId() {
        return rehabilitationTrainCategoryId;
    }

    public void setRehabilitationTrainCategoryId(String rehabilitationTrainCategoryId) {
        this.rehabilitationTrainCategoryId = rehabilitationTrainCategoryId == null ? null : rehabilitationTrainCategoryId.trim();
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