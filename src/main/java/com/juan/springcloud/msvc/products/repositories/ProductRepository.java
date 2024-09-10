package com.juan.springcloud.msvc.products.repositories;

import com.juan.springcloud.msvc.products.entities.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
