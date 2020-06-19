package com.example.project.controllers;

import com.example.project.models.Seller;
import com.example.project.services.SellerServices;
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
public class SellerController {
    @Autowired
    SellerServices service;

    @PostMapping("/api/register/seller")
    public Seller register(
            @RequestBody Seller seller,
            HttpSession session) {
        Seller existingSeller = service.findSellerByUsername(seller.getUsername());
        if(existingSeller == null) {
            Seller currentSeller = service.createSeller(seller);
            session.setAttribute("currentSeller", currentSeller);
            return currentSeller;
        }
        return null;
    }

    @PostMapping("/api/profile/seller")
    public Seller profile(HttpSession session) {
        Seller currentSeller = (Seller)session.getAttribute("currentSeller");
        return currentSeller;
    }

    @PostMapping("/api/login/seller")
    public Seller login(
            @RequestBody Seller seller,
            HttpSession session) {
        Seller currentSeller = service.findSellerByCredentials(seller.getUsername(), seller.getPassword());
        session.setAttribute("currentSeller", currentSeller);
        return currentSeller;
    }

    @PostMapping("/api/logout/seller")
    public void logout(HttpSession session) {
        session.invalidate();
    }
}