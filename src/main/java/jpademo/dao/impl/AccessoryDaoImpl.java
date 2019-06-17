package jpademo.dao.impl;

import jpademo.dao.AbstractDao;
import jpademo.dao.AccessoryDao;
import jpademo.model.Accessory;

import javax.persistence.EntityManager;

public class AccessoryDaoImpl extends AbstractDao<Accessory, Long> implements AccessoryDao {
    public AccessoryDaoImpl(EntityManager entityManager) {
        super(entityManager, Accessory.class);
    }
}
