package jpademo;

import jpademo.dao.PatientDao;
import jpademo.dao.impl.PatientDaoImpl;
import jpademo.model.Patient;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import java.util.Date;
import java.util.List;

public class Main {

    @PersistenceContext
    private static EntityManager entityManager;

    public static EntityManager getEntityManager() {
        return entityManager;
    }

    public static void main(String[] args) {


        EntityManagerFactory entityManagerFactory = Persistence
                .createEntityManagerFactory("persistence");
        entityManager = entityManagerFactory.createEntityManager();

        Patient patient = new Patient();
        PatientDao patientDao = new PatientDaoImpl(entityManager);
        patient.setName("Петя Poroshenko");
        patient.setDateOfBirth(new Date(1972, 12, 12));


        System.out.println(patientDao.findById(3L).toString());
//        patientDao.insert(patient);

        final List<Patient> all = patientDao.findAll();

        for (Patient patient1 : all) {
            System.out.println(patient1.toString());
        }

//        entityManager.getTransaction().begin();
//        patient.setName("Petro Poroshenko");
//        patient.setDateOfBirth(new Date(1972, 12, 12));
//        entityManager.persist(patient);
//        entityManager.getTransaction().commit();
//        entityManager.close();
//
//        List<Patient> all = patientDao.findAll();
//        System.out.println(all);
//
//        entityManagerFactory.close();
    }
}
