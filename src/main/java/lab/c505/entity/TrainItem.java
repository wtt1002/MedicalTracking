package lab.c505.entity;

public class TrainItem {
    private Long ti_id;

    private Long fr_id;

    private Byte train_type;

    private String train_name;

    private Float duration;

    private Byte strength;

    private Byte train_time;

    private String remark;

    public Long getTi_id() {
        return ti_id;
    }

    public void setTi_id(Long ti_id) {
        this.ti_id = ti_id;
    }

    public Long getFr_id() {
        return fr_id;
    }

    public void setFr_id(Long fr_id) {
        this.fr_id = fr_id;
    }

    public Byte getTrain_type() {
        return train_type;
    }

    public void setTrain_type(Byte train_type) {
        this.train_type = train_type;
    }

    public String getTrain_name() {
        return train_name;
    }

    public void setTrain_name(String train_name) {
        this.train_name = train_name;
    }

    public Float getDuration() {
        return duration;
    }

    public void setDuration(Float duration) {
        this.duration = duration;
    }

    public Byte getStrength() {
        return strength;
    }

    public void setStrength(Byte strength) {
        this.strength = strength;
    }

    public Byte getTrain_time() {
        return train_time;
    }

    public void setTrain_time(Byte train_time) {
        this.train_time = train_time;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}