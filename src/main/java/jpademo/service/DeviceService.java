package jpademo.service;

import jpademo.model.Device;
import jpademo.model.Patient;
import jpademo.model.Test;

import java.util.List;

public interface DeviceService {

    Device findById(Long id);

    List<Device> findAll();

    Device insert(Device device);

    Device update(Device device);

    void delete(Device device);

    void doTest(Patient patient, Test Test);
}
