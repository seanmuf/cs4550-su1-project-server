package com.example.project.controllers;

import com.example.project.models.Buyer;
import com.example.project.models.Listing;
import com.example.project.models.User;
import com.example.project.services.BuyerServices;
import com.example.project.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@CrossOrigin(
        origins = "https://wbdv-project-prototype-seanmuf.herokuapp.com",
        maxAge = 3600,
        allowCredentials = "true")
public class UserController {
    @Autowired
    UserServices service;

    @Autowired
    BuyerServices buyerServices;


    @PostMapping("/api/register")
    public User register(
            @RequestBody User user,
            HttpSession session) {
        User existingUser = service.findUserByUsername(user.getUsername());
        if(existingUser == null) {
            User currentUser = service.createUser(user);
            session.setAttribute("currentUser", currentUser);
            return currentUser;
        }
        return null;
    }

    @PostMapping("/api/profile")
    public User profile(HttpSession session) {
        User currentUser = (User)session.getAttribute("currentUser");
        return currentUser;
    }

    @PutMapping("/api/profile/{uid}")
    public User updateUser(
            @PathVariable("uid") Integer userId,
            @RequestBody User updatedUser,
            HttpSession session) {
        User oldUser = service.findUserById(userId);
        service.updateUser(oldUser, updatedUser);
        session.setAttribute("oldUser", oldUser);
        return oldUser;
    }

    @GetMapping("/api/users")
    public List<User> findAllUsers() {
        return service.findAllUsers();
    }

    @PostMapping("/api/users/{uid}")
    public User findUser(
            @PathVariable("uid") Integer userId,
            HttpSession session) {
        User currentUser = service.findUserById(userId);
        session.setAttribute("currentUser", currentUser);
        return currentUser;
    }

    @PostMapping("/api/login")
    public User login(
            @RequestBody User user,
            HttpSession session) {
        User currentUser = service.findUserByCredentials(user.getUsername(), user.getPassword());
        session.setAttribute("currentUser", currentUser);
        return currentUser;
    }

    @PostMapping("/api/logout")
    public void logout(HttpSession session) {
        session.invalidate();
    }
}
