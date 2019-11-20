package service;

import DAO.implementation.TypeDoctorDAO;
import model.TypeDoctorEntity;

import java.util.List;

public class TypeDoctorService {

    public List<TypeDoctorEntity> findAll() throws Exception{
        return  new TypeDoctorDAO().findAll();
    }

    public TypeDoctorEntity findById(Integer id) throws Exception{
        return new TypeDoctorDAO().findByID(id);
    }

    public void create(TypeDoctorEntity entity) throws Exception{
        new TypeDoctorDAO().create(entity);
    }

    public void update(TypeDoctorEntity entity) throws Exception{
        new TypeDoctorDAO().update(entity);
    }

    public void delete(Integer id) throws Exception{
        new TypeDoctorDAO().delete(id);
    }
}
