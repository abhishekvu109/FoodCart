package com.abhi.foodcart.inventory.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.Date;

@EqualsAndHashCode
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ProductRequest {

    @NotEmpty(message = "Product name is required")
    @NotNull(message = "Product name is required")
    private String productName;

    private String description;

    @NotEmpty(message = "Category is required")
    @NotNull(message = "Category is required")
    private String category;

    @NotEmpty(message = "Type is required")
    @NotNull(message = "Type is required")
    private String type;

    @NotEmpty(message = "Price is required")
    @NotNull(message = "Price is required")
    private double price;


    private String countryOfOrigin;

    @NotEmpty(message = "Expiry date is required")
    @NotNull(message = "Expiry date is required")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private Date expiryDate;
}
