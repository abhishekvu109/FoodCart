package com.abhi.foodcart.inventory.service;

import com.abhi.foodcart.inventory.dto.CategoryRequest;
import com.abhi.foodcart.inventory.dto.CategoryResponse;
import com.abhi.foodcart.inventory.entities.Category;

import java.util.Collection;

public interface CategoryService {

    public CategoryResponse add(CategoryRequest request);

    public Collection<CategoryResponse> addAll(Collection<CategoryRequest> request);

    public Category getCategoryByName(String categoryName);
}
