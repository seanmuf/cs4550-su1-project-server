package com.example.project.repositories;

import com.example.project.models.Listing;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ListingRepository extends CrudRepository<Listing, Integer> {
    @Query("SELECT listings FROM Listing listings")
    List<Listing> findAllListings();

    @Query("SELECT listings FROM Listing listings WHERE listings.id=:listingId")
    Listing findListingById(
            @Param("listingId") Integer lid
    );

    @Query("SELECT listings FROM Listing listings WHERE listings.seller=:sellerId")
    List<Listing> findListingBySellerId(
            @Param("sellerId") Integer sid
    );
}
