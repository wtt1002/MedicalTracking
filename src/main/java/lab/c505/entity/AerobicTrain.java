package lab.c505.entity;

public class AerobicTrain {
    private Long at_id;

    private Long ar_id;

    private Integer strength;

    private Integer train_time;

    private String remark;

    public Long getAt_id() {
        return at_id;
    }

    public void setAt_id(Long at_id) {
        this.at_id = at_id;
    }

    public Long getAr_id() {
        return ar_id;
    }

    public void setAr_id(Long ar_id) {
        this.ar_id = ar_id;
    }

    public Integer getStrength() {
        return strength;
    }

    public void setStrength(Integer strength) {
        this.strength = strength;
    }

    public Integer getTrain_time() {
        return train_time;
    }

    public void setTrain_time(Integer train_time) {
        this.train_time = train_time;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}