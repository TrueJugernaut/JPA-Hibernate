package jpademo.dao;

import jpademo.model.Patient;
import jpademo.model.Test;

public interface PatientDao extends CrudDao<Patient, Long> {
    void doTest(Patient patient, Test test);
}
