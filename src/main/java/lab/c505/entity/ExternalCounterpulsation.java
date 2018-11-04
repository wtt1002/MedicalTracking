package lab.c505.entity;

public class ExternalCounterpulsation {
    private Long ec_id;

    private Long ar_id;

    private Float duration;

    private Byte train_time;

    private String remark;

    public Long getEc_id() {
        return ec_id;
    }

    public void setEc_id(Long ec_id) {
        this.ec_id = ec_id;
    }

    public Long getAr_id() {
        return ar_id;
    }

    public void setAr_id(Long ar_id) {
        this.ar_id = ar_id;
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