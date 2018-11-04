package lab.c505.entity;

public class AdverseReaction {
    private Long ar_id;

    private Long fr_id;

    private Byte drug_stimulate;

    private String hemorrhage;

    private Byte re_hospital;

    private Byte dyspnea;

    private Byte other;

    private String supplement;

    public Long getAr_id() {
        return ar_id;
    }

    public void setAr_id(Long ar_id) {
        this.ar_id = ar_id;
    }

    public Long getFr_id() {
        return fr_id;
    }

    public void setFr_id(Long fr_id) {
        this.fr_id = fr_id;
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