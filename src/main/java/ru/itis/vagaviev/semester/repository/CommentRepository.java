package ru.itis.vagaviev.semester.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ru.itis.vagaviev.semester.dto.CommentDto;
import ru.itis.vagaviev.semester.model.Comment;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Integer> {
    List<CommentDto> getCommentsByPostId(int postId);
}
