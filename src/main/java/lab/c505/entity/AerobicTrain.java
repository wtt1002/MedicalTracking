package lab.c505.entity;

public class AerobicTrain {
    private Long at_id;

    private Long fr_id;

    private Integer strength;

    private Integer train_time;

    private Integer bike_revolution;

    private Integer bike_resistance;

    private Integer bike_time;

    private Integer treadmill_work;

    private Integer treadmill_time;

    private String remark;

    public Long getAt_id() {
        return at_id;
    }

    public void setAt_id(Long at_id) {
        this.at_id = at_id;
    }

    public Long getFr_id() {
        return fr_id;
    }

    public void setFr_id(Long fr_id) {
        this.fr_id = fr_id;
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

    public Integer getBike_revolution() {
        return bike_revolution;
    }

    public void setBike_revolution(Integer bike_revolution) {
        this.bike_revolution = bike_revolution;
    }

    public Integer getBike_resistance() {
        return bike_resistance;
    }

    public void setBike_resistance(Integer bike_resistance) {
        this.bike_resistance = bike_resistance;
    }

    public Integer getBike_time() {
        return bike_time;
    }

    public void setBike_time(Integer bike_time) {
        this.bike_time = bike_time;
    }

    public Integer getTreadmill_work() {
        return treadmill_work;
    }

    public void setTreadmill_work(Integer treadmill_work) {
        this.treadmill_work = treadmill_work;
    }

    public Integer getTreadmill_time() {
        return treadmill_time;
    }

    public void setTreadmill_time(Integer treadmill_time) {
        this.treadmill_time = treadmill_time;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}