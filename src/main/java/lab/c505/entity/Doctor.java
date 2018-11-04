package lab.c505.entity;

public class Doctor {
    private Long doctor_id;

    private String doctor_number;

    private String doctor_name;

    private Byte gender;

    private String phone;

    private Long hosp_id;

    public Long getDoctor_id() {
        return doctor_id;
    }

    public void setDoctor_id(Long doctor_id) {
        this.doctor_id = doctor_id;
    }

    public String getDoctor_number() {
        return doctor_number;
    }

    public void setDoctor_number(String doctor_number) {
        this.doctor_number = doctor_number;
    }

    public String getDoctor_name() {
        return doctor_name;
    }

    public void setDoctor_name(String doctor_name) {
        this.doctor_name = doctor_name;
    }

    public Byte getGender() {
        return gender;
    }

    public void setGender(Byte gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Long getHosp_id() {
        return hosp_id;
    }

    public void setHosp_id(Long hosp_id) {
        this.hosp_id = hosp_id;
    }
}