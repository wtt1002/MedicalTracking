package lab.c505.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Score {
    private String score_id;

    private String medical_history_id;

    private BigDecimal grace_score;

    private BigDecimal dapt_score;

    private BigDecimal crucede_score;

    private String dapt_detail;

    private Date create_time;

    private String create_user;

    private Date modify_time;

    private String modify_user;

    private Integer delete_flag;

    private Integer version;

    public Score(String score_id, String medical_history_id, BigDecimal grace_score, BigDecimal dapt_score, BigDecimal crucede_score, String dapt_detail, Date create_time, String create_user, Date modify_time, String modify_user, Integer delete_flag, Integer version) {
        this.score_id = score_id;
        this.medical_history_id = medical_history_id;
        this.grace_score = grace_score;
        this.dapt_score = dapt_score;
        this.crucede_score = crucede_score;
        this.dapt_detail = dapt_detail;
        this.create_time = create_time;
        this.create_user = create_user;
        this.modify_time = modify_time;
        this.modify_user = modify_user;
        this.delete_flag = delete_flag;
        this.version = version;
    }

    public Score() {
        super();
    }

    public String getScore_id() {
        return score_id;
    }

    public void setScore_id(String score_id) {
        this.score_id = score_id == null ? null : score_id.trim();
    }

    public String getMedical_history_id() {
        return medical_history_id;
    }

    public void setMedical_history_id(String medical_history_id) {
        this.medical_history_id = medical_history_id == null ? null : medical_history_id.trim();
    }

    public BigDecimal getGrace_score() {
        return grace_score;
    }

    public void setGrace_score(BigDecimal grace_score) {
        this.grace_score = grace_score;
    }

    public BigDecimal getDapt_score() {
        return dapt_score;
    }

    public void setDapt_score(BigDecimal dapt_score) {
        this.dapt_score = dapt_score;
    }

    public BigDecimal getCrucede_score() {
        return crucede_score;
    }

    public void setCrucede_score(BigDecimal crucede_score) {
        this.crucede_score = crucede_score;
    }

    public String getDapt_detail() {
        return dapt_detail;
    }

    public void setDapt_detail(String dapt_detail) {
        this.dapt_detail = dapt_detail == null ? null : dapt_detail.trim();
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