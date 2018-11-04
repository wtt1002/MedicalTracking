package lab.c505.entity;

public class ResistanceTrain {
    private Long rst_id;

    private Long ar_id;

    private Integer train_time;

    private Integer strength;

    private String remark;

    public Long getRst_id() {
        return rst_id;
    }

    public void setRst_id(Long rst_id) {
        this.rst_id = rst_id;
    }

    public Long getAr_id() {
        return ar_id;
    }

    public void setAr_id(Long ar_id) {
        this.ar_id = ar_id;
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}