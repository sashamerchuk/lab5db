package model;

import javax.persistence.*;

@Entity
@Table(name = "patient",schema = "hospitallab4db")
public class PatientEntity {
    private Integer id_patient;
    private String name;
    private Integer age;
    private String work;
    private String email;
    private Integer phone;
    private String lifestyle;
    private Integer bad_habits;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_patient",nullable = false)
    public Integer getId_patient() {
        return id_patient;
    }

    public void setId_patient(Integer id_patient) {
        this.id_patient = id_patient;
    }

    @Basic
    @Column(name = "name",nullable = false)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "age",nullable = false)
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Basic
    @Column(name = "work",nullable = false)
    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    @Basic
    @Column(name = "email",nullable = false)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "phone",nullable = false)
    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "lifestyle",nullable = false)
    public String getLifestyle() {
        return lifestyle;
    }

    public void setLifestyle(String lifestyle) {
        this.lifestyle = lifestyle;
    }

    @Basic
    @Column(name = "bad_habits",nullable = false)
    public Integer getBad_habits() {
        return bad_habits;
    }

    public void setBad_habits(Integer bad_habits) {
        this.bad_habits = bad_habits;
    }


    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;

        PatientEntity that = (PatientEntity) o;
        if(id_patient != null ? !id_patient.equals(that.id_patient) : that.id_patient != null) return false;
        if(name != null ? !name.equals(that.name) : that.name != null) return false;
        if(age != null ? !age.equals(that.age) : that.age != null) return false;
        if(work != null ? !work.equals(that.work) : that.work != null) return false;
        if(email != null ? !email.equals(that.email) : that.email != null) return false;
        if(phone != null ? !phone.equals(that.phone) : that.phone != null) return false;
        if(lifestyle != null ? !lifestyle.equals(that.lifestyle) : that.lifestyle != null) return false;
        if(bad_habits != null ? !bad_habits.equals(that.bad_habits) : that.bad_habits != null) return false;
        return true;
    }

    @Override
    public int hashCode(){
        int result = id_patient != null ? id_patient.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() :0);
        result = 31 * result + (age != null ? age.hashCode() :0);
        result = 31 * result + (work != null ? work.hashCode() :0);
        result = 31 * result + (email != null ? email.hashCode() :0);
        result = 31 * result + (phone != null ? phone.hashCode() :0);
        result = 31 * result + (lifestyle != null ? lifestyle.hashCode() :0);
        result = 31 * result + (bad_habits != null ? bad_habits.hashCode() :0);

        return result;
    }

    @Override
    public String toString(){
        return "PatientEntity{ " + "id_patient = "  + id_patient + ","
                + "name = " + name
                +"age = " + age +
                "email = " + email +
                "phone = " + phone +
                "lifestyle = " + lifestyle +
                "bad_habits = " + bad_habits + "}";
    }
}
