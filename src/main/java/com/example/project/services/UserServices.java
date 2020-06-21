package com.example.project.services;


import com.example.project.models.Buyer;
import com.example.project.models.Seller;
import com.example.project.models.User;
import com.example.project.repositories.BuyerRepository;
import com.example.project.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;

@Service
public class UserServices {
    @Autowired
    UserRepository repository;

    public User updateUser(User oldUser, User updatedUser) {
        oldUser.setUsername(updatedUser.getUsername());
        oldUser.setPassword(updatedUser.getPassword());
        oldUser.setF_name(updatedUser.getF_name());
        oldUser.setL_name(updatedUser.getL_name());
        oldUser.setEmail(updatedUser.getEmail());
        oldUser.setUserType(updatedUser.getUserType());
        repository.save(oldUser);
        return oldUser;
    }

    public User createUser(User user) {
        return repository.save(user);
    }


    public User findUserById(Integer id) {
        return repository.findUserById(id);
    }

    public User findUserByCredentials(String username, String password) {
        return repository.findUserByCredentials(username, password);
    }

    public User findUserByUsername(String username) {
        return repository.findUserByUsername(username);
    }
}
