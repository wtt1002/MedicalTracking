package lab.c505.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.util.Date;

@TableName(value = "t_assessment")
public class Assessment {

    @TableId(type = IdType.AUTO)
    private String assessmentId;

    private BigDecimal sasScore;

    private BigDecimal sdsScore;

    private BigDecimal naScore;

    private BigDecimal psqiScore;

    private BigDecimal ipqaScore;

    private BigDecimal fagerstormScore;

    private BigDecimal leftGrip;

    private BigDecimal rightGrip;

    private BigDecimal threeMeterTest;

    private BigDecimal fourMeterTest;

    private BigDecimal standUpTest;

    private BigDecimal leftBalanceTest;

    private BigDecimal rightBalanceTest;

    private BigDecimal sitReach;

    private BigDecimal upperarmCircumference;

    private BigDecimal bmi;

    private BigDecimal tricepsSkinfoldThickness;

    private String medicalHistoryId;

    private Date createTime;

    private String createUser;

    private Date modifyTime;

    private String modifyUser;

    private Integer deleteFlag;

    private Integer version;

    public Assessment(String assessmentId, BigDecimal sasScore, BigDecimal sdsScore, BigDecimal naScore, BigDecimal psqiScore, BigDecimal ipqaScore, BigDecimal fagerstormScore, BigDecimal leftGrip, BigDecimal rightGrip, BigDecimal threeMeterTest, BigDecimal fourMeterTest, BigDecimal standUpTest, BigDecimal leftBalanceTest, BigDecimal rightBalanceTest, BigDecimal sitReach, BigDecimal upperarmCircumference, BigDecimal bmi, BigDecimal tricepsSkinfoldThickness, String medicalHistoryId, Date createTime, String createUser, Date modifyTime, String modifyUser, Integer deleteFlag, Integer version) {
        this.assessmentId = assessmentId;
        this.sasScore = sasScore;
        this.sdsScore = sdsScore;
        this.naScore = naScore;
        this.psqiScore = psqiScore;
        this.ipqaScore = ipqaScore;
        this.fagerstormScore = fagerstormScore;
        this.leftGrip = leftGrip;
        this.rightGrip = rightGrip;
        this.threeMeterTest = threeMeterTest;
        this.fourMeterTest = fourMeterTest;
        this.standUpTest = standUpTest;
        this.leftBalanceTest = leftBalanceTest;
        this.rightBalanceTest = rightBalanceTest;
        this.sitReach = sitReach;
        this.upperarmCircumference = upperarmCircumference;
        this.bmi = bmi;
        this.tricepsSkinfoldThickness = tricepsSkinfoldThickness;
        this.medicalHistoryId = medicalHistoryId;
        this.createTime = createTime;
        this.createUser = createUser;
        this.modifyTime = modifyTime;
        this.modifyUser = modifyUser;
        this.deleteFlag = deleteFlag;
        this.version = version;
    }

    public Assessment() {
        super();
    }

    public String getAssessmentId() {
        return assessmentId;
    }

    public void setAssessmentId(String assessmentId) {
        this.assessmentId = assessmentId == null ? null : assessmentId.trim();
    }

    public BigDecimal getSasScore() {
        return sasScore;
    }

    public void setSasScore(BigDecimal sasScore) {
        this.sasScore = sasScore;
    }

    public BigDecimal getSdsScore() {
        return sdsScore;
    }

    public void setSdsScore(BigDecimal sdsScore) {
        this.sdsScore = sdsScore;
    }

    public BigDecimal getNaScore() {
        return naScore;
    }

    public void setNaScore(BigDecimal naScore) {
        this.naScore = naScore;
    }

    public BigDecimal getPsqiScore() {
        return psqiScore;
    }

    public void setPsqiScore(BigDecimal psqiScore) {
        this.psqiScore = psqiScore;
    }

    public BigDecimal getIpqaScore() {
        return ipqaScore;
    }

    public void setIpqaScore(BigDecimal ipqaScore) {
        this.ipqaScore = ipqaScore;
    }

    public BigDecimal getFagerstormScore() {
        return fagerstormScore;
    }

    public void setFagerstormScore(BigDecimal fagerstormScore) {
        this.fagerstormScore = fagerstormScore;
    }

    public BigDecimal getLeftGrip() {
        return leftGrip;
    }

    public void setLeftGrip(BigDecimal leftGrip) {
        this.leftGrip = leftGrip;
    }

    public BigDecimal getRightGrip() {
        return rightGrip;
    }

    public void setRightGrip(BigDecimal rightGrip) {
        this.rightGrip = rightGrip;
    }

    public BigDecimal getThreeMeterTest() {
        return threeMeterTest;
    }

    public void setThreeMeterTest(BigDecimal threeMeterTest) {
        this.threeMeterTest = threeMeterTest;
    }

    public BigDecimal getFourMeterTest() {
        return fourMeterTest;
    }

    public void setFourMeterTest(BigDecimal fourMeterTest) {
        this.fourMeterTest = fourMeterTest;
    }

    public BigDecimal getStandUpTest() {
        return standUpTest;
    }

    public void setStandUpTest(BigDecimal standUpTest) {
        this.standUpTest = standUpTest;
    }

    public BigDecimal getLeftBalanceTest() {
        return leftBalanceTest;
    }

    public void setLeftBalanceTest(BigDecimal leftBalanceTest) {
        this.leftBalanceTest = leftBalanceTest;
    }

    public BigDecimal getRightBalanceTest() {
        return rightBalanceTest;
    }

    public void setRightBalanceTest(BigDecimal rightBalanceTest) {
        this.rightBalanceTest = rightBalanceTest;
    }

    public BigDecimal getSitReach() {
        return sitReach;
    }

    public void setSitReach(BigDecimal sitReach) {
        this.sitReach = sitReach;
    }

    public BigDecimal getUpperarmCircumference() {
        return upperarmCircumference;
    }

    public void setUpperarmCircumference(BigDecimal upperarmCircumference) {
        this.upperarmCircumference = upperarmCircumference;
    }

    public BigDecimal getBmi() {
        return bmi;
    }

    public void setBmi(BigDecimal bmi) {
        this.bmi = bmi;
    }

    public BigDecimal getTricepsSkinfoldThickness() {
        return tricepsSkinfoldThickness;
    }

    public void setTricepsSkinfoldThickness(BigDecimal tricepsSkinfoldThickness) {
        this.tricepsSkinfoldThickness = tricepsSkinfoldThickness;
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
}