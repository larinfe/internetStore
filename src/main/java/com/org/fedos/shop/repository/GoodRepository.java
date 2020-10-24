package com.org.fedos.shop.repository;
import com.org.fedos.shop.entity.Good;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GoodRepository extends JpaRepository<Good, Integer> {
}