package com.yr.product.service;

import com.yr.product.dto.request.ProductDtoRequest;
import com.yr.product.dto.response.ProductDtoResponse;
import com.yr.product.mapper.ProductMapper;
import com.yr.product.model.Product;
import com.yr.product.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    private ProductRepository productRepository;
    private ProductMapper productMapper;

    public ProductService(ProductRepository productRepository, ProductMapper productMapper) {
        this.productRepository = productRepository;
        this.productMapper = productMapper;
    }

    public List<ProductDtoResponse> findAllProducts() {
        List<Product> productList = productRepository.findAll();
        List<ProductDtoResponse> productDtoResponseList = new ArrayList<>();

        for (Product product: productList) {
            productDtoResponseList.add(productMapper.productToProductDTOResponse(product));
        }
        return productDtoResponseList;
    }

    public ProductDtoResponse saveProduct(ProductDtoRequest productDtoRequest) {
        ProductDtoResponse productDtoResponse = productMapper.productToProductDTOResponse(
                productRepository.save(productMapper.productDTORequestToProduct(productDtoRequest)));
        return productDtoResponse;
    }
}
