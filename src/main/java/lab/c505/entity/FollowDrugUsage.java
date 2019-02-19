package lab.c505.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.util.Date;

@TableName(value = "t_follow_drug_usage")
public class FollowDrugUsage {

    @TableId(type = IdType.AUTO)
    private String drugUsageId;

    private BigDecimal drugDosage;

    private String drugDosageUnit;

    private Integer drugTime;

    private Integer drugDay;

    private Integer drugPeriod;

    private String drugPeriodUnit;

    private String drugId;

    private String medicalHistoryId;

    private Date createTime;

    private String createUser;

    private Date modifyTime;

    private String modifyUser;

    private Integer deleteFlag;

    private Integer version;

    private Integer followUpIndex;

    public FollowDrugUsage(String drugUsageId, BigDecimal drugDosage, String drugDosageUnit, Integer drugTime, Integer drugDay, Integer drugPeriod, String drugPeriodUnit, String drugId, String medicalHistoryId, Date createTime, String createUser, Date modifyTime, String modifyUser, Integer deleteFlag, Integer version, Integer followUpIndex) {
        this.drugUsageId = drugUsageId;
        this.drugDosage = drugDosage;
        this.drugDosageUnit = drugDosageUnit;
        this.drugTime = drugTime;
        this.drugDay = drugDay;
        this.drugPeriod = drugPeriod;
        this.drugPeriodUnit = drugPeriodUnit;
        this.drugId = drugId;
        this.medicalHistoryId = medicalHistoryId;
        this.createTime = createTime;
        this.createUser = createUser;
        this.modifyTime = modifyTime;
        this.modifyUser = modifyUser;
        this.deleteFlag = deleteFlag;
        this.version = version;
        this.followUpIndex = followUpIndex;
    }

    public FollowDrugUsage() {
        super();
    }

    public String getDrugUsageId() {
        return drugUsageId;
    }

    public void setDrugUsageId(String drugUsageId) {
        this.drugUsageId = drugUsageId == null ? null : drugUsageId.trim();
    }

    public BigDecimal getDrugDosage() {
        return drugDosage;
    }

    public void setDrugDosage(BigDecimal drugDosage) {
        this.drugDosage = drugDosage;
    }

    public String getDrugDosageUnit() {
        return drugDosageUnit;
    }

    public void setDrugDosageUnit(String drugDosageUnit) {
        this.drugDosageUnit = drugDosageUnit == null ? null : drugDosageUnit.trim();
    }

    public Integer getDrugTime() {
        return drugTime;
    }

    public void setDrugTime(Integer drugTime) {
        this.drugTime = drugTime;
    }

    public Integer getDrugDay() {
        return drugDay;
    }

    public void setDrugDay(Integer drugDay) {
        this.drugDay = drugDay;
    }

    public Integer getDrugPeriod() {
        return drugPeriod;
    }

    public void setDrugPeriod(Integer drugPeriod) {
        this.drugPeriod = drugPeriod;
    }

    public String getDrugPeriodUnit() {
        return drugPeriodUnit;
    }

    public void setDrugPeriodUnit(String drugPeriodUnit) {
        this.drugPeriodUnit = drugPeriodUnit == null ? null : drugPeriodUnit.trim();
    }

    public String getDrugId() {
        return drugId;
    }

    public void setDrugId(String drugId) {
        this.drugId = drugId == null ? null : drugId.trim();
    }

    public String getMedicalHistoryId() {
        return medicalHistoryId;
    }

    public void setMedicalHistoryId(String medicalHistoryId) {
        this.medicalHistoryId = medicalHistoryId == null ? null : medicalHistoryId.trim();
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

    public Integer getFollowUpIndex() {
        return followUpIndex;
    }

    public void setFollowUpIndex(Integer followUpIndex) {
        this.followUpIndex = followUpIndex;
    }
}