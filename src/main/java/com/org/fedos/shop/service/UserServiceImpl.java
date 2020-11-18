package com.org.fedos.shop.service;

import com.org.fedos.shop.dto.UserDto;
import com.org.fedos.shop.entity.User;
import com.org.fedos.shop.mapping.UserMapper;
import com.org.fedos.shop.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserRepository userRepository;
    private UserMapper mapper;

    @Override
    public Optional<UserDto> findById(int id) {
        Optional<UserDto> result = userRepository.findById(id).map(mapper::mapToDto);
        return result;
    }

    @Override
    public Optional<UserDto> create(UserDto userDto) {
        Optional<UserDto> result = userRepository.create(userDto).map(mapper::mapToDto);
        return result;
    }

    @Override
    public Optional<UserDto> update(UserDto userDto) {
        return Optional.of(userRepository.update());
    }

    @Override
    public Optional<UserDto> save(UserDto userDto) {
        return Optional.of(userRepository.save(UserDto));
    }

    @Override
    public void deleteById(int id) {
        userRepository.deleteById(id);
    }
}
