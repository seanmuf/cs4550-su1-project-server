package com.example.project.repositories;

import com.example.project.models.Listing;
import com.example.project.models.Store;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StoreRepository extends CrudRepository<Store, Integer> {
    @Query("SELECT stores FROM Store stores")
    List<Store> findAllStores();

    @Query("SELECT stores.listings FROM Store stores WHERE stores.id=:storeId")
    List<Listing> findAllStoreListings(
            @Param("storeId") Integer storeId
    );

    @Query("SELECT stores FROM Store stores WHERE stores.id=:storeId")
    Store findStoreById(
            @Param("storeId") Integer storeId
    );


}
