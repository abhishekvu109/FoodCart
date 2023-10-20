package com.abhi.foodcart.inventory.service;

import com.abhi.foodcart.inventory.dto.ProductRequest;
import com.abhi.foodcart.inventory.dto.ProductResponse;
import com.abhi.foodcart.inventory.entities.ProductType;

import java.util.Collection;
import java.util.List;

public interface ProductService {

    public ProductResponse add(ProductRequest request);

    public List<ProductResponse> addAll(Collection<ProductRequest> request);

    public boolean remove();

    public boolean removeAll();

    public ProductResponse update(ProductRequest request, long productId);

}
