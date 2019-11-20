package DAO.implementation;

import DAO.IAnalysisDAO;
import model.AnalysisEntity;
import org.hibernate.Session;
import session.SessionManager;

import org.hibernate.query.Query;
import java.util.LinkedList;
import java.util.List;

public class AnalysisDAO implements IAnalysisDAO {


    @Override
    public List<AnalysisEntity> findAll() throws Exception{
        List<AnalysisEntity> allEntities = new LinkedList<>();

        Session session = SessionManager.getSession();

        Query query = session.createQuery("FROM AnalysisEntity");
        for(Object obj : query.list()){
            allEntities.add((AnalysisEntity) obj);
        }
        return allEntities;
    }

    @Override
    public AnalysisEntity findByID(Integer id) throws Exception{
        Session session = SessionManager.getSession();
        return session.get(AnalysisEntity.class, id);
    }

    @Override
    public void create(AnalysisEntity entity) throws Exception{
        Session session = SessionManager.getSession();

        if(entity!=null){
            session.beginTransaction();
            session.save(entity);
            session.getTransaction().commit();
        }else{
            System.out.println("No entity to save");
        }
    }

    @Override
    public void update(AnalysisEntity entity) throws Exception{
        Session session = SessionManager.getSession();

        if(entity!=null){
            session.beginTransaction();
            session.update(entity);
            session.getTransaction().commit();
        }else {
            System.out.println("No entity to update");
        }
    }

    @Override
    public void delete(Integer id) throws Exception{
        Session session = SessionManager.getSession();
        session.beginTransaction();
        AnalysisEntity analysisEntity = session.get(AnalysisEntity.class,id);
        if(analysisEntity!=null){
            session.delete(analysisEntity);
        }else{
            System.out.println("No entity to delete");
        }
        session.getTransaction().commit();
    }
}
