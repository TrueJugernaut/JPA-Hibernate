package jpademo.dao;

import java.io.Serializable;
import java.util.List;

public interface CrudDao<T, ID extends Serializable> {

    T findById(ID id);

//    List<T> findAll();

    T insert(T t);

    T update(T t);

    void delete(T t);
}