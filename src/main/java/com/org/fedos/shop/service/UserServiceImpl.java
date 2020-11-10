package com.org.fedos.shop.service;

import com.org.fedos.shop.entity.User;
import com.org.fedos.shop.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserRepository userRepository;

    @Override
    public User findById(int id) {
        Optional<User> result = userRepository.findById(id);
        User user = null;
        if(result.isPresent()){
            user = result.get();
        }//про елс не стал пиздить так как там совсем непонятно
        return user;
    }

    @Override
    public void create(int id) {

    }

    @Override
    public void update(int id) {
        //непонятно наверно как-то на сейв можно завязать это все
    }

    @Override
    public void save(User user) {
        userRepository.save(user);
    }

    @Override
    public void deleteById(int id) {
        userRepository.deleteById(id);
    }
}
