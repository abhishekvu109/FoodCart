package com.abhi.foodcart.inventory.dto;

import lombok.*;

@Data
@ToString
@EqualsAndHashCode
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CategoryResponse {

    private String refId;

    private String categoryName;

    private String description;

    private String status;
}
