package com.example.project.controllers;


import com.example.project.models.Store;
import com.example.project.services.StoreServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@RestController
@CrossOrigin(
        origins = "*",
        allowCredentials = "true")
public class StoreController {

    @Autowired
    StoreServices service;

    @PostMapping("/api/stores")
    public Store createStore(
            @RequestBody Store store,
            HttpSession session) {
        Store existingStore = service.findStoreById(store.getId());
        if(existingStore == null) {
            Store currentStore = service.createStore(store);
            session.setAttribute("currentStore", currentStore);
            return currentStore;
        }
        return null;
    }
}
