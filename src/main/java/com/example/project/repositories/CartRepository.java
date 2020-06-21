package com.example.project.repositories;

import com.example.project.models.Cart;
import com.example.project.models.Listing;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CartRepository extends CrudRepository<Cart, Integer> {



    @Query("SELECT cart FROM Cart cart WHERE cart.id=:cartId")
    Cart findCartById(
            @Param("cartId") Integer cartId);
}