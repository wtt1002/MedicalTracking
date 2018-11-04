package lab.c505.entity;

public class NutritionalPrescription {
    private Long np_id;

    private Long ar_id;

    private Integer calorie;

    private Integer fat;

    private Integer protein;

    public Long getNp_id() {
        return np_id;
    }

    public void setNp_id(Long np_id) {
        this.np_id = np_id;
    }

    public Long getAr_id() {
        return ar_id;
    }

    public void setAr_id(Long ar_id) {
        this.ar_id = ar_id;
    }

    public Integer getCalorie() {
        return calorie;
    }

    public void setCalorie(Integer calorie) {
        this.calorie = calorie;
    }

    public Integer getFat() {
        return fat;
    }

    public void setFat(Integer fat) {
        this.fat = fat;
    }

    public Integer getProtein() {
        return protein;
    }

    public void setProtein(Integer protein) {
        this.protein = protein;
    }
}