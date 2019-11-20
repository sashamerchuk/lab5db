package DAO.implementation;

import DAO.IDiagnosisDAO;
import model.DiagnosisEntity;
import org.hibernate.Session;
import org.hibernate.query.Query;
import session.SessionManager;

import java.util.LinkedList;
import java.util.List;

public class DiagnosisDAO implements IDiagnosisDAO {

    @Override
    public List<DiagnosisEntity> findAll() throws Exception{
        List<DiagnosisEntity> allEntities = new LinkedList<>();

        Session session = SessionManager.getSession();

        Query query = session.createQuery("FROM DiagnosisEntity");
        for(Object obj : query.list()){
            allEntities.add((DiagnosisEntity) obj);
        }
        return allEntities;
    }

    @Override
    public DiagnosisEntity findByID(Integer id) throws Exception{
        Session session = SessionManager.getSession();
        return session.get(DiagnosisEntity.class, id);
    }

    @Override
    public void create(DiagnosisEntity entity) throws Exception{
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
    public void update(DiagnosisEntity entity) throws Exception{
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
        DiagnosisEntity diagnosisEntity = session.get(DiagnosisEntity.class,id);
        if(diagnosisEntity!=null){
            session.delete(diagnosisEntity);
        }else{
            System.out.println("No entity to delete");
        }
        session.getTransaction().commit();
    }
}
