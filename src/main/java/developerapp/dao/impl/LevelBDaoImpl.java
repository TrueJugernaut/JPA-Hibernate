package developerapp.dao.impl;

import developerapp.dao.LevelBDao;
import developerapp.model.intelligence.LevelB;
import jpademo.dao.AbstractDao;

import javax.persistence.EntityManager;

public class LevelBDaoImpl extends AbstractDao<LevelB, Long> implements LevelBDao {
    public LevelBDaoImpl(EntityManager entityManager, Class<LevelB> aClass) {
        super(entityManager, aClass);
    }
}
