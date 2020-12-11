package com.shop.Controller;

import com.shop.Service.ProductService;
import com.shop.Service.ProductServiceImpl;
import com.shop.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin("*")
@RequestMapping("/product")
public class ProductController {
 /*   private final ProductService productService;

    @Autowired
    public ProductController(@Qualifier("productServiceImpl") ProductService productService) {
        this.productService = productService;
    }*/

   /* @GetMapping("/concatenateProductProvider/{Id}")
    public String concatenateProductProvider(@PathVariable("Id") Integer Id){
        return ((ProductServiceImpl) productService).processProviderName(Id);
    }*/


  /*  @GetMapping("/all")
    public List<Product> getAllProducts() {
        return productService.getAllProduct();
    }


    @PostMapping("/add")
    public void addProduct(@RequestBody Product abc) {
        productService.addProduct(abc);
    }

    @DeleteMapping("/delete")
    public void deleteProduct(@RequestBody Product product) {productService.deleteProduct(product);}

    @PutMapping("/{id}")
    public void updateProduct(@RequestBody Product product) {productService.updateProduct(product);}*/
}
