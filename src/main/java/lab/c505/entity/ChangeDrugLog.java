package lab.c505.entity;

import java.util.Date;

public class ChangeDrugLog {
    private String change_drug_id;

    private String operate_doc_id;

    private String follow_up_id;

    private String pre_drug_usage;

    private String aft_drug_usage;

    private Date change_time;

    private String change_reason;

    private Date create_time;

    private String create_user;

    private Date modify_time;

    private String modify_user;

    private Integer delete_flag;

    private Integer version;

    public ChangeDrugLog(String change_drug_id, String operate_doc_id, String follow_up_id, String pre_drug_usage, String aft_drug_usage, Date change_time, String change_reason, Date create_time, String create_user, Date modify_time, String modify_user, Integer delete_flag, Integer version) {
        this.change_drug_id = change_drug_id;
        this.operate_doc_id = operate_doc_id;
        this.follow_up_id = follow_up_id;
        this.pre_drug_usage = pre_drug_usage;
        this.aft_drug_usage = aft_drug_usage;
        this.change_time = change_time;
        this.change_reason = change_reason;
        this.create_time = create_time;
        this.create_user = create_user;
        this.modify_time = modify_time;
        this.modify_user = modify_user;
        this.delete_flag = delete_flag;
        this.version = version;
    }

    public ChangeDrugLog() {
        super();
    }

    public String getChange_drug_id() {
        return change_drug_id;
    }

    public void setChange_drug_id(String change_drug_id) {
        this.change_drug_id = change_drug_id == null ? null : change_drug_id.trim();
    }

    public String getOperate_doc_id() {
        return operate_doc_id;
    }

    public void setOperate_doc_id(String operate_doc_id) {
        this.operate_doc_id = operate_doc_id == null ? null : operate_doc_id.trim();
    }

    public String getFollow_up_id() {
        return follow_up_id;
    }

    public void setFollow_up_id(String follow_up_id) {
        this.follow_up_id = follow_up_id == null ? null : follow_up_id.trim();
    }

    public String getPre_drug_usage() {
        return pre_drug_usage;
    }

    public void setPre_drug_usage(String pre_drug_usage) {
        this.pre_drug_usage = pre_drug_usage == null ? null : pre_drug_usage.trim();
    }

    public String getAft_drug_usage() {
        return aft_drug_usage;
    }

    public void setAft_drug_usage(String aft_drug_usage) {
        this.aft_drug_usage = aft_drug_usage == null ? null : aft_drug_usage.trim();
    }

    public Date getChange_time() {
        return change_time;
    }

    public void setChange_time(Date change_time) {
        this.change_time = change_time;
    }

    public String getChange_reason() {
        return change_reason;
    }

    public void setChange_reason(String change_reason) {
        this.change_reason = change_reason == null ? null : change_reason.trim();
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