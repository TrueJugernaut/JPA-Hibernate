package jpademo.service;

import jpademo.model.Accessory;

import java.util.List;

public interface AccessoryService {

    Accessory findById(Long id);

    List<Accessory> findAll();

    Accessory insert(Accessory accessory);

    Accessory update(Accessory accessory);

    void delete(Accessory accessory);
}
