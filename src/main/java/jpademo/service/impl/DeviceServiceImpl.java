package jpademo.service.impl;

import jpademo.dao.DeviceDao;
import jpademo.model.Device;
import jpademo.service.DeviceService;

import java.util.List;

public class DeviceServiceImpl implements DeviceService {

    private DeviceDao deviceDao;

    public DeviceServiceImpl(DeviceDao deviceDao) {
        this.deviceDao = deviceDao;
    }

    @Override
    public Device findById(Long id) {
        return deviceDao.findById(id);
    }

    @Override
    public List<Device> findAll() {
        return deviceDao.findAll();
    }

    @Override
    public Device insert(Device device) {
        return deviceDao.insert(device);
    }

    @Override
    public Device update(Device device) {
        return deviceDao.update(device);
    }

    @Override
    public void delete(Device device) {
        deviceDao.delete(device);
    }
}
