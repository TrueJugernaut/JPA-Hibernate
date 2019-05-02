package jpademo.dao.impl;

import jpademo.dao.AbstractDao;
import jpademo.dao.TestDao;
import jpademo.model.Patient;
import jpademo.model.Test;

import javax.persistence.EntityManager;

public class TestDaoImpl extends AbstractDao<Test, Long> implements TestDao {
    public TestDaoImpl(EntityManager entityManager) {
        super(entityManager, Test.class);
    }

    @Override
    public void doSkinTest(Patient patient) {

    }
}
