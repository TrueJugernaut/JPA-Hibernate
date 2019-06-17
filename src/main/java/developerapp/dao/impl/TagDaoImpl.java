package developerapp.dao.impl;

import developerapp.dao.TagDao;
import developerapp.model.intelligence.Tag;
import jpademo.dao.AbstractDao;

import javax.persistence.EntityManager;

public class TagDaoImpl extends AbstractDao<Tag, Long> implements TagDao {
    public TagDaoImpl(EntityManager entityManager, Class<Tag> aClass) {
        super(entityManager, aClass);
    }
}
