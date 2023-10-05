package com.example.springFrameworkIntroduce.Entity;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Post")
public class PostController {
private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }
    @GetMapping(path = "list")
    public List<Post>list(){
        return postService.list();
    }
    @PostMapping(path = "item")
    public void add(@RequestBody Post post){
        postService.add(post);
    }
    @DeleteMapping(path = "item/{postId}")
    public void delete(@PathVariable("postId") Long postId){
        postService.delete(postId);
    }
    @PutMapping(path = "item")
    public void delete(@RequestBody Post post){
        postService.update(post);
    }

}
