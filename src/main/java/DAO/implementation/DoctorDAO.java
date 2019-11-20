package DAO.implementation;

import DAO.IDoctorDAO;
import model.DoctorEntity;
import org.hibernate.Session;
import session.SessionManager;
import org.hibernate.query.Query;
import java.util.LinkedList;
import java.util.List;

public class DoctorDAO implements IDoctorDAO {
    @Override
    public List<DoctorEntity> findAll() throws Exception{
        List<DoctorEntity> allEntities = new LinkedList<>();

        Session session = SessionManager.getSession();

        Query query = session.createQuery("FROM DoctorEntity");
        for(Object obj : query.list()){
            allEntities.add((DoctorEntity) obj);
        }
        return allEntities;
    }

    @Override
    public DoctorEntity findByID(Integer id) throws Exception{
        Session session = SessionManager.getSession();
        return session.get(DoctorEntity.class, id);
    }

    @Override
    public void create(DoctorEntity entity) throws Exception{
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
    public void update(DoctorEntity entity) throws Exception{
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
        DoctorEntity doctorEntity = session.get(DoctorEntity.class,id);
        if(doctorEntity!=null){
            session.delete(doctorEntity);
        }else{
            System.out.println("No entity to delete");
        }
        session.getTransaction().commit();
    }
}
