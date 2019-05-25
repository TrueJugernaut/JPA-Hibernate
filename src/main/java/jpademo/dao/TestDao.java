package jpademo.dao;

import jpademo.model.Patient;
import jpademo.model.Test;

import java.time.LocalDate;
import java.util.List;

public interface TestDao extends CrudDao<Test, Long> {

    List<Test> getAllTestsInDateRange(LocalDate from, LocalDate to);

    List<Patient> getPatientsWithGlucoseHigherThan(Double normalLevel);
}
