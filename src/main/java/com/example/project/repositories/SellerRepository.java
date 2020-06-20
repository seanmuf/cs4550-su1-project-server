package com.example.project.repositories;

import com.example.project.models.Seller;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;


public interface SellerRepository extends CrudRepository<Seller, Integer> {

    @Query("SELECT seller FROM Seller seller WHERE seller.id=:sellerId")
    Seller findSellerById(
            @Param("sellerId") Integer sid);

    @Query("SELECT seller FROM Seller seller WHERE seller.username=:username AND seller.password=:password")
    Seller findSellerByCredentials(
            @Param("username") String username,
            @Param("password") String password);

    @Query("SELECT seller FROM Seller seller WHERE seller.username=:u")
    Seller findSellerByUsername(
            @Param("u") String username);
    }


