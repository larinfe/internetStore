package com.org.fedos.shop.mapping;

import com.org.fedos.shop.dto.UserDto;
import com.org.fedos.shop.entity.User;

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
}
