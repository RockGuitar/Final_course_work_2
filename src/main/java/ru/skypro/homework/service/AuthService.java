package ru.skypro.homework.service;

import ru.skypro.homework.dto.RegisterReqDto;
import ru.skypro.homework.dto.RoleDto;

public interface AuthService {
    boolean login(String userName, String password);
    boolean register( RegisterReqDto registerReq, RoleDto role);
}
