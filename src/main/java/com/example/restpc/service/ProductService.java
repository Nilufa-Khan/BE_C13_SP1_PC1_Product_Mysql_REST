package com.example.restpc.service;

import com.example.restpc.domain.Product;

import java.util.List;

public interface ProductService {
    public Product addProduct(Product product);
    public List<Product> getProduct();
    public boolean deleteProductById(int productId);
    public List<Product> getProductByProductId(int productId);
}
