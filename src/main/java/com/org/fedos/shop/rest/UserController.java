package com.org.fedos.shop.rest;

import com.org.fedos.shop.dto.UserDto;
import com.org.fedos.shop.entity.User;
import com.org.fedos.shop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;


@RestController
@RequestMapping("/api")
public class UserController {
    private UserService userService;


    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("user/{id}")
    public ResponseEntity<UserDto> getUser(@PathVariable Integer id){
//        Optional<UserDto> user = userService.findById(id);
//        user.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
        return userService.findById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());


    }
}
