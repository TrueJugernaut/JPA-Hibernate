package jpademo;

import jpademo.dao.PatientDao;
import jpademo.dao.impl.PatientDaoImpl;
import jpademo.model.Patient;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {

//    @PersistenceContext
    private static EntityManager entityManager;

    public static EntityManager getEntityManager() {
        return entityManager;
    }

//    PatientDao patientDao = new PatientDaoImpl(entityManager, Patient);
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence
                .createEntityManagerFactory("persistence");
        entityManager = entityManagerFactory.createEntityManager();
        Patient patient = new Patient();
        savePatient(patient);
        getPatient(1L);

    }


//    PatientDaoImpl patientDao;

    public static void savePatient(Patient patient) {
        patient.setName("Petro Poroshenko");
        patient.setDateOfBirth(new Date(1972, 12, 12));
    }
    public static Patient getPatient(long patientId) {

        return null;
    }

    public static void removePatient(Long patientId) {

    }
}
