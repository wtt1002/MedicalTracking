package lab.c505.entity;

public class ExternalCounterpulsation {
    private Long ec_id;

    private Long fr_id;

    private Float duration;

    private Byte train_time;

    private String remark;

    public Long getEc_id() {
        return ec_id;
    }

    public void setEc_id(Long ec_id) {
        this.ec_id = ec_id;
    }

    public Long getFr_id() {
        return fr_id;
    }

    public void setFr_id(Long fr_id) {
        this.fr_id = fr_id;
    }

    public Float getDuration() {
        return duration;
    }

    public void setDuration(Float duration) {
        this.duration = duration;
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