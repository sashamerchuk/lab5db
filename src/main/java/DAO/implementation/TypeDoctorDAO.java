package DAO.implementation;

import DAO.ITypeDoctorDAO;
import model.TypeDoctorEntity;
import org.hibernate.Session;
import session.SessionManager;

import org.hibernate.query.Query;
import java.util.LinkedList;
import java.util.List;
public class TypeDoctorDAO implements ITypeDoctorDAO {
    @Override
    public List<TypeDoctorEntity> findAll() throws Exception{
        List<TypeDoctorEntity> allEntities = new LinkedList<>();

        Session session = SessionManager.getSession();

        Query query = session.createQuery("FROM TypeDoctorEntity");
        for(Object obj : query.list()){
            allEntities.add((TypeDoctorEntity) obj);
        }
        return allEntities;
    }

    @Override
    public TypeDoctorEntity findByID(Integer id) throws Exception{
        Session session = SessionManager.getSession();
        return session.get(TypeDoctorEntity.class, id);
    }

    @Override
    public void create(TypeDoctorEntity entity) throws Exception{
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
    public void update(TypeDoctorEntity entity) throws Exception{
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
        TypeDoctorEntity typeDoctorEntity = session.get(TypeDoctorEntity.class,id);
        if(typeDoctorEntity!=null){
            session.delete(typeDoctorEntity);
        }else{
            System.out.println("No entity to delete");
        }
        session.getTransaction().commit();
    }
}
