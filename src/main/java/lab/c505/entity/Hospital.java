package lab.c505.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Hospital {
    private String hos_id;

    private String hos_name;

    private String hos_py;

    private String hos_code;

    private String hos_rank;

    private String hos_type;

    private String hos_province;

    private String hos_city;

    private String hos_district;

    private Integer hos_beds;

    private String hos_address;

    private String hos_detail;

    private String hos_tel;

    private BigDecimal hos_longitude;

    private BigDecimal hos_latitude;

    private Date create_time;

    private String create_user;

    private Date modify_time;

    private String modify_user;

    private Integer delete_flag;

    private Integer version;

    public Hospital(String hos_id, String hos_name, String hos_py, String hos_code, String hos_rank, String hos_type, String hos_province, String hos_city, String hos_district, Integer hos_beds, String hos_address, String hos_detail, String hos_tel, BigDecimal hos_longitude, BigDecimal hos_latitude, Date create_time, String create_user, Date modify_time, String modify_user, Integer delete_flag, Integer version) {
        this.hos_id = hos_id;
        this.hos_name = hos_name;
        this.hos_py = hos_py;
        this.hos_code = hos_code;
        this.hos_rank = hos_rank;
        this.hos_type = hos_type;
        this.hos_province = hos_province;
        this.hos_city = hos_city;
        this.hos_district = hos_district;
        this.hos_beds = hos_beds;
        this.hos_address = hos_address;
        this.hos_detail = hos_detail;
        this.hos_tel = hos_tel;
        this.hos_longitude = hos_longitude;
        this.hos_latitude = hos_latitude;
        this.create_time = create_time;
        this.create_user = create_user;
        this.modify_time = modify_time;
        this.modify_user = modify_user;
        this.delete_flag = delete_flag;
        this.version = version;
    }

    public Hospital() {
        super();
    }

    public String getHos_id() {
        return hos_id;
    }

    public void setHos_id(String hos_id) {
        this.hos_id = hos_id == null ? null : hos_id.trim();
    }

    public String getHos_name() {
        return hos_name;
    }

    public void setHos_name(String hos_name) {
        this.hos_name = hos_name == null ? null : hos_name.trim();
    }

    public String getHos_py() {
        return hos_py;
    }

    public void setHos_py(String hos_py) {
        this.hos_py = hos_py == null ? null : hos_py.trim();
    }

    public String getHos_code() {
        return hos_code;
    }

    public void setHos_code(String hos_code) {
        this.hos_code = hos_code == null ? null : hos_code.trim();
    }

    public String getHos_rank() {
        return hos_rank;
    }

    public void setHos_rank(String hos_rank) {
        this.hos_rank = hos_rank == null ? null : hos_rank.trim();
    }

    public String getHos_type() {
        return hos_type;
    }

    public void setHos_type(String hos_type) {
        this.hos_type = hos_type == null ? null : hos_type.trim();
    }

    public String getHos_province() {
        return hos_province;
    }

    public void setHos_province(String hos_province) {
        this.hos_province = hos_province == null ? null : hos_province.trim();
    }

    public String getHos_city() {
        return hos_city;
    }

    public void setHos_city(String hos_city) {
        this.hos_city = hos_city == null ? null : hos_city.trim();
    }

    public String getHos_district() {
        return hos_district;
    }

    public void setHos_district(String hos_district) {
        this.hos_district = hos_district == null ? null : hos_district.trim();
    }

    public Integer getHos_beds() {
        return hos_beds;
    }

    public void setHos_beds(Integer hos_beds) {
        this.hos_beds = hos_beds;
    }

    public String getHos_address() {
        return hos_address;
    }

    public void setHos_address(String hos_address) {
        this.hos_address = hos_address == null ? null : hos_address.trim();
    }

    public String getHos_detail() {
        return hos_detail;
    }

    public void setHos_detail(String hos_detail) {
        this.hos_detail = hos_detail == null ? null : hos_detail.trim();
    }

    public String getHos_tel() {
        return hos_tel;
    }

    public void setHos_tel(String hos_tel) {
        this.hos_tel = hos_tel == null ? null : hos_tel.trim();
    }

    public BigDecimal getHos_longitude() {
        return hos_longitude;
    }

    public void setHos_longitude(BigDecimal hos_longitude) {
        this.hos_longitude = hos_longitude;
    }

    public BigDecimal getHos_latitude() {
        return hos_latitude;
    }

    public void setHos_latitude(BigDecimal hos_latitude) {
        this.hos_latitude = hos_latitude;
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