package com.sliit.product_service.repository;

import com.sliit.product_service.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    // JpaRepository provides all basic CRUD operations
    // Additional custom query methods can be added here if needed
}
