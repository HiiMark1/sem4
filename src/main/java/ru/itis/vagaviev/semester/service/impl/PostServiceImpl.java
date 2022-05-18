package ru.itis.vagaviev.semester.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.itis.vagaviev.semester.dto.CreatePostDto;
import ru.itis.vagaviev.semester.dto.PostDto;
import ru.itis.vagaviev.semester.model.Post;
import ru.itis.vagaviev.semester.repository.PostRepository;
import ru.itis.vagaviev.semester.service.PostService;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PostServiceImpl implements PostService {
    private final PostRepository postRepository;

    @Autowired
    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public PostDto save(CreatePostDto post) {
        return PostDto.formModel(postRepository.save(new Post(post.getUserId(), post.getDate(), post.getRating(), post.getText(),
                post.getPicUrl(), post.getName())));
    }

    @Override
    public List<PostDto> getAllPosts() {
        return postRepository.findAll().stream().map(PostDto::formModel).collect(Collectors.toList());
    }

    @Override
    public PostDto getById(int id) {
        Optional<Post> post = postRepository.getPostById(id);
        if(post.isPresent()){
            return PostDto.formModel(post.get());
        } else {
            return null;
        }
    }
}
