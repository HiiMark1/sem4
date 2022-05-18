package ru.itis.vagaviev.semester.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;
import ru.itis.vagaviev.semester.model.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> getUserByEmail(String email);

    void deleteUserByEmail(String email);

    @Transactional
    @Modifying
    @Query(value = "update users u set name = ?1 where u.email = ?2", nativeQuery = true)
    void changeName(String name, String email);

    @Transactional
    @Modifying
    @Query(value = "update users u set surname = ?1 where u.email = ?2", nativeQuery = true)
    void changeSurname(String surname, String email);

    @Transactional
    @Modifying
    @Query(value = "update users u set status = ?1 where u.email = ?2", nativeQuery = true)
    void changeStatus(String status, String email);
}
