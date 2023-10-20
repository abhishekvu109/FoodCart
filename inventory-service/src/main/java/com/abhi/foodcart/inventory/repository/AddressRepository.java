package com.abhi.foodcart.inventory.repository;

import com.abhi.foodcart.inventory.entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {
}
