package jpademo.dao.impl;

import jpademo.dao.AbstractDao;
import jpademo.dao.TestDao;
import jpademo.model.Patient;
import jpademo.model.Test;

import javax.persistence.EntityManager;
import java.time.LocalDate;
import java.util.List;

public class TestDaoImpl extends AbstractDao<Test, Long> implements TestDao {
    public TestDaoImpl(EntityManager entityManager) {
        super(entityManager, Test.class);
    }

    @Override
    public List<Test> getAllTestsInDateRange(LocalDate from, LocalDate to) {
        return entityManager
                .createQuery("select t " +
                        "from Test t " +
                        "where t.testDate >= :frm and t.testDate <= :to", Test.class)
                .setParameter("frm", from)
                .setParameter("to", to)
                .getResultList();
    }

    @Override
    public List<Patient> getPatientsWithGlucoseHigherThan(Double normalLevel) {
        return entityManager
                .createQuery("select p " +
                        "from Patient p " +
                        "inner join BloodTest b " +
                        "on p.id = b.patient.id " +
                        "where b.leikocits > :norma", Patient.class)
                .setParameter("norma", normalLevel)
                .getResultList();
    }
}
