package lab.c505.entity;

import java.util.Date;

public class ExamItem {
    private String examItemId;

    private String examCategoryId;

    private String examItemCode;

    private String examItemName;

    private String shortName;

    private String itemUnit;

    private Date createTime;

    private String createUser;

    private Date modifyTime;

    private String modifyUser;

    private Integer deleteFlag;

    private Integer version;

    public ExamItem(String examItemId, String examCategoryId, String examItemCode, String examItemName, String shortName, String itemUnit, Date createTime, String createUser, Date modifyTime, String modifyUser, Integer deleteFlag, Integer version) {
        this.examItemId = examItemId;
        this.examCategoryId = examCategoryId;
        this.examItemCode = examItemCode;
        this.examItemName = examItemName;
        this.shortName = shortName;
        this.itemUnit = itemUnit;
        this.createTime = createTime;
        this.createUser = createUser;
        this.modifyTime = modifyTime;
        this.modifyUser = modifyUser;
        this.deleteFlag = deleteFlag;
        this.version = version;
    }

    public ExamItem() {
        super();
    }

    public String getExamItemId() {
        return examItemId;
    }

    public void setExamItemId(String examItemId) {
        this.examItemId = examItemId == null ? null : examItemId.trim();
    }

    public String getExamCategoryId() {
        return examCategoryId;
    }

    public void setExamCategoryId(String examCategoryId) {
        this.examCategoryId = examCategoryId == null ? null : examCategoryId.trim();
    }

    public String getExamItemCode() {
        return examItemCode;
    }

    public void setExamItemCode(String examItemCode) {
        this.examItemCode = examItemCode == null ? null : examItemCode.trim();
    }

    public String getExamItemName() {
        return examItemName;
    }

    public void setExamItemName(String examItemName) {
        this.examItemName = examItemName == null ? null : examItemName.trim();
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName == null ? null : shortName.trim();
    }

    public String getItemUnit() {
        return itemUnit;
    }

    public void setItemUnit(String itemUnit) {
        this.itemUnit = itemUnit == null ? null : itemUnit.trim();
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