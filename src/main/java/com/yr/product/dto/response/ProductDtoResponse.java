package com.yr.product.dto.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProductDtoResponse {

    private int id;

    private String name;
}
