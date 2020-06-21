package com.example.project.controllers;

import com.example.project.models.Buyer;
import com.example.project.models.Seller;
import com.example.project.models.User;
import com.example.project.services.BuyerServices;
import com.example.project.services.SellerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@RestController
@CrossOrigin(
        origins = "*",
        allowCredentials = "true")
public class BuyerController {
    @Autowired
    BuyerServices service;

    @PostMapping("/api/buyers")
    public Buyer register(
            HttpSession session) {
        if(true) {
            Buyer currentBuyer = service.createBuyer();
            session.setAttribute("currentBuyer", currentBuyer);
            return currentBuyer;
        }
        return null;
    }
}
