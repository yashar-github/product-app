package com.yr.product.controller;

import com.yr.product.dto.request.ProductDtoRequest;
import com.yr.product.dto.response.ProductDtoResponse;
import com.yr.product.model.Product;
import com.yr.product.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/product")
    public ProductDtoResponse createProduct(@RequestBody ProductDtoRequest productDtoRequest)
    {
        return productService.saveProduct(productDtoRequest);
    }

    @GetMapping("/product")
    public List<ProductDtoResponse> getAllProducts() {
        return productService.findAllProducts();
    }
}
