package service;

import DAO.implementation.HabitsDAO;
import model.HabitsEntity;

import java.util.List;

public class HabitsService {

    public List<HabitsEntity> findAll() throws Exception{
        return  new HabitsDAO().findAll();
    }

    public HabitsEntity findById(Integer id) throws Exception{
        return new HabitsDAO().findByID(id);
    }

    public void create(HabitsEntity entity) throws Exception{
        new HabitsDAO().create(entity);
    }

    public void update(HabitsEntity entity) throws Exception{
        new HabitsDAO().update(entity);
    }

    public void delete(Integer id) throws Exception{
        new HabitsDAO().delete(id);
    }
}
