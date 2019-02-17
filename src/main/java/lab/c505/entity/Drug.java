package lab.c505.entity;

import java.util.Date;

public class Drug {
    private String drug_id;

    private String drug_code;

    private String drug_category_id;

    private String drug_name;

    private String drug_short_name;

    private Date create_time;

    private String create_user;

    private Date modify_time;

    private String modify_user;

    private Integer delete_flag;

    private Integer version;

    public Drug(String drug_id, String drug_code, String drug_category_id, String drug_name, String drug_short_name, Date create_time, String create_user, Date modify_time, String modify_user, Integer delete_flag, Integer version) {
        this.drug_id = drug_id;
        this.drug_code = drug_code;
        this.drug_category_id = drug_category_id;
        this.drug_name = drug_name;
        this.drug_short_name = drug_short_name;
        this.create_time = create_time;
        this.create_user = create_user;
        this.modify_time = modify_time;
        this.modify_user = modify_user;
        this.delete_flag = delete_flag;
        this.version = version;
    }

    public Drug() {
        super();
    }

    public String getDrug_id() {
        return drug_id;
    }

    public void setDrug_id(String drug_id) {
        this.drug_id = drug_id == null ? null : drug_id.trim();
    }

    public String getDrug_code() {
        return drug_code;
    }

    public void setDrug_code(String drug_code) {
        this.drug_code = drug_code == null ? null : drug_code.trim();
    }

    public String getDrug_category_id() {
        return drug_category_id;
    }

    public void setDrug_category_id(String drug_category_id) {
        this.drug_category_id = drug_category_id == null ? null : drug_category_id.trim();
    }

    public String getDrug_name() {
        return drug_name;
    }

    public void setDrug_name(String drug_name) {
        this.drug_name = drug_name == null ? null : drug_name.trim();
    }

    public String getDrug_short_name() {
        return drug_short_name;
    }

    public void setDrug_short_name(String drug_short_name) {
        this.drug_short_name = drug_short_name == null ? null : drug_short_name.trim();
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