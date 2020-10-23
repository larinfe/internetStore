package com.org.fedos.shop.repository;
import com.org.fedos.shop.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdersRepository extends JpaRepository<Orders, Integer> {
}