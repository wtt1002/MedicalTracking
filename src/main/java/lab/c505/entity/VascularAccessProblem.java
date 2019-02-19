package lab.c505.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;

@TableName(value = "t_vascular_access_problem")
public class VascularAccessProblem {

    @TableId(type = IdType.AUTO)
    private String vascularAccessProblemId;

    private String medicalHistoryId;

    private String complication;

    private String otherComplication;

    private Date createTime;

    private String createUser;

    private Date modifyTime;

    private String modifyUser;

    private Integer deleteFlag;

    private Integer version;

    public VascularAccessProblem(String vascularAccessProblemId, String medicalHistoryId, String complication, String otherComplication, Date createTime, String createUser, Date modifyTime, String modifyUser, Integer deleteFlag, Integer version) {
        this.vascularAccessProblemId = vascularAccessProblemId;
        this.medicalHistoryId = medicalHistoryId;
        this.complication = complication;
        this.otherComplication = otherComplication;
        this.createTime = createTime;
        this.createUser = createUser;
        this.modifyTime = modifyTime;
        this.modifyUser = modifyUser;
        this.deleteFlag = deleteFlag;
        this.version = version;
    }

    public VascularAccessProblem() {
        super();
    }

    public String getVascularAccessProblemId() {
        return vascularAccessProblemId;
    }

    public void setVascularAccessProblemId(String vascularAccessProblemId) {
        this.vascularAccessProblemId = vascularAccessProblemId == null ? null : vascularAccessProblemId.trim();
    }

    public String getMedicalHistoryId() {
        return medicalHistoryId;
    }

    public void setMedicalHistoryId(String medicalHistoryId) {
        this.medicalHistoryId = medicalHistoryId == null ? null : medicalHistoryId.trim();
    }

    public String getComplication() {
        return complication;
    }

    public void setComplication(String complication) {
        this.complication = complication == null ? null : complication.trim();
    }

    public String getOtherComplication() {
        return otherComplication;
    }

    public void setOtherComplication(String otherComplication) {
        this.otherComplication = otherComplication == null ? null : otherComplication.trim();
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