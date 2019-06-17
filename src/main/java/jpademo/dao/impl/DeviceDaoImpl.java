package jpademo.dao.impl;

import jpademo.dao.AbstractDao;
import jpademo.dao.DeviceDao;
import jpademo.model.Device;

import javax.persistence.EntityManager;

public class DeviceDaoImpl extends AbstractDao<Device, Long> implements DeviceDao {

    public DeviceDaoImpl(EntityManager entityManager) {
        super(entityManager, Device.class);
    }
}
