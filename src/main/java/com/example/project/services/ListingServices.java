package com.example.project.services;

import com.example.project.models.Listing;
import com.example.project.models.Seller;
import com.example.project.repositories.ListingRepository;
import com.example.project.repositories.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class ListingServices {
    @Autowired
    ListingRepository repository;

    @Autowired
    SellerRepository sellerRepository;


    public Listing createListing(Integer sellerId, Listing newListing) {
        Seller seller = sellerRepository.findSellerById(sellerId);
        newListing.setSeller(seller);
        return repository.save(newListing);
    }

    public List<Listing> deleteListing(Integer lid) {
        repository.deleteById(lid);
        List<Listing> result = new ArrayList<>();
        return result;
    }


    public List<Listing> findAllListings() {
        return repository.findAllListings();
    }

    public List<Listing> findAllListingsByCategory(String category) {
        ArrayList<Listing> result = new ArrayList<>();
        List<Listing> listings = repository.findAllListings();
        for (int i = 0; i < listings.size(); i++) {
            if (listings.get(i).l_category.equals(category)) {
                result.add(listings.get(i));
            }
        }
        return result;
    }

    public Listing updateListing(Integer listingId, Listing updatedListing) {
        Listing listing = repository.findListingById(listingId);
        listing.setL_name(updatedListing.getL_name());
        listing.setL_category(updatedListing.getL_category());
        listing.setL_price(updatedListing.getL_price());
        listing.setL_description(updatedListing.getL_description());
        listing.setL_quantity(updatedListing.getL_quantity());
        repository.save(listing);
        return listing;
    }

    public List<Listing> findAllListingsBySeller(Integer sid) {
        return repository.findListingBySellerId(sid);
    }

}
