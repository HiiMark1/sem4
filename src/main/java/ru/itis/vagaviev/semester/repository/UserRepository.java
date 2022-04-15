package ru.itis.vagaviev.semester.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.itis.vagaviev.semester.model.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> getUserByEmail(String email);
}
