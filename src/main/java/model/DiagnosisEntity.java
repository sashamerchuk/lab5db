package model;

import javax.persistence.*;

@Entity
@Table(name = "diagnosis",schema = "hospitallab4db")
public class DiagnosisEntity {
    private Integer iddiagnosis;
    private String description_diagnosis;
    private Integer patient_id_patient;
    private String data_diagnosis;

    @Id
    @Column(name = "iddiagnosis",nullable = false)
    public Integer getIddiagnosis() {
        return iddiagnosis;
    }

    public void setIddiagnosis(Integer iddiagnosis) {
        this.iddiagnosis = iddiagnosis;
    }

    @Basic
    @Column(name = "description_diagnosis",nullable = false,length = 50)
    public String getDescription_diagnosis() {
        return description_diagnosis;
    }

    public void setDescription_diagnosis(String description_diagnosis) {
        this.description_diagnosis = description_diagnosis;
    }


    @Basic
    @Column(name = "patient_id_patient",nullable = false)
    public Integer getPatient_id_patient() {
        return patient_id_patient;
    }

    public void setPatient_id_patient(Integer patient_id_patient) {
        this.patient_id_patient = patient_id_patient;
    }

    @Basic
    @Column(name = "data_diagnosis")
    public String getData_diagnosis() {
        return data_diagnosis;
    }

    public void setData_diagnosis(String data_diagnosis) {
        this.data_diagnosis = data_diagnosis;
    }


    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;

        DiagnosisEntity that = (DiagnosisEntity) o;
        if(iddiagnosis != null ? !iddiagnosis.equals(that.iddiagnosis) : that.iddiagnosis != null) return false;
        if(description_diagnosis != null ? !description_diagnosis.equals(that.description_diagnosis) : that.description_diagnosis != null) return false;
        if(patient_id_patient != null ? !patient_id_patient.equals(that.patient_id_patient) :that.patient_id_patient != null) return false;
        if(data_diagnosis != null ? !data_diagnosis.equals(that.data_diagnosis) : that.data_diagnosis != null) return false;
        return true;
    }

    @Override
    public int hashCode(){
        int result = iddiagnosis != null ? iddiagnosis.hashCode() : 0;
        result = 31 * result + (description_diagnosis != null ? description_diagnosis.hashCode() :0);
        result = 31 * result + (patient_id_patient != null ? patient_id_patient.hashCode() :0);
        result = 31 * result + (data_diagnosis != null ? data_diagnosis.hashCode() : 0);
        return result;
    }

    @Override
    public String toString(){
        return "DiagnosisEntity{" + "iddiagnosis = "  + iddiagnosis + ","
                + "description_diagnosis = " + description_diagnosis + ","
                + "patient_id_patient = " + patient_id_patient  + ","
                + "data_diagnosis = " + data_diagnosis + "}";
    }
}
