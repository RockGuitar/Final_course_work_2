package ru.skypro.homework.service;

import org.springframework.stereotype.Service;
import ru.skypro.homework.model.User;

import java.util.Collection;

@Service
public interface UserService {
    User readUser ( Long id );

    User updateUser ( User user );

    Collection<User> getAllUsers();
}
