package com.org.fedos.shop.repository;

import com.org.fedos.shop.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.nio.channels.FileChannel;

public interface UserRepository extends JpaRepository<User, Integer> {

}