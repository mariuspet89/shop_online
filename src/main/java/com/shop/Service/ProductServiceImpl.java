package com.shop.Service;

import com.shop.Repository.ProductRepository;
import com.shop.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.ProviderException;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }


    public String processProviderName(Integer productId) {
        Product product;
        String providerName;

        product = productRepository.getOne(productId);
        providerName = product.getProvider().getName();
        if (providerName.equals("abc")) {
            return providerName + "XYZ";
        }else {
            throw new ProviderException("Providerul nu are numele abc, multumesc!");
        }
    }
    @Override
    public List<Product> getAllProduct() {
        return productRepository.findAll();
    }

    @Override
    public void addProduct(Product product) {
        productRepository.save(product);
    }

    @Override
    public void deleteProduct(Product product) {
        productRepository.delete(product);

    }

    @Override
    public void updateProduct(Product product) {
        productRepository.save(product);
    }
}
