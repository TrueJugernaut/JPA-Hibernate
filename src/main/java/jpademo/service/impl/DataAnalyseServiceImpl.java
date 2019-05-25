package jpademo.service.impl;

import jpademo.dao.PatientDao;
import jpademo.dao.TestDao;
import jpademo.model.Patient;
import jpademo.service.DataAnalyzeService;

import java.util.List;

public class DataAnalyseServiceImpl implements DataAnalyzeService {

    private PatientDao patientDao;

    private TestDao testDao;

    public DataAnalyseServiceImpl(PatientDao patientDao, TestDao testDao) {
        this.patientDao = patientDao;
        this.testDao = testDao;
    }

    @Override
    public List<Patient> getPatientsWithGlucoseHigherThan(double nornalLevel) {
        return null;
    }

    @Override
    public List<Patient> getPatientsWithHighGlucoseAndSkinProblems(double glucoseNornalLevel, double anySkinTestParameter) {
        return null;
    }
}
