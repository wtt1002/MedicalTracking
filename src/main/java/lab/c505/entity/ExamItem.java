package lab.c505.entity;

import java.util.Date;

public class ExamItem {
    private String exam_item_id;

    private String exam_category_id;

    private String exam_item_code;

    private String exam_item_name;

    private String short_name;

    private String item_unit;

    private Date create_time;

    private String create_user;

    private Date modify_time;

    private String modify_user;

    private Integer delete_flag;

    private Integer version;

    public ExamItem(String exam_item_id, String exam_category_id, String exam_item_code, String exam_item_name, String short_name, String item_unit, Date create_time, String create_user, Date modify_time, String modify_user, Integer delete_flag, Integer version) {
        this.exam_item_id = exam_item_id;
        this.exam_category_id = exam_category_id;
        this.exam_item_code = exam_item_code;
        this.exam_item_name = exam_item_name;
        this.short_name = short_name;
        this.item_unit = item_unit;
        this.create_time = create_time;
        this.create_user = create_user;
        this.modify_time = modify_time;
        this.modify_user = modify_user;
        this.delete_flag = delete_flag;
        this.version = version;
    }

    public ExamItem() {
        super();
    }

    public String getExam_item_id() {
        return exam_item_id;
    }

    public void setExam_item_id(String exam_item_id) {
        this.exam_item_id = exam_item_id == null ? null : exam_item_id.trim();
    }

    public String getExam_category_id() {
        return exam_category_id;
    }

    public void setExam_category_id(String exam_category_id) {
        this.exam_category_id = exam_category_id == null ? null : exam_category_id.trim();
    }

    public String getExam_item_code() {
        return exam_item_code;
    }

    public void setExam_item_code(String exam_item_code) {
        this.exam_item_code = exam_item_code == null ? null : exam_item_code.trim();
    }

    public String getExam_item_name() {
        return exam_item_name;
    }

    public void setExam_item_name(String exam_item_name) {
        this.exam_item_name = exam_item_name == null ? null : exam_item_name.trim();
    }

    public String getShort_name() {
        return short_name;
    }

    public void setShort_name(String short_name) {
        this.short_name = short_name == null ? null : short_name.trim();
    }

    public String getItem_unit() {
        return item_unit;
    }

    public void setItem_unit(String item_unit) {
        this.item_unit = item_unit == null ? null : item_unit.trim();
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