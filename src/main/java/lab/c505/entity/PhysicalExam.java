package lab.c505.entity;

public class PhysicalExam {
    private Long pe_id;

    private Byte check_type;

    private Long fr_id;

    private Long ar_id;

    private Long patient_id;

    private Byte blood_h;

    private Byte blood_l;

    private Byte hr;

    private Byte weight;

    private String supplement;

    public Long getPe_id() {
        return pe_id;
    }

    public void setPe_id(Long pe_id) {
        this.pe_id = pe_id;
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

    public Byte getBlood_h() {
        return blood_h;
    }

    public void setBlood_h(Byte blood_h) {
        this.blood_h = blood_h;
    }

    public Byte getBlood_l() {
        return blood_l;
    }

    public void setBlood_l(Byte blood_l) {
        this.blood_l = blood_l;
    }

    public Byte getHr() {
        return hr;
    }

    public void setHr(Byte hr) {
        this.hr = hr;
    }

    public Byte getWeight() {
        return weight;
    }

    public void setWeight(Byte weight) {
        this.weight = weight;
    }

    public String getSupplement() {
        return supplement;
    }

    public void setSupplement(String supplement) {
        this.supplement = supplement;
    }
}