package com.acc.inventory;

import org.springframework.data.jpa.repository.JpaRepository;

// Spring Data JPA creates CRUD implementation at runtime automatically.
public interface InventoryRepository extends JpaRepository<Inventory, Integer> {



}