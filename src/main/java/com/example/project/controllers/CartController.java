package com.example.project.controllers;

import com.example.project.models.Cart;
import com.example.project.models.Store;
import com.example.project.services.CartServices;
import com.example.project.services.StoreServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
@CrossOrigin(
        origins = "https://student-marketplace-seanmuf.herokuapp.com/",
        allowCredentials = "true")
public class CartController {

    @Autowired
    CartServices service;

    @PostMapping("/api/carts")
    public Cart createCart(
            @RequestBody Cart cart,
            HttpSession session) {
        Cart existingCart = service.findCartById(cart.getId());
        if(existingCart == null) {
            Cart currentCart = service.createCart(cart);
            session.setAttribute("currentCart", currentCart);
            return currentCart;
        }
        return null;
    }
}

