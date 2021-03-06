package com.beautydeals.demo.repository;

import com.beautydeals.demo.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    Optional<Product> findById(Long productId);

    Optional<Product> findByProductDescription(String productDescription);

    Page<Product> findByCreatedBy(Long userId, Pageable pageable);

    long countByCreatedBy(Long userId);

    List<Product> findByIdIn(List<Long> productIds);

    List<Product> findByIdIn(List<Long> productIds, Sort sort);
}
