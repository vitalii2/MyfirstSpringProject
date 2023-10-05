package com.example.springFrameworkIntroduce.Entity;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PostRepository extends JpaRepository<Post,Long> {
    Optional<Post>findPostById(int id);
}
