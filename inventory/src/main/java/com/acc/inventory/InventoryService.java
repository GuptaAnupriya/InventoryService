package com.acc.inventory;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InventoryService {

    @Autowired
    private InventoryRepository inventoryRepository;

    public List<Inventory> findAll() {
        return inventoryRepository.findAll();
    }

    public Optional<Inventory> findById(int id) {
        return inventoryRepository.findById(id);
    }

    public Inventory save(Inventory items) {
        return inventoryRepository.save(items);
    }

    public void deleteById(int id) {
    	inventoryRepository.deleteById(id);
    }


}
