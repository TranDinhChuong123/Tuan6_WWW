package com.example.tuan66.Controllers;

import com.example.tuan66.entities.Post;
import com.example.tuan66.entities.User;
import com.example.tuan66.repositories.PostRepositoty;
import com.example.tuan66.repositories.UserRepositoty;
import com.example.tuan66.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.List;

@Controller
public class PostController {

    @Autowired
    private PostRepositoty postRepositoty;

    @GetMapping("/post")
    public String loginPage(Model model) {
        List<Post> posts = postRepositoty.findAll();
        model.addAttribute("posts",posts);
        return "post";
    }
    @PostMapping("/post")
    public String loginPag(Model model) {
        List<Post> posts = postRepositoty.findAll();
        model.addAttribute("posts",posts);
        return "post";
    }
    @GetMapping("/post-detail/{id}")
    public String loginPage(@PathVariable long id, Model model) {
        Post post= postRepositoty.findById(id).orElse(null);
        model.addAttribute("post",post);
        return "post-detail";
    }
    @GetMapping("/add-post")
    public String addPost(Model model) {
        return "add-post";
    }
    @PostMapping("/add")
    public String add(@RequestParam String MetaTitle,
                      @RequestParam String Summary,
                      @RequestParam String title,
                      @RequestParam String Content,Model model) {

        postRepositoty.save(new Post(true,Content,"/iamge/img.png",MetaTitle,Summary, Instant.now(),Instant.now(),
                title,new User(1),Instant.now(),Instant.now()));
        return "redirect:/post";
    }

//    @PostMapping("/login")
//    public String login(@RequestParam String username, @RequestParam String password, Model model) {
//        User user = userRepositoty.findUserByRegisteredAt(username);
//        model.addAttribute("user", user);
//        System.out.println(user.getId());
//        if (user != null && user.getPasswordHash().equals(password)) {
//            return "dashboard";
//        } else {
//            return "login";
//        }
//    }

}
