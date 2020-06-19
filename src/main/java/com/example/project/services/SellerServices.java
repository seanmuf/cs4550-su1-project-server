package com.example.project.services;

import com.example.project.models.Listing;
import com.example.project.models.Seller;
import com.example.project.repositories.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class SellerServices {
    @Autowired
    SellerRepository repository;

    public Seller createSeller(Seller seller) {
        return repository.save(seller);
    }
    public Seller findSellerById(Integer id) {
        return repository.findSellerById(id);
    }

    public Seller findSellerByCredentials(String username, String password) {
        return repository.findSellerByCredentials(username, password);
    }

    public Seller findSellerByUsername(String username) {
        return repository.findSellerByUsername(username);
    }
}
