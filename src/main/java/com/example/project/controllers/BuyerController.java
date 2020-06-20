package com.example.project.controllers;

import com.example.project.models.Buyer;
import com.example.project.models.Seller;
import com.example.project.services.BuyerServices;
import com.example.project.services.SellerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@RestController
@CrossOrigin(
        origins = "http://localhost:3000",
        allowCredentials = "true")
public class BuyerController {
    @Autowired
    BuyerServices service;

    @PostMapping("/api/buyers")
    public Buyer register(
            @RequestBody Buyer buyer,
            HttpSession session) {
        Buyer existingBuyer = service.findBuyerById(buyer.getId());
        if(existingBuyer == null) {
            Buyer currentBuyer = service.createBuyer(buyer);
            session.setAttribute("currentBuyer", currentBuyer);
            return currentBuyer;
        }
        return null;
    }
}
