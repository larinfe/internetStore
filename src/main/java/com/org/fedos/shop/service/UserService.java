package com.org.fedos.shop.service;

import com.org.fedos.shop.dto.UserDto;

import java.util.Optional;


public interface  UserService {

    Optional<UserDto> findById(int id);//

    UserDto save(UserDto userDto, int id);

    void create(UserDto userDto);//

    UserDto save(UserDto userDto);

    void deleteById(int id);//
}
