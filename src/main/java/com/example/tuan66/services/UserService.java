package com.example.tuan66.services;


import com.example.tuan66.entities.PostComment;
import com.example.tuan66.repositories.PostCommentRepositoty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostCommentService {
    @Autowired
    private PostCommentRepositoty postCommentRepositoty;

    public List<PostComment> findAll() {
        return postCommentRepositoty.findAll();
    }
    public void add(PostComment postComment){
        postCommentRepositoty.save(postComment);
    }


    public PostComment findById(long id) {
         return postCommentRepositoty.findById(id).orElse(null);
    }
}
