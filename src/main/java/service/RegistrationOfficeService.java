package service;

import DAO.implementation.RegistrationOfficeDAO;
import model.RegistrationOfficeEntity;

import java.util.List;

public class RegistrationOfficeService {

    public List<RegistrationOfficeEntity> findAll() throws Exception{
        return  new RegistrationOfficeDAO().findAll();
    }

    public RegistrationOfficeEntity findById(Integer id) throws Exception{
        return new RegistrationOfficeDAO().findByID(id);
    }

    public void create(RegistrationOfficeEntity entity) throws Exception{
        new RegistrationOfficeDAO().create(entity);
    }

    public void update(RegistrationOfficeEntity entity) throws Exception{
        new RegistrationOfficeDAO().update(entity);
    }

    public void delete(Integer id) throws Exception{
        new RegistrationOfficeDAO().delete(id);
    }
}
