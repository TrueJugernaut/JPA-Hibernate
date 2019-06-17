package developerapp.dao.impl;

import developerapp.dao.LevelADao;
import developerapp.model.intelligence.LevelA;
import jpademo.dao.AbstractDao;

import javax.persistence.EntityManager;

public class LevelADaoImpl extends AbstractDao<LevelA, Long> implements LevelADao {
    public LevelADaoImpl(EntityManager entityManager, Class<LevelA> aClass) {
        super(entityManager, aClass);
    }
}
