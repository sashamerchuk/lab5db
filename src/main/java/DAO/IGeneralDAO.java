package DAO;

import java.util.List;

public interface IGeneralDAO<T,ID_T> {
    List<T> findAll() throws Exception;
    T findByID(ID_T id) throws Exception;
    void create(T entity) throws Exception;
    void update(T entity) throws Exception;
    void delete(ID_T id) throws Exception;
}
