package ru.itis.vagaviev.semester.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.itis.vagaviev.semester.dto.CommentDto;
import ru.itis.vagaviev.semester.dto.CreateCommentDto;
import ru.itis.vagaviev.semester.model.Comment;
import ru.itis.vagaviev.semester.repository.CommentRepository;
import ru.itis.vagaviev.semester.service.CommentService;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {
    private final CommentRepository commentRepository;

    @Autowired
    public CommentServiceImpl(CommentRepository commentRepository){
        this.commentRepository = commentRepository;
    }

    @Override
    public List<CommentDto> getAllCommentsForPost(int postId) {
        return commentRepository.getCommentsByPostId(postId);
    }

    @Override
    public CommentDto save(CreateCommentDto comment) {
        return CommentDto.formModel(commentRepository.save(new Comment(comment.getUserId(), comment.getDate(), comment.getText(), comment.getPostId())));
    }
}
