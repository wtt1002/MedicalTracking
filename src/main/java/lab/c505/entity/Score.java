package lab.c505.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.util.Date;

@TableName(value = "t_score")
public class Score {

    @TableId(type = IdType.AUTO)
    private String scoreId;

    private String medicalHistoryId;

    private BigDecimal graceScore;

    private BigDecimal daptScore;

    private BigDecimal crucedeScore;

    private String daptDetail;

    private Date createTime;

    private String createUser;

    private Date modifyTime;

    private String modifyUser;

    private Integer deleteFlag;

    private Integer version;

    public Score(String scoreId, String medicalHistoryId, BigDecimal graceScore, BigDecimal daptScore, BigDecimal crucedeScore, String daptDetail, Date createTime, String createUser, Date modifyTime, String modifyUser, Integer deleteFlag, Integer version) {
        this.scoreId = scoreId;
        this.medicalHistoryId = medicalHistoryId;
        this.graceScore = graceScore;
        this.daptScore = daptScore;
        this.crucedeScore = crucedeScore;
        this.daptDetail = daptDetail;
        this.createTime = createTime;
        this.createUser = createUser;
        this.modifyTime = modifyTime;
        this.modifyUser = modifyUser;
        this.deleteFlag = deleteFlag;
        this.version = version;
    }

    public Score() {
        super();
    }

    public String getScoreId() {
        return scoreId;
    }

    public void setScoreId(String scoreId) {
        this.scoreId = scoreId == null ? null : scoreId.trim();
    }

    public String getMedicalHistoryId() {
        return medicalHistoryId;
    }

    public void setMedicalHistoryId(String medicalHistoryId) {
        this.medicalHistoryId = medicalHistoryId == null ? null : medicalHistoryId.trim();
    }

    public BigDecimal getGraceScore() {
        return graceScore;
    }

    public void setGraceScore(BigDecimal graceScore) {
        this.graceScore = graceScore;
    }

    public BigDecimal getDaptScore() {
        return daptScore;
    }

    public void setDaptScore(BigDecimal daptScore) {
        this.daptScore = daptScore;
    }

    public BigDecimal getCrucedeScore() {
        return crucedeScore;
    }

    public void setCrucedeScore(BigDecimal crucedeScore) {
        this.crucedeScore = crucedeScore;
    }

    public String getDaptDetail() {
        return daptDetail;
    }

    public void setDaptDetail(String daptDetail) {
        this.daptDetail = daptDetail == null ? null : daptDetail.trim();
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