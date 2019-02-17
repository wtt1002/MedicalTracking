package lab.c505.entity;

import java.util.Date;

public class RehabilitationTrainCategory {
    private String rehabilitation_train_category_id;

    private String rehabilitation_train_category_code;

    private String rehabilitation_train_category_name;

    private Date create_time;

    private String create_user;

    private Date modify_time;

    private String modify_user;

    private Integer delete_flag;

    private Integer version;

    public RehabilitationTrainCategory(String rehabilitation_train_category_id, String rehabilitation_train_category_code, String rehabilitation_train_category_name, Date create_time, String create_user, Date modify_time, String modify_user, Integer delete_flag, Integer version) {
        this.rehabilitation_train_category_id = rehabilitation_train_category_id;
        this.rehabilitation_train_category_code = rehabilitation_train_category_code;
        this.rehabilitation_train_category_name = rehabilitation_train_category_name;
        this.create_time = create_time;
        this.create_user = create_user;
        this.modify_time = modify_time;
        this.modify_user = modify_user;
        this.delete_flag = delete_flag;
        this.version = version;
    }

    public RehabilitationTrainCategory() {
        super();
    }

    public String getRehabilitation_train_category_id() {
        return rehabilitation_train_category_id;
    }

    public void setRehabilitation_train_category_id(String rehabilitation_train_category_id) {
        this.rehabilitation_train_category_id = rehabilitation_train_category_id == null ? null : rehabilitation_train_category_id.trim();
    }

    public String getRehabilitation_train_category_code() {
        return rehabilitation_train_category_code;
    }

    public void setRehabilitation_train_category_code(String rehabilitation_train_category_code) {
        this.rehabilitation_train_category_code = rehabilitation_train_category_code == null ? null : rehabilitation_train_category_code.trim();
    }

    public String getRehabilitation_train_category_name() {
        return rehabilitation_train_category_name;
    }

    public void setRehabilitation_train_category_name(String rehabilitation_train_category_name) {
        this.rehabilitation_train_category_name = rehabilitation_train_category_name == null ? null : rehabilitation_train_category_name.trim();
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