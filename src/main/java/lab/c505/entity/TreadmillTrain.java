package lab.c505.entity;

public class TreadmillTrain {
    private Long tt_id;

    private Long at_id;

    private Integer speed;

    private Integer time_len;

    private String remark;

    public Long getTt_id() {
        return tt_id;
    }

    public void setTt_id(Long tt_id) {
        this.tt_id = tt_id;
    }

    public Long getAt_id() {
        return at_id;
    }

    public void setAt_id(Long at_id) {
        this.at_id = at_id;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public Integer getTime_len() {
        return time_len;
    }

    public void setTime_len(Integer time_len) {
        this.time_len = time_len;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}