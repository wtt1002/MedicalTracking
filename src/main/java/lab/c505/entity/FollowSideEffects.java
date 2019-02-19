package lab.c505.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;

@TableName(value = "t_follow_side_effects")
public class FollowSideEffects {

    @TableId(type = IdType.AUTO)
    private String sideEffectsId;

    private String stomachStimulation;

    private String hemorrhage;

    private String goHospital;

    private String dyspnea;

    private String followUpId;

    private Date createTime;

    private String createUser;

    private Date modifyTime;

    private String modifyUser;

    private Integer deleteFlag;

    private Integer version;

    public FollowSideEffects(String sideEffectsId, String stomachStimulation, String hemorrhage, String goHospital, String dyspnea, String followUpId, Date createTime, String createUser, Date modifyTime, String modifyUser, Integer deleteFlag, Integer version) {
        this.sideEffectsId = sideEffectsId;
        this.stomachStimulation = stomachStimulation;
        this.hemorrhage = hemorrhage;
        this.goHospital = goHospital;
        this.dyspnea = dyspnea;
        this.followUpId = followUpId;
        this.createTime = createTime;
        this.createUser = createUser;
        this.modifyTime = modifyTime;
        this.modifyUser = modifyUser;
        this.deleteFlag = deleteFlag;
        this.version = version;
    }

    public FollowSideEffects() {
        super();
    }

    public String getSideEffectsId() {
        return sideEffectsId;
    }

    public void setSideEffectsId(String sideEffectsId) {
        this.sideEffectsId = sideEffectsId == null ? null : sideEffectsId.trim();
    }

    public String getStomachStimulation() {
        return stomachStimulation;
    }

    public void setStomachStimulation(String stomachStimulation) {
        this.stomachStimulation = stomachStimulation == null ? null : stomachStimulation.trim();
    }

    public String getHemorrhage() {
        return hemorrhage;
    }

    public void setHemorrhage(String hemorrhage) {
        this.hemorrhage = hemorrhage == null ? null : hemorrhage.trim();
    }

    public String getGoHospital() {
        return goHospital;
    }

    public void setGoHospital(String goHospital) {
        this.goHospital = goHospital == null ? null : goHospital.trim();
    }

    public String getDyspnea() {
        return dyspnea;
    }

    public void setDyspnea(String dyspnea) {
        this.dyspnea = dyspnea == null ? null : dyspnea.trim();
    }

    public String getFollowUpId() {
        return followUpId;
    }

    public void setFollowUpId(String followUpId) {
        this.followUpId = followUpId == null ? null : followUpId.trim();
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