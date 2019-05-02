package jpademo;

import jpademo.model.Patient;
import jpademo.service.AccessoryService;
import jpademo.service.DeviceService;
import jpademo.service.PatientService;
import jpademo.service.TestService;
import jpademo.service.factory.SessionFactory;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        PatientService patientService = SessionFactory.getPatientService();
        DeviceService deviceService = SessionFactory.getDeviseService();
        TestService testService = SessionFactory.getTestService();
        AccessoryService accessoryService = SessionFactory.getAccessoeyService();

        final List<Patient> all = patientService.findAll();

        for (Patient patient2 : all) {
            System.out.println(patient2.toString());
        }
    }
}
