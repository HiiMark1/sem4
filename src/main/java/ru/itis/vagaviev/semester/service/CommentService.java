package ru.itis.vagaviev.semester.service;

import ru.itis.vagaviev.semester.dto.CommentDto;
import ru.itis.vagaviev.semester.dto.CreateCommentDto;

import java.util.List;

public interface CommentService {
    List<CommentDto> getAllCommentsForPost(int postId);

    CommentDto save(CreateCommentDto comment);
}
