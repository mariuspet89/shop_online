package com.shop.Service;

import com.shop.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAllProduct();

    void addProduct (Product product);
    void deleteProduct (Product product);
    void updateProduct (Product product);
}
