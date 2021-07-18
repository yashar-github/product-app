package com.yr.product.mapper;

import com.yr.product.dto.request.ProductDtoRequest;
import com.yr.product.dto.response.ProductDtoResponse;
import com.yr.product.model.Product;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductMapper {

    public Product productDTORequestToProduct(ProductDtoRequest productDtoRequest) {
      Product product = Product.builder()
               .name(productDtoRequest.getName()).build();
      return product;
    }

    public ProductDtoResponse productToProductDTOResponse(Product product) {
    ProductDtoResponse productDtoResponse = ProductDtoResponse.builder()
            .name(product.getName())
            .id(product.getId()).build();
    return productDtoResponse;

    }

}
