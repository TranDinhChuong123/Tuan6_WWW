package com.example.tuan66.Controllers;

import com.example.tuan66.entities.PostComment;
import com.example.tuan66.entities.User;
import com.example.tuan66.repositories.UserRepositoty;
import com.example.tuan66.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private UserRepositoty userRepositoty;

    @GetMapping("/login")
    public String loginPage() {
        return "login";
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
