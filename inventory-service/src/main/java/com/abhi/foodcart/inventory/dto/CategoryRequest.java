package com.abhi.foodcart.inventory.dto;

import lombok.*;

@EqualsAndHashCode
@ToString
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CategoryRequest {
    private String categoryName;
    private String categoryDescription;
}
