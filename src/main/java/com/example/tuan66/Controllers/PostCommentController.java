package com.example.tuan66.Controllers;


import com.example.tuan66.entities.PostComment;
import com.example.tuan66.services.PostCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class PostCommentController {
    @Autowired
    private PostCommentService postCommentService;


    @GetMapping("/2")
    public String getListPostComment(Model model) {
        List<PostComment> postComments = postCommentService.findAll();
        model.addAttribute("postComments", postComments);
        return "post";
    }
    @GetMapping("/postComment/{id}")
    public String getPostCommentById(@PathVariable Long id, Model model) {
        PostComment postComment = postCommentService.findById(id);

        if (postComment != null) {
            model.addAttribute("postComment", postComment);
            return "postCommentDetail";
        } else {
            return "postCommentNotFound";
        }
    }


}
