package com.example.project.repositories;

import com.example.project.models.Seller;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SellerRepository extends CrudRepository<Seller, Integer> {

    @Query("SELECT seller FROM Seller seller WHERE seller.id=:sellerId")
    Seller findSellerById(
            @Param("sellerId") Integer sid);

    @Query("SELECT seller FROM Seller seller")
    List<Seller> findAllSellers();
}
