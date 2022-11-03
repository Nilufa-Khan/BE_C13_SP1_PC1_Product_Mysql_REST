package com.example.restpc.service;

import com.example.restpc.domain.Product;
import com.example.restpc.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    ProductRepository productRepository;
    @Autowired
   public ProductServiceImpl(ProductRepository productRepository){
        this.productRepository = productRepository;
    }



    @Override
    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public List<Product> getProduct() {
        return productRepository.findAll();
    }

    @Override
    public boolean deleteProductById(int productId) {
        productRepository.deleteById(productId);
        return true;
    }

    @Override
    public List<Product> getProductByProductId(int productId) {
        return productRepository.findByProductId(productId);
    }
}
