package lab.c505.entity;

import java.util.Date;

public class ColourSonography {
    private Long cs_id;

    private Long ar_id;

    private String graph_name;

    private Date graph_time;

    private String graph_path;

    private String remark;

    public Long getCs_id() {
        return cs_id;
    }

    public void setCs_id(Long cs_id) {
        this.cs_id = cs_id;
    }

    public Long getAr_id() {
        return ar_id;
    }

    public void setAr_id(Long ar_id) {
        this.ar_id = ar_id;
    }

    public String getGraph_name() {
        return graph_name;
    }

    public void setGraph_name(String graph_name) {
        this.graph_name = graph_name;
    }

    public Date getGraph_time() {
        return graph_time;
    }

    public void setGraph_time(Date graph_time) {
        this.graph_time = graph_time;
    }

    public String getGraph_path() {
        return graph_path;
    }

    public void setGraph_path(String graph_path) {
        this.graph_path = graph_path;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}