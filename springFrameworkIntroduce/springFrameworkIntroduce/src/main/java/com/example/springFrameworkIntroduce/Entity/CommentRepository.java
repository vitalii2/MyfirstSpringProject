package com.example.springFrameworkIntroduce.Entity;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CommentRepository extends JpaRepository<Comment,Long> {
Optional<Comment>findCommentById(int id);
}
