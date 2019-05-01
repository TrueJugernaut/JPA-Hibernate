package jpademo.dao;

import org.hibernate.Session;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.io.Serializable;
import java.util.List;

public class AbstractDao<T, ID extends Serializable> implements CrudDao<T, ID> {

    protected final EntityManager entityManager;
    protected final Class<T> aClass;

    public AbstractDao(EntityManager entityManager, Class<T> aClass) {
        this.entityManager = entityManager;
        this.aClass = aClass;
    }


    @Override
    public T findById(ID id) {
        entityManager.getTransaction().begin();
        T t = entityManager.find(aClass, id);
        entityManager.getTransaction().commit();
        return t;
    }

    @Override
    public T insert(T t) {
        entityManager.getTransaction().begin();
        entityManager.persist(t);
        entityManager.getTransaction().commit();
        return findById((ID) entityManager
                .createQuery("select max(e.id) as id from " + aClass.getSimpleName() + " e").getSingleResult());
    }

    @Override
    public T update(T t) {
        entityManager.getTransaction().begin();
        entityManager.merge(t);
        entityManager.getTransaction().commit();
        return null;
    }

    @Override
    public void delete(T t) {
        entityManager.getTransaction().begin();
        entityManager.remove(t);
        entityManager.getTransaction().commit();
    }
}