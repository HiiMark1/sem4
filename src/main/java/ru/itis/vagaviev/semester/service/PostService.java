package ru.itis.vagaviev.semester.service;

import ru.itis.vagaviev.semester.dto.CreatePostDto;
import ru.itis.vagaviev.semester.dto.PostDto;

import java.util.List;

public interface PostService {
    PostDto save(CreatePostDto post);

    List<PostDto> getAllPosts();

    PostDto getById(int id);
}
