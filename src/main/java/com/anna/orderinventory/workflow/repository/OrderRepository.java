package com.anna.orderinventory.workflow.repository;

import com.anna.orderinventory.workflow.entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<OrderEntity, Integer> {
}
