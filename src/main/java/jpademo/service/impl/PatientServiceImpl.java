package jpademo.service.impl;

import jpademo.dao.PatientDao;
import jpademo.model.Patient;
import jpademo.service.PatientService;

import java.util.List;

public class PatientServiceImpl implements PatientService {

    private PatientDao patientDao;

    public PatientServiceImpl(PatientDao patientDao) {
        this.patientDao = patientDao;
    }

    @Override
    public Patient findById(Long id) {
        return patientDao.findById(id);
    }

    @Override
    public List<Patient> findAll() {
        return patientDao.criteriaBuilderFindAll();
    }

    @Override
    public Patient insert(Patient patient) {
        return patientDao.insert(patient);
    }

    @Override
    public Patient update(Patient patient) {
        return patientDao.update(patient);
    }

    @Override
    public void delete(Patient patient) {
        patientDao.delete(patient);
    }
}
