package ru.itis.vagaviev.semester.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import ru.itis.vagaviev.semester.dto.CreateUserDto;
import ru.itis.vagaviev.semester.dto.UserDto;
import ru.itis.vagaviev.semester.model.User;
import ru.itis.vagaviev.semester.repository.UserRepository;
import ru.itis.vagaviev.semester.service.UserService;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final BCryptPasswordEncoder encoder;

    @Autowired
    public UserServiceImpl(UserRepository userRepository, BCryptPasswordEncoder encoder) {
        this.userRepository = userRepository;
        this.encoder = encoder;
    }

    @Override
    public UserDto save(CreateUserDto user) {
        return UserDto.fromModel(userRepository.save(new User(user.getName(), user.getSurname(), user.getAge(), user.getEmail(), user.getStatus(),
                user.getLogin(), encoder.encode(user.getPassword()), user.getImageUri())));
    }

    @Override
    public UserDto getUserByEmail(String email) {
        Optional<User> user = userRepository.getUserByEmail(email);
        if(user.isPresent()){
            return UserDto.fromModel(user.get());
        } else {
            return null;
        }
    }
}
