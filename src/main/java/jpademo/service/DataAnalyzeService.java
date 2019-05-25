package jpademo.service;

import jpademo.model.Patient;

import java.util.List;

public interface DataAnalyzeService {

    List<Patient> getPatientsWithGlucoseHigherThan(double normalLevel);

    //todo: add here ANY skin test parameter you wish
    List <Patient> getPatientsWithHighGlucoseAndSkinProblems(double glucoseNormalLevel, double anySkinTestParameter);
}