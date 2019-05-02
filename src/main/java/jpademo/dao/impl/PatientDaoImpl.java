package jpademo.dao.impl;

import jpademo.dao.AbstractDao;
import jpademo.dao.PatientDao;
import jpademo.model.Patient;
import jpademo.model.Test;

import javax.persistence.EntityManager;


public class PatientDaoImpl extends AbstractDao<Patient, Long> implements PatientDao {

    public PatientDaoImpl(EntityManager entityManager) {
        super(entityManager, Patient.class);
    }

    @Override
    public void doTest(Patient patient, Test test) {
        entityManager.getTransaction().begin();
    }
}
