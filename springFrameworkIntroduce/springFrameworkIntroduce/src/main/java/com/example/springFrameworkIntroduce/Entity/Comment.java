package com.example.springFrameworkIntroduce.Entity;

import jakarta.persistence.*;

import java.time.LocalTime;

@Entity
public class Comment {
    @Id
    @SequenceGenerator(name = "comment_sequance", sequenceName = "comment_sequance")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "comment_sequance")
    private int id;
    private int postid;
    private String text;
    private LocalTime timestamp;

    public Comment(int id, int postid, String text, LocalTime timestamp) {
        this.id = id;
        this.postid = postid;
        this.text = text;
        this.timestamp = timestamp;
    }
    public Comment(){}
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPostid() {
        return postid;
    }

    public void setPostid(int postid) {
        this.postid = postid;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LocalTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalTime timestamp) {
        this.timestamp = timestamp;
    }
}
