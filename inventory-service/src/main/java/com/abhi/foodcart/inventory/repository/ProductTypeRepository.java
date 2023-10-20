package com.abhi.foodcart.inventory.repository;

import com.abhi.foodcart.inventory.entities.ProductType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductTypeRepository extends JpaRepository<ProductType, Long> {
    public ProductType findProductTypeByType(String type);
}
