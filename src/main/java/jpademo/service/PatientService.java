package jpademo.service;

import jpademo.model.Patient;

import java.util.List;

public interface PatientService {

    Patient findById(Long id);

    List<Patient> findAll();

    Patient insert(Patient patient);

    Patient update(Patient patient);

    void delete(Patient patient);
}
