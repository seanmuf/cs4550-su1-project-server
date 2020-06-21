package com.example.project.services;

import com.example.project.models.*;
import com.example.project.repositories.BuyerRepository;
import com.example.project.repositories.CartRepository;
import com.example.project.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.ArrayList;
import java.util.List;

@Service
public class BuyerServices {
    @Autowired
    BuyerRepository repository;

    @Autowired
    UserRepository userRepository;

    @Autowired
    CartRepository cartRepository;


    public Buyer createBuyer(User user) {
        Buyer buyer = new Buyer();
        buyer.setUser(user);
        return repository.save(buyer);
    }

    public List<Buyer> findAllBuyers() {
        return repository.findAllBuyers();
    }


    public Buyer findBuyerById(Integer id) {
            return repository.findBuyerById(id);
        }

}
