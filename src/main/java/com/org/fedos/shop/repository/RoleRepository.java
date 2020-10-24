package com.org.fedos.shop.repository;
import com.org.fedos.shop.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Integer> {
}