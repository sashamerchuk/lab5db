package service;

import DAO.implementation.HabitsDAO;
import DAO.implementation.PatientDAO;
import model.PatientEntity;

import java.util.List;

public class PatientService {

    public List<PatientEntity> findAll() throws Exception{
        return  new PatientDAO().findAll();
    }

    public PatientEntity findById(Integer id) throws Exception{
        return new PatientDAO().findByID(id);
    }

    public void create(PatientEntity entity) throws Exception{
        new PatientDAO().create(entity);
    }

    public void update(PatientEntity entity) throws Exception{
        new PatientDAO().update(entity);
    }

    public void delete(Integer id) throws Exception{
        new PatientDAO().delete(id);
    }
}
