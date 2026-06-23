package com.shaurya.spring.ch12springbootdatasources.Controller;

import com.shaurya.spring.ch12springbootdatasources.Model.product;
import com.shaurya.spring.ch12springbootdatasources.Repository.productRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class productController {
    private final productRepository productRepository;
    @Autowired
    public productController(productRepository productRepository) {
        this.productRepository = productRepository;
    }
    @PostMapping
    public product save(@RequestBody product p) {
        productRepository.save(p);
        return p;
    }
    @GetMapping
    public List<product> getAll() {
        return productRepository.findAll();
    }
}
