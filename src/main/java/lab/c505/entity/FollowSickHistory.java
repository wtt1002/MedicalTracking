package lab.c505.entity;

import java.util.Date;

public class FollowSickHistory {
    private String follow_sick_history_id;

    private String follow_up_id;

    private String ischemia;

    private String hemorrhage;

    private Byte revascularization;

    private Byte nyha_rank;

    private Byte is_weak;

    private Byte is_soreness;

    private Byte is_smoke;

    private Byte is_patient_edu;

    private String other_info;

    private Date create_time;

    private String create_user;

    private Date modify_time;

    private String modify_user;

    private Integer delete_flag;

    private Integer version;

    public FollowSickHistory(String follow_sick_history_id, String follow_up_id, String ischemia, String hemorrhage, Byte revascularization, Byte nyha_rank, Byte is_weak, Byte is_soreness, Byte is_smoke, Byte is_patient_edu, String other_info, Date create_time, String create_user, Date modify_time, String modify_user, Integer delete_flag, Integer version) {
        this.follow_sick_history_id = follow_sick_history_id;
        this.follow_up_id = follow_up_id;
        this.ischemia = ischemia;
        this.hemorrhage = hemorrhage;
        this.revascularization = revascularization;
        this.nyha_rank = nyha_rank;
        this.is_weak = is_weak;
        this.is_soreness = is_soreness;
        this.is_smoke = is_smoke;
        this.is_patient_edu = is_patient_edu;
        this.other_info = other_info;
        this.create_time = create_time;
        this.create_user = create_user;
        this.modify_time = modify_time;
        this.modify_user = modify_user;
        this.delete_flag = delete_flag;
        this.version = version;
    }

    public FollowSickHistory() {
        super();
    }

    public String getFollow_sick_history_id() {
        return follow_sick_history_id;
    }

    public void setFollow_sick_history_id(String follow_sick_history_id) {
        this.follow_sick_history_id = follow_sick_history_id == null ? null : follow_sick_history_id.trim();
    }

    public String getFollow_up_id() {
        return follow_up_id;
    }

    public void setFollow_up_id(String follow_up_id) {
        this.follow_up_id = follow_up_id == null ? null : follow_up_id.trim();
    }

    public String getIschemia() {
        return ischemia;
    }

    public void setIschemia(String ischemia) {
        this.ischemia = ischemia == null ? null : ischemia.trim();
    }

    public String getHemorrhage() {
        return hemorrhage;
    }

    public void setHemorrhage(String hemorrhage) {
        this.hemorrhage = hemorrhage == null ? null : hemorrhage.trim();
    }

    public Byte getRevascularization() {
        return revascularization;
    }

    public void setRevascularization(Byte revascularization) {
        this.revascularization = revascularization;
    }

    public Byte getNyha_rank() {
        return nyha_rank;
    }

    public void setNyha_rank(Byte nyha_rank) {
        this.nyha_rank = nyha_rank;
    }

    public Byte getIs_weak() {
        return is_weak;
    }

    public void setIs_weak(Byte is_weak) {
        this.is_weak = is_weak;
    }

    public Byte getIs_soreness() {
        return is_soreness;
    }

    public void setIs_soreness(Byte is_soreness) {
        this.is_soreness = is_soreness;
    }

    public Byte getIs_smoke() {
        return is_smoke;
    }

    public void setIs_smoke(Byte is_smoke) {
        this.is_smoke = is_smoke;
    }

    public Byte getIs_patient_edu() {
        return is_patient_edu;
    }

    public void setIs_patient_edu(Byte is_patient_edu) {
        this.is_patient_edu = is_patient_edu;
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