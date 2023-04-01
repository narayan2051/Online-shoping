package com.asmt.onlineshoping.service.impl;

import com.asmt.onlineshoping.dto.ProductDTO;
import com.asmt.onlineshoping.model.Product;
import com.asmt.onlineshoping.repository.ProductRepo;
import com.asmt.onlineshoping.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepo productRepo;

    @Override
    public Product save(ProductDTO productDTO) {
        Product product = new Product();
        product.setCategory(productDTO.getCategory());
        product.setDescription(productDTO.getDescription());
        product.setPrice(productDTO.getPrice());
        product.setName(productDTO.getName());
        product.setQuantity(productDTO.getQuantity());
        return productRepo.save(product);

    }

    @Override
    public Product update(ProductDTO productDTO) {
        return null;
    }

    @Override
    public Product getById(Integer id) {
        return null;
    }

    @Override
    public List<Product> getAll() {
        return productRepo.findAll();
    }
}
