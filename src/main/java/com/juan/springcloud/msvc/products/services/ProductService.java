package com.juan.springcloud.msvc.products.services;

import com.juan.springcloud.msvc.products.entities.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    List<Product> findAll();

    Optional<Product> findById(Long id);

    /*Optional<Product> save(Product product);

    boolean delete(Product product);*/


}
