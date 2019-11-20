package DAO.implementation;

import DAO.IRegistrationOfficeDAO;

import model.RegistrationOfficeEntity;
import org.hibernate.Session;
import session.SessionManager;

import org.hibernate.query.Query;
import java.util.LinkedList;
import java.util.List;

public class RegistrationOfficeDAO implements IRegistrationOfficeDAO {
    @Override
    public List<RegistrationOfficeEntity> findAll() throws Exception{
        List<RegistrationOfficeEntity> allEntities = new LinkedList<>();

        Session session = SessionManager.getSession();

        Query query = session.createQuery("FROM RegistrationOfficeEntity");
        for(Object obj : query.list()){
            allEntities.add((RegistrationOfficeEntity) obj);
        }
        return allEntities;
    }

    @Override
    public RegistrationOfficeEntity findByID(Integer id) throws Exception{
        Session session = SessionManager.getSession();
        return session.get(RegistrationOfficeEntity.class, id);
    }

    @Override
    public void create(RegistrationOfficeEntity entity) throws Exception{
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
    public void update(RegistrationOfficeEntity entity) throws Exception{
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
        RegistrationOfficeEntity officeEntity = session.get(RegistrationOfficeEntity.class,id);
        if(officeEntity!=null){
            session.delete(officeEntity);
        }else{
            System.out.println("No entity to delete");
        }
        session.getTransaction().commit();
    }
}
