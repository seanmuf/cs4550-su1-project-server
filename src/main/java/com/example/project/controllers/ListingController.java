package com.example.project.controllers;

import com.example.project.models.Listing;
import com.example.project.models.User;
import com.example.project.services.ListingServices;
import com.example.project.services.SellerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class ListingController {
    @Autowired
    ListingServices service;

    @GetMapping("/api/listings")
    public List<Listing> findAllListings() {
        return service.findAllListings();
    }

    @GetMapping("/api/listings/{category}")
    public List<Listing> findAllListingsByCategory(
            @PathVariable("category") String category) {
        return service.findAllListingsByCategory(category);
    }


    @PostMapping("/api/listing")
    public Listing createListing(
            @RequestBody Listing listing,
            HttpSession session) {
        Listing existingListing = service.findListingById(listing.getL_price());
        if(existingListing == null) {
            Listing currentListing = service.createListing(listing);
            session.setAttribute("currentListing", currentListing);
            return currentListing;
        }
        return null;
    }

    @DeleteMapping("/api/listings/{lid}")
    public List<Listing> deleteListing(
            @PathVariable("lid") Integer listingId) {
        return service.deleteListing(listingId);
    }

    @PutMapping("/api/listings/{lid}")
    public Listing updateListing(
            @PathVariable("lid") Integer listingId,
            @RequestBody Listing updatedListing) {
        return service.updateListing(listingId, updatedListing);
    }



}
