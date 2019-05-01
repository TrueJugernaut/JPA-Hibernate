package jpademo.dao.impl;

import jpademo.dao.AbstractDao;
import jpademo.dao.PatientDao;
import jpademo.model.Patient;
import jpademo.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.jpa.HibernateQuery;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;


public class PatientDaoImpl extends AbstractDao<Patient, Long> implements PatientDao {

    public PatientDaoImpl(EntityManager entityManager) {
        super(entityManager, Patient.class);
    }
    private Session session;

    @Override
    public List<Patient> findAll() {
        entityManager.getTransaction().begin();
//        List<Patient> tList = entityManager.createQuery("SELECT e FROM " + Patient.class.getSimpleName() + " e").getResultList();
        List<Patient> selectAFromPatientA = entityManager.createQuery("select a from Patient a", Patient.class).getResultList();

//        TypedQuery<Patient> query =
//                entityManager.createQuery("SELECT p FROM "+ Patient.class.getSimpleName() +" p", Patient.class);
//        List<Patient> results = query.getResultList();
        entityManager.getTransaction().commit();
        return selectAFromPatientA;
    }
}
