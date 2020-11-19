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
    public UserDto save(UserDto userDto, int id) {
        return null;
    }

//    @Override
//    public UserDto save(UserDto userDto, int id) {
//        findById(id);
//        UserDto result = userRepository.save().map(mapper::mapToDto);
//        return result;
//    }

    @Override
    public void create (UserDto userDto) {
        userRepository.create();
    }

    @Override
    public UserDto save(UserDto userDto) {
        return null;
    }

    @Override
    public void deleteById(int id) {
        userRepository.deleteById(id);
    }
}
