package com.shaurya.spring.ch08springbootwebapps.Controller;

import com.shaurya.spring.ch08springbootwebapps.Model.Product;
import com.shaurya.spring.ch08springbootwebapps.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class ProductController {
    private final ProductService productService;
    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }
    @GetMapping("/product")
    public String getProducts(Model model) {
        var products = productService.getProducts();
        model.addAttribute("products", products);
        return "product.html";
    }
    @PostMapping("/product")
    public String addProduct(
            @RequestParam(required = false,defaultValue = "shaurya")String name,
            @RequestParam(required = false,defaultValue = "0.0")float price
            ,Model model
    ) {
        Product product = new Product();
        product.setName(name);
        product.setPrice(price);
        productService.addProduct(product);
        var products = productService.getProducts();
        model.addAttribute("products", products);
        return "product.html";
    }
}
