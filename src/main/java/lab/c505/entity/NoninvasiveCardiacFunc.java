package lab.c505.entity;

public class NoninvasiveCardiacFunc {
    private Long ncf_id;

    private Byte check_type;

    private Long fr_id;

    private Long ar_id;

    private Long patient_id;

    private Integer hr;

    private Float sv;

    private Float svi;

    private Float co;

    private Float ci;

    private Float cti;

    private Float lcwi;

    private Float lvet;

    private Float ef;

    private Float svr;

    private Float svri;

    private Float edfr;

    private Float edv;

    private String conclusion;

    public Long getNcf_id() {
        return ncf_id;
    }

    public void setNcf_id(Long ncf_id) {
        this.ncf_id = ncf_id;
    }

    public Byte getCheck_type() {
        return check_type;
    }

    public void setCheck_type(Byte check_type) {
        this.check_type = check_type;
    }

    public Long getFr_id() {
        return fr_id;
    }

    public void setFr_id(Long fr_id) {
        this.fr_id = fr_id;
    }

    public Long getAr_id() {
        return ar_id;
    }

    public void setAr_id(Long ar_id) {
        this.ar_id = ar_id;
    }

    public Long getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(Long patient_id) {
        this.patient_id = patient_id;
    }

    public Integer getHr() {
        return hr;
    }

    public void setHr(Integer hr) {
        this.hr = hr;
    }

    public Float getSv() {
        return sv;
    }

    public void setSv(Float sv) {
        this.sv = sv;
    }

    public Float getSvi() {
        return svi;
    }

    public void setSvi(Float svi) {
        this.svi = svi;
    }

    public Float getCo() {
        return co;
    }

    public void setCo(Float co) {
        this.co = co;
    }

    public Float getCi() {
        return ci;
    }

    public void setCi(Float ci) {
        this.ci = ci;
    }

    public Float getCti() {
        return cti;
    }

    public void setCti(Float cti) {
        this.cti = cti;
    }

    public Float getLcwi() {
        return lcwi;
    }

    public void setLcwi(Float lcwi) {
        this.lcwi = lcwi;
    }

    public Float getLvet() {
        return lvet;
    }

    public void setLvet(Float lvet) {
        this.lvet = lvet;
    }

    public Float getEf() {
        return ef;
    }

    public void setEf(Float ef) {
        this.ef = ef;
    }

    public Float getSvr() {
        return svr;
    }

    public void setSvr(Float svr) {
        this.svr = svr;
    }

    public Float getSvri() {
        return svri;
    }

    public void setSvri(Float svri) {
        this.svri = svri;
    }

    public Float getEdfr() {
        return edfr;
    }

    public void setEdfr(Float edfr) {
        this.edfr = edfr;
    }

    public Float getEdv() {
        return edv;
    }

    public void setEdv(Float edv) {
        this.edv = edv;
    }

    public String getConclusion() {
        return conclusion;
    }

    public void setConclusion(String conclusion) {
        this.conclusion = conclusion;
    }
}