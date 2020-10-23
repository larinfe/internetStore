package com.org.fedos.shop.repository;
import com.org.fedos.shop.entity.Goods;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GoodsRepository extends JpaRepository<Goods, Integer> {
}