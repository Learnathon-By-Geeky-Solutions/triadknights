package com.triad_knights.agri_connect.service;



import com.triad_knights.agri_connect.model.Product;
import com.triad_knights.agri_connect.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    private final ProductRepository productRepository;
    @Autowired

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    public Page<Product> getProducts(int page, int size) {
        return productRepository.findAll(PageRequest.of(page, size));
    }
}
