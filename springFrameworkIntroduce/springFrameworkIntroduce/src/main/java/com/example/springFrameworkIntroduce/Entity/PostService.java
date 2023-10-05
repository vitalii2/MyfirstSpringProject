package com.example.springFrameworkIntroduce.Entity;

import org.springframework.stereotype.Service;

import java.rmi.StubNotFoundException;
import java.util.List;
import java.util.Optional;

@Service
public class PostService {
    private final PostRepository postRepository;
    public PostService(PostRepository postRepository){
        this.postRepository=postRepository;
    }
    public List<Post>list(){
        return postRepository.findAll();
    }
    public void add(Post post){
        if(postRepository.findPostById(post.getId()).isPresent()){
            System.out.println("this post already exist");
        }
        postRepository.save(post);
    }
    public void delete(Long postId){
        postRepository.deleteById(postId);
    }
    public void update(Post post){
        Optional<Post> row = postRepository.findPostById(post.getId());
        if(row.isPresent()){
            Post item = row.get();
            if(!post.getTitle().isEmpty()){
                item.setTitle(post.getTitle());
            }
            if(post.getTime() != null){
                item.setTime(post.getTime());
            }
            postRepository.save(item);
        }
    }
}
