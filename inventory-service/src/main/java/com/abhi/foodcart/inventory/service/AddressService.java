package com.abhi.foodcart.inventory.service;

import com.abhi.foodcart.inventory.entities.Address;

import java.util.List;

public interface AddressService {
    public Address add(Address address);

    public List<Address> getAllSupplierAddresses(long supplierId);

    public Address getActiveSupplierAddress(long supplierId);

    public Address update(Address address);

    public Address remove(long addressId);
}
