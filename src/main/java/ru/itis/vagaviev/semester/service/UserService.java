package ru.itis.vagaviev.semester.service;

import ru.itis.vagaviev.semester.dto.CreateUserDto;
import ru.itis.vagaviev.semester.dto.UserDto;

public interface UserService {
    UserDto save(CreateUserDto user);

    UserDto getUserByEmail(String email);
}
