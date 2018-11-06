package lab.c505.entity;

public class ResistanceTrain {
    private Long rst_id;

    private Long fr_id;

    private Integer train_time;

    private Integer strength;

    private Integer belt_color;

    private Integer belt_frequency;

    private Integer belt_group;

    private Integer dumbbell_strength;

    private Integer dumbbell_frequency;

    private Integer dumbbell_group;

    private Integer instrument_strength;

    private Integer instrument_frequency;

    private Integer instrument_group;

    private String remark;

    public Long getRst_id() {
        return rst_id;
    }

    public void setRst_id(Long rst_id) {
        this.rst_id = rst_id;
    }

    public Long getFr_id() {
        return fr_id;
    }

    public void setFr_id(Long fr_id) {
        this.fr_id = fr_id;
    }

    public Integer getTrain_time() {
        return train_time;
    }

    public void setTrain_time(Integer train_time) {
        this.train_time = train_time;
    }

    public Integer getStrength() {
        return strength;
    }

    public void setStrength(Integer strength) {
        this.strength = strength;
    }

    public Integer getBelt_color() {
        return belt_color;
    }

    public void setBelt_color(Integer belt_color) {
        this.belt_color = belt_color;
    }

    public Integer getBelt_frequency() {
        return belt_frequency;
    }

    public void setBelt_frequency(Integer belt_frequency) {
        this.belt_frequency = belt_frequency;
    }

    public Integer getBelt_group() {
        return belt_group;
    }

    public void setBelt_group(Integer belt_group) {
        this.belt_group = belt_group;
    }

    public Integer getDumbbell_strength() {
        return dumbbell_strength;
    }

    public void setDumbbell_strength(Integer dumbbell_strength) {
        this.dumbbell_strength = dumbbell_strength;
    }

    public Integer getDumbbell_frequency() {
        return dumbbell_frequency;
    }

    public void setDumbbell_frequency(Integer dumbbell_frequency) {
        this.dumbbell_frequency = dumbbell_frequency;
    }

    public Integer getDumbbell_group() {
        return dumbbell_group;
    }

    public void setDumbbell_group(Integer dumbbell_group) {
        this.dumbbell_group = dumbbell_group;
    }

    public Integer getInstrument_strength() {
        return instrument_strength;
    }

    public void setInstrument_strength(Integer instrument_strength) {
        this.instrument_strength = instrument_strength;
    }

    public Integer getInstrument_frequency() {
        return instrument_frequency;
    }

    public void setInstrument_frequency(Integer instrument_frequency) {
        this.instrument_frequency = instrument_frequency;
    }

    public Integer getInstrument_group() {
        return instrument_group;
    }

    public void setInstrument_group(Integer instrument_group) {
        this.instrument_group = instrument_group;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}