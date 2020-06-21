package com.example.project.services;

import com.example.project.models.Buyer;
import com.example.project.models.Cart;
import com.example.project.models.Listing;
import com.example.project.models.Store;
import com.example.project.repositories.CartRepository;
import com.example.project.repositories.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CartServices {
    @Autowired
    CartRepository repository;

    public List<Listing> deleteFromCart(Integer lid) {
        repository.deleteById(lid);
        List<Listing> result = new ArrayList<>();
        return result;
    }




    public Cart createCart(Buyer b) {
        Cart c = new Cart();
        c.setBuyer(b);
        return repository.save(c);
    }


    public Cart findCartById(Integer cartId) {
        return repository.findCartById(cartId);
    }
}
