package lab.c505.entity;

import java.util.Date;

public class RehabilitationValue {
    private String train_value_id;

    private String rehabilitation_item_id;

    private String medical_history_id;

    private Integer train_value;

    private Byte train_period;

    private Byte train_intensity;

    private Byte train_time;

    private Byte train_group;

    private Byte train_duration;

    private String other_info;

    private Date create_time;

    private String create_user;

    private Date modify_time;

    private String modify_user;

    private Integer delete_flag;

    private Integer version;

    public RehabilitationValue(String train_value_id, String rehabilitation_item_id, String medical_history_id, Integer train_value, Byte train_period, Byte train_intensity, Byte train_time, Byte train_group, Byte train_duration, String other_info, Date create_time, String create_user, Date modify_time, String modify_user, Integer delete_flag, Integer version) {
        this.train_value_id = train_value_id;
        this.rehabilitation_item_id = rehabilitation_item_id;
        this.medical_history_id = medical_history_id;
        this.train_value = train_value;
        this.train_period = train_period;
        this.train_intensity = train_intensity;
        this.train_time = train_time;
        this.train_group = train_group;
        this.train_duration = train_duration;
        this.other_info = other_info;
        this.create_time = create_time;
        this.create_user = create_user;
        this.modify_time = modify_time;
        this.modify_user = modify_user;
        this.delete_flag = delete_flag;
        this.version = version;
    }

    public RehabilitationValue() {
        super();
    }

    public String getTrain_value_id() {
        return train_value_id;
    }

    public void setTrain_value_id(String train_value_id) {
        this.train_value_id = train_value_id == null ? null : train_value_id.trim();
    }

    public String getRehabilitation_item_id() {
        return rehabilitation_item_id;
    }

    public void setRehabilitation_item_id(String rehabilitation_item_id) {
        this.rehabilitation_item_id = rehabilitation_item_id == null ? null : rehabilitation_item_id.trim();
    }

    public String getMedical_history_id() {
        return medical_history_id;
    }

    public void setMedical_history_id(String medical_history_id) {
        this.medical_history_id = medical_history_id == null ? null : medical_history_id.trim();
    }

    public Integer getTrain_value() {
        return train_value;
    }

    public void setTrain_value(Integer train_value) {
        this.train_value = train_value;
    }

    public Byte getTrain_period() {
        return train_period;
    }

    public void setTrain_period(Byte train_period) {
        this.train_period = train_period;
    }

    public Byte getTrain_intensity() {
        return train_intensity;
    }

    public void setTrain_intensity(Byte train_intensity) {
        this.train_intensity = train_intensity;
    }

    public Byte getTrain_time() {
        return train_time;
    }

    public void setTrain_time(Byte train_time) {
        this.train_time = train_time;
    }

    public Byte getTrain_group() {
        return train_group;
    }

    public void setTrain_group(Byte train_group) {
        this.train_group = train_group;
    }

    public Byte getTrain_duration() {
        return train_duration;
    }

    public void setTrain_duration(Byte train_duration) {
        this.train_duration = train_duration;
    }

    public String getOther_info() {
        return other_info;
    }

    public void setOther_info(String other_info) {
        this.other_info = other_info == null ? null : other_info.trim();
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