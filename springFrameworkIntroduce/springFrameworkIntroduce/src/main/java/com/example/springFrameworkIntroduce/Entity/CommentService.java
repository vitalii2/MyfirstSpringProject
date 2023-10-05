package com.example.springFrameworkIntroduce.Entity;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CommentService {
    private final CommentRepository commentRepository;

    public CommentService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }
    public List<Comment> list(){
        return commentRepository.findAll();
    }
    public void add(Comment comment){
       commentRepository.save(comment);
    }
    public void delete(Long commentId){
        commentRepository.deleteById(commentId);
    }
    public void update(Comment comment){
        Optional<Comment> row = commentRepository.findCommentById(comment.getId());
        if(row.isPresent()){
            Comment item = row.get();
            if(!comment.getText().isEmpty()){
                item.setText(comment.getText());
            }
            if(comment.getTimestamp() != null){
                item.setTimestamp(comment.getTimestamp());
            }
            commentRepository.save(item);
        }
    }
}
