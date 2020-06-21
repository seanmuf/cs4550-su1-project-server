package com.example.project.controllers;

import com.example.project.models.Buyer;
import com.example.project.models.Cart;
import com.example.project.models.Store;
import com.example.project.models.User;
import com.example.project.services.BuyerServices;
import com.example.project.services.CartServices;
import com.example.project.services.StoreServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@RestController
@CrossOrigin(
        origins = "https://student-marketplace-seanmuf.herokuapp.com/",
        allowCredentials = "true")
public class CartController {

    @Autowired
    CartServices service;

    @Autowired
    BuyerServices buyerServices;

    @PostMapping("/api/{bid}/carts")
    public Cart createCart(
            @PathVariable("bid") Integer buyerId,
            HttpSession session) {
        Buyer existingBuyer = buyerServices.findBuyerById(buyerId);
        if(existingBuyer != null) {
            Cart currentCart = service.createCart(existingBuyer);
            session.setAttribute("currentCart", currentCart);
            return currentCart;
        }
        return null;
    }
}

