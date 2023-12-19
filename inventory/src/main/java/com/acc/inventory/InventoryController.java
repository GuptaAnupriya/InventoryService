package com.acc.inventory;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/items")
public class InventoryController {

    @Autowired
    private InventoryService inventoryService;

    @GetMapping("/items")
    public List<Inventory> findAll() {
        return inventoryService.findAll();
    }
    @GetMapping("/")
    public String checkAPI() {
        return "Hello Inventory Service";
    }

    @GetMapping("/{id}")
    public Optional<Inventory> findById(@RequestParam int id) {
        return inventoryService.findById(id);
    }

    // create a items
    @ResponseStatus(HttpStatus.CREATED) // 201
    @PostMapping("/item")
    public Inventory create(@RequestBody Inventory items) {
        return inventoryService.save(items);
    }

    // update a items
    @PutMapping("/item")
    public Inventory update(@RequestBody Inventory items) {
        return inventoryService.save(items);
    }

    // delete a items
    @ResponseStatus(HttpStatus.NO_CONTENT) // 204
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable int id) {
    	inventoryService.deleteById(id);
    }




}

