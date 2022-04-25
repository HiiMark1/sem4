package ru.itis.vagaviev.semester.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.itis.vagaviev.semester.model.Comment;

public interface CommentRepository extends JpaRepository<Comment, Integer> {
}
