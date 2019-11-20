package model;

import javax.persistence.*;

@Entity
@Table(name = "habits",schema = "hospitallab4db")
public class HabitsEntity {
    private Integer idhabits;
    private String habits;

    @Id
    @Column(name = "idhabits",nullable = false)
    public Integer getIdhabits() {
        return idhabits;
    }

    public void setIdhabits(Integer idhabits) {
        this.idhabits = idhabits;
    }

    @Basic
    @Column(name = "habits",nullable = false,length = 3)
    public String getHabits() {
        return habits;
    }

    public void setHabits(String habits) {
        this.habits = habits;
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;

        HabitsEntity that = (HabitsEntity) o;
        if(idhabits != null ? !idhabits.equals(that.idhabits) : that.idhabits != null) return false;
        if(habits != null ? !habits.equals(that.habits) : that.habits != null) return false;
        return true;
    }

    @Override
    public int hashCode(){
        int result = idhabits != null ? idhabits.hashCode() : 0;
        result = 31 * result + (habits != null ? habits.hashCode() :0);
        return result;
    }

    @Override
    public String toString(){
        return "HabitsEntity{" + "idhabits = "  + idhabits + ","
                + "habits = " + habits + "}";
    }
}
