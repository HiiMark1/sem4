package ru.itis.vagaviev.semester.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import ru.itis.vagaviev.semester.dto.CreatePostDto;
import ru.itis.vagaviev.semester.dto.PostDto;
import ru.itis.vagaviev.semester.service.CommentService;
import ru.itis.vagaviev.semester.service.PostService;
import ru.itis.vagaviev.semester.service.UserService;
import java.util.Collections;
import java.util.List;

@Controller
public class PostController {
    UserService userService;
    PostService postService;
    CommentService commentService;

    @Autowired
    public PostController(UserService userService, PostService postService, CommentService commentService) {
        this.userService = userService;
        this.postService = postService;
        this.commentService = commentService;
    }

    @PostMapping("/new_post")
    public String newPost(@ModelAttribute(name = "post") CreatePostDto createPostDto) {
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        String email = null;
        if (principal instanceof UserDetails) {
            email = ((UserDetails) principal).getUsername();
        }
        createPostDto.setUserId(userService.getUserByEmail(email).getId());
        postService.save(createPostDto);
        return "redirect:/post_created";
    }

    @GetMapping("/new_post")
    public String getSignUp(Model model) {
        model.addAttribute("post", new CreatePostDto());
        return "new_post";
    }

    @GetMapping("/post_created")
    public String postCreated() {

        return "post_created";
    }

    @GetMapping("/news")
    public String getNews(Model model) {
        List<PostDto> postDtoList = postService.getAllPosts();
        Collections.reverse(postDtoList);
        model.addAttribute("posts", postDtoList);
        return "news";
    }
}
