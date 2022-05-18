package ru.itis.vagaviev.semester.service;

import ru.itis.vagaviev.semester.dto.CreateUserDto;
import ru.itis.vagaviev.semester.dto.UserDto;

public interface UserService {
    UserDto save(CreateUserDto user);

    UserDto getUserByEmail(String email);

    void deleteUser(String email);

    void updateName(String name, String email);

    void updateSurame(String surname, String email);

    void updateStatus(String status, String email);
}
