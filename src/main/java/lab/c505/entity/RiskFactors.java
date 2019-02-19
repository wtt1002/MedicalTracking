package lab.c505.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;

@TableName(value = "t_risk_factors")
public class RiskFactors {

    @TableId(type = IdType.AUTO)
    private String riskFactorsId;

    private Byte isSmoke;

    private Byte isHeavy;

    private Byte isLessMove;

    private Byte bloodPressureControl;

    private Byte glycemicControl;

    private Byte bloodLipidControl;

    private String followUpId;

    private Date createTime;

    private String createUser;

    private Date modifyTime;

    private String modifyUser;

    private Integer deleteFlag;

    private Integer version;

    public RiskFactors(String riskFactorsId, Byte isSmoke, Byte isHeavy, Byte isLessMove, Byte bloodPressureControl, Byte glycemicControl, Byte bloodLipidControl, String followUpId, Date createTime, String createUser, Date modifyTime, String modifyUser, Integer deleteFlag, Integer version) {
        this.riskFactorsId = riskFactorsId;
        this.isSmoke = isSmoke;
        this.isHeavy = isHeavy;
        this.isLessMove = isLessMove;
        this.bloodPressureControl = bloodPressureControl;
        this.glycemicControl = glycemicControl;
        this.bloodLipidControl = bloodLipidControl;
        this.followUpId = followUpId;
        this.createTime = createTime;
        this.createUser = createUser;
        this.modifyTime = modifyTime;
        this.modifyUser = modifyUser;
        this.deleteFlag = deleteFlag;
        this.version = version;
    }

    public RiskFactors() {
        super();
    }

    public String getRiskFactorsId() {
        return riskFactorsId;
    }

    public void setRiskFactorsId(String riskFactorsId) {
        this.riskFactorsId = riskFactorsId == null ? null : riskFactorsId.trim();
    }

    public Byte getIsSmoke() {
        return isSmoke;
    }

    public void setIsSmoke(Byte isSmoke) {
        this.isSmoke = isSmoke;
    }

    public Byte getIsHeavy() {
        return isHeavy;
    }

    public void setIsHeavy(Byte isHeavy) {
        this.isHeavy = isHeavy;
    }

    public Byte getIsLessMove() {
        return isLessMove;
    }

    public void setIsLessMove(Byte isLessMove) {
        this.isLessMove = isLessMove;
    }

    public Byte getBloodPressureControl() {
        return bloodPressureControl;
    }

    public void setBloodPressureControl(Byte bloodPressureControl) {
        this.bloodPressureControl = bloodPressureControl;
    }

    public Byte getGlycemicControl() {
        return glycemicControl;
    }

    public void setGlycemicControl(Byte glycemicControl) {
        this.glycemicControl = glycemicControl;
    }

    public Byte getBloodLipidControl() {
        return bloodLipidControl;
    }

    public void setBloodLipidControl(Byte bloodLipidControl) {
        this.bloodLipidControl = bloodLipidControl;
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