package service;

import DAO.implementation.DoctorDAO;
import model.DoctorEntity;

import java.util.List;

public class DoctorService {

    public List<DoctorEntity> findAll() throws Exception{
        return  new DoctorDAO().findAll();
    }

    public DoctorEntity findById(Integer id) throws Exception{
        return new DoctorDAO().findByID(id);
    }

    public void create(DoctorEntity entity) throws Exception{
        new DoctorDAO().create(entity);
    }

    public void update(DoctorEntity entity) throws Exception{
        new DoctorDAO().update(entity);
    }

    public void delete(Integer id) throws Exception{
        new DoctorDAO().delete(id);
    }
}
