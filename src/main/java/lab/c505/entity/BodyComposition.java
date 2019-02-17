package lab.c505.entity;

import java.math.BigDecimal;
import java.util.Date;

public class BodyComposition {
    private String body_composition_id;

    private BigDecimal height;

    private BigDecimal weight;

    private BigDecimal bmi;

    private BigDecimal muscle_weight;

    private BigDecimal fat_weight;

    private BigDecimal body_fat_percentage;

    private String medical_history_id;

    private Date create_time;

    private String create_user;

    private Date modify_time;

    private String modify_user;

    private Integer delete_flag;

    private Integer version;

    public BodyComposition(String body_composition_id, BigDecimal height, BigDecimal weight, BigDecimal bmi, BigDecimal muscle_weight, BigDecimal fat_weight, BigDecimal body_fat_percentage, String medical_history_id, Date create_time, String create_user, Date modify_time, String modify_user, Integer delete_flag, Integer version) {
        this.body_composition_id = body_composition_id;
        this.height = height;
        this.weight = weight;
        this.bmi = bmi;
        this.muscle_weight = muscle_weight;
        this.fat_weight = fat_weight;
        this.body_fat_percentage = body_fat_percentage;
        this.medical_history_id = medical_history_id;
        this.create_time = create_time;
        this.create_user = create_user;
        this.modify_time = modify_time;
        this.modify_user = modify_user;
        this.delete_flag = delete_flag;
        this.version = version;
    }

    public BodyComposition() {
        super();
    }

    public String getBody_composition_id() {
        return body_composition_id;
    }

    public void setBody_composition_id(String body_composition_id) {
        this.body_composition_id = body_composition_id == null ? null : body_composition_id.trim();
    }

    public BigDecimal getHeight() {
        return height;
    }

    public void setHeight(BigDecimal height) {
        this.height = height;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public BigDecimal getBmi() {
        return bmi;
    }

    public void setBmi(BigDecimal bmi) {
        this.bmi = bmi;
    }

    public BigDecimal getMuscle_weight() {
        return muscle_weight;
    }

    public void setMuscle_weight(BigDecimal muscle_weight) {
        this.muscle_weight = muscle_weight;
    }

    public BigDecimal getFat_weight() {
        return fat_weight;
    }

    public void setFat_weight(BigDecimal fat_weight) {
        this.fat_weight = fat_weight;
    }

    public BigDecimal getBody_fat_percentage() {
        return body_fat_percentage;
    }

    public void setBody_fat_percentage(BigDecimal body_fat_percentage) {
        this.body_fat_percentage = body_fat_percentage;
    }

    public String getMedical_history_id() {
        return medical_history_id;
    }

    public void setMedical_history_id(String medical_history_id) {
        this.medical_history_id = medical_history_id == null ? null : medical_history_id.trim();
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public String getCreate_user() {
        return create_user;
    }

    public void setCreate_user(String create_user) {
        this.create_user = create_user == null ? null : create_user.trim();
    }

    public Date getModify_time() {
        return modify_time;
    }

    public void setModify_time(Date modify_time) {
        this.modify_time = modify_time;
    }

    public String getModify_user() {
        return modify_user;
    }

    public void setModify_user(String modify_user) {
        this.modify_user = modify_user == null ? null : modify_user.trim();
    }

    public Integer getDelete_flag() {
        return delete_flag;
    }

    public void setDelete_flag(Integer delete_flag) {
        this.delete_flag = delete_flag;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }
}