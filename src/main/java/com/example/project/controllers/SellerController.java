package com.example.project.controllers;

import com.example.project.models.Buyer;
import com.example.project.models.Listing;
import com.example.project.models.Seller;
import com.example.project.models.User;
import com.example.project.services.SellerServices;
import com.example.project.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@CrossOrigin(
        origins = "https://wbdv-project-prototype-seanmuf.herokuapp.com",
        maxAge = 3600,
        allowCredentials = "true")
public class SellerController {
    @Autowired
    SellerServices service;

    @Autowired
    UserServices userServices;

    @PostMapping("/api/sellers/register")
    public Seller register(
            @RequestBody Seller seller,
            HttpSession session) {
        User existingUser = userServices.findUserById(seller.getId());
        if(existingUser != null) {
            Seller currentSeller = service.createSeller(existingUser);
            session.setAttribute("currentSeller", currentSeller);
            return currentSeller;
        }
        return null;
    }

    @PostMapping("/api/seller")
    public Seller profile(HttpSession session) {
        Seller currentSeller = (Seller)session.getAttribute("currentSeller");
        return currentSeller;
    }


    @GetMapping("/api/sellers")
    public List<Seller> findAllSellers() {
        return service.findAllSellers();
    }

}