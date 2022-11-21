package ru.skypro.homework.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;
import ru.skypro.homework.dto.UserDto;
import ru.skypro.homework.mappings.UserMapper;
import ru.skypro.homework.model.User;
import ru.skypro.homework.service.UserService;

@RestController
@RequestMapping("/users")
@CrossOrigin(value = "http://localhost:3000")
public class UserController {

    private final UserService userService;
    private final UserMapper userMapper;

    //Здесь ошибка: userMapper could not Autowire, no beans of userMapper detected
    public UserController ( UserService userService, UserMapper userMapper ) {
        this.userService = userService;
        this.userMapper = userMapper;
    }
    @Secured("USER")
    @PatchMapping("/me")
    public UserDto updateUser( @RequestBody UserDto user){
        User updatedUser = userMapper.userDtoToUser(user);
        userService.updateUser(updatedUser);
        return user;
    }
    @Secured("USER")
    @GetMapping("/me")
    public UserDto readUser(Long id){
        User foundUser = userService.readUser(id);
        return userMapper.userToUserDto(foundUser);
    }
    @Secured("USER")
    @DeleteMapping
    public void deleteUser(Long id){
        User foundUser = userService.readUser(id);
        UserDto foundUserDto = userMapper.userToUserDto(foundUser);
        userService.deleteUser(foundUserDto.getId());
    }

}
