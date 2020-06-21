package com.example.project.controllers;

import com.example.project.models.Listing;
import com.example.project.models.Seller;
import com.example.project.models.User;
import com.example.project.services.SellerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@RestController
@CrossOrigin(
        origins = "https://student-marketplace-seanmuf.herokuapp.com/",
        allowCredentials = "true")
public class SellerController {
    @Autowired
    SellerServices service;

    @PostMapping("/api/sellers/{sid}")
    public Seller register(
            @PathVariable("sid") Integer sellerId,
            @RequestBody Seller seller,
            HttpSession session) {
        Seller existingSeller = service.findSellerById(sellerId);
        if(existingSeller == null) {
            Seller currentSeller = service.createSeller(seller);
            session.setAttribute("currentSeller", currentSeller);
            return currentSeller;
        }
        return null;
    }
}