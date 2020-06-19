package com.example.project.controllers;

import com.example.project.models.Listing;
import com.example.project.services.ListingServices;
import com.example.project.services.SellerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/api/sellers/{sid}/listings")
    public List<Listing> findAllListingsBySeller(
            @PathVariable("sid") Integer sid) {
        return service.findAllListingsBySeller(sid);
    }

    @PostMapping("/api/sellers/{sid}/listings")
    public Listing createListing(
            @PathVariable("sid") Integer sellerId,
            @RequestBody Listing newListing) {
        return service.createListing(sellerId, newListing);
    }

    @DeleteMapping("/api/listings/{lid}")
    public List<Listing> deleteListing(
            @PathVariable("lid") Integer lid) {
        return service.deleteListing(lid);
    }

    @PutMapping("/api/listings/{lid}")
    public Listing updateListing(
            @PathVariable("lid") Integer listingId,
            @RequestBody Listing updatedListing) {
        return service.updateListing(listingId, updatedListing);
    }

}
