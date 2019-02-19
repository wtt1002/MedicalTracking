package lab.c505.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;

@TableName(value = "t_follow_sick_history")
public class FollowSickHistory {

    @TableId(type = IdType.AUTO)
    private String followSickHistoryId;

    private String followUpId;

    private String ischemia;

    private String hemorrhage;

    private Byte revascularization;

    private Byte nyhaRank;

    private Byte isWeak;

    private Byte isSoreness;

    private Byte isSmoke;

    private Byte isPatientEdu;

    private String otherInfo;

    private Date createTime;

    private String createUser;

    private Date modifyTime;

    private String modifyUser;

    private Integer deleteFlag;

    private Integer version;

    public FollowSickHistory(String followSickHistoryId, String followUpId, String ischemia, String hemorrhage, Byte revascularization, Byte nyhaRank, Byte isWeak, Byte isSoreness, Byte isSmoke, Byte isPatientEdu, String otherInfo, Date createTime, String createUser, Date modifyTime, String modifyUser, Integer deleteFlag, Integer version) {
        this.followSickHistoryId = followSickHistoryId;
        this.followUpId = followUpId;
        this.ischemia = ischemia;
        this.hemorrhage = hemorrhage;
        this.revascularization = revascularization;
        this.nyhaRank = nyhaRank;
        this.isWeak = isWeak;
        this.isSoreness = isSoreness;
        this.isSmoke = isSmoke;
        this.isPatientEdu = isPatientEdu;
        this.otherInfo = otherInfo;
        this.createTime = createTime;
        this.createUser = createUser;
        this.modifyTime = modifyTime;
        this.modifyUser = modifyUser;
        this.deleteFlag = deleteFlag;
        this.version = version;
    }

    public FollowSickHistory() {
        super();
    }

    public String getFollowSickHistoryId() {
        return followSickHistoryId;
    }

    public void setFollowSickHistoryId(String followSickHistoryId) {
        this.followSickHistoryId = followSickHistoryId == null ? null : followSickHistoryId.trim();
    }

    public String getFollowUpId() {
        return followUpId;
    }

    public void setFollowUpId(String followUpId) {
        this.followUpId = followUpId == null ? null : followUpId.trim();
    }

    public String getIschemia() {
        return ischemia;
    }

    public void setIschemia(String ischemia) {
        this.ischemia = ischemia == null ? null : ischemia.trim();
    }

    public String getHemorrhage() {
        return hemorrhage;
    }

    public void setHemorrhage(String hemorrhage) {
        this.hemorrhage = hemorrhage == null ? null : hemorrhage.trim();
    }

    public Byte getRevascularization() {
        return revascularization;
    }

    public void setRevascularization(Byte revascularization) {
        this.revascularization = revascularization;
    }

    public Byte getNyhaRank() {
        return nyhaRank;
    }

    public void setNyhaRank(Byte nyhaRank) {
        this.nyhaRank = nyhaRank;
    }

    public Byte getIsWeak() {
        return isWeak;
    }

    public void setIsWeak(Byte isWeak) {
        this.isWeak = isWeak;
    }

    public Byte getIsSoreness() {
        return isSoreness;
    }

    public void setIsSoreness(Byte isSoreness) {
        this.isSoreness = isSoreness;
    }

    public Byte getIsSmoke() {
        return isSmoke;
    }

    public void setIsSmoke(Byte isSmoke) {
        this.isSmoke = isSmoke;
    }

    public Byte getIsPatientEdu() {
        return isPatientEdu;
    }

    public void setIsPatientEdu(Byte isPatientEdu) {
        this.isPatientEdu = isPatientEdu;
    }

    public String getOtherInfo() {
        return otherInfo;
    }

    public void setOtherInfo(String otherInfo) {
        this.otherInfo = otherInfo == null ? null : otherInfo.trim();
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