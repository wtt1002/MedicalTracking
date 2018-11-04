package lab.c505.entity;

public class TreadmillElasticBelt {
    private Long tteb_id;

    private Long rst_id;

    private Byte color;

    private Integer train_time;

    private Integer train_group;

    private String remark;

    public Long getTteb_id() {
        return tteb_id;
    }

    public void setTteb_id(Long tteb_id) {
        this.tteb_id = tteb_id;
    }

    public Long getRst_id() {
        return rst_id;
    }

    public void setRst_id(Long rst_id) {
        this.rst_id = rst_id;
    }

    public Byte getColor() {
        return color;
    }

    public void setColor(Byte color) {
        this.color = color;
    }

    public Integer getTrain_time() {
        return train_time;
    }

    public void setTrain_time(Integer train_time) {
        this.train_time = train_time;
    }

    public Integer getTrain_group() {
        return train_group;
    }

    public void setTrain_group(Integer train_group) {
        this.train_group = train_group;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}