package ru.skypro.homework.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;
import ru.skypro.homework.dto.UserDto;
import ru.skypro.homework.mappings.UserMapper;
import ru.skypro.homework.model.User;
import ru.skypro.homework.service.UserService;

import java.util.Collection;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/users")
@CrossOrigin(value = "http://localhost:3000")
public class UserController{

    private final UserService userService;

    public UserController ( UserService userService ) {
        this.userService = userService;
    }
    @Secured("USER")
    @PatchMapping("/me")
    public UserDto updateUser( @RequestBody UserDto user){
        User updatedUser = UserMapper.INSTANCE.userDtoToUser(user);
        userService.updateUser(updatedUser);
        return user;
    }
    @Secured("USER")
    @GetMapping("{id}")
    public UserDto readUser(@PathVariable Long id){
        User foundUser = userService.readUser(id);
        return UserMapper.INSTANCE.userToUserDto(foundUser);
    }

    @GetMapping("/me")
    public Collection<UserDto> getAllUsers(){
        return userService.getAllUsers().stream().
                map(UserMapper.INSTANCE::userToUserDto).collect(Collectors.toList());
    }

}
