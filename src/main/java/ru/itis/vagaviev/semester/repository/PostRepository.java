package ru.itis.vagaviev.semester.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.itis.vagaviev.semester.model.Post;

public interface PostRepository extends JpaRepository<Post, Integer> {

}
