package com.shaurya.spring.ch08springbootwebapps.Service;

import com.shaurya.spring.ch08springbootwebapps.Model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ProductService {
    ArrayList<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }
    public ArrayList<Product> getProducts() {
        return products;
    }
}
