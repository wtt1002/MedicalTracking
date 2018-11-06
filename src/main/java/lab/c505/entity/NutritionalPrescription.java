package lab.c505.entity;

public class NutritionalPrescription {
    private Long np_id;

    private Long fr_id;

    private Integer calorie;

    private Integer fat;

    private Integer protein;

    public Long getNp_id() {
        return np_id;
    }

    public void setNp_id(Long np_id) {
        this.np_id = np_id;
    }

    public Long getFr_id() {
        return fr_id;
    }

    public void setFr_id(Long fr_id) {
        this.fr_id = fr_id;
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