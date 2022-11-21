package ru.skypro.homework.service;

import org.springframework.stereotype.Service;
import ru.skypro.homework.dto.RegisterReqDto;
import ru.skypro.homework.dto.RoleDto;
@Service
public interface AuthService {
    boolean login(String userName, String password);
    boolean register( RegisterReqDto registerReq, RoleDto role);
}
