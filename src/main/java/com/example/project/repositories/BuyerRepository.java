package com.example.project.repositories;

import com.example.project.models.Buyer;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface BuyerRepository extends CrudRepository<Buyer, Integer> {

    @Query("SELECT buyer FROM Buyer buyer WHERE buyer.id=:buyerId")
    Buyer findBuyerById(
            @Param("buyerId") Integer sid);

    @Query("SELECT buyer FROM Buyer buyer WHERE buyer.username=:username AND buyer.password=:password")
    Buyer findBuyerByCredentials(
            @Param("username") String username,
            @Param("password") String password);

    @Query("SELECT buyer FROM Buyer buyer WHERE buyer.username=:u")
    Buyer findBuyerByUsername(
            @Param("u") String username);
}
