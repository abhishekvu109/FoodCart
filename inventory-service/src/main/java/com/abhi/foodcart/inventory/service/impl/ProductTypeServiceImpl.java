package com.abhi.foodcart.inventory.service.impl;

import com.abhi.foodcart.inventory.dto.ProductTypeRequest;
import com.abhi.foodcart.inventory.dto.ProductTypeResponse;
import com.abhi.foodcart.inventory.entities.ProductType;
import com.abhi.foodcart.inventory.repository.ProductTypeRepository;
import com.abhi.foodcart.inventory.service.ProductTypeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Slf4j
@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class ProductTypeServiceImpl implements ProductTypeService {

    private final ProductTypeRepository productTypeRepository;

    @Override
    public ProductTypeResponse add(ProductTypeRequest request) {
        return null;
    }

    @Override
    public Collection<ProductTypeResponse> add(Collection<ProductTypeRequest> request) {
        return null;
    }

    @Override
    public ProductType getProductTypeByName(String name) {
        return productTypeRepository.findProductTypeByType(name);
    }
}
