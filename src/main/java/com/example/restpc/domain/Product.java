package com.example.restpc.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
    @Id
private int productId;
private String productName,productDescription;
private double amountInStock;

    public Product(int productId, String productName, String productDescription, double amountInStock) {
        this.productId = productId;
        this.productName = productName;
        this.productDescription = productDescription;
        this.amountInStock = amountInStock;
    }

    public Product() {
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public double getAmountInStock() {
        return amountInStock;
    }

    public void setAmountInStock(double amountInStock) {
        this.amountInStock = amountInStock;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productDescription='" + productDescription + '\'' +
                ", amountInStock=" + amountInStock +
                '}';
    }
}
