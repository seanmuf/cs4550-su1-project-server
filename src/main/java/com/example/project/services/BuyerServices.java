package com.example.project.services;

import com.example.project.models.*;
import com.example.project.repositories.BuyerRepository;
import com.example.project.repositories.CartRepository;
import com.example.project.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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


    public Buyer createBuyer() {
        Buyer buyer = new Buyer();
        return repository.save(buyer);
    }


        public Buyer findBuyerById(Integer id) {
            return repository.findBuyerById(id);
        }

}
