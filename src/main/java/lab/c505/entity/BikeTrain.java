package lab.c505.entity;

public class BikeTrain {
    private Long bt_id;

    private Long at_id;

    private Integer speed;

    private Integer strength;

    private Integer time_len;

    private String remark;

    public Long getBt_id() {
        return bt_id;
    }

    public void setBt_id(Long bt_id) {
        this.bt_id = bt_id;
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

    public Integer getStrength() {
        return strength;
    }

    public void setStrength(Integer strength) {
        this.strength = strength;
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