package lab.c505.entity;

import java.math.BigDecimal;
import java.util.Date;

public class NutritionPrescription {
    private String nutrition_prescription_id;

    private BigDecimal heat_quantity;

    private BigDecimal saccharides;

    private BigDecimal fat;

    private BigDecimal protein;

    private String other_info;

    private String follow_up_id;

    private Date create_time;

    private String create_user;

    private Date modify_time;

    private String modify_user;

    private Integer delete_flag;

    private Integer version;

    public NutritionPrescription(String nutrition_prescription_id, BigDecimal heat_quantity, BigDecimal saccharides, BigDecimal fat, BigDecimal protein, String other_info, String follow_up_id, Date create_time, String create_user, Date modify_time, String modify_user, Integer delete_flag, Integer version) {
        this.nutrition_prescription_id = nutrition_prescription_id;
        this.heat_quantity = heat_quantity;
        this.saccharides = saccharides;
        this.fat = fat;
        this.protein = protein;
        this.other_info = other_info;
        this.follow_up_id = follow_up_id;
        this.create_time = create_time;
        this.create_user = create_user;
        this.modify_time = modify_time;
        this.modify_user = modify_user;
        this.delete_flag = delete_flag;
        this.version = version;
    }

    public NutritionPrescription() {
        super();
    }

    public String getNutrition_prescription_id() {
        return nutrition_prescription_id;
    }

    public void setNutrition_prescription_id(String nutrition_prescription_id) {
        this.nutrition_prescription_id = nutrition_prescription_id == null ? null : nutrition_prescription_id.trim();
    }

    public BigDecimal getHeat_quantity() {
        return heat_quantity;
    }

    public void setHeat_quantity(BigDecimal heat_quantity) {
        this.heat_quantity = heat_quantity;
    }

    public BigDecimal getSaccharides() {
        return saccharides;
    }

    public void setSaccharides(BigDecimal saccharides) {
        this.saccharides = saccharides;
    }

    public BigDecimal getFat() {
        return fat;
    }

    public void setFat(BigDecimal fat) {
        this.fat = fat;
    }

    public BigDecimal getProtein() {
        return protein;
    }

    public void setProtein(BigDecimal protein) {
        this.protein = protein;
    }

    public String getOther_info() {
        return other_info;
    }

    public void setOther_info(String other_info) {
        this.other_info = other_info == null ? null : other_info.trim();
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