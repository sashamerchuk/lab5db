package DAO.implementation;

import DAO.IHabitsDAO;
import model.HabitsEntity;
import org.hibernate.Session;
import session.SessionManager;

import org.hibernate.query.Query;
import java.util.LinkedList;
import java.util.List;
public class HabitsDAO implements IHabitsDAO {

    @Override
    public List<HabitsEntity> findAll() throws Exception{
        List<HabitsEntity> allEntities = new LinkedList<>();

        Session session = SessionManager.getSession();

        Query query = session.createQuery("FROM HabitsEntity");
        for(Object obj : query.list()){
            allEntities.add((HabitsEntity) obj);
        }
        return allEntities;
    }

    @Override
    public HabitsEntity findByID(Integer id) throws Exception{
        Session session = SessionManager.getSession();
        return session.get(HabitsEntity.class, id);
    }

    @Override
    public void create(HabitsEntity entity) throws Exception{
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
    public void update(HabitsEntity entity) throws Exception{
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
        HabitsEntity habitsEntity = session.get(HabitsEntity.class,id);
        if(habitsEntity!=null){
            session.delete(habitsEntity);
        }else{
            System.out.println("No entity to delete");
        }
        session.getTransaction().commit();
    }
}
