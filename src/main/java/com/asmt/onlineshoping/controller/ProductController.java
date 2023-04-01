package com.asmt.onlineshoping.controller;

import com.asmt.onlineshoping.dto.ProductDTO;
import com.asmt.onlineshoping.model.Product;
import com.asmt.onlineshoping.service.ProductService;
import com.asmt.onlineshoping.service.impl.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping
    public Product save(@RequestBody ProductDTO productDTO) {
        return productService.save(productDTO);
    }

    @GetMapping
    public List<Product> getAll() {
        return productService.getAll();
    }

    @GetMapping("/{id}")
    public Product getById(@PathVariable("id") Integer id){
        return productService.getById(id);
    }


}
