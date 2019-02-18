package lab.c505.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;

@TableName(value = "t_change_drug_log")
public class ChangeDrugLog {

    @TableId(type = IdType.AUTO)
    private String changeDrugId;

    private String operateDocId;

    private String followUpId;

    private String preDrugUsage;

    private String aftDrugUsage;

    private Date changeTime;

    private String changeReason;

    private Date createTime;

    private String createUser;

    private Date modifyTime;

    private String modifyUser;

    private Integer deleteFlag;

    private Integer version;

    public ChangeDrugLog(String changeDrugId, String operateDocId, String followUpId, String preDrugUsage, String aftDrugUsage, Date changeTime, String changeReason, Date createTime, String createUser, Date modifyTime, String modifyUser, Integer deleteFlag, Integer version) {
        this.changeDrugId = changeDrugId;
        this.operateDocId = operateDocId;
        this.followUpId = followUpId;
        this.preDrugUsage = preDrugUsage;
        this.aftDrugUsage = aftDrugUsage;
        this.changeTime = changeTime;
        this.changeReason = changeReason;
        this.createTime = createTime;
        this.createUser = createUser;
        this.modifyTime = modifyTime;
        this.modifyUser = modifyUser;
        this.deleteFlag = deleteFlag;
        this.version = version;
    }

    public ChangeDrugLog() {
        super();
    }

    public String getChangeDrugId() {
        return changeDrugId;
    }

    public void setChangeDrugId(String changeDrugId) {
        this.changeDrugId = changeDrugId == null ? null : changeDrugId.trim();
    }

    public String getOperateDocId() {
        return operateDocId;
    }

    public void setOperateDocId(String operateDocId) {
        this.operateDocId = operateDocId == null ? null : operateDocId.trim();
    }

    public String getFollowUpId() {
        return followUpId;
    }

    public void setFollowUpId(String followUpId) {
        this.followUpId = followUpId == null ? null : followUpId.trim();
    }

    public String getPreDrugUsage() {
        return preDrugUsage;
    }

    public void setPreDrugUsage(String preDrugUsage) {
        this.preDrugUsage = preDrugUsage == null ? null : preDrugUsage.trim();
    }

    public String getAftDrugUsage() {
        return aftDrugUsage;
    }

    public void setAftDrugUsage(String aftDrugUsage) {
        this.aftDrugUsage = aftDrugUsage == null ? null : aftDrugUsage.trim();
    }

    public Date getChangeTime() {
        return changeTime;
    }

    public void setChangeTime(Date changeTime) {
        this.changeTime = changeTime;
    }

    public String getChangeReason() {
        return changeReason;
    }

    public void setChangeReason(String changeReason) {
        this.changeReason = changeReason == null ? null : changeReason.trim();
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