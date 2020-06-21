package com.example.project.services;

import com.example.project.models.Listing;
import com.example.project.models.Seller;
import com.example.project.models.User;
import com.example.project.repositories.SellerRepository;
import com.example.project.repositories.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class SellerServices {
    @Autowired
    SellerRepository repository;

    @Autowired
    StoreRepository storeRepository;

    public Seller createSeller(User u) {
        Seller s = new Seller();
        s.setUser(u);
        return repository.save(s);
    }

    public List<Seller> findAllSellers() {
        return repository.findAllSellers();
    }


    public List<Listing> deleteFromStore(Integer lid) {
        storeRepository.deleteById(lid);
        List<Listing> result = new ArrayList<>();
        return result;
    }





    public Seller findSellerById(Integer id) {
        return repository.findSellerById(id);
    }
}
