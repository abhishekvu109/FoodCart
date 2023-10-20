package com.abhi.foodcart.inventory.service.impl;

import com.abhi.foodcart.inventory.constants.LogMessageConstants.*;
import com.abhi.foodcart.inventory.dto.ProductRequest;
import com.abhi.foodcart.inventory.dto.ProductResponse;
import com.abhi.foodcart.inventory.entities.Category;
import com.abhi.foodcart.inventory.entities.ProductType;
import com.abhi.foodcart.inventory.exceptions.CategoryNotFoundException;
import com.abhi.foodcart.inventory.exceptions.ProductTypeNotFoundException;
import com.abhi.foodcart.inventory.repository.ProductPriceRepository;
import com.abhi.foodcart.inventory.repository.ProductRepository;
import com.abhi.foodcart.inventory.repository.ProductTypeRepository;
import com.abhi.foodcart.inventory.service.CategoryService;
import com.abhi.foodcart.inventory.service.ProductService;
import com.abhi.foodcart.inventory.service.ProductTypeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;
    private final ProductTypeRepository productTypeRepository;
    private final ProductPriceRepository productPriceRepository;
    private final CategoryService categoryService;
    private final ProductTypeService productTypeService;

    @Override
    @Transactional
    public ProductResponse add(ProductRequest request) {
        Category category = categoryService.getCategoryByName(request.getCategory());
        if (category == null)
            throw new CategoryNotFoundException(ExceptionMsg.CATEGORY_NOT_FOUND);
        ProductType productType=productTypeService.getProductTypeByName(request.getType());
        if(productType==null)
            throw new ProductTypeNotFoundException(ExceptionMsg.PRODUCT_TYPE_NOT_FOUND);

        return null;
    }

    @Override
    public List<ProductResponse> addAll(Collection<ProductRequest> request) {
        return null;
    }

    @Override
    public boolean remove() {
        return false;
    }

    @Override
    public boolean removeAll() {
        return false;
    }

    @Override
    public ProductResponse update(ProductRequest request, long productId) {
        return null;
    }


}
