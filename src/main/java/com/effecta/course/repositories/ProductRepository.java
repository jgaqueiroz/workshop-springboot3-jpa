package com.effecta.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.effecta.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
