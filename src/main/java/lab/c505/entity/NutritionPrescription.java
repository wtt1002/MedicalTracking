package lab.c505.entity;

import java.math.BigDecimal;
import java.util.Date;

public class NutritionPrescription {
    private String nutritionPrescriptionId;

    private BigDecimal heatQuantity;

    private BigDecimal saccharides;

    private BigDecimal fat;

    private BigDecimal protein;

    private String otherInfo;

    private String followUpId;

    private Date createTime;

    private String createUser;

    private Date modifyTime;

    private String modifyUser;

    private Integer deleteFlag;

    private Integer version;

    public NutritionPrescription(String nutritionPrescriptionId, BigDecimal heatQuantity, BigDecimal saccharides, BigDecimal fat, BigDecimal protein, String otherInfo, String followUpId, Date createTime, String createUser, Date modifyTime, String modifyUser, Integer deleteFlag, Integer version) {
        this.nutritionPrescriptionId = nutritionPrescriptionId;
        this.heatQuantity = heatQuantity;
        this.saccharides = saccharides;
        this.fat = fat;
        this.protein = protein;
        this.otherInfo = otherInfo;
        this.followUpId = followUpId;
        this.createTime = createTime;
        this.createUser = createUser;
        this.modifyTime = modifyTime;
        this.modifyUser = modifyUser;
        this.deleteFlag = deleteFlag;
        this.version = version;
    }

    public NutritionPrescription() {
        super();
    }

    public String getNutritionPrescriptionId() {
        return nutritionPrescriptionId;
    }

    public void setNutritionPrescriptionId(String nutritionPrescriptionId) {
        this.nutritionPrescriptionId = nutritionPrescriptionId == null ? null : nutritionPrescriptionId.trim();
    }

    public BigDecimal getHeatQuantity() {
        return heatQuantity;
    }

    public void setHeatQuantity(BigDecimal heatQuantity) {
        this.heatQuantity = heatQuantity;
    }

    public BigDecimal getSaccharides() {
        return saccharides;
    }

    public void setSaccharides(BigDecimal saccharides) {
        this.saccharides = saccharides;
    }

    public BigDecimal getFat() {
        return fat;
    }

    public void setFat(BigDecimal fat) {
        this.fat = fat;
    }

    public BigDecimal getProtein() {
        return protein;
    }

    public void setProtein(BigDecimal protein) {
        this.protein = protein;
    }

    public String getOtherInfo() {
        return otherInfo;
    }

    public void setOtherInfo(String otherInfo) {
        this.otherInfo = otherInfo == null ? null : otherInfo.trim();
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