package lab.c505.entity;

import java.math.BigDecimal;
import java.util.Date;

public class FollowDrugUsage {
    private String drug_usage_id;

    private BigDecimal drug_dosage;

    private String drug_dosage_unit;

    private Integer drug_time;

    private Integer drug_day;

    private Integer drug_period;

    private String drug_period_unit;

    private String drug_id;

    private String medical_history_id;

    private Date create_time;

    private String create_user;

    private Date modify_time;

    private String modify_user;

    private Integer delete_flag;

    private Integer version;

    private Integer follow_up_index;

    public FollowDrugUsage(String drug_usage_id, BigDecimal drug_dosage, String drug_dosage_unit, Integer drug_time, Integer drug_day, Integer drug_period, String drug_period_unit, String drug_id, String medical_history_id, Date create_time, String create_user, Date modify_time, String modify_user, Integer delete_flag, Integer version, Integer follow_up_index) {
        this.drug_usage_id = drug_usage_id;
        this.drug_dosage = drug_dosage;
        this.drug_dosage_unit = drug_dosage_unit;
        this.drug_time = drug_time;
        this.drug_day = drug_day;
        this.drug_period = drug_period;
        this.drug_period_unit = drug_period_unit;
        this.drug_id = drug_id;
        this.medical_history_id = medical_history_id;
        this.create_time = create_time;
        this.create_user = create_user;
        this.modify_time = modify_time;
        this.modify_user = modify_user;
        this.delete_flag = delete_flag;
        this.version = version;
        this.follow_up_index = follow_up_index;
    }

    public FollowDrugUsage() {
        super();
    }

    public String getDrug_usage_id() {
        return drug_usage_id;
    }

    public void setDrug_usage_id(String drug_usage_id) {
        this.drug_usage_id = drug_usage_id == null ? null : drug_usage_id.trim();
    }

    public BigDecimal getDrug_dosage() {
        return drug_dosage;
    }

    public void setDrug_dosage(BigDecimal drug_dosage) {
        this.drug_dosage = drug_dosage;
    }

    public String getDrug_dosage_unit() {
        return drug_dosage_unit;
    }

    public void setDrug_dosage_unit(String drug_dosage_unit) {
        this.drug_dosage_unit = drug_dosage_unit == null ? null : drug_dosage_unit.trim();
    }

    public Integer getDrug_time() {
        return drug_time;
    }

    public void setDrug_time(Integer drug_time) {
        this.drug_time = drug_time;
    }

    public Integer getDrug_day() {
        return drug_day;
    }

    public void setDrug_day(Integer drug_day) {
        this.drug_day = drug_day;
    }

    public Integer getDrug_period() {
        return drug_period;
    }

    public void setDrug_period(Integer drug_period) {
        this.drug_period = drug_period;
    }

    public String getDrug_period_unit() {
        return drug_period_unit;
    }

    public void setDrug_period_unit(String drug_period_unit) {
        this.drug_period_unit = drug_period_unit == null ? null : drug_period_unit.trim();
    }

    public String getDrug_id() {
        return drug_id;
    }

    public void setDrug_id(String drug_id) {
        this.drug_id = drug_id == null ? null : drug_id.trim();
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

    public Integer getFollow_up_index() {
        return follow_up_index;
    }

    public void setFollow_up_index(Integer follow_up_index) {
        this.follow_up_index = follow_up_index;
    }
}