package model;

import javax.persistence.*;

@Entity
@Table(name = "registration_office",schema = "hospitallab4db")
public class RegistrationOfficeEntity {
    private Integer id_of_patient;
    private String data;
    private Integer id_medical_doctor;
    private String type_of_treatment;
    private Integer money;
    private Integer doctor_iddoctor;
    private Integer patient_id_patient;

    @Id
    @Column(name = "id_of_patient",nullable = false)
    public Integer getId_of_patient() {
        return id_of_patient;
    }

    public void setId_of_patient(Integer id_of_patient) {
        this.id_of_patient = id_of_patient;
    }

    @Basic
    @Column(name = "data",nullable = false)
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Basic
    @Column(name = "id_medical_doctor",nullable = false)
    public Integer getId_medical_doctor() {
        return id_medical_doctor;
    }

    public void setId_medical_doctor(Integer id_medical_doctor) {
        this.id_medical_doctor = id_medical_doctor;
    }

    @Basic
    @Column(name = "type_of_treatment")
    public String getType_of_treatment() {
        return type_of_treatment;
    }

    public void setType_of_treatment(String type_of_treatment) {
        this.type_of_treatment = type_of_treatment;
    }

    @Basic
    @Column(name = "money",nullable = false)
    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    @Basic
    @Column(name = "doctor_iddoctor",nullable = false)
    public Integer getDoctor_iddoctor() {
        return doctor_iddoctor;
    }

    public void setDoctor_iddoctor(Integer doctor_iddoctor) {
        this.doctor_iddoctor = doctor_iddoctor;
    }

    @Basic
    @Column(name = "patient_id_patient",nullable = false)
    public Integer getPatient_id_patient() {
        return patient_id_patient;
    }

    public void setPatient_id_patient(Integer patient_id_patient) {
        this.patient_id_patient = patient_id_patient;
    }



    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;

        RegistrationOfficeEntity that = (RegistrationOfficeEntity) o;
        if(id_of_patient != null ? !id_of_patient.equals(that.id_of_patient) : that.id_of_patient != null) return false;
        if(data != null ? !data.equals(that.data) : that.data!= null) return false;
        if(id_medical_doctor != null ? !id_medical_doctor.equals(that.id_medical_doctor) : that.id_medical_doctor != null) return false;
        if(type_of_treatment != null ? !type_of_treatment.equals(that.type_of_treatment) : that.type_of_treatment != null) return false;
        if(money != null ? !money.equals(that.money) : that.money != null) return false;
        if(doctor_iddoctor != null ? !doctor_iddoctor.equals(that.doctor_iddoctor) : that.doctor_iddoctor != null) return false;
        if(patient_id_patient != null ? !patient_id_patient.equals(that.patient_id_patient) : that.patient_id_patient != null) return false;
        return true;
    }

    @Override
    public int hashCode(){
        int result = id_of_patient != null ? id_of_patient.hashCode() : 0;
        result = 31 * result + (data != null ? data.hashCode() :0);
        result = 31 * result + (id_medical_doctor != null ? id_medical_doctor.hashCode() :0);
        result = 31 * result + (type_of_treatment != null ? type_of_treatment.hashCode() :0);
        result = 31 * result + (money != null ? money.hashCode() :0);
        result = 31 * result + (doctor_iddoctor != null ? doctor_iddoctor.hashCode() :0);
        result = 31 * result + (patient_id_patient != null ? patient_id_patient.hashCode() :0);
        return result;
    }

    @Override
    public String toString(){
        return "RegistrationOfficeEntity{ " + "id_of_patient = "  + id_of_patient + ","
                + "data = " + data
                +"id_medical_doctor = " + id_medical_doctor +
                "type_of_treatment = " + type_of_treatment +
                "money = " + money +
                "doctor_id_doctor = " + doctor_iddoctor +
                "patient_id_patient = " + patient_id_patient + "}";
    }
}
