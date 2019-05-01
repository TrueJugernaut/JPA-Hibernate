package jpademo.dao;

import jpademo.model.Patient;

import java.util.List;

public interface PatientDao extends CrudDao<Patient, Long> {
    List<Patient> findAll();
}
