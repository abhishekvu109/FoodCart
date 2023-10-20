package com.abhi.foodcart.inventory.service.impl;

import com.abhi.foodcart.inventory.constants.ApplicationConstants.*;
import com.abhi.foodcart.inventory.dto.CategoryRequest;
import com.abhi.foodcart.inventory.dto.CategoryResponse;
import com.abhi.foodcart.inventory.entities.Category;
import com.abhi.foodcart.inventory.util.CommonUtils;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@Slf4j
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class CategoryServiceHelper {

    public final CommonUtils commonUtils;

    public Category buildCategoryFromRequest(CategoryRequest request) {
        return Category.builder()
                .categoryName(request.getCategoryName())
                .categoryDesc(request.getCategoryDescription())
                .uuid(UUID.randomUUID().toString())
                .refId(commonUtils.generateUniqueKey())
                .status(Status.ACTIVE)
                .build();

    }

    public CategoryResponse buildCategoryResponseFromEntity(Category category) {
        return CategoryResponse.builder()
                .refId(category.getRefId())
                .categoryName(category.getCategoryName())
                .description(category.getCategoryDesc())
                .build();
    }

}
