package com.example.vatsal.controller;

import com.example.vatsal.entity.Product;
import com.example.vatsal.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/addProduct")
    public Product saveProduct(@RequestBody Product product){
        return productService.saveProduct(product);
    }

    @PostMapping("/addProducts")
    public List<Product> saveProducts(@RequestBody List<Product> products){
        return productService.saveProducts(products);
    }

    @GetMapping("/getProduct/{id}")
    public Product getProduct(@PathVariable int id){
        return productService.getProduct(id);
    }

    @GetMapping("/getProductByName/{name}")
    public Product getProductByName(@PathVariable String name){
        return productService.getProductByName(name);
    }

    @GetMapping("/getProducts")
    public List<Product> getProductByName(){
        return productService.getProducts();
    }

    @PutMapping("/updateProduct")
    public Product updateProduct(@RequestBody Product product){
        return productService.updateProduct(product);
    }

    @DeleteMapping("/deleteProduct/{id}")
    public String deleteProduct(@PathVariable int id){
        return productService.deleteProduct(id);
    }
}
