package com.yr.product.dto.request;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
public class ProductDtoRequest {

    public ProductDtoRequest(String name) {
        this.name = name;
    }

    private String name;
}
