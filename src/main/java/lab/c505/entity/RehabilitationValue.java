package lab.c505.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;

@TableName(value = "t_rehabilitation_value")
public class RehabilitationValue {

    @TableId(type = IdType.AUTO)
    private String trainValueId;

    private String rehabilitationItemId;

    private String medicalHistoryId;

    private Integer trainValue;

    private Byte trainPeriod;

    private Byte trainIntensity;

    private Byte trainTime;

    private Byte trainGroup;

    private Byte trainDuration;

    private String otherInfo;

    private Date createTime;

    private String createUser;

    private Date modifyTime;

    private String modifyUser;

    private Integer deleteFlag;

    private Integer version;

    public RehabilitationValue(String trainValueId, String rehabilitationItemId, String medicalHistoryId, Integer trainValue, Byte trainPeriod, Byte trainIntensity, Byte trainTime, Byte trainGroup, Byte trainDuration, String otherInfo, Date createTime, String createUser, Date modifyTime, String modifyUser, Integer deleteFlag, Integer version) {
        this.trainValueId = trainValueId;
        this.rehabilitationItemId = rehabilitationItemId;
        this.medicalHistoryId = medicalHistoryId;
        this.trainValue = trainValue;
        this.trainPeriod = trainPeriod;
        this.trainIntensity = trainIntensity;
        this.trainTime = trainTime;
        this.trainGroup = trainGroup;
        this.trainDuration = trainDuration;
        this.otherInfo = otherInfo;
        this.createTime = createTime;
        this.createUser = createUser;
        this.modifyTime = modifyTime;
        this.modifyUser = modifyUser;
        this.deleteFlag = deleteFlag;
        this.version = version;
    }

    public RehabilitationValue() {
        super();
    }

    public String getTrainValueId() {
        return trainValueId;
    }

    public void setTrainValueId(String trainValueId) {
        this.trainValueId = trainValueId == null ? null : trainValueId.trim();
    }

    public String getRehabilitationItemId() {
        return rehabilitationItemId;
    }

    public void setRehabilitationItemId(String rehabilitationItemId) {
        this.rehabilitationItemId = rehabilitationItemId == null ? null : rehabilitationItemId.trim();
    }

    public String getMedicalHistoryId() {
        return medicalHistoryId;
    }

    public void setMedicalHistoryId(String medicalHistoryId) {
        this.medicalHistoryId = medicalHistoryId == null ? null : medicalHistoryId.trim();
    }

    public Integer getTrainValue() {
        return trainValue;
    }

    public void setTrainValue(Integer trainValue) {
        this.trainValue = trainValue;
    }

    public Byte getTrainPeriod() {
        return trainPeriod;
    }

    public void setTrainPeriod(Byte trainPeriod) {
        this.trainPeriod = trainPeriod;
    }

    public Byte getTrainIntensity() {
        return trainIntensity;
    }

    public void setTrainIntensity(Byte trainIntensity) {
        this.trainIntensity = trainIntensity;
    }

    public Byte getTrainTime() {
        return trainTime;
    }

    public void setTrainTime(Byte trainTime) {
        this.trainTime = trainTime;
    }

    public Byte getTrainGroup() {
        return trainGroup;
    }

    public void setTrainGroup(Byte trainGroup) {
        this.trainGroup = trainGroup;
    }

    public Byte getTrainDuration() {
        return trainDuration;
    }

    public void setTrainDuration(Byte trainDuration) {
        this.trainDuration = trainDuration;
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