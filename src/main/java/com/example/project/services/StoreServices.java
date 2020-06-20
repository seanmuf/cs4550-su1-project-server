package com.example.project.services;

import com.example.project.models.Listing;
import com.example.project.models.Seller;
import com.example.project.models.Store;
import com.example.project.repositories.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StoreServices {
    @Autowired
    StoreRepository repository;

    public Store createStore(Store store) {
        return repository.save(store);
    }


    public Store findStoreById(Integer storeId) {
        return repository.findStoreById(storeId);
    }
}
