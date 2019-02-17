package lab.c505.entity;

import java.util.Date;

public class FollowUp {
    private String follow_up_id;

    private String medical_history_id;

    private String doctor_id;

    private Date plan_time;

    private Date final_time;

    private Date plan_way;

    private Date final_way;

    private Integer follow_up_duration;

    private String recovery_status;

    private String further_consultation;

    private String recent_symptoms;

    private Integer follow_up_index;

    private Date create_time;

    private String create_user;

    private Date modify_time;

    private String modify_user;

    private Integer delete_flag;

    private Integer version;

    public FollowUp(String follow_up_id, String medical_history_id, String doctor_id, Date plan_time, Date final_time, Date plan_way, Date final_way, Integer follow_up_duration, String recovery_status, String further_consultation, String recent_symptoms, Integer follow_up_index, Date create_time, String create_user, Date modify_time, String modify_user, Integer delete_flag, Integer version) {
        this.follow_up_id = follow_up_id;
        this.medical_history_id = medical_history_id;
        this.doctor_id = doctor_id;
        this.plan_time = plan_time;
        this.final_time = final_time;
        this.plan_way = plan_way;
        this.final_way = final_way;
        this.follow_up_duration = follow_up_duration;
        this.recovery_status = recovery_status;
        this.further_consultation = further_consultation;
        this.recent_symptoms = recent_symptoms;
        this.follow_up_index = follow_up_index;
        this.create_time = create_time;
        this.create_user = create_user;
        this.modify_time = modify_time;
        this.modify_user = modify_user;
        this.delete_flag = delete_flag;
        this.version = version;
    }

    public FollowUp() {
        super();
    }

    public String getFollow_up_id() {
        return follow_up_id;
    }

    public void setFollow_up_id(String follow_up_id) {
        this.follow_up_id = follow_up_id == null ? null : follow_up_id.trim();
    }

    public String getMedical_history_id() {
        return medical_history_id;
    }

    public void setMedical_history_id(String medical_history_id) {
        this.medical_history_id = medical_history_id == null ? null : medical_history_id.trim();
    }

    public String getDoctor_id() {
        return doctor_id;
    }

    public void setDoctor_id(String doctor_id) {
        this.doctor_id = doctor_id == null ? null : doctor_id.trim();
    }

    public Date getPlan_time() {
        return plan_time;
    }

    public void setPlan_time(Date plan_time) {
        this.plan_time = plan_time;
    }

    public Date getFinal_time() {
        return final_time;
    }

    public void setFinal_time(Date final_time) {
        this.final_time = final_time;
    }

    public Date getPlan_way() {
        return plan_way;
    }

    public void setPlan_way(Date plan_way) {
        this.plan_way = plan_way;
    }

    public Date getFinal_way() {
        return final_way;
    }

    public void setFinal_way(Date final_way) {
        this.final_way = final_way;
    }

    public Integer getFollow_up_duration() {
        return follow_up_duration;
    }

    public void setFollow_up_duration(Integer follow_up_duration) {
        this.follow_up_duration = follow_up_duration;
    }

    public String getRecovery_status() {
        return recovery_status;
    }

    public void setRecovery_status(String recovery_status) {
        this.recovery_status = recovery_status == null ? null : recovery_status.trim();
    }

    public String getFurther_consultation() {
        return further_consultation;
    }

    public void setFurther_consultation(String further_consultation) {
        this.further_consultation = further_consultation == null ? null : further_consultation.trim();
    }

    public String getRecent_symptoms() {
        return recent_symptoms;
    }

    public void setRecent_symptoms(String recent_symptoms) {
        this.recent_symptoms = recent_symptoms == null ? null : recent_symptoms.trim();
    }

    public Integer getFollow_up_index() {
        return follow_up_index;
    }

    public void setFollow_up_index(Integer follow_up_index) {
        this.follow_up_index = follow_up_index;
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