package ru.skypro.homework.service;

import org.springframework.stereotype.Service;
import ru.skypro.homework.model.User;
@Service
public interface UserService {
    User readUser ( Long id );

    User updateUser ( User user );

    void deleteUser ( Long id );
}
