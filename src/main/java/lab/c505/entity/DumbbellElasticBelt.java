package lab.c505.entity;

public class DumbbellElasticBelt {
    private Long tdeb_id;

    private Long rst_id;

    private Byte strength;

    private Byte train_time;

    private Byte train_group;

    private String remark;

    public Long getTdeb_id() {
        return tdeb_id;
    }

    public void setTdeb_id(Long tdeb_id) {
        this.tdeb_id = tdeb_id;
    }

    public Long getRst_id() {
        return rst_id;
    }

    public void setRst_id(Long rst_id) {
        this.rst_id = rst_id;
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

    public Byte getTrain_group() {
        return train_group;
    }

    public void setTrain_group(Byte train_group) {
        this.train_group = train_group;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}