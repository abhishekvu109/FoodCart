package com.abhi.foodcart.inventory.entities.embeddable;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Embeddable
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Address {
    private String addressLine1;
    private String Street;
    private String city;
    private String state;
    private String zipCode;
    private String country;
    private String addressType;
}
