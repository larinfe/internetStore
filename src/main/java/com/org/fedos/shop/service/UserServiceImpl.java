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
    private UserRepository userRepository;
    private UserMapper mapper;

    @Autowired
    public UserServiceImpl(UserRepository userRepository, UserMapper mapper) {
        this.userRepository = userRepository;
        this.mapper = mapper;
    }

    @Override
    public Optional<UserDto> findById(int id) {
        return userRepository.findById(id).map(mapper::mapToDto);
    }

    @Override
    public UserDto save(UserDto userDto) {
        User user = Optional.of(userDto)
                            .map(UserDto::getId)
                            .flatMap(id -> userRepository.findById(id))
                            .orElse(new User());

        User saved = userRepository.save(user);

        return mapper.dtoToUser(saved);
    }

    @Override
    public void deleteById(int id) {
        Optional<User> user = userRepository.findById(id);
        userRepository.deleteById(id);
    }
}
