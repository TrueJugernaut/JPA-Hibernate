package jpademo.service.impl;

import jpademo.dao.TestDao;
import jpademo.model.Test;
import jpademo.service.TestService;

import java.util.List;

public class TestServiceImpl implements TestService {

    private TestDao testDao;

    public TestServiceImpl(TestDao testDao) {
        this.testDao = testDao;
    }

    @Override
    public Test findById(Long id) {
        return testDao.findById(id);
    }

    @Override
    public List<Test> findAll() {
        return testDao.findAll();
    }

    @Override
    public Test insert(Test test) {
        return testDao.insert(test);
    }

    @Override
    public Test update(Test test) {
        return testDao.update(test);
    }

    @Override
    public void delete(Test test) {
        testDao.delete(test);
    }
}
