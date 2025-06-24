package com.effecta.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.effecta.course.entities.OrderItem;
import com.effecta.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
