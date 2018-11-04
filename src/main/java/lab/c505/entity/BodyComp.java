package lab.c505.entity;

public class BodyComp {
    private Long bc_id;

    private Long ar_id;

    private Float height;

    private Float weight;

    private Float bmi;

    private Float muscle;

    private Float fat;

    private Float fat_rate;

    public Long getBc_id() {
        return bc_id;
    }

    public void setBc_id(Long bc_id) {
        this.bc_id = bc_id;
    }

    public Long getAr_id() {
        return ar_id;
    }

    public void setAr_id(Long ar_id) {
        this.ar_id = ar_id;
    }

    public Float getHeight() {
        return height;
    }

    public void setHeight(Float height) {
        this.height = height;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public Float getBmi() {
        return bmi;
    }

    public void setBmi(Float bmi) {
        this.bmi = bmi;
    }

    public Float getMuscle() {
        return muscle;
    }

    public void setMuscle(Float muscle) {
        this.muscle = muscle;
    }

    public Float getFat() {
        return fat;
    }

    public void setFat(Float fat) {
        this.fat = fat;
    }

    public Float getFat_rate() {
        return fat_rate;
    }

    public void setFat_rate(Float fat_rate) {
        this.fat_rate = fat_rate;
    }
}