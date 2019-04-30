package jpademo.dao.impl;

import jpademo.dao.AbstractDao;
import jpademo.model.Device;

import javax.persistence.EntityManager;

public class DeviceDaoImpl extends AbstractDao<Device, Long> {

    public DeviceDaoImpl(EntityManager entityManager, Class<Device> aClass) {
        super(entityManager, aClass);
    }
}
