package com.abhi.foodcart.inventory.service;

import com.abhi.foodcart.inventory.dto.ProductTypeRequest;
import com.abhi.foodcart.inventory.dto.ProductTypeResponse;
import com.abhi.foodcart.inventory.entities.ProductType;

import java.util.Collection;

public interface ProductTypeService {

    public ProductTypeResponse add(ProductTypeRequest request);

    public Collection<ProductTypeResponse> add(Collection<ProductTypeRequest> request);

    public ProductType getProductTypeByName(String name);
}
