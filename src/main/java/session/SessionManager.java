package session;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.cfg.Configuration;

public class SessionManager {

    private static final SessionFactory sessionFactory;

    static {
        try{
            sessionFactory  = new Configuration().configure().buildSessionFactory();
        }catch(Throwable t){
            System.err.println("Initial Session Factory creation failed" + t);
            throw new ExceptionInInitializerError(t);
        }
    }

    public static Session getSession() throws HibernateException{
        return sessionFactory.openSession();
    }
}
