package model;

import javax.persistence.*;

@Entity
@Table(name = "type_doctor",schema = "hospitallab4db")
public class TypeDoctorEntity {
    private Integer idtype_doctor;
    private String type_doctor;

    @Id
    @Column(name = "idtype_doctor",nullable = false)
    public Integer getIdtype_doctor() {
        return idtype_doctor;
    }

    public void setIdtype_doctor(Integer idtype_doctor) {
        this.idtype_doctor = idtype_doctor;
    }

    @Basic
    @Column(name = "type_doctor",nullable = false)
    public String getType_doctor() {
        return type_doctor;
    }

    public void setType_doctor(String type_doctor) {
        this.type_doctor = type_doctor;
    }


    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;

        TypeDoctorEntity that = (TypeDoctorEntity) o;
        if(idtype_doctor != null ? !idtype_doctor.equals(that.idtype_doctor) : that.idtype_doctor != null) return false;
        if(type_doctor != null ? !type_doctor.equals(that.type_doctor) : that.type_doctor != null) return false;
        return true;
    }

    @Override
    public int hashCode(){
        int result = idtype_doctor != null ? idtype_doctor.hashCode() : 0;
        result = 31 * result + (idtype_doctor != null ? idtype_doctor.hashCode() :0);
        result = 31 * result + (type_doctor != null ? type_doctor.hashCode() :0);
        return result;
    }

    @Override
    public String toString(){
        return "TypeDoctorEntity{" + "idtype_doctor = "  + idtype_doctor + ","
                + "type_doctor = " + type_doctor + "}";
    }
}

