package ru.itis.vagaviev.semester.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.itis.vagaviev.semester.model.Message;

public interface MessageRepository extends JpaRepository<Message, Integer> {
}
