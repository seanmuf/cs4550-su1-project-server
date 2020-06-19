package com.example.project.services;

import com.example.project.models.Buyer;
import com.example.project.repositories.BuyerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BuyerServices {
    @Autowired
    BuyerRepository repository;

    public Buyer createBuyer(Buyer Buyer) {
        return repository.save(Buyer);
    }
    public Buyer findBuyerById(Integer id) {
        return repository.findBuyerById(id);
    }

    public Buyer findBuyerByCredentials(String username, String password) {
        return repository.findBuyerByCredentials(username, password);
    }

    public Buyer findBuyerByUsername(String username) {
        return repository.findBuyerByUsername(username);
    }
}
