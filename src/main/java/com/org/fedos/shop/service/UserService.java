package com.org.fedos.shop.service;

import com.org.fedos.shop.entity.User;


public interface  UserService {

    User findById(int id);//наверное полезно

    void create(int id);//похоже что-то не то))

    void update(int id);//непонятно

    void save(User user);//вроде понятно

    void deleteById(int id);//достаточно понятно
}
