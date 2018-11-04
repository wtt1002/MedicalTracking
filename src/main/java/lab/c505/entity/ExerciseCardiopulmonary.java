package lab.c505.entity;

public class ExerciseCardiopulmonary {
    private Long ecp_id;

    private Byte check_type;

    private Long ar_id;

    private Float peak_load;

    private Float peak_mets;

    private Float peak_vo2;

    private Float vo2_max;

    private Float at;

    private Integer peace_rate;

    private Integer peak_rate;

    private Integer target_rate;

    private Float fev;

    private Float fev_rate;

    private Float fev_fvc;

    private String conclusion;

    public Long getEcp_id() {
        return ecp_id;
    }

    public void setEcp_id(Long ecp_id) {
        this.ecp_id = ecp_id;
    }

    public Byte getCheck_type() {
        return check_type;
    }

    public void setCheck_type(Byte check_type) {
        this.check_type = check_type;
    }

    public Long getAr_id() {
        return ar_id;
    }

    public void setAr_id(Long ar_id) {
        this.ar_id = ar_id;
    }

    public Float getPeak_load() {
        return peak_load;
    }

    public void setPeak_load(Float peak_load) {
        this.peak_load = peak_load;
    }

    public Float getPeak_mets() {
        return peak_mets;
    }

    public void setPeak_mets(Float peak_mets) {
        this.peak_mets = peak_mets;
    }

    public Float getPeak_vo2() {
        return peak_vo2;
    }

    public void setPeak_vo2(Float peak_vo2) {
        this.peak_vo2 = peak_vo2;
    }

    public Float getVo2_max() {
        return vo2_max;
    }

    public void setVo2_max(Float vo2_max) {
        this.vo2_max = vo2_max;
    }

    public Float getAt() {
        return at;
    }

    public void setAt(Float at) {
        this.at = at;
    }

    public Integer getPeace_rate() {
        return peace_rate;
    }

    public void setPeace_rate(Integer peace_rate) {
        this.peace_rate = peace_rate;
    }

    public Integer getPeak_rate() {
        return peak_rate;
    }

    public void setPeak_rate(Integer peak_rate) {
        this.peak_rate = peak_rate;
    }

    public Integer getTarget_rate() {
        return target_rate;
    }

    public void setTarget_rate(Integer target_rate) {
        this.target_rate = target_rate;
    }

    public Float getFev() {
        return fev;
    }

    public void setFev(Float fev) {
        this.fev = fev;
    }

    public Float getFev_rate() {
        return fev_rate;
    }

    public void setFev_rate(Float fev_rate) {
        this.fev_rate = fev_rate;
    }

    public Float getFev_fvc() {
        return fev_fvc;
    }

    public void setFev_fvc(Float fev_fvc) {
        this.fev_fvc = fev_fvc;
    }

    public String getConclusion() {
        return conclusion;
    }

    public void setConclusion(String conclusion) {
        this.conclusion = conclusion;
    }
}