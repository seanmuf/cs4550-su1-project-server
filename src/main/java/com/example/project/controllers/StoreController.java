package com.example.project.controllers;


import com.example.project.models.*;
import com.example.project.services.BuyerServices;
import com.example.project.services.ListingServices;
import com.example.project.services.SellerServices;
import com.example.project.services.StoreServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@CrossOrigin(
        origins = "https://student-marketplace-seanmuf.herokuapp.com/",
        allowCredentials = "true")
public class StoreController {

    @Autowired
    StoreServices service;

    @Autowired
    SellerServices sellerServices;

    @Autowired
    ListingServices listingServices;

    @PostMapping("/api/{sid}/stores")
    public Store createStore(
            @PathVariable("sid") Integer sellerId,
            HttpSession session) {
        Seller existingSeller = sellerServices.findSellerById(sellerId);
        if(existingSeller != null) {
            Store currentStore = service.createStore(existingSeller);
            session.setAttribute("currentStore", currentStore);
            return currentStore;
        }
        return null;
    }

    @PostMapping("/api/store")
    public Store store(HttpSession session) {
        Store currentStore = (Store)session.getAttribute("currentStore");
        return currentStore;
    }

    @GetMapping("/api/store/listings")
    public List<Listing> findListingsForStore(HttpSession session) {
        User currentUser = (User)session.getAttribute("currentUser");
        return service.findAllStoreListings(currentUser);
    }

    @PostMapping("/api/store/listings/create")
    public Listing createListing(
            @RequestBody Listing listing,
            HttpSession session) {
        if(true) {
            Listing currentListing = listingServices.createListing(listing);
            Store store = (Store) session.getAttribute("currentStore");
            service.addToStore(currentListing, store);
            return currentListing;
        }
        return null;
    }
}
