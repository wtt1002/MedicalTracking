package lab.c505.entity;

import java.util.Date;

public class Department {
    private String dept_id;

    private String hos_id;

    private String dept_name;

    private String dept_py;

    private String dept_leader;

    private String dept_address;

    private String dept_tel;

    private String dept_detail;

    private Date create_time;

    private String create_user;

    private Date modify_time;

    private String modify_user;

    private Integer delete_flag;

    private Integer version;

    public Department(String dept_id, String hos_id, String dept_name, String dept_py, String dept_leader, String dept_address, String dept_tel, String dept_detail, Date create_time, String create_user, Date modify_time, String modify_user, Integer delete_flag, Integer version) {
        this.dept_id = dept_id;
        this.hos_id = hos_id;
        this.dept_name = dept_name;
        this.dept_py = dept_py;
        this.dept_leader = dept_leader;
        this.dept_address = dept_address;
        this.dept_tel = dept_tel;
        this.dept_detail = dept_detail;
        this.create_time = create_time;
        this.create_user = create_user;
        this.modify_time = modify_time;
        this.modify_user = modify_user;
        this.delete_flag = delete_flag;
        this.version = version;
    }

    public Department() {
        super();
    }

    public String getDept_id() {
        return dept_id;
    }

    public void setDept_id(String dept_id) {
        this.dept_id = dept_id == null ? null : dept_id.trim();
    }

    public String getHos_id() {
        return hos_id;
    }

    public void setHos_id(String hos_id) {
        this.hos_id = hos_id == null ? null : hos_id.trim();
    }

    public String getDept_name() {
        return dept_name;
    }

    public void setDept_name(String dept_name) {
        this.dept_name = dept_name == null ? null : dept_name.trim();
    }

    public String getDept_py() {
        return dept_py;
    }

    public void setDept_py(String dept_py) {
        this.dept_py = dept_py == null ? null : dept_py.trim();
    }

    public String getDept_leader() {
        return dept_leader;
    }

    public void setDept_leader(String dept_leader) {
        this.dept_leader = dept_leader == null ? null : dept_leader.trim();
    }

    public String getDept_address() {
        return dept_address;
    }

    public void setDept_address(String dept_address) {
        this.dept_address = dept_address == null ? null : dept_address.trim();
    }

    public String getDept_tel() {
        return dept_tel;
    }

    public void setDept_tel(String dept_tel) {
        this.dept_tel = dept_tel == null ? null : dept_tel.trim();
    }

    public String getDept_detail() {
        return dept_detail;
    }

    public void setDept_detail(String dept_detail) {
        this.dept_detail = dept_detail == null ? null : dept_detail.trim();
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