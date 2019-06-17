package jpademo.service.impl;

import jpademo.dao.PatientDao;
import jpademo.dao.TestDao;

public class DataAnalyseServiceImpl {

    private PatientDao patientDao;

    private TestDao testDao;

    public DataAnalyseServiceImpl(PatientDao patientDao, TestDao testDao) {
        this.patientDao = patientDao;
        this.testDao = testDao;
    }
}
