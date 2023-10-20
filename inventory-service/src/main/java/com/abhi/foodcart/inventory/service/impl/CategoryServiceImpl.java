package com.abhi.foodcart.inventory.service.impl;

import com.abhi.foodcart.inventory.dto.CategoryRequest;
import com.abhi.foodcart.inventory.dto.CategoryResponse;
import com.abhi.foodcart.inventory.entities.Category;
import com.abhi.foodcart.inventory.repository.CategoryRepository;
import com.abhi.foodcart.inventory.service.CategoryService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;
    private final CategoryServiceHelper categoryServiceHelper;

    @Override
    public CategoryResponse add(CategoryRequest request) {
        Category category = categoryServiceHelper.buildCategoryFromRequest(request);
        return categoryServiceHelper.buildCategoryResponseFromEntity(categoryRepository.save(category));
    }

    @Override
    public Collection<CategoryResponse> addAll(Collection<CategoryRequest> requests) {
        Collection<CategoryResponse> categoryResponseList = new LinkedList<>();
        requests.forEach(request -> {
            Category category = categoryServiceHelper.buildCategoryFromRequest(request);
            categoryResponseList.add(categoryServiceHelper.buildCategoryResponseFromEntity(categoryRepository.save(category)));
        });
        return categoryResponseList;

    }

    @Override
    public Category getCategoryByName(String categoryName) {
        return categoryRepository.findCategoryByCategoryName(categoryName);
    }
}
