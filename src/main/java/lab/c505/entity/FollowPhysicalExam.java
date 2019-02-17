package lab.c505.entity;

import java.math.BigDecimal;

public class FollowPhysicalExam {
    private String follow_physical_exam_id;

    private String follow_up_id;

    private BigDecimal blood_pressure_high;

    private BigDecimal blood_pressure_low;

    private Short heart_rate;

    private BigDecimal weight;

    private String other_info;

    public FollowPhysicalExam(String follow_physical_exam_id, String follow_up_id, BigDecimal blood_pressure_high, BigDecimal blood_pressure_low, Short heart_rate, BigDecimal weight, String other_info) {
        this.follow_physical_exam_id = follow_physical_exam_id;
        this.follow_up_id = follow_up_id;
        this.blood_pressure_high = blood_pressure_high;
        this.blood_pressure_low = blood_pressure_low;
        this.heart_rate = heart_rate;
        this.weight = weight;
        this.other_info = other_info;
    }

    public FollowPhysicalExam() {
        super();
    }

    public String getFollow_physical_exam_id() {
        return follow_physical_exam_id;
    }

    public void setFollow_physical_exam_id(String follow_physical_exam_id) {
        this.follow_physical_exam_id = follow_physical_exam_id == null ? null : follow_physical_exam_id.trim();
    }

    public String getFollow_up_id() {
        return follow_up_id;
    }

    public void setFollow_up_id(String follow_up_id) {
        this.follow_up_id = follow_up_id == null ? null : follow_up_id.trim();
    }

    public BigDecimal getBlood_pressure_high() {
        return blood_pressure_high;
    }

    public void setBlood_pressure_high(BigDecimal blood_pressure_high) {
        this.blood_pressure_high = blood_pressure_high;
    }

    public BigDecimal getBlood_pressure_low() {
        return blood_pressure_low;
    }

    public void setBlood_pressure_low(BigDecimal blood_pressure_low) {
        this.blood_pressure_low = blood_pressure_low;
    }

    public Short getHeart_rate() {
        return heart_rate;
    }

    public void setHeart_rate(Short heart_rate) {
        this.heart_rate = heart_rate;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public String getOther_info() {
        return other_info;
    }

    public void setOther_info(String other_info) {
        this.other_info = other_info == null ? null : other_info.trim();
    }
}