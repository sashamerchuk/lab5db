package DAO.implementation;

import DAO.IPatientDAO;
import model.PatientEntity;
import org.hibernate.Session;
import session.SessionManager;

import org.hibernate.query.Query;
import java.util.LinkedList;
import java.util.List;


public class PatientDAO implements IPatientDAO {
    @Override
    public List<PatientEntity> findAll() throws Exception{
        List<PatientEntity> allEntities = new LinkedList<>();

        Session session = SessionManager.getSession();

        Query query = session.createQuery("FROM PatientEntity");
        for(Object obj : query.list()){
            allEntities.add((PatientEntity) obj);
        }
        return allEntities;
    }

    @Override
    public PatientEntity findByID(Integer id) throws Exception{
        Session session = SessionManager.getSession();
        return session.get(PatientEntity.class, id);
    }

    @Override
    public void create(PatientEntity entity) throws Exception{
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
    public void update(PatientEntity entity) throws Exception{
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
        PatientEntity patientEntity = session.get(PatientEntity.class,id);
        if(patientEntity!=null){
            session.delete(patientEntity);
        }else{
            System.out.println("No entity to delete");
        }
        session.getTransaction().commit();
    }
}
