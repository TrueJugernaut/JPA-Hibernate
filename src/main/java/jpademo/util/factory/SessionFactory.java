package jpademo.util.factory;

import jpademo.dao.impl.AccessoryDaoImpl;
import jpademo.dao.impl.DeviceDaoImpl;
import jpademo.dao.impl.PatientDaoImpl;
import jpademo.dao.impl.TestDaoImpl;
import jpademo.service.AccessoryService;
import jpademo.service.DeviceService;
import jpademo.service.PatientService;
import jpademo.service.TestService;
import jpademo.service.impl.AccessoryServiceImpl;
import jpademo.service.impl.DeviceServiceImpl;
import jpademo.service.impl.PatientServiceImpl;
import jpademo.service.impl.TestServiceImpl;
import jpademo.util.HibernateUtil;

import javax.persistence.EntityManager;

public class SessionFactory {
    private static final EntityManager entityManager;

    static {
        entityManager = HibernateUtil.getEntityManager();
    }

    public static DeviceService getDeviseService() {
        return new DeviceServiceImpl(new DeviceDaoImpl(entityManager));
    }

    public static PatientService getPatientService() {
        return new PatientServiceImpl(new PatientDaoImpl(entityManager));
    }

    public static TestService getTestService() {
        return new TestServiceImpl(new TestDaoImpl(entityManager));
    }

    public static AccessoryService getAccessoryService() {
        return new AccessoryServiceImpl(new AccessoryDaoImpl(entityManager));
    }
}
