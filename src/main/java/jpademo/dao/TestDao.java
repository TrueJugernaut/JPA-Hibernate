package jpademo.dao;

import jpademo.model.Patient;
import jpademo.model.Test;

public interface TestDao extends CrudDao<Test, Long> {
    void doSkinTest(Patient patient);
}
