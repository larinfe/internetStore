package com.org.fedos.shop.service;

import com.org.fedos.shop.dto.UserDto;
import com.org.fedos.shop.entity.User;

import java.util.Optional;


public interface  UserService {

    Optional<UserDto> findById(int id);//

    Optional<UserDto> create(UserDto userDto);//
    Optional<UserDto> update(UserDto userDto);//

    Optional<UserDto> save(UserDto userDto);

    void deleteById(int id);//
}
