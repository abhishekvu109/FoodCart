package com.abhi.foodcart.inventory.repository;

import com.abhi.foodcart.inventory.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

    public Category findCategoryByCategoryName(String name);
}
