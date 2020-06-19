package com.example.project.services;

import com.example.project.models.Listing;
import com.example.project.models.Seller;
import com.example.project.repositories.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SellerServices {
    @Autowired
    SellerRepository repository;

    public List<Seller> findAllSellers() {
        return repository.findAllSellers();
    }

    public Seller createSeller(Seller seller) {
    }
}
