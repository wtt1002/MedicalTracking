package lab.c505.entity;

public class AdverseReaction {
    private Long arc_id;

    private Long ar_id;

    private Long mr_id;

    private Long patient_id;

    private Byte drug_stimulate;

    private String hemorrhage;

    private Byte re_hospital;

    private Byte dyspnea;

    private Byte other;

    private String supplement;

    public Long getArc_id() {
        return arc_id;
    }

    public void setArc_id(Long arc_id) {
        this.arc_id = arc_id;
    }

    public Long getAr_id() {
        return ar_id;
    }

    public void setAr_id(Long ar_id) {
        this.ar_id = ar_id;
    }

    public Long getMr_id() {
        return mr_id;
    }

    public void setMr_id(Long mr_id) {
        this.mr_id = mr_id;
    }

    public Long getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(Long patient_id) {
        this.patient_id = patient_id;
    }

    public Byte getDrug_stimulate() {
        return drug_stimulate;
    }

    public void setDrug_stimulate(Byte drug_stimulate) {
        this.drug_stimulate = drug_stimulate;
    }

    public String getHemorrhage() {
        return hemorrhage;
    }

    public void setHemorrhage(String hemorrhage) {
        this.hemorrhage = hemorrhage;
    }

    public Byte getRe_hospital() {
        return re_hospital;
    }

    public void setRe_hospital(Byte re_hospital) {
        this.re_hospital = re_hospital;
    }

    public Byte getDyspnea() {
        return dyspnea;
    }

    public void setDyspnea(Byte dyspnea) {
        this.dyspnea = dyspnea;
    }

    public Byte getOther() {
        return other;
    }

    public void setOther(Byte other) {
        this.other = other;
    }

    public String getSupplement() {
        return supplement;
    }

    public void setSupplement(String supplement) {
        this.supplement = supplement;
    }
}