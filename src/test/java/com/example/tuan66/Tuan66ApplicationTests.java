package com.example.tuan66;

import com.example.tuan66.entities.Post;
import com.example.tuan66.entities.PostComment;
import com.example.tuan66.entities.User;
import com.example.tuan66.repositories.PostCommentRepositoty;
import com.example.tuan66.repositories.UserRepositoty;
import com.example.tuan66.services.PostCommentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.Instant;

@SpringBootTest
class Tuan66ApplicationTests {
    @Autowired
    private PostCommentService postCommentService;
    @Autowired
    private UserRepositoty userRepositoty;
    private PostCommentRepositoty postCommentRepositoty;


    @Test
    void contextLoads() {
        System.out.println("qqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqq");
        System.out.println(userRepositoty.findUserByRegisteredAt("1").getPasswordHash());

//        postCommentService.add(new PostComment(3,new Post(1),"chuong",new PostComment(1),true,"content", Instant.now(),Instant.now(),new User(1)));
//        postCommentService.findAll().forEach(x->{
//            System.out.println(x.getId());;
//        });

    }

}
