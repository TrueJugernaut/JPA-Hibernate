package jpademo.service;

import jpademo.model.Test;

import java.util.List;

public interface TestService {

    Test findById(Long id);

    List<Test> findAll();

    Test insert(Test test);

    Test update(Test test);

    void delete(Test test);
}
