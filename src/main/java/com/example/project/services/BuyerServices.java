package com.example.project.services;

import com.example.project.models.Buyer;
import com.example.project.models.Listing;
import com.example.project.models.Seller;
import com.example.project.models.User;
import com.example.project.repositories.BuyerRepository;
import com.example.project.repositories.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BuyerServices {
    @Autowired
    BuyerRepository repository;

    @Autowired
    CartRepository cartRepository;

    public Buyer createBuyer(Buyer buyer) {
        return repository.save(buyer);
    }

    public Listing addToCart(Listing listing) {
        return cartRepository.save(listing);
    }

    public List<Listing> deleteFromCart(Integer lid) {
        cartRepository.deleteById(lid);
        List<Listing> result = new ArrayList<>();
        return result;
    }

        public Buyer findBuyerById(Integer id) {
            return repository.findBuyerById(id);
        }

}
