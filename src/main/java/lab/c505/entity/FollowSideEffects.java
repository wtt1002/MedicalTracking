package lab.c505.entity;

import java.util.Date;

public class FollowSideEffects {
    private String side_effects_id;

    private String stomach_stimulation;

    private String hemorrhage;

    private String go_hospital;

    private String dyspnea;

    private String follow_up_id;

    private Date create_time;

    private String create_user;

    private Date modify_time;

    private String modify_user;

    private Integer delete_flag;

    private Integer version;

    public FollowSideEffects(String side_effects_id, String stomach_stimulation, String hemorrhage, String go_hospital, String dyspnea, String follow_up_id, Date create_time, String create_user, Date modify_time, String modify_user, Integer delete_flag, Integer version) {
        this.side_effects_id = side_effects_id;
        this.stomach_stimulation = stomach_stimulation;
        this.hemorrhage = hemorrhage;
        this.go_hospital = go_hospital;
        this.dyspnea = dyspnea;
        this.follow_up_id = follow_up_id;
        this.create_time = create_time;
        this.create_user = create_user;
        this.modify_time = modify_time;
        this.modify_user = modify_user;
        this.delete_flag = delete_flag;
        this.version = version;
    }

    public FollowSideEffects() {
        super();
    }

    public String getSide_effects_id() {
        return side_effects_id;
    }

    public void setSide_effects_id(String side_effects_id) {
        this.side_effects_id = side_effects_id == null ? null : side_effects_id.trim();
    }

    public String getStomach_stimulation() {
        return stomach_stimulation;
    }

    public void setStomach_stimulation(String stomach_stimulation) {
        this.stomach_stimulation = stomach_stimulation == null ? null : stomach_stimulation.trim();
    }

    public String getHemorrhage() {
        return hemorrhage;
    }

    public void setHemorrhage(String hemorrhage) {
        this.hemorrhage = hemorrhage == null ? null : hemorrhage.trim();
    }

    public String getGo_hospital() {
        return go_hospital;
    }

    public void setGo_hospital(String go_hospital) {
        this.go_hospital = go_hospital == null ? null : go_hospital.trim();
    }

    public String getDyspnea() {
        return dyspnea;
    }

    public void setDyspnea(String dyspnea) {
        this.dyspnea = dyspnea == null ? null : dyspnea.trim();
    }

    public String getFollow_up_id() {
        return follow_up_id;
    }

    public void setFollow_up_id(String follow_up_id) {
        this.follow_up_id = follow_up_id == null ? null : follow_up_id.trim();
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