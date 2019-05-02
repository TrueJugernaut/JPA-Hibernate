package jpademo.service;

import jpademo.model.Device;

import java.util.List;

public interface DeviceService {

    Device findById(Long id);

    List<Device> findAll();

    Device insert(Device device);

    Device update(Device device);

    void delete(Device device);
}
