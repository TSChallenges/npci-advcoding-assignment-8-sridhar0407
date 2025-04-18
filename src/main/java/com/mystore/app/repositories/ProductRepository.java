package com.mystore.app.repositories;

import com.mystore.app.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface ProductRepository extends JpaRepository<Product, Integer> {

    // TODO
    // TODO
    List<Product> findByNameContainingIgnoreCase(String name);
    List<Product> findByCategoryIgnoreCase(String category);
    List<Product> findByPriceBetween(Double minPrice, Double maxPrice);
    List<Product> findByStockQuantityBetween(Integer minStock, Integer maxStock);

}
