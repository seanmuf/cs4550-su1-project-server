package com.example.project.controllers;

import com.example.project.models.Buyer;
import com.example.project.services.BuyerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
@CrossOrigin(
        origins = "http://localhost:8080",
        allowCredentials = "true")
public class BuyerController {
    @Autowired
    BuyerServices service;

    @PostMapping("/api/register/buyer")
    public Buyer register(
            @RequestBody Buyer Buyer,
            HttpSession session) {
        Buyer existingBuyer = service.findBuyerByUsername(Buyer.getUsername());
        if(existingBuyer == null) {
            Buyer currentBuyer = service.createBuyer(Buyer);
            session.setAttribute("currentBuyer", currentBuyer);
            return currentBuyer;
        }
        return null;
    }

    @PostMapping("/api/profile/buyer")
    public Buyer profile(HttpSession session) {
        Buyer currentBuyer = (Buyer)session.getAttribute("currentBuyer");
        return currentBuyer;
    }

    @PostMapping("/api/login/buyer")
    public Buyer login(
            @RequestBody Buyer Buyer,
            HttpSession session) {
        Buyer currentBuyer = service.findBuyerByCredentials(Buyer.getUsername(), Buyer.getPassword());
        session.setAttribute("currentBuyer", currentBuyer);
        return currentBuyer;
    }

    @PostMapping("/api/logout/buyer")
    public void logout(HttpSession session) {
        session.invalidate();
    }
}
