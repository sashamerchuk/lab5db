package service;


import DAO.implementation.DiagnosisDAO;
import model.DiagnosisEntity;

import java.util.List;

public class DiagnosisService {

    public List<DiagnosisEntity> findAll() throws Exception{
        return  new DiagnosisDAO().findAll();
    }

    public DiagnosisEntity findById(Integer id) throws Exception{
        return new DiagnosisDAO().findByID(id);
    }

    public void create(DiagnosisEntity entity) throws Exception{
        new DiagnosisDAO().create(entity);
    }

    public void update(DiagnosisEntity entity) throws Exception{
        new DiagnosisDAO().update(entity);
    }

    public void delete(Integer id) throws Exception{
        new DiagnosisDAO().delete(id);
    }
}
