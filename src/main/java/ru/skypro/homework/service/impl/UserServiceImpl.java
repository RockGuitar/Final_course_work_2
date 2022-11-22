package ru.skypro.homework.service.impl;

import org.springframework.stereotype.Service;
import ru.skypro.homework.mappings.UserMapper;
import ru.skypro.homework.model.User;
import ru.skypro.homework.repository.UserRepository;
import ru.skypro.homework.service.UserService;

import java.util.Collection;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    public UserServiceImpl ( UserRepository userRepository ) {
        this.userRepository = userRepository;
    }

    public User readUser ( Long id ) {
        return userRepository.findById(id).orElseThrow();
    }

    public User updateUser ( User user ) {
        return userRepository.save(user);
    }

    public Collection<User> getAllUsers(){return userRepository.getAllUsers();}
}
