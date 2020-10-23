package com.org.fedos.shop.repository;
import com.org.fedos.shop.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Integer> {
}