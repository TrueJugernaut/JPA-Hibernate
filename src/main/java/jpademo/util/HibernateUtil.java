package jpademo.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class HibernateUtil {
    private static final String PERSISTENT_UNIT_NAME = "persistenceU";

    private static final EntityManagerFactory entityManager;

    static {
        try {
            entityManager = Persistence.createEntityManagerFactory(PERSISTENT_UNIT_NAME);
        } catch (Throwable ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static EntityManager getEntityManager() {
        return entityManager.createEntityManager();
    }

    public static void close() {
        entityManager.close();
    }


}

