package jpademo.service.impl;

import jpademo.dao.AccessoryDao;
import jpademo.model.Accessory;
import jpademo.service.AccessoryService;

import java.util.List;

public class AccessoryServiceImpl implements AccessoryService {

    private AccessoryDao accessoryDao;

    public AccessoryServiceImpl(AccessoryDao accessoryDao) {
        this.accessoryDao = accessoryDao;
    }

    @Override
    public Accessory findById(Long id) {
        return accessoryDao.findById(id);
    }

    @Override
    public List<Accessory> findAll() {
        return accessoryDao.findAll();
    }

    @Override
    public Accessory insert(Accessory accessory) {
        return accessoryDao.insert(accessory);
    }

    @Override
    public Accessory update(Accessory accessory) {
        return accessoryDao.update(accessory);
    }

    @Override
    public void delete(Accessory accessory) {
        accessoryDao.delete(accessory);
    }
}
