package com.asmt.onlineshoping.service;

import com.asmt.onlineshoping.dto.ProductDTO;
import com.asmt.onlineshoping.model.Product;

import java.util.List;

public interface ProductService {
    Product save(ProductDTO productDTO);
    Product update(ProductDTO productDTO);
    Product getById(Integer id);
    List<Product> getAll();
}
