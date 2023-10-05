package com.example.springFrameworkIntroduce.Entity;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Comment")
public class CommentController {
    private final CommentService commentService;
    public CommentController(CommentService commentService){
        this.commentService = commentService;
    }
    @GetMapping(path = "comments")
    public List<Comment> list(){
        return commentService.list();
    }
    @PostMapping(path = "item")
    public void add(@RequestBody Comment comment){
        commentService.add(comment);
    }
    @DeleteMapping(path = "item/{commentId}")
    public void delete(@PathVariable("commentId") Long commentId){
        commentService.delete(commentId);
    }
    @PutMapping(path = "item")
    public void delete(@RequestBody Comment comment){
        commentService.update(comment);
    }
}
