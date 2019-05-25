package jpademo;

import jpademo.model.Patient;
import jpademo.service.AccessoryService;
import jpademo.service.DeviceService;
import jpademo.service.PatientService;
import jpademo.service.TestService;
import jpademo.service.factory.SessionFactory;

import java.time.LocalDate;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        PatientService patientService = SessionFactory.getPatientService();
        DeviceService deviceService = SessionFactory.getDeviseService();
        TestService testService = SessionFactory.getTestService();
        AccessoryService accessoryService = SessionFactory.getAccessoeyService();

        //Create new patient
        Patient patient = Patient.builder()
                .name("Nesterov Yehor")
                .dateOfBirth(LocalDate.of(1984, 12, 29))
                .build();
        patientService.insert(patient);

        final List<Patient> all = patientService.findAll();

        for (Patient patient2 : all) {
            System.out.println(patient2.toString());
        }

        testService.findAll();
        Patient patient1 = patientService.findById(1L);
        System.out.println(patient1.toString());
        System.out.println(patient1.getTests());
    }
}
