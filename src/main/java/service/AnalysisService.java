package service;

import DAO.implementation.AnalysisDAO;
import model.AnalysisEntity;

import java.util.List;

public class AnalysisService {

    public List<AnalysisEntity> findAll() throws Exception{
        return  new AnalysisDAO().findAll();
    }

    public AnalysisEntity findById(Integer id) throws Exception{
        return new AnalysisDAO().findByID(id);
    }

    public void create(AnalysisEntity entity) throws Exception{
        new AnalysisDAO().create(entity);
    }

    public void update(AnalysisEntity entity) throws Exception{
        new AnalysisDAO().update(entity);
    }

    public void delete(Integer id) throws Exception{
        new AnalysisDAO().delete(id);
    }
}
