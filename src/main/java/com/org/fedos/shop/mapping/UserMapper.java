package com.org.fedos.shop.mapping;

import com.org.fedos.shop.dto.UserDto;
import com.org.fedos.shop.entity.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {
    public UserDto mapToDto(User user){
        UserDto userDto = new UserDto();
        userDto.setId(user.getId());
        userDto.setAddress(user.getAddress());
        userDto.setPhone(user.getPhone());
        userDto.setName(user.getName());
        userDto.setEmail(user.getEmail());
        userDto.setPassword(user.getPassword());
        return userDto;
    }
    public UserDto dtoToUser(User user){
        UserDto userDto = new UserDto();
        user.setEmail(userDto.getEmail());
        user.setAddress(userDto.getAddress());
        user.setId(user.getId());
        user.setAddress(user.getAddress());
        user.setPhone(user.getPhone());
        user.setName(user.getName());
        user.setEmail(user.getEmail());

        return userDto;
    }
}
