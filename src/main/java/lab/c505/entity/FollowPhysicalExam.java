package lab.c505.entity;

import java.math.BigDecimal;

public class FollowPhysicalExam {
    private String followPhysicalExamId;

    private String followUpId;

    private BigDecimal bloodPressureHigh;

    private BigDecimal bloodPressureLow;

    private Short heartRate;

    private BigDecimal weight;

    private String otherInfo;

    public FollowPhysicalExam(String followPhysicalExamId, String followUpId, BigDecimal bloodPressureHigh, BigDecimal bloodPressureLow, Short heartRate, BigDecimal weight, String otherInfo) {
        this.followPhysicalExamId = followPhysicalExamId;
        this.followUpId = followUpId;
        this.bloodPressureHigh = bloodPressureHigh;
        this.bloodPressureLow = bloodPressureLow;
        this.heartRate = heartRate;
        this.weight = weight;
        this.otherInfo = otherInfo;
    }

    public FollowPhysicalExam() {
        super();
    }

    public String getFollowPhysicalExamId() {
        return followPhysicalExamId;
    }

    public void setFollowPhysicalExamId(String followPhysicalExamId) {
        this.followPhysicalExamId = followPhysicalExamId == null ? null : followPhysicalExamId.trim();
    }

    public String getFollowUpId() {
        return followUpId;
    }

    public void setFollowUpId(String followUpId) {
        this.followUpId = followUpId == null ? null : followUpId.trim();
    }

    public BigDecimal getBloodPressureHigh() {
        return bloodPressureHigh;
    }

    public void setBloodPressureHigh(BigDecimal bloodPressureHigh) {
        this.bloodPressureHigh = bloodPressureHigh;
    }

    public BigDecimal getBloodPressureLow() {
        return bloodPressureLow;
    }

    public void setBloodPressureLow(BigDecimal bloodPressureLow) {
        this.bloodPressureLow = bloodPressureLow;
    }

    public Short getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(Short heartRate) {
        this.heartRate = heartRate;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public String getOtherInfo() {
        return otherInfo;
    }

    public void setOtherInfo(String otherInfo) {
        this.otherInfo = otherInfo == null ? null : otherInfo.trim();
    }
}