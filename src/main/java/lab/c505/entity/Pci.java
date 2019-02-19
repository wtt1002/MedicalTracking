package lab.c505.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;

@TableName(value = "t_pci")
public class Pci {

    @TableId(type = IdType.AUTO)
    private String pciId;

    private String medicalHistoryId;

    private String cabg;

    private String thrombolysis;

    private String therapyType;

    private Date operateDuration;

    private Integer pcidb2;

    private String pciAntiplatelet;

    private String pciType;

    private String pciAnticoagulant;

    private String operateDrug;

    private String assistiveDevice;

    private String contrastMediumType;

    private Integer contrastMediumAmount;

    private String operateDoctor;

    private String pciInfo;

    private String pciDetail;

    private String interventionProblem;

    private Date createTime;

    private String createUser;

    private Date modifyTime;

    private String modifyUser;

    private Integer deleteFlag;

    private Integer version;

    public Pci(String pciId, String medicalHistoryId, String cabg, String thrombolysis, String therapyType, Date operateDuration, Integer pcidb2, String pciAntiplatelet, String pciType, String pciAnticoagulant, String operateDrug, String assistiveDevice, String contrastMediumType, Integer contrastMediumAmount, String operateDoctor, String pciInfo, String pciDetail, String interventionProblem, Date createTime, String createUser, Date modifyTime, String modifyUser, Integer deleteFlag, Integer version) {
        this.pciId = pciId;
        this.medicalHistoryId = medicalHistoryId;
        this.cabg = cabg;
        this.thrombolysis = thrombolysis;
        this.therapyType = therapyType;
        this.operateDuration = operateDuration;
        this.pcidb2 = pcidb2;
        this.pciAntiplatelet = pciAntiplatelet;
        this.pciType = pciType;
        this.pciAnticoagulant = pciAnticoagulant;
        this.operateDrug = operateDrug;
        this.assistiveDevice = assistiveDevice;
        this.contrastMediumType = contrastMediumType;
        this.contrastMediumAmount = contrastMediumAmount;
        this.operateDoctor = operateDoctor;
        this.pciInfo = pciInfo;
        this.pciDetail = pciDetail;
        this.interventionProblem = interventionProblem;
        this.createTime = createTime;
        this.createUser = createUser;
        this.modifyTime = modifyTime;
        this.modifyUser = modifyUser;
        this.deleteFlag = deleteFlag;
        this.version = version;
    }

    public Pci() {
        super();
    }

    public String getPciId() {
        return pciId;
    }

    public void setPciId(String pciId) {
        this.pciId = pciId == null ? null : pciId.trim();
    }

    public String getMedicalHistoryId() {
        return medicalHistoryId;
    }

    public void setMedicalHistoryId(String medicalHistoryId) {
        this.medicalHistoryId = medicalHistoryId == null ? null : medicalHistoryId.trim();
    }

    public String getCabg() {
        return cabg;
    }

    public void setCabg(String cabg) {
        this.cabg = cabg == null ? null : cabg.trim();
    }

    public String getThrombolysis() {
        return thrombolysis;
    }

    public void setThrombolysis(String thrombolysis) {
        this.thrombolysis = thrombolysis == null ? null : thrombolysis.trim();
    }

    public String getTherapyType() {
        return therapyType;
    }

    public void setTherapyType(String therapyType) {
        this.therapyType = therapyType == null ? null : therapyType.trim();
    }

    public Date getOperateDuration() {
        return operateDuration;
    }

    public void setOperateDuration(Date operateDuration) {
        this.operateDuration = operateDuration;
    }

    public Integer getPcidb2() {
        return pcidb2;
    }

    public void setPcidb2(Integer pcidb2) {
        this.pcidb2 = pcidb2;
    }

    public String getPciAntiplatelet() {
        return pciAntiplatelet;
    }

    public void setPciAntiplatelet(String pciAntiplatelet) {
        this.pciAntiplatelet = pciAntiplatelet == null ? null : pciAntiplatelet.trim();
    }

    public String getPciType() {
        return pciType;
    }

    public void setPciType(String pciType) {
        this.pciType = pciType == null ? null : pciType.trim();
    }

    public String getPciAnticoagulant() {
        return pciAnticoagulant;
    }

    public void setPciAnticoagulant(String pciAnticoagulant) {
        this.pciAnticoagulant = pciAnticoagulant == null ? null : pciAnticoagulant.trim();
    }

    public String getOperateDrug() {
        return operateDrug;
    }

    public void setOperateDrug(String operateDrug) {
        this.operateDrug = operateDrug == null ? null : operateDrug.trim();
    }

    public String getAssistiveDevice() {
        return assistiveDevice;
    }

    public void setAssistiveDevice(String assistiveDevice) {
        this.assistiveDevice = assistiveDevice == null ? null : assistiveDevice.trim();
    }

    public String getContrastMediumType() {
        return contrastMediumType;
    }

    public void setContrastMediumType(String contrastMediumType) {
        this.contrastMediumType = contrastMediumType == null ? null : contrastMediumType.trim();
    }

    public Integer getContrastMediumAmount() {
        return contrastMediumAmount;
    }

    public void setContrastMediumAmount(Integer contrastMediumAmount) {
        this.contrastMediumAmount = contrastMediumAmount;
    }

    public String getOperateDoctor() {
        return operateDoctor;
    }

    public void setOperateDoctor(String operateDoctor) {
        this.operateDoctor = operateDoctor == null ? null : operateDoctor.trim();
    }

    public String getPciInfo() {
        return pciInfo;
    }

    public void setPciInfo(String pciInfo) {
        this.pciInfo = pciInfo == null ? null : pciInfo.trim();
    }

    public String getPciDetail() {
        return pciDetail;
    }

    public void setPciDetail(String pciDetail) {
        this.pciDetail = pciDetail == null ? null : pciDetail.trim();
    }

    public String getInterventionProblem() {
        return interventionProblem;
    }

    public void setInterventionProblem(String interventionProblem) {
        this.interventionProblem = interventionProblem == null ? null : interventionProblem.trim();
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