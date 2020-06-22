package com.example.project.services;

import com.example.project.models.Listing;
import com.example.project.models.Seller;
import com.example.project.models.Store;
import com.example.project.models.User;
import com.example.project.repositories.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoreServices {
    @Autowired
    StoreRepository repository;

    public Store createStore(Seller seller) {
        Store store = new Store();
        store.setSeller(seller);
        return repository.save(store);
    }

    public Store addToStore(Listing listing, Store store) {
        store.addToStore(listing);
        return repository.save(store);
    }

    public List<Listing> findAllStoreListings(Store store) {
        return repository.findAllStoreListings(store.getId());
    }


    public Store findStoreById(Integer storeId) {
        return repository.findStoreById(storeId);
    }

}
