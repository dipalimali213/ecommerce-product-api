package com.example.ecommerce.controller;

import com.example.ecommerce.model.Product;
import com.example.ecommerce.store.ProductStore;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {

    @PostMapping
    public ResponseEntity<String> addProduct(@RequestBody Product product) {

        if (product.getName() == null || product.getName().isEmpty()) {
            return ResponseEntity.badRequest().body("Product name is required");
        }

        if (product.getPrice() <= 0) {
            return ResponseEntity.badRequest().body("Product price must be greater than 0");
        }

        ProductStore.products.add(product);
        return ResponseEntity.ok("Product added successfully");
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable int id) {

        for (Product product : ProductStore.products) {
            if (product.getId() == id) {
                return ResponseEntity.ok(product);
            }
        }
        return ResponseEntity.notFound().build();
    }
}
