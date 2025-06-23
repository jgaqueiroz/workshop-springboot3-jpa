package com.effecta.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.effecta.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
