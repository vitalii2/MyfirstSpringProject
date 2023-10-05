package com.example.springFrameworkIntroduce.Entity;

import jakarta.persistence.*;

import java.time.LocalTime;

@Entity
public class Post {
    @Id
    @SequenceGenerator(name = "post_sequance", sequenceName = "post_sequance")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "post_sequance")
    private int id;
    private String title;
    private String content;
    private LocalTime time;

    public Post(int id, String title, String content, LocalTime time) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.time = time;
    }
    public Post(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }
}
